package com.hekaikai666.ztruey.controller;

import com.hekaikai666.ztruey.bean.Users;
import com.hekaikai666.ztruey.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    // Service自动注入到Controller
    @Autowired
    UsersService usersService;

    @RequestMapping("/login")
    public String show() {
        return "login";
    }

    @RequestMapping(value = "/loginIn", method = RequestMethod.POST)
    public String login(String name, String password) {
        Users users = usersService.loginIn(name, password);
        if (users != null) {
            return "success";
        } else {
            return "error";
        }
    }
}
