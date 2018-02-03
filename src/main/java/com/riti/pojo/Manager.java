package com.riti.pojo;

public class Manager {
    private String coolManagerId;

    private String coolUserId;

    private String coolCompanyId;

    private String coolTagListId;

    public Manager(String coolManagerId, String coolUserId, String coolCompanyId, String coolTagListId) {
        this.coolManagerId = coolManagerId;
        this.coolUserId = coolUserId;
        this.coolCompanyId = coolCompanyId;
        this.coolTagListId = coolTagListId;
    }

    public Manager() {
        super();
    }

    public String getCoolManagerId() {
        return coolManagerId;
    }

    public void setCoolManagerId(String coolManagerId) {
        this.coolManagerId = coolManagerId == null ? null : coolManagerId.trim();
    }

    public String getCoolUserId() {
        return coolUserId;
    }

    public void setCoolUserId(String coolUserId) {
        this.coolUserId = coolUserId == null ? null : coolUserId.trim();
    }

    public String getCoolCompanyId() {
        return coolCompanyId;
    }

    public void setCoolCompanyId(String coolCompanyId) {
        this.coolCompanyId = coolCompanyId == null ? null : coolCompanyId.trim();
    }

    public String getCoolTagListId() {
        return coolTagListId;
    }

    public void setCoolTagListId(String coolTagListId) {
        this.coolTagListId = coolTagListId == null ? null : coolTagListId.trim();
    }
}