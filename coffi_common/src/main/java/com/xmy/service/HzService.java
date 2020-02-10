package com.xmy.service;

import com.xmy.model.*;

import java.util.List;

public interface HzService {

    int toApply(ApplyModel apply);

    HuizhiModel to224();

    List<ProfessionModel> queryProfession();

    List<EmployedModel> queryEmployed();

    List<TeacherModel> queryTeacher();

    List<NewsModel> queryNews();

    List<NewsModel> queryNews1();

    List<EmployedModel> queryEmp();

    List<SchoolModel> querySchool();
}
