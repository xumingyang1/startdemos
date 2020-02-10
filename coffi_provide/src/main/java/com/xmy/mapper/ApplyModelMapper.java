package com.xmy.mapper;

import com.xmy.model.*;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ApplyModelMapper {
    int deleteByPrimaryKey(Integer applyid);

    int insert(ApplyModel record);

    int insertSelective(ApplyModel record);

    ApplyModel selectByPrimaryKey(Integer applyid);

    int updateByPrimaryKeySelective(ApplyModel record);

    int updateByPrimaryKey(ApplyModel record);

    int toApply(ApplyModel apply);

    @Select("select * from h_huizhi")
    HuizhiModel to224();

    @Select("select * from h_profession")
    List<ProfessionModel> queryProfession();

    @Select("SELECT * FROM h_employed e ORDER BY e.employedSalary DESC")
    List<EmployedModel> queryEmployed();

    @Select("SELECT * FROM h_teacher")
    List<TeacherModel> queryTeacher();

    @Select("SELECT * FROM h_news n WHERE n.newsType='新闻动态' ORDER BY n.newsDate DESC")
    List<NewsModel> queryNews();

    @Select("SELECT * FROM h_news n WHERE n.newsType='商务动态' ORDER BY n.newsDate DESC")
    List<NewsModel> queryNews1();

    @Select("SELECT * FROM h_employed e WHERE e.employedId > 4")
    List<EmployedModel> queryEmp();

    @Select("SELECT * FROM h_school")
    List<SchoolModel> querySchool();
}