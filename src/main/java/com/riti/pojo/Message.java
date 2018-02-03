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

    private Short isdelete;

    public Message(String coolMessageId, String coolCompanyId, String coolUserId, String coolMessageHandleId, String coolMessageDetail, Date coolMessageCreateTime, Date coolMessageUpdateTime, Short isdelete) {
        this.coolMessageId = coolMessageId;
        this.coolCompanyId = coolCompanyId;
        this.coolUserId = coolUserId;
        this.coolMessageHandleId = coolMessageHandleId;
        this.coolMessageDetail = coolMessageDetail;
        this.coolMessageCreateTime = coolMessageCreateTime;
        this.coolMessageUpdateTime = coolMessageUpdateTime;
        this.isdelete = isdelete;
    }

    public Message() {
        super();
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

    public Short getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }
}