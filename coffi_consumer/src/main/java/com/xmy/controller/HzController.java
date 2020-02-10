package com.xmy.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xmy.model.*;
import com.xmy.service.HzService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("hz")
@ComponentScan(basePackages = {"com.xmy.*"})
public class HzController {

    @Reference
    private HzService hzService;

    @RequestMapping("toApply")
    @ResponseBody
    public int toApply(ApplyModel apply){
        if (apply.getApplyname()==""||apply.getApplytel()==""||apply.getApplyprofession()==""||apply.getApplynum()==""){
            return 0;
        }
        int i = hzService.toApply(apply);
        return i;
    }

    @RequestMapping("to224")
    @ResponseBody
    public HuizhiModel to224(){
        HuizhiModel hz = hzService.to224();
        return hz;
    }

    @RequestMapping("queryProfession")
    @ResponseBody
    public List<ProfessionModel> queryProfession(){
        List<ProfessionModel> pro = hzService.queryProfession();
        return pro;
    }

    @RequestMapping("queryEmployed")
    @ResponseBody
    public List<EmployedModel> queryEmployed(){
        List<EmployedModel> emp = hzService.queryEmployed();
        return emp;
    }

    @RequestMapping("queryTeacher")
    @ResponseBody
    public List<TeacherModel> queryTeacher(){
        List<TeacherModel> tea = hzService.queryTeacher();
        return tea;
    }

    @RequestMapping("queryNews")
    @ResponseBody
    public List<NewsModel> queryNews(){
        List<NewsModel> news = hzService.queryNews();
        return news;
    }

    @RequestMapping("queryNews1")
    @ResponseBody
    public List<NewsModel> queryNews1(){
        List<NewsModel> news = hzService.queryNews1();
        return news;
    }

    @RequestMapping("queryEmp")
    @ResponseBody
    public List<EmployedModel> queryEmp(){
        List<EmployedModel> emp = hzService.queryEmp();
        return emp;
    }

    @RequestMapping("querySchool")
    @ResponseBody
    public List<SchoolModel> querySchool(){
        List<SchoolModel> school = hzService.querySchool();
        return school;
    }


    @RequestMapping("toJieshao")
    public String toJieshao(){
        return "jieshao";
    }
    @RequestMapping("toMain")
    public String toMain(){
        return "main";
    }
    @RequestMapping("toAbout")
    public String toAbout(){
        return "about";
    }
    @RequestMapping("toFengcai")
    public String toFengcai(){
        return "fengcai";
    }
    @RequestMapping("toChanpin")
    public String toChanpin(){ return "chanpin"; }
    @RequestMapping("toUI")
    public String toUI(){
        return "ui";
    }
    @RequestMapping("toYunying")
    public String toYunying(){
        return "yunying";
    }
    @RequestMapping("toShichang")
    public String toShichang(){
        return "shichang";
    }
    @RequestMapping("toShizi")
    public String toShizi(){ return "shizi"; }
    @RequestMapping("toNews")
    public String toNews(){ return "news"; }
    @RequestMapping("toShizi1")
    public String toShizi1(){ return "shizi1"; }
    @RequestMapping("toOne")
    public String toOne(){ return "one"; }
    @RequestMapping("toTwo")
    public String toTwo(){ return "two"; }
    @RequestMapping("toThree")
    public String toThree(){ return "three"; }
    @RequestMapping("toFour")
    public String toFour(){ return "four"; }
    @RequestMapping("toFive")
    public String toFive(){ return "five"; }
    @RequestMapping("toSix")
    public String toSix(){ return "six"; }




}
