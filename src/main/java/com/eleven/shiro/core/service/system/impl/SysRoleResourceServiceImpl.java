package com.eleven.shiro.core.service.system.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eleven.shiro.core.entity.system.SysResource;
import com.eleven.shiro.core.entity.system.SysRoleResource;
import com.eleven.shiro.core.mapper.system.SysRolePermissionMapper;
import com.eleven.shiro.core.service.system.SysResourceService;
import com.eleven.shiro.core.service.system.SysRoleResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eleven
 * @version 2019/4/16/9:01
 */
@Service
@Transactional
public class SysRoleResourceServiceImpl extends ServiceImpl<SysRolePermissionMapper, SysRoleResource>
        implements SysRoleResourceService {

    @Autowired
    private SysResourceService resourceService;

    @Override
    public List<SysResource> findAllResourceByRoleId(String rid) {
        List<SysRoleResource> rps = this.selectList(new EntityWrapper<SysRoleResource>().eq("rid", rid));
        if (rps != null) {
            List<String> pids = new ArrayList<>();
            rps.forEach(v -> pids.add(v.getPid()));
            if (pids.size() == 0) {
                return null;
            }
            return resourceService.selectList(new EntityWrapper<SysResource>()
                    .in("id", pids)
                    .orderBy("sort", true)
            );
        }
        return null;
    }
}
