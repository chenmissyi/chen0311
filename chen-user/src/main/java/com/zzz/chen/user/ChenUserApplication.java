package com.zzz.chen.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.zzz.chen.user.mapper")
public class ChenUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChenUserApplication.class, args);
    }

}
