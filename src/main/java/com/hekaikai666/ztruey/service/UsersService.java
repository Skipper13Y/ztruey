package com.hekaikai666.ztruey.service;

import com.hekaikai666.ztruey.bean.Users;

public interface UsersService {
    Users loginIn(String name, String password);
}
