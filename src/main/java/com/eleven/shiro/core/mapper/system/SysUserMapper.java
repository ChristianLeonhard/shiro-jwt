package com.eleven.shiro.core.mapper.system;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.eleven.shiro.core.entity.system.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysUserMapper extends BaseMapper<SysUser> {

}
