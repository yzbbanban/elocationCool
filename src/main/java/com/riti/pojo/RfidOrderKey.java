package com.riti.pojo;

import java.util.Date;

public class RfidOrderKey {
    private String rfiduserid;

    private String rfididname;

    private String rfidorderstocktype;

    private Date rfidordercreatetime;

    public RfidOrderKey(String rfiduserid, String rfididname, String rfidorderstocktype, Date rfidordercreatetime) {
        this.rfiduserid = rfiduserid;
        this.rfididname = rfididname;
        this.rfidorderstocktype = rfidorderstocktype;
        this.rfidordercreatetime = rfidordercreatetime;
    }

    public RfidOrderKey() {
        super();
    }

    public String getRfiduserid() {
        return rfiduserid;
    }

    public void setRfiduserid(String rfiduserid) {
        this.rfiduserid = rfiduserid == null ? null : rfiduserid.trim();
    }

    public String getRfididname() {
        return rfididname;
    }

    public void setRfididname(String rfididname) {
        this.rfididname = rfididname == null ? null : rfididname.trim();
    }

    public String getRfidorderstocktype() {
        return rfidorderstocktype;
    }

    public void setRfidorderstocktype(String rfidorderstocktype) {
        this.rfidorderstocktype = rfidorderstocktype == null ? null : rfidorderstocktype.trim();
    }

    public Date getRfidordercreatetime() {
        return rfidordercreatetime;
    }

    public void setRfidordercreatetime(Date rfidordercreatetime) {
        this.rfidordercreatetime = rfidordercreatetime;
    }
}