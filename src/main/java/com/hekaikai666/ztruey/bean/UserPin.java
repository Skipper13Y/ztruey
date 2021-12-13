package com.hekaikai666.ztruey.bean;

import java.util.Objects;

public class UserPin {
    private String userId;
    private String password;
    private String state;
    private String expireType;
    private String effectTime;
    private String expireTime;
    private String pwdErrCount;
    private String pwdErrTime;
    private String pwdLastUpdate;
    private String pwdLastUnlock;
    private String pwdFirstLogin;
    private String pwdLastLogin;
    private String pwdLastClient;
    private String loginCount;
    private String nickname;
    private String reserve;
    private String icon;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getExpireType() {
        return expireType;
    }

    public void setExpireType(String expireType) {
        this.expireType = expireType;
    }

    public String getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(String effectTime) {
        this.effectTime = effectTime;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getPwdErrCount() {
        return pwdErrCount;
    }

    public void setPwdErrCount(String pwdErrCount) {
        this.pwdErrCount = pwdErrCount;
    }

    public String getPwdErrTime() {
        return pwdErrTime;
    }

    public void setPwdErrTime(String pwdErrTime) {
        this.pwdErrTime = pwdErrTime;
    }

    public String getPwdLastUpdate() {
        return pwdLastUpdate;
    }

    public void setPwdLastUpdate(String pwdLastUpdate) {
        this.pwdLastUpdate = pwdLastUpdate;
    }

    public String getPwdLastUnlock() {
        return pwdLastUnlock;
    }

    public void setPwdLastUnlock(String pwdLastUnlock) {
        this.pwdLastUnlock = pwdLastUnlock;
    }

    public String getPwdFirstLogin() {
        return pwdFirstLogin;
    }

    public void setPwdFirstLogin(String pwdFirstLogin) {
        this.pwdFirstLogin = pwdFirstLogin;
    }

    public String getPwdLastLogin() {
        return pwdLastLogin;
    }

    public void setPwdLastLogin(String pwdLastLogin) {
        this.pwdLastLogin = pwdLastLogin;
    }

    public String getPwdLastClient() {
        return pwdLastClient;
    }

    public void setPwdLastClient(String pwdLastClient) {
        this.pwdLastClient = pwdLastClient;
    }

    public String getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(String loginCount) {
        this.loginCount = loginCount;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserPin)) return false;
        UserPin userPin = (UserPin) o;
        return Objects.equals(getUserId(), userPin.getUserId()) &&
                Objects.equals(getPassword(), userPin.getPassword()) &&
                Objects.equals(getState(), userPin.getState()) &&
                Objects.equals(getExpireType(), userPin.getExpireType()) &&
                Objects.equals(getEffectTime(), userPin.getEffectTime()) &&
                Objects.equals(getExpireTime(), userPin.getExpireTime()) &&
                Objects.equals(getPwdErrCount(), userPin.getPwdErrCount()) &&
                Objects.equals(getPwdErrTime(), userPin.getPwdErrTime()) &&
                Objects.equals(getPwdLastUpdate(), userPin.getPwdLastUpdate()) &&
                Objects.equals(getPwdLastUnlock(), userPin.getPwdLastUnlock()) &&
                Objects.equals(getPwdFirstLogin(), userPin.getPwdFirstLogin()) &&
                Objects.equals(getPwdLastLogin(), userPin.getPwdLastLogin()) &&
                Objects.equals(getPwdLastClient(), userPin.getPwdLastClient()) &&
                Objects.equals(getLoginCount(), userPin.getLoginCount()) &&
                Objects.equals(getNickname(), userPin.getNickname()) &&
                Objects.equals(getReserve(), userPin.getReserve()) &&
                Objects.equals(getIcon(), userPin.getIcon());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getPassword(), getState(), getExpireType(), getEffectTime(), getExpireTime(), getPwdErrCount(), getPwdErrTime(), getPwdLastUpdate(), getPwdLastUnlock(), getPwdFirstLogin(), getPwdLastLogin(), getPwdLastClient(), getLoginCount(), getNickname(), getReserve(), getIcon());
    }
}
