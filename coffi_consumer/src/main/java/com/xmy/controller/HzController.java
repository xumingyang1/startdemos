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






}
