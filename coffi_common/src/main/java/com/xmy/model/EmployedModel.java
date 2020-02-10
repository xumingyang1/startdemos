package com.xmy.model;

import java.io.Serializable;

public class EmployedModel implements Serializable {
    private static final long serialVersionUID = -2377226598786435019L;
    private Integer employedid;

    private String employedname;

    private String employedposition;

    private String employedsalary;

    private String employedunit;

    private Integer employedage;

    private String employedaddress;

    private Integer professionid;

    private String employedimg;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getEmployedid() {
        return employedid;
    }

    public void setEmployedid(Integer employedid) {
        this.employedid = employedid;
    }

    public String getEmployedname() {
        return employedname;
    }

    public void setEmployedname(String employedname) {
        this.employedname = employedname;
    }

    public String getEmployedposition() {
        return employedposition;
    }

    public void setEmployedposition(String employedposition) {
        this.employedposition = employedposition;
    }

    public String getEmployedsalary() {
        return employedsalary;
    }

    public void setEmployedsalary(String employedsalary) {
        this.employedsalary = employedsalary;
    }

    public String getEmployedunit() {
        return employedunit;
    }

    public void setEmployedunit(String employedunit) {
        this.employedunit = employedunit;
    }

    public Integer getEmployedage() {
        return employedage;
    }

    public void setEmployedage(Integer employedage) {
        this.employedage = employedage;
    }

    public String getEmployedaddress() {
        return employedaddress;
    }

    public void setEmployedaddress(String employedaddress) {
        this.employedaddress = employedaddress;
    }

    public Integer getProfessionid() {
        return professionid;
    }

    public void setProfessionid(Integer professionid) {
        this.professionid = professionid;
    }

    public String getEmployedimg() {
        return employedimg;
    }

    public void setEmployedimg(String employedimg) {
        this.employedimg = employedimg;
    }

    @Override
    public String toString() {
        return "EmployedModel{" +
                "employedid=" + employedid +
                ", employedname='" + employedname + '\'' +
                ", employedposition='" + employedposition + '\'' +
                ", employedsalary='" + employedsalary + '\'' +
                ", employedunit='" + employedunit + '\'' +
                ", employedage=" + employedage +
                ", employedaddress='" + employedaddress + '\'' +
                ", professionid=" + professionid +
                ", employedimg='" + employedimg + '\'' +
                '}';
    }
}