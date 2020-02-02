package com.king.shiro.biz.impl;

import com.king.shiro.biz.IUserBiz;
import com.king.shiro.mapper.UserMapper;
import com.king.shiro.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBizImpl implements IUserBiz {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserName(String username) {
        return userMapper.queryUserName(username);
    }
}
