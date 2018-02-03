package com.riti.pojo;

import java.util.Date;

public class RfidIdName {
    private Integer rfidorderid;

    private String rfididname;

    private Date rfidordernumcreatetime;

    public RfidIdName(Integer rfidorderid, String rfididname, Date rfidordernumcreatetime) {
        this.rfidorderid = rfidorderid;
        this.rfididname = rfididname;
        this.rfidordernumcreatetime = rfidordernumcreatetime;
    }

    public RfidIdName() {
        super();
    }

    public Integer getRfidorderid() {
        return rfidorderid;
    }

    public void setRfidorderid(Integer rfidorderid) {
        this.rfidorderid = rfidorderid;
    }

    public String getRfididname() {
        return rfididname;
    }

    public void setRfididname(String rfididname) {
        this.rfididname = rfididname == null ? null : rfididname.trim();
    }

    public Date getRfidordernumcreatetime() {
        return rfidordernumcreatetime;
    }

    public void setRfidordernumcreatetime(Date rfidordernumcreatetime) {
        this.rfidordernumcreatetime = rfidordernumcreatetime;
    }
}