package com.eleven.shiro.core.controller.system;

import com.eleven.shiro.common.controller.CrudController;
import com.eleven.shiro.core.dto.system.role.FindRoleDTO;
import com.eleven.shiro.core.dto.system.role.RoleAddDTO;
import com.eleven.shiro.core.dto.system.role.RoleUpdateDTO;
import com.eleven.shiro.core.entity.system.SysRole;
import com.eleven.shiro.core.service.system.SysRoleService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author Eleven
 * @version 2019/4/19/9:41
 */
@RestController
@RequestMapping(value = {"/system/role"})
@Api(tags = {"角色管理"})
public class RoleController implements CrudController<SysRole, RoleAddDTO, RoleUpdateDTO, String, FindRoleDTO,
        SysRoleService> {

    private final SysRoleService sysRoleService;

    @Autowired
    public RoleController(SysRoleService sysRoleService) {
        this.sysRoleService = sysRoleService;
    }

    @Override
    public SysRoleService getService() {
        return sysRoleService;
    }
}
