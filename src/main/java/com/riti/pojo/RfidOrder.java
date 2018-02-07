package com.riti.pojo;

import java.util.Date;

public class RfidOrder extends RfidOrderKey {
    private String rfidordernum;

    public RfidOrder(String rfiduserid, String rfididname, String rfidorderstocktype, Date rfidordercreatetime, String rfidordernum) {
        super(rfiduserid, rfididname, rfidorderstocktype, rfidordercreatetime);
        this.rfidordernum = rfidordernum;
    }

    public RfidOrder() {
        super();
    }

    public String getRfidordernum() {
        return rfidordernum;
    }

    public void setRfidordernum(String rfidordernum) {
        this.rfidordernum = rfidordernum == null ? null : rfidordernum.trim();
    }
}