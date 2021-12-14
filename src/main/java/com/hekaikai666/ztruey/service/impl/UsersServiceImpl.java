package com.hekaikai666.ztruey.service.impl;

import com.hekaikai666.ztruey.Code.Const;
import com.hekaikai666.ztruey.Code.Dict;
import com.hekaikai666.ztruey.bean.Users;
import com.hekaikai666.ztruey.mapper.UserPinMapper;
import com.hekaikai666.ztruey.mapper.UsersMapper;
import com.hekaikai666.ztruey.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UsersServiceImpl implements UsersService {

    // 将Dao注入到Service中
    @Autowired
    private UsersMapper userMapper;

    private UserPinMapper userPinMapper;

    @Override
    public Users loginIn(String username, String password) {
        return userMapper.getUserInfo(username, password);
    }

    @Override
    public boolean loginCheck(Users users) {
        Map<String,Object> params = new HashMap<>();
        params.put(Dict.UserName,users.getUserName());
        params.put(Dict.State, Const.State.A);
        params.put(Dict.UserType,Const.UserType.P);
        userMapper.selectUserInfoByUserName(params);
//        userPinMapper.selectUserPinInfoByUserId(users.getUserId());
        return false;
    }
}
