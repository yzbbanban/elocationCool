package com.riti.pojo;

import java.util.Date;

public class NFCDeviceParams {
    private Integer id;

    private Integer uid;

    private String company;

    private String devicenum;

    private String goodsname;

    private Short delay;

    private Short intervaltime;

    private Float maxtemperature;

    private Float mintemperature;

    private Short model;

    private Short readstop;

    private Short datauploadmode;

    private Short tagtype;

    private Float maxhum;

    private Float minhum;

    private Date devicecreatetime;

    private Date deviceupdatetime;

    public NFCDeviceParams(Integer id, Integer uid, String company, String devicenum, String goodsname, Short delay, Short intervaltime, Float maxtemperature, Float mintemperature, Short model, Short readstop, Short datauploadmode, Short tagtype, Float maxhum, Float minhum, Date devicecreatetime, Date deviceupdatetime) {
        this.id = id;
        this.uid = uid;
        this.company = company;
        this.devicenum = devicenum;
        this.goodsname = goodsname;
        this.delay = delay;
        this.intervaltime = intervaltime;
        this.maxtemperature = maxtemperature;
        this.mintemperature = mintemperature;
        this.model = model;
        this.readstop = readstop;
        this.datauploadmode = datauploadmode;
        this.tagtype = tagtype;
        this.maxhum = maxhum;
        this.minhum = minhum;
        this.devicecreatetime = devicecreatetime;
        this.deviceupdatetime = deviceupdatetime;
    }

    public NFCDeviceParams() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getDevicenum() {
        return devicenum;
    }

    public void setDevicenum(String devicenum) {
        this.devicenum = devicenum == null ? null : devicenum.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Short getDelay() {
        return delay;
    }

    public void setDelay(Short delay) {
        this.delay = delay;
    }

    public Short getIntervaltime() {
        return intervaltime;
    }

    public void setIntervaltime(Short intervaltime) {
        this.intervaltime = intervaltime;
    }

    public Float getMaxtemperature() {
        return maxtemperature;
    }

    public void setMaxtemperature(Float maxtemperature) {
        this.maxtemperature = maxtemperature;
    }

    public Float getMintemperature() {
        return mintemperature;
    }

    public void setMintemperature(Float mintemperature) {
        this.mintemperature = mintemperature;
    }

    public Short getModel() {
        return model;
    }

    public void setModel(Short model) {
        this.model = model;
    }

    public Short getReadstop() {
        return readstop;
    }

    public void setReadstop(Short readstop) {
        this.readstop = readstop;
    }

    public Short getDatauploadmode() {
        return datauploadmode;
    }

    public void setDatauploadmode(Short datauploadmode) {
        this.datauploadmode = datauploadmode;
    }

    public Short getTagtype() {
        return tagtype;
    }

    public void setTagtype(Short tagtype) {
        this.tagtype = tagtype;
    }

    public Float getMaxhum() {
        return maxhum;
    }

    public void setMaxhum(Float maxhum) {
        this.maxhum = maxhum;
    }

    public Float getMinhum() {
        return minhum;
    }

    public void setMinhum(Float minhum) {
        this.minhum = minhum;
    }

    public Date getDevicecreatetime() {
        return devicecreatetime;
    }

    public void setDevicecreatetime(Date devicecreatetime) {
        this.devicecreatetime = devicecreatetime;
    }

    public Date getDeviceupdatetime() {
        return deviceupdatetime;
    }

    public void setDeviceupdatetime(Date deviceupdatetime) {
        this.deviceupdatetime = deviceupdatetime;
    }
}