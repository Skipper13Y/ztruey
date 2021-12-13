package com.hekaikai666.ztruey.controller;


import com.alibaba.fastjson.JSONObject;
import com.hekaikai666.ztruey.Code.ReqCode;
import com.hekaikai666.ztruey.bean.Users;
import com.hekaikai666.ztruey.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class LoginController {
    // Service自动注入到Controller
    @Autowired
    UsersService usersService;

    @RequestMapping("/login")
    public String show() {
        return ReqCode.login;
    }

    @RequestMapping(value = "/loginIn", method = RequestMethod.POST)
    public String login(String username, String password) {
        Users users = usersService.loginIn(username, password);
        if (users != null) {
            return ReqCode.success;
        } else {
            return ReqCode.error;
        }
    }

    @ResponseBody
    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    public String userLogin(@RequestBody JSONObject jsonParam, Map<String, Object> resp) {
        Users user = JSONObject.toJavaObject(jsonParam, Users.class);//将建json对象转换为Person对象
        // 1.检查用户信息
        if (usersService.loginCheck(user)) {

        } else {
            // 密码错误,返回前端提示 RespCode.PWD_NOT_MATCHED
        }
        System.out.println(user.toString());
//        resp.put(ReqCode)
        return ReqCode.success;
    }
//    @ResponseBody
//    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
//    public String userLogin(@RequestBody JSONObject jsonParam) {
//        Users user = JSONObject.toJavaObject(jsonParam,Users.class);//将建json对象转换为Person对象
//        String username = user.getUsername();
//        String password = user.getPassword();
//        try {
//            //获取当前的用户
//            Subject subject = SecurityUtils.getSubject();
//            //封装用户的登录数据
//            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, password);
//            subject.login(usernamePasswordToken);//执行登录的方法 没有异常就成功了
//            return "index";
//        } catch (UnknownAccountException e) {
//            /**
//             * 异常信息
//             * UnknownAccountException ：用户名不存在
//             * IncorrectCredentialsException：密码错误
//             */
//            e.printStackTrace();
//            System.out.println("用户名不存在");
//        }catch (IncorrectCredentialsException e){
//            System.out.println("密码错误");
//        }
//        return ReqCode.success;
//    }
}
