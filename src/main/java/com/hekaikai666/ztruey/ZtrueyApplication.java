package com.hekaikai666.ztruey;

import com.hekaikai666.ztruey.Code.Dict;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(Dict.mapper)
public class ZtrueyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZtrueyApplication.class, args);
    }

}
