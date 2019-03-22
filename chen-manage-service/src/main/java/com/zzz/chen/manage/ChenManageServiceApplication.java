package com.zzz.chen.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.zzz.chen.manage.mapper")
public class ChenManageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChenManageServiceApplication.class, args);
    }

}
