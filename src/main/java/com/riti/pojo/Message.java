package com.riti.pojo;

import java.util.Date;

public class Message {
    private String coolMessageId;

    private String coolCompanyId;

    private String coolUserId;

    private String coolMessageHandleId;

    private String coolMessageDetail;

    private Date coolMessageCreateTime;

    private Date coolMessageUpdateTime;

    private Integer isdelete;

    private User user;

    public Message() {
        super();
    }

    public Message(String coolMessageId, String coolCompanyId, String coolUserId, String coolMessageHandleId, String coolMessageDetail, Date coolMessageCreateTime, Date coolMessageUpdateTime, Integer isdelete) {
        this.coolMessageId = coolMessageId;
        this.coolCompanyId = coolCompanyId;
        this.coolUserId = coolUserId;
        this.coolMessageHandleId = coolMessageHandleId;
        this.coolMessageDetail = coolMessageDetail;
        this.coolMessageCreateTime = coolMessageCreateTime;
        this.coolMessageUpdateTime = coolMessageUpdateTime;
        this.isdelete = isdelete;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Message(String companyId, String apply_userId, Integer isdelete) {
        super();
        this.coolCompanyId = companyId == null ? null : companyId.trim();
        this.coolUserId = apply_userId == null ? null : apply_userId.trim();
        this.isdelete = isdelete;
    }

    public String getCoolMessageId() {
        return coolMessageId;
    }

    public void setCoolMessageId(String coolMessageId) {
        this.coolMessageId = coolMessageId == null ? null : coolMessageId.trim();
    }

    public String getCoolCompanyId() {
        return coolCompanyId;
    }

    public void setCoolCompanyId(String coolCompanyId) {
        this.coolCompanyId = coolCompanyId == null ? null : coolCompanyId.trim();
    }

    public String getCoolUserId() {
        return coolUserId;
    }

    public void setCoolUserId(String coolUserId) {
        this.coolUserId = coolUserId == null ? null : coolUserId.trim();
    }

    public String getCoolMessageHandleId() {
        return coolMessageHandleId;
    }

    public void setCoolMessageHandleId(String coolMessageHandleId) {
        this.coolMessageHandleId = coolMessageHandleId == null ? null : coolMessageHandleId.trim();
    }

    public String getCoolMessageDetail() {
        return coolMessageDetail;
    }

    public void setCoolMessageDetail(String coolMessageDetail) {
        this.coolMessageDetail = coolMessageDetail == null ? null : coolMessageDetail.trim();
    }

    public Date getCoolMessageCreateTime() {
        return coolMessageCreateTime;
    }

    public void setCoolMessageCreateTime(Date coolMessageCreateTime) {
        this.coolMessageCreateTime = coolMessageCreateTime;
    }

    public Date getCoolMessageUpdateTime() {
        return coolMessageUpdateTime;
    }

    public void setCoolMessageUpdateTime(Date coolMessageUpdateTime) {
        this.coolMessageUpdateTime = coolMessageUpdateTime;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}