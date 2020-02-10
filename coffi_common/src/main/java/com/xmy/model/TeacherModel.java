package com.xmy.model;

import java.io.Serializable;

public class TeacherModel implements Serializable {
    private static final long serialVersionUID = -4380089512332356266L;
    private Integer teacherid;

    private String teachername;

    private String teacherexperience;

    private String teacherlessons;

    private String teacherprofession;

    private String teachergrade;

    private String teacherimg;

    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public String getTeacherexperience() {
        return teacherexperience;
    }

    public void setTeacherexperience(String teacherexperience) {
        this.teacherexperience = teacherexperience == null ? null : teacherexperience.trim();
    }

    public String getTeacherlessons() {
        return teacherlessons;
    }

    public void setTeacherlessons(String teacherlessons) {
        this.teacherlessons = teacherlessons == null ? null : teacherlessons.trim();
    }

    public String getTeacherprofession() {
        return teacherprofession;
    }

    public void setTeacherprofession(String teacherprofession) {
        this.teacherprofession = teacherprofession == null ? null : teacherprofession.trim();
    }

    public String getTeachergrade() {
        return teachergrade;
    }

    public void setTeachergrade(String teachergrade) {
        this.teachergrade = teachergrade == null ? null : teachergrade.trim();
    }

    public String getTeacherimg() {
        return teacherimg;
    }

    public void setTeacherimg(String teacherimg) {
        this.teacherimg = teacherimg == null ? null : teacherimg.trim();
    }
}