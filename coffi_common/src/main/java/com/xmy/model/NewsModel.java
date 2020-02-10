package com.xmy.model;

import java.io.Serializable;
import java.util.Date;

public class NewsModel implements Serializable {
    private static final long serialVersionUID = 2611648084443695839L;
    private Integer newsid;

    private String newstype;

    private String newscontent;

    private Date newsdate;

    private String newstitle;

    private String newssource;

    private String newsimg;

    private String particulars;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getNewstype() {
        return newstype;
    }

    public void setNewstype(String newstype) {
        this.newstype = newstype;
    }

    public String getNewscontent() {
        return newscontent;
    }

    public void setNewscontent(String newscontent) {
        this.newscontent = newscontent;
    }

    public Date getNewsdate() {
        return newsdate;
    }

    public void setNewsdate(Date newsdate) {
        this.newsdate = newsdate;
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle;
    }

    public String getNewssource() {
        return newssource;
    }

    public void setNewssource(String newssource) {
        this.newssource = newssource;
    }

    public String getNewsimg() {
        return newsimg;
    }

    public void setNewsimg(String newsimg) {
        this.newsimg = newsimg;
    }

    public String getParticulars() {
        return particulars;
    }

    public void setParticulars(String particulars) {
        this.particulars = particulars;
    }

    @Override
    public String toString() {
        return "NewsModel{" +
                "newsid=" + newsid +
                ", newstype='" + newstype + '\'' +
                ", newscontent='" + newscontent + '\'' +
                ", newsdate=" + newsdate +
                ", newstitle='" + newstitle + '\'' +
                ", newssource='" + newssource + '\'' +
                ", newsimg='" + newsimg + '\'' +
                ", particulars='" + particulars + '\'' +
                '}';
    }
}