package com.riti.pojo;

import java.util.Date;

public class Company {
    private String coolCompanyId;

    private String coolCompanyName;

    private String coolCompanyEmail;

    private String coolCompanyAddress;

    private String coolCompanyTel;

    private Date coolCompanyCreateTime;

    private Date coolCompanyUpdateTime;

    public Company(String coolCompanyId, String coolCompanyName, String coolCompanyEmail, String coolCompanyAddress, String coolCompanyTel, Date coolCompanyCreateTime, Date coolCompanyUpdateTime) {
        this.coolCompanyId = coolCompanyId;
        this.coolCompanyName = coolCompanyName;
        this.coolCompanyEmail = coolCompanyEmail;
        this.coolCompanyAddress = coolCompanyAddress;
        this.coolCompanyTel = coolCompanyTel;
        this.coolCompanyCreateTime = coolCompanyCreateTime;
        this.coolCompanyUpdateTime = coolCompanyUpdateTime;
    }

    public Company() {
        super();
    }

    public String getCoolCompanyId() {
        return coolCompanyId;
    }

    public void setCoolCompanyId(String coolCompanyId) {
        this.coolCompanyId = coolCompanyId == null ? null : coolCompanyId.trim();
    }

    public String getCoolCompanyName() {
        return coolCompanyName;
    }

    public void setCoolCompanyName(String coolCompanyName) {
        this.coolCompanyName = coolCompanyName == null ? null : coolCompanyName.trim();
    }

    public String getCoolCompanyEmail() {
        return coolCompanyEmail;
    }

    public void setCoolCompanyEmail(String coolCompanyEmail) {
        this.coolCompanyEmail = coolCompanyEmail == null ? null : coolCompanyEmail.trim();
    }

    public String getCoolCompanyAddress() {
        return coolCompanyAddress;
    }

    public void setCoolCompanyAddress(String coolCompanyAddress) {
        this.coolCompanyAddress = coolCompanyAddress == null ? null : coolCompanyAddress.trim();
    }

    public String getCoolCompanyTel() {
        return coolCompanyTel;
    }

    public void setCoolCompanyTel(String coolCompanyTel) {
        this.coolCompanyTel = coolCompanyTel == null ? null : coolCompanyTel.trim();
    }

    public Date getCoolCompanyCreateTime() {
        return coolCompanyCreateTime;
    }

    public void setCoolCompanyCreateTime(Date coolCompanyCreateTime) {
        this.coolCompanyCreateTime = coolCompanyCreateTime;
    }

    public Date getCoolCompanyUpdateTime() {
        return coolCompanyUpdateTime;
    }

    public void setCoolCompanyUpdateTime(Date coolCompanyUpdateTime) {
        this.coolCompanyUpdateTime = coolCompanyUpdateTime;
    }
}