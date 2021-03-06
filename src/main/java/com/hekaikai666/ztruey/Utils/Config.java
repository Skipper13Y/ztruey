package com.hekaikai666.ztruey.Utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 配置内部类
 */
@Controller
@Configuration
class Config {
    /**
     * 获取日志对象，构造函数传入当前类，查找日志方便定位
     */
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Value("${user.home}")
    private String userName;

    /**
     * 端口
     */
    @Value("${server.port}")
    private String port;

    /**
     * 启动成功
     */
    @Bean
    public ApplicationRunner applicationRunner() {
        return applicationArguments -> {
            try {
                InetAddress ia = InetAddress.getLocalHost();
                //获取本机内网IP
                log.info("启动成功：" + "http://" + ia.getHostAddress() + ":" + port + "/");
                log.info("${user.home} ：" + userName);
            } catch (UnknownHostException ex) {
                ex.printStackTrace();
            }
        };
    }
}
