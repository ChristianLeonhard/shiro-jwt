package com.eleven.shiro.core.entity.system;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data //提供读写属性、提供equals()、hashCode()、toString() 方法
@NoArgsConstructor //提供无参构造函数
@AllArgsConstructor //提供全参构造函数
@Builder //提供一个内部的Builder
public class SysUser implements Serializable {


    @TableId
    private String id;
    private String username;
    private Integer age;
    private String password;
    private Integer status;
    @TableField(exist = false)
    private List<SysRole> roles;
    private Date createDate;

    private static final long serialVersionUID = 1L;

}
