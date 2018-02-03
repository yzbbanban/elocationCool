package com.riti.pojo;

import java.util.Date;

public class TagList {
    private String coolTagListId;

    private String coolUserId;

    private String uid;

    private Date coolTagCreateTime;

    private Date coolTagUpdateTime;

    public TagList(String coolTagListId, String coolUserId, String uid, Date coolTagCreateTime, Date coolTagUpdateTime) {
        this.coolTagListId = coolTagListId;
        this.coolUserId = coolUserId;
        this.uid = uid;
        this.coolTagCreateTime = coolTagCreateTime;
        this.coolTagUpdateTime = coolTagUpdateTime;
    }

    public TagList() {
        super();
    }

    public String getCoolTagListId() {
        return coolTagListId;
    }

    public void setCoolTagListId(String coolTagListId) {
        this.coolTagListId = coolTagListId == null ? null : coolTagListId.trim();
    }

    public String getCoolUserId() {
        return coolUserId;
    }

    public void setCoolUserId(String coolUserId) {
        this.coolUserId = coolUserId == null ? null : coolUserId.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public Date getCoolTagCreateTime() {
        return coolTagCreateTime;
    }

    public void setCoolTagCreateTime(Date coolTagCreateTime) {
        this.coolTagCreateTime = coolTagCreateTime;
    }

    public Date getCoolTagUpdateTime() {
        return coolTagUpdateTime;
    }

    public void setCoolTagUpdateTime(Date coolTagUpdateTime) {
        this.coolTagUpdateTime = coolTagUpdateTime;
    }
}