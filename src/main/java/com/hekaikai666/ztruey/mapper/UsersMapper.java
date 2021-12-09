package com.hekaikai666.ztruey.mapper;

import com.hekaikai666.ztruey.bean.Users;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    Users getUserInfo(@Param("username") String username, @Param("password") String password);
}
