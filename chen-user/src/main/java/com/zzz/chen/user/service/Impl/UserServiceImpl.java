package com.zzz.chen.user.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zzz.chen.service.UserService;
import com.zzz.chen.bean.UserInfo;
import com.zzz.chen.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> getAllUser() {
        return userInfoMapper.selectAll();
    }
}
