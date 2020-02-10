// JavaScript Document
$(document).ready(function(){
	
	//div延迟加载
	wow = new WOW({
		animateClass: 'animated',
		offset: 120
	});
	wow.init();
	
	//溢出文字省略号表示...
		$('.pro_r p').each(function(){
			var maxwidth=45;
			if($(this).text().length>maxwidth){
				$(this).text($(this).text().substring(0,maxwidth));
				$(this).html($(this).html()+'…');
				}
			});
		$('.pro_r h3').each(function(){
			var maxwidth=26;
			if($(this).text().length>maxwidth){
				$(this).text($(this).text().substring(0,maxwidth));
				$(this).html($(this).html()+'…');
				}
			});
		$('.pro_fllb li a p').each(function(){
			var maxwidth=30;
			if($(this).text().length>maxwidth){
				$(this).text($(this).text().substring(0,maxwidth));
				$(this).html($(this).html()+'…');
				}
			});
		
	//点击出现注册弹窗
	$('.cd-popup-trigger0').on('click', function(event){
            event.preventDefault();
            $('.cd-popup').addClass('is-visible');
            //$(".dialog-addquxiao").hide()
        });

	//关闭窗口
        $('.cd-popup').on('click', function(event){
            if( $(event.target).is('.close .icon') || $(event.target).is('.cd-popup') ) {
                event.preventDefault();
                $(this).removeClass('is-visible');
            }
        });
		
		
	//点击出现登录弹窗
	$('.index_login').on('click', function(event){
            event.preventDefault();
            $('.cd-login').addClass('is-visible');
            //$(".dialog-addquxiao").hide()
        });

	//关闭窗口
        $('.cd-login').on('click', function(event){
            if( $(event.target).is('.close .icon') || $(event.target).is('.cd-login') ) {
                event.preventDefault();
                $(this).removeClass('is-visible');
            }
        });

	
	
	//表单验证，不能为空
	//登录：用户名
	 $('input[name="username"]').focus(function(){
			$(this).removeClass('red');
			$(this).next().text('');		
	 })
	 //登录：密码
	 $('input[name="password"]').focus(function(){
			$(this).removeClass('red');
			$(this).next().text('');	
	 })
	 
	 //注册：用户名
	 $('input[name="reg_name"]').focus(function(){
			$(this).removeClass('red');
			$(this).next().text('');		
	 })
	 //注册：密码
	 $('input[name="reg_password"]').focus(function(){
			$(this).removeClass('red');
			$(this).next().text('');	
	 })
	  //注册重复：密码
	 $('input[name="reg_passssword"]').focus(function(){
			$(this).removeClass('red');
			$(this).next().text('');	
	 })
	 
	 
	 //提交按钮,所有验证通过方可提交
        $('.b_login').click(function(){
          if($('input[name="username"]').val()=='请输入用户名'){
            $('input[name="username"]').next().text('不能为空').addClass('tswz');
			$('input[name="username"]').removeClass('blue').addClass('red');
          }
		  if($('input[name="password"]').val()==''){
            $('input[name="password"]').next().text('不能为空').addClass('tswz');
			$('input[name="password"]').removeClass('blue').addClass('red');
          }  
		})
		
		$('.b_register').click(function(){
          if($('input[name="reg_name"]').val()=='请输入用户名'){
            $('input[name="reg_name"]').next().text('不能为空').addClass('tswz2');
			$('input[name="reg_name"]').removeClass('blue').addClass('red');
          }
		  if($('input[name="reg_password"]').val()==''){
            $('input[name="reg_password"]').next().text('不能为空').addClass('tswz2');
			$('input[name="reg_password"]').removeClass('blue').addClass('red');
          } 
		  if($('input[name="reg_passssword"]').val()==''){
            $('input[name="reg_passssword"]').next().text('不能为空').addClass('tswz2');
			$('input[name="reg_passssword"]').removeClass('blue').addClass('red');
          } 
		  
		  var a=$('input[name="reg_password"]').val();
		  var b=$('input[name="reg_passssword"]').val();
		  if(a!=b){
			$('input[name="reg_passssword"]').next().text('两次密码不一致').addClass('tswz2');
			}
		})
		
		

	//判断页面下拉100px的距离，出现的效果
	$(function(){
        $(window).scroll(function(){
            if($(window).scrollTop() > 100){
                $("#gotop").fadeIn(1000);//一秒渐入动画
				$('header').css('background','rgba(255,255,255,0.8)')
            }else{
                $("#gotop").fadeOut(1000);//一秒渐隐动画
				$('header').css('background','rgba(255,255,255,0)')
            }
        });
         
        $("#gotop").click(function(){
            $('body,html').animate({scrollTop:0},1000);
        });
    });
	
	$('.index_login').click(function(){
		setTimeout(function(){
			$('.login_jm').css('box-shadow','0 0 10px 15px rgba(0, 0, 0, 0.5)')
			},100)
		})
		
	//个人中心下拉菜单
	$('.my_menu h3:nth-child(2)').mouseenter(function(){
		$('.xiahuaz_menu').css('display','block');
		})
		
	$('.xiahuaz_menu').mouseleave(function(){
		$('.xiahuaz_menu').css('display','none');	
			})
			
			
			
	
	//产品详情页，选项卡
	$(".pro_xqmain_h3").click(function(){
		$(this).addClass("pro_activ");
		$(".pro_csmain_h3").removeClass("pro_activ")
		$(".pro_xqmain").css("display","block");
		$(".pro_csmain").css("display","none");
	})
	
	
	$(".pro_csmain_h3").click(function(){
		$(this).addClass("pro_activ");
		$(".pro_xqmain_h3").removeClass("pro_activ")
		$("pro_xqmain_h3").css("color","#a0a0a0");
		$(".pro_xqmain").css("display","none");
		$(".pro_csmain").css("display","block");
	})
	
	//div获取了和图片相同的高度 宽度	
	$(".pro_zz").height($(".rmtj_img").height());
	$(".pro_zz").width($(".rmtj_img").width());
	
	
	
	$(".ser_form input").focus(function(){
  		$(".ser_form input").addClass("ser_form_focus");
	});
	
	$(".ser_form input").blur(function(){
		$(".ser_form input").removeClass("ser_form_focus");
	});
	
	$('.sitemap ul h5').click( function(){
		$(this).parent().children().siblings("li").toggle("slow");
		
		
		})
	
	//
	$('.shipin_down').mouseenter(function(){
		$(this).next().show();
		})
		
	$('.shipin_down').mouseleave(function(){
		$(this).next().hide();
		})

	//手机点菜单
	$('.nav-toggle .icon-caidan').click(function(){
		$('.nav_phone').toggle(1000);
		})

	
})
	
	

