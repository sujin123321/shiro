package com.king.shiro.mapper;

import com.king.shiro.model.UserRole;

public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);
}