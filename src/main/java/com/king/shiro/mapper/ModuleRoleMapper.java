package com.king.shiro.mapper;

import com.king.shiro.model.ModuleRole;

public interface ModuleRoleMapper {
    int insert(ModuleRole record);

    int insertSelective(ModuleRole record);
}