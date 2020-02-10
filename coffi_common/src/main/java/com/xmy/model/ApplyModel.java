package com.xmy.model;

import java.io.Serializable;

public class ApplyModel implements Serializable {
    private static final long serialVersionUID = -763011495341675882L;
    private Integer applyid;

    private String applyname;

    private String applytel;

    private String applyprofession;

    private String applynum;

    public Integer getApplyid() {
        return applyid;
    }

    public void setApplyid(Integer applyid) {
        this.applyid = applyid;
    }

    public String getApplyname() {
        return applyname;
    }

    public void setApplyname(String applyname) {
        this.applyname = applyname == null ? null : applyname.trim();
    }

    public String getApplytel() {
        return applytel;
    }

    public void setApplytel(String applytel) {
        this.applytel = applytel == null ? null : applytel.trim();
    }

    public String getApplyprofession() {
        return applyprofession;
    }

    public void setApplyprofession(String applyprofession) {
        this.applyprofession = applyprofession == null ? null : applyprofession.trim();
    }

    public String getApplynum() {
        return applynum;
    }

    public void setApplynum(String applynum) {
        this.applynum = applynum == null ? null : applynum.trim();
    }

    @Override
    public String toString() {
        return "ApplyModel{" +
                "applyid=" + applyid +
                ", applyname='" + applyname + '\'' +
                ", applytel='" + applytel + '\'' +
                ", applyprofession='" + applyprofession + '\'' +
                ", applynum='" + applynum + '\'' +
                '}';
    }
}