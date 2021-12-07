package com.hekaikai666.ztruey.controller;

import com.hekaikai666.ztruey.Code.Dict;
import com.hekaikai666.ztruey.Code.ReqCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController {

    @RequestMapping(ReqCode.index)
    public String sayHello() {
        return Dict.index;
    }
}
