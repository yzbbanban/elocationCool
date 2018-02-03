package com.riti.pojo;

import java.util.Date;

public class RfidUser {
    private String rfiduserid;

    private String coolUserId;

    private String rfidusername;

    private String rfiduserlocation;

    private Date rfidusercreattime;

    public RfidUser(String rfiduserid, String coolUserId, String rfidusername, String rfiduserlocation, Date rfidusercreattime) {
        this.rfiduserid = rfiduserid;
        this.coolUserId = coolUserId;
        this.rfidusername = rfidusername;
        this.rfiduserlocation = rfiduserlocation;
        this.rfidusercreattime = rfidusercreattime;
    }

    public RfidUser() {
        super();
    }

    public String getRfiduserid() {
        return rfiduserid;
    }

    public void setRfiduserid(String rfiduserid) {
        this.rfiduserid = rfiduserid == null ? null : rfiduserid.trim();
    }

    public String getCoolUserId() {
        return coolUserId;
    }

    public void setCoolUserId(String coolUserId) {
        this.coolUserId = coolUserId == null ? null : coolUserId.trim();
    }

    public String getRfidusername() {
        return rfidusername;
    }

    public void setRfidusername(String rfidusername) {
        this.rfidusername = rfidusername == null ? null : rfidusername.trim();
    }

    public String getRfiduserlocation() {
        return rfiduserlocation;
    }

    public void setRfiduserlocation(String rfiduserlocation) {
        this.rfiduserlocation = rfiduserlocation == null ? null : rfiduserlocation.trim();
    }

    public Date getRfidusercreattime() {
        return rfidusercreattime;
    }

    public void setRfidusercreattime(Date rfidusercreattime) {
        this.rfidusercreattime = rfidusercreattime;
    }
}