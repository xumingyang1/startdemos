(function (doc_01, win_01) {
var docEl_01 = doc_01.documentElement;
var resizeEvt_01 = 'orientationchange' in window ? 'orientationchange' : 'resize';
var recalc_01 = function () {
var clientWidth_01 = docEl_01.clientWidth;
var clientheight_01 = docEl_01.clientHeight;
if (!clientWidth_01) return;
if(clientWidth_01<641)
{
docEl_01.style.fontSize = (clientWidth_01/640*100).toFixed(1)+'px';
}
else
{
	docEl_01.style.fontSize = 100+'px';

}
};
recalc_01();
if (!doc_01.addEventListener) return;
win_01.addEventListener(resizeEvt_01, recalc_01, false);
})(document, window);
//返回上一步
$(function(){
 $("#fanhui_btn").bind("click",function(){
   history.go(-1);
 });

 // 底部hover效果
 $('.footer_02 a').hover(function(){
    $(this).addClass('this').siblings().removeClass('this');
 })
});
function tab_hanshu(content,nrxx,ssxx_id,tab_length)
{
    for (zs_id=0;zs_id<tab_length;zs_id++)
    {
        document.getElementById(content+zs_id).className = "moren";
        document.getElementById(nrxx+zs_id).style.display = "none";
    }
    document.getElementById(content+ssxx_id).className = "this";
    document.getElementById(nrxx+ssxx_id).style.display = "block";
}

//jquery切换TAB
    function jquery_tabnav(tab_bq,tab_nr,mouser_sj)
    {
        var $header_tabli = $(tab_bq);//获取标签
        $header_tabli.eq(0).addClass('this');
        $header_tabli.eq(0).removeClass('moren');
        $(tab_nr).eq(0).show();
        if(mouser_sj=='click')//判断鼠标状态有click和hover二种事件
        {
            $header_tabli.click(function(){
                $(this).addClass('this').removeClass('moren').siblings().removeClass('this').addClass('moren');//当前标签添加样式后删除
                var index = $header_tabli.index(this);//定义当前第几个元素
                $(tab_nr).eq(index).show().siblings().hide();//当前元素显示后隐藏
            });
        }
        else
        {
            $header_tabli.hover(function(){
                $(this).addClass('this').removeClass('moren').siblings().removeClass('this').addClass('moren');//当前标签添加样式后删除
                var index = $header_tabli.index(this);//定义当前第几个元素
                $(tab_nr).eq(index).show().siblings().hide();//当前元素显示后隐藏
            });
        }
    }
    function biaoqian_xz(id_1,id_2)
    {
        $("#"+id_2).slideDown(50);
        $("#"+id_1).mouseleave(function(){
            $("#"+id_2).slideUp(50);
        })
        $("#"+id_2).click(function(){
            $("#"+id_2).slideUp(50);
        })
    }
    function value_qz(id_1,id_2){
        var v1=document.getElementById(id_1).innerHTML;
        document.getElementById(id_2).value=v1;
        //document.getElementById(id_3).innerHTML=v1;
    }

