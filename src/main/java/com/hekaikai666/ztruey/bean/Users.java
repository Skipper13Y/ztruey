package com.hekaikai666.ztruey.bean;

import java.util.Objects;

public class Users {
    private int id;
    private String username;
    private String password;
    private String VerifyCode;

    public Users() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerifyCode() {
        return VerifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        VerifyCode = verifyCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Users)) return false;
        Users users = (Users) o;
        return getId() == users.getId() &&
                Objects.equals(getUsername(), users.getUsername()) &&
                Objects.equals(getPassword(), users.getPassword()) &&
                Objects.equals(getVerifyCode(), users.getVerifyCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUsername(), getPassword(), getVerifyCode());
    }
}
