package com.hekaikai666.ztruey.mapper;

import com.hekaikai666.ztruey.bean.Users;

public interface UsersMapper {
    Users getUserInfo(String name, String password);
}
