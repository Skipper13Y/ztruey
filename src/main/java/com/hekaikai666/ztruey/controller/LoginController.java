package com.hekaikai666.ztruey.controller;

import com.hekaikai666.ztruey.Code.Dict;
import com.hekaikai666.ztruey.bean.Users;
import com.hekaikai666.ztruey.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    // Service自动注入到Controller
    @Autowired
    UsersService usersService;

    @RequestMapping("/login")
    public String show() {
        return Dict.login;
    }

    @RequestMapping(value = "/loginIn", method = RequestMethod.POST)
    public String login(String username, String password) {
        Users users = usersService.loginIn(username, password);
        if (users != null) {
            return Dict.success;
        } else {
            return Dict.error;
        }
    }

    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    @ResponseBody
    public String userLogin(Users users) {
        System.out.println(users);
        return Dict.success;
    }
}
