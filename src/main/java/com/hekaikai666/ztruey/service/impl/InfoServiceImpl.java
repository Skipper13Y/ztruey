package com.hekaikai666.ztruey.service.impl;

import com.hekaikai666.ztruey.bean.Info;
import com.hekaikai666.ztruey.mapper.InfoDao;
import com.hekaikai666.ztruey.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    InfoDao dao;

    /**
     * 通过用户名查询用户信息
     *
     * @param username
     * @return Info 用户信息对象
     */
    @Override
    public Info queryByName(String username) {
        return dao.queryByName(username);
    }
}
