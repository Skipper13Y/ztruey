package com.hekaikai666.ztruey.controller;

import com.hekaikai666.ztruey.Code.Dict;
import com.hekaikai666.ztruey.Code.ReqCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("")
public class helloController {

    /**
     * 首次进入跳转至登录页面
     * @return index.html
     */
    @RequestMapping("/")
    public String sayHello() {
        return Dict.index;
    }

    /**
     * 跳转到测试登录界面
     * @return
     */
    @RequestMapping("/hello")
    public String sayHello2() {
        return "static/html/login";
    }
}
