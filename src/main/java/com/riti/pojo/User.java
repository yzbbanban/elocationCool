package com.riti.pojo;

import java.util.Date;

public class User {
    private String coolUserId;

    private String coolCompanyId;

    private String coolUserName;

    private String coolUserPassword;

    private String coolUserToken;

    private String coolUserNick;

    private String coolUserGender;

    private String coolUserEmail;

    private Date coolCreateTime;

    private Integer coolUserLevel;

    private Date coolUserUpdateTime;

    public User() {
        super();
    }

    public User(String coolUserId, String coolCompanyId, String coolUserName, String coolUserPassword, String coolUserToken, String coolUserNick, String coolUserGender, String coolUserEmail, Date coolCreateTime, Integer coolUserLevel, Date coolUserUpdateTime) {
        this.coolUserId = coolUserId;
        this.coolCompanyId = coolCompanyId;
        this.coolUserName = coolUserName;
        this.coolUserPassword = coolUserPassword;
        this.coolUserToken = coolUserToken;
        this.coolUserNick = coolUserNick;
        this.coolUserGender = coolUserGender;
        this.coolUserEmail = coolUserEmail;
        this.coolCreateTime = coolCreateTime;
        this.coolUserLevel = coolUserLevel;
        this.coolUserUpdateTime = coolUserUpdateTime;
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

    public String getCoolUserName() {
        return coolUserName;
    }

    public void setCoolUserName(String coolUserName) {
        this.coolUserName = coolUserName == null ? null : coolUserName.trim();
    }

    public String getCoolUserPassword() {
        return coolUserPassword;
    }

    public void setCoolUserPassword(String coolUserPassword) {
        this.coolUserPassword = coolUserPassword == null ? null : coolUserPassword.trim();
    }

    public String getCoolUserToken() {
        return coolUserToken;
    }

    public void setCoolUserToken(String coolUserToken) {
        this.coolUserToken = coolUserToken == null ? null : coolUserToken.trim();
    }

    public String getCoolUserNick() {
        return coolUserNick;
    }

    public void setCoolUserNick(String coolUserNick) {
        this.coolUserNick = coolUserNick == null ? null : coolUserNick.trim();
    }

    public String getCoolUserGender() {
        return coolUserGender;
    }

    public void setCoolUserGender(String coolUserGender) {
        this.coolUserGender = coolUserGender == null ? null : coolUserGender.trim();
    }

    public String getCoolUserEmail() {
        return coolUserEmail;
    }

    public void setCoolUserEmail(String coolUserEmail) {
        this.coolUserEmail = coolUserEmail == null ? null : coolUserEmail.trim();
    }

    public Date getCoolCreateTime() {
        return coolCreateTime;
    }

    public void setCoolCreateTime(Date coolCreateTime) {
        this.coolCreateTime = coolCreateTime;
    }

    public Integer getCoolUserLevel() {
        return coolUserLevel;
    }

    public void setCoolUserLevel(Integer coolUserLevel) {
        this.coolUserLevel = coolUserLevel;
    }

    public Date getCoolUserUpdateTime() {
        return coolUserUpdateTime;
    }

    public void setCoolUserUpdateTime(Date coolUserUpdateTime) {
        this.coolUserUpdateTime = coolUserUpdateTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "coolUserId='" + coolUserId + '\'' +
                ", coolCompanyId='" + coolCompanyId + '\'' +
                ", coolUserName='" + coolUserName + '\'' +
                ", coolUserPassword='" + coolUserPassword + '\'' +
                ", coolUserToken='" + coolUserToken + '\'' +
                ", coolUserNick='" + coolUserNick + '\'' +
                ", coolUserGender='" + coolUserGender + '\'' +
                ", coolUserEmail='" + coolUserEmail + '\'' +
                ", coolCreateTime=" + coolCreateTime +
                ", coolUserLevel=" + coolUserLevel +
                ", coolUserUpdateTime=" + coolUserUpdateTime +
                '}';
    }
}