package com.eleven.shiro.core.vo.system;

import com.eleven.shiro.core.entity.system.SysResource;
import com.eleven.shiro.core.entity.system.SysRole;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author Eleven
 * @version 2019/4/18/11:34
 */
@Data
public class SysUserVO {

    private String id;
    private String username;
    private Integer age;
    private Integer status;
    private List<SysRole> roles;
    private Date createDate;
    private List<SysResource> resources;

}
