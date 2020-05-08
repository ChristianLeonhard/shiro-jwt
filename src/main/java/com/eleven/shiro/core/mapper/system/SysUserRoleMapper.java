package com.eleven.shiro.core.mapper.system;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.eleven.shiro.core.entity.system.SysUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Eleven
 * @version 2019/4/16/11:31
 */
@Mapper
@Repository
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {
}
