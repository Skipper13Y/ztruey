package com.hekaikai666.ztruey.service.impl;

import com.hekaikai666.ztruey.bean.Users;
import com.hekaikai666.ztruey.mapper.UsersMapper;
import com.hekaikai666.ztruey.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    // 将Dao注入到Service中
    @Autowired
    private UsersMapper userMapper;

    @Override
    public Users loginIn(String username, String password) {
        return userMapper.getUserInfo(username, password);
    }
}
