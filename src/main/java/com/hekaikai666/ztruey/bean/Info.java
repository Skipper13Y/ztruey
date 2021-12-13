package com.hekaikai666.ztruey.bean;

public class Info {
    private String username;
    private String password;
    private String perm;

    @Override
    public String toString() {
        return "Info{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", perm='" + perm + '\'' +
                '}';
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

    public String getPerm() {
        return perm;
    }

    public void setPerm(String perm) {
        this.perm = perm;
    }
}
