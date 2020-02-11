package com.xmy.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.xmy.mapper.ApplyModelMapper;
import com.xmy.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service(interfaceClass = HzService.class)
@Component//把当前的类注入spring容器
public class HzServiceImpl implements HzService {

    @Autowired
    private ApplyModelMapper applyModelMapper;




}
