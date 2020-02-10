package com.xmy.model;

import java.io.Serializable;

public class ProfessionModel implements Serializable {
    private static final long serialVersionUID = 556409023955771046L;
    private Integer professionid;

    private String professionname;

    private String professionskill;

    private String professionduration;

    private String professioncourse;

    private String professionobligation;

    private String professionimg;

    public Integer getProfessionid() {
        return professionid;
    }

    public void setProfessionid(Integer professionid) {
        this.professionid = professionid;
    }

    public String getProfessionname() {
        return professionname;
    }

    public void setProfessionname(String professionname) {
        this.professionname = professionname == null ? null : professionname.trim();
    }

    public String getProfessionskill() {
        return professionskill;
    }

    public void setProfessionskill(String professionskill) {
        this.professionskill = professionskill == null ? null : professionskill.trim();
    }

    public String getProfessionduration() {
        return professionduration;
    }

    public void setProfessionduration(String professionduration) {
        this.professionduration = professionduration == null ? null : professionduration.trim();
    }

    public String getProfessioncourse() {
        return professioncourse;
    }

    public void setProfessioncourse(String professioncourse) {
        this.professioncourse = professioncourse == null ? null : professioncourse.trim();
    }

    public String getProfessionobligation() {
        return professionobligation;
    }

    public void setProfessionobligation(String professionobligation) {
        this.professionobligation = professionobligation == null ? null : professionobligation.trim();
    }

    public String getProfessionimg() {
        return professionimg;
    }

    public void setProfessionimg(String professionimg) {
        this.professionimg = professionimg == null ? null : professionimg.trim();
    }
}