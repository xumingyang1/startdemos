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

    @Override
    public int toApply(ApplyModel apply) {
        int i = applyModelMapper.toApply(apply);
        return i;
    }

    @Override
    public HuizhiModel to224() {
        return applyModelMapper.to224();
    }

    @Override
    public List<ProfessionModel> queryProfession() {
        return applyModelMapper.queryProfession();
    }

    @Override
    public List<EmployedModel> queryEmployed() {
        return applyModelMapper.queryEmployed();
    }

    @Override
    public List<TeacherModel> queryTeacher() {
        return applyModelMapper.queryTeacher();
    }

    @Override
    public List<NewsModel> queryNews() {
        return applyModelMapper.queryNews();
    }

    @Override
    public List<NewsModel> queryNews1() {
        return applyModelMapper.queryNews1();
    }

    @Override
    public List<EmployedModel> queryEmp() {
        return applyModelMapper.queryEmp();
    }

    @Override
    public List<SchoolModel> querySchool() {
        return applyModelMapper.querySchool();
    }


}
