package com.riti.pojo;

public class NFCTemperatureData {
    private Integer id;

    private Integer uid;

    private String goodsname;

    private String daterecordtime;

    private Double maxtemperature;

    private Double mintemperature;

    private Double temperature;

    private Integer tempstatus;

    private Double maxhum;

    private Double minhum;

    private Double hum;

    private Integer humstatus;

    public NFCTemperatureData(Integer id, Integer uid, String goodsname, String daterecordtime, Double maxtemperature, Double mintemperature, Double temperature, Integer tempstatus, Double maxhum, Double minhum, Double hum, Integer humstatus) {
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

    public Double getMaxtemperature() {
        return maxtemperature;
    }

    public void setMaxtemperature(Double maxtemperature) {
        this.maxtemperature = maxtemperature;
    }

    public Double getMintemperature() {
        return mintemperature;
    }

    public void setMintemperature(Double mintemperature) {
        this.mintemperature = mintemperature;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Integer getTempstatus() {
        return tempstatus;
    }

    public void setTempstatus(Integer tempstatus) {
        this.tempstatus = tempstatus;
    }

    public Double getMaxhum() {
        return maxhum;
    }

    public void setMaxhum(Double maxhum) {
        this.maxhum = maxhum;
    }

    public Double getMinhum() {
        return minhum;
    }

    public void setMinhum(Double minhum) {
        this.minhum = minhum;
    }

    public Double getHum() {
        return hum;
    }

    public void setHum(Double hum) {
        this.hum = hum;
    }

    public Integer getHumstatus() {
        return humstatus;
    }

    public void setHumstatus(Integer humstatus) {
        this.humstatus = humstatus;
    }
}