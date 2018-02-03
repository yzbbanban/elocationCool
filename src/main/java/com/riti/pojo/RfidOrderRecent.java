package com.riti.pojo;

import java.util.Date;

public class RfidOrderRecent {
    private String rfididname;

    private String rfiduserid;

    private String rfidordernum;

    private String rfidorderstocktype;

    private Date rfidorderrecenttime;

    public RfidOrderRecent(String rfididname, String rfiduserid, String rfidordernum, String rfidorderstocktype, Date rfidorderrecenttime) {
        this.rfididname = rfididname;
        this.rfiduserid = rfiduserid;
        this.rfidordernum = rfidordernum;
        this.rfidorderstocktype = rfidorderstocktype;
        this.rfidorderrecenttime = rfidorderrecenttime;
    }

    public RfidOrderRecent() {
        super();
    }

    public String getRfididname() {
        return rfididname;
    }

    public void setRfididname(String rfididname) {
        this.rfididname = rfididname == null ? null : rfididname.trim();
    }

    public String getRfiduserid() {
        return rfiduserid;
    }

    public void setRfiduserid(String rfiduserid) {
        this.rfiduserid = rfiduserid == null ? null : rfiduserid.trim();
    }

    public String getRfidordernum() {
        return rfidordernum;
    }

    public void setRfidordernum(String rfidordernum) {
        this.rfidordernum = rfidordernum == null ? null : rfidordernum.trim();
    }

    public String getRfidorderstocktype() {
        return rfidorderstocktype;
    }

    public void setRfidorderstocktype(String rfidorderstocktype) {
        this.rfidorderstocktype = rfidorderstocktype == null ? null : rfidorderstocktype.trim();
    }

    public Date getRfidorderrecenttime() {
        return rfidorderrecenttime;
    }

    public void setRfidorderrecenttime(Date rfidorderrecenttime) {
        this.rfidorderrecenttime = rfidorderrecenttime;
    }
}