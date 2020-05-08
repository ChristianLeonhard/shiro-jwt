package com.eleven.shiro.core.mapper.system;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.eleven.shiro.core.entity.system.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysRoleMapper extends BaseMapper<SysRole> {

}
