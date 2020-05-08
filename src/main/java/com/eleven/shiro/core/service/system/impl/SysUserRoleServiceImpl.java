package com.eleven.shiro.core.service.system.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eleven.shiro.core.entity.system.SysUserRole;
import com.eleven.shiro.core.mapper.system.SysUserRoleMapper;
import com.eleven.shiro.core.service.system.SysUserRoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Eleven
 * @version 2019/4/16/11:32
 */
@Service
@Transactional
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService {
}
