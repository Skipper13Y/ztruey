package com.hekaikai666.ztruey.bean;

import java.util.Objects;

public class Users {
    private String userId;
    private String userName;
    private String userType;
    private String state;
    private String name;
    private String idType;
    private String idNo;
    private String telephone;
    private String mobile;
    private String email;
    private String city;
    private String address;
    private String zipcode;
    private String gender;
    private String title;
    private String enname;
    private String birthday;
    private String createDiv;
    private String createTime;
    private String createUser;
    private String updateTime;
    private String updateUser;

    // 参数接收
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCreateDiv() {
        return createDiv;
    }

    public void setCreateDiv(String createDiv) {
        this.createDiv = createDiv;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Users)) return false;
        Users users = (Users) o;
        return Objects.equals(getUserId(), users.getUserId()) &&
                Objects.equals(getUserName(), users.getUserName()) &&
                Objects.equals(getUserType(), users.getUserType()) &&
                Objects.equals(getState(), users.getState()) &&
                Objects.equals(getName(), users.getName()) &&
                Objects.equals(getIdType(), users.getIdType()) &&
                Objects.equals(getIdNo(), users.getIdNo()) &&
                Objects.equals(getTelephone(), users.getTelephone()) &&
                Objects.equals(getMobile(), users.getMobile()) &&
                Objects.equals(getEmail(), users.getEmail()) &&
                Objects.equals(getCity(), users.getCity()) &&
                Objects.equals(getAddress(), users.getAddress()) &&
                Objects.equals(getZipcode(), users.getZipcode()) &&
                Objects.equals(getGender(), users.getGender()) &&
                Objects.equals(getTitle(), users.getTitle()) &&
                Objects.equals(getEnname(), users.getEnname()) &&
                Objects.equals(getBirthday(), users.getBirthday()) &&
                Objects.equals(getCreateDiv(), users.getCreateDiv()) &&
                Objects.equals(getCreateTime(), users.getCreateTime()) &&
                Objects.equals(getCreateUser(), users.getCreateUser()) &&
                Objects.equals(getUpdateTime(), users.getUpdateTime()) &&
                Objects.equals(getUpdateUser(), users.getUpdateUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getUserName(), getUserType(), getState(), getName(), getIdType(), getIdNo(), getTelephone(), getMobile(), getEmail(), getCity(), getAddress(), getZipcode(), getGender(), getTitle(), getEnname(), getBirthday(), getCreateDiv(), getCreateTime(), getCreateUser(), getUpdateTime(), getUpdateUser());
    }
}
