package com.xmy.model;

import java.io.Serializable;

public class SchoolModel implements Serializable {
    private static final long serialVersionUID = 8806744182589180637L;
    private Integer sid;

    private String sintroduce;

    private String simg;



    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSintroduce() {
        return sintroduce;
    }

    public void setSintroduce(String sintroduce) {
        this.sintroduce = sintroduce == null ? null : sintroduce.trim();
    }

    public String getSimg() {
        return simg;
    }

    public void setSimg(String simg) {
        this.simg = simg == null ? null : simg.trim();
    }
}