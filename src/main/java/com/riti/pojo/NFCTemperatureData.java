package com.riti.pojo;

public class NFCTemperatureData {
    private Integer id;

    private Integer uid;

    private String goodsname;

    private String daterecordtime;

    private Float maxtemperature;

    private Float mintemperature;

    private Float temperature;

    private Short tempstatus;

    private Float maxhum;

    private Float minhum;

    private Float hum;

    private Short humstatus;

    public NFCTemperatureData(Integer id, Integer uid, String goodsname, String daterecordtime, Float maxtemperature, Float mintemperature, Float temperature, Short tempstatus, Float maxhum, Float minhum, Float hum, Short humstatus) {
        this.id = id;
        this.uid = uid;
        this.goodsname = goodsname;
        this.daterecordtime = daterecordtime;
        this.maxtemperature = maxtemperature;
        this.mintemperature = mintemperature;
        this.temperature = temperature;
        this.tempstatus = tempstatus;
        this.maxhum = maxhum;
        this.minhum = minhum;
        this.hum = hum;
        this.humstatus = humstatus;
    }

    public NFCTemperatureData() {
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

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getDaterecordtime() {
        return daterecordtime;
    }

    public void setDaterecordtime(String daterecordtime) {
        this.daterecordtime = daterecordtime == null ? null : daterecordtime.trim();
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

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Short getTempstatus() {
        return tempstatus;
    }

    public void setTempstatus(Short tempstatus) {
        this.tempstatus = tempstatus;
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

    public Float getHum() {
        return hum;
    }

    public void setHum(Float hum) {
        this.hum = hum;
    }

    public Short getHumstatus() {
        return humstatus;
    }

    public void setHumstatus(Short humstatus) {
        this.humstatus = humstatus;
    }
}