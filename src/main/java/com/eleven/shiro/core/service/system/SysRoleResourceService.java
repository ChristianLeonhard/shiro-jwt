package com.eleven.shiro.core.service.system;

import com.baomidou.mybatisplus.service.IService;
import com.eleven.shiro.core.entity.system.SysResource;
import com.eleven.shiro.core.entity.system.SysRoleResource;

import java.util.List;

/**
 * @author Eleven
 * @version 2019/4/16/9:01
 */
public interface SysRoleResourceService extends IService<SysRoleResource> {

    List<SysResource> findAllResourceByRoleId(String rid);

}
