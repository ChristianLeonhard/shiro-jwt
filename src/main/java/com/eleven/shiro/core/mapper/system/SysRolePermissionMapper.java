package com.eleven.shiro.core.mapper.system;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.eleven.shiro.core.entity.system.SysRoleResource;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Eleven
 * @version 2019/4/16/9:00
 */
@Mapper
@Repository
public interface SysRolePermissionMapper extends BaseMapper<SysRoleResource> {
}
