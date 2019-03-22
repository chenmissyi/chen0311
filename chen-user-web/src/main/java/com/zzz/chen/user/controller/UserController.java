package com.zzz.chen.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zzz.chen.bean.UserInfo;
import com.zzz.chen.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("getAllUserInfo")
    public List<UserInfo> getAllUserInfo(){
        return userService.getAllUser();
    }
}
