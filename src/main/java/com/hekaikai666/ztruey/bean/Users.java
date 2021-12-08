package com.hekaikai666.ztruey.bean;

import java.util.Objects;

public class Users {
    private int id;
    private String name;
    private String password;

    public Users() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (o == null || getClass() != o.getClass()) return false;
        Users userBean = (Users) o;
        return id == userBean.id &&
                Objects.equals(name, userBean.name) &&
                Objects.equals(password, userBean.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password);
    }
}