package com.hekaikai666.ztruey.Code;

public class SqlCode {
    /**
     * 通过登录名查询用户信息
     */
    public static final String queryByName = "SELECT * FROM info WHERE username = #{username}";
}
