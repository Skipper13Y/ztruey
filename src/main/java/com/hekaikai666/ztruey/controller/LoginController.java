package com.hekaikai666.ztruey.controller;


import com.alibaba.fastjson.JSONObject;
import com.hekaikai666.ztruey.Code.Dict;
import com.hekaikai666.ztruey.bean.Users;
import com.hekaikai666.ztruey.service.UsersService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
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

    @ResponseBody
    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    public String userLogin(@RequestBody JSONObject jsonParam) {
        Users user = JSONObject.toJavaObject(jsonParam, Users.class);//将建json对象转换为Person对象
        System.out.println(user.toString());
        return Dict.success;
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
//        return Dict.success;
//    }
}
