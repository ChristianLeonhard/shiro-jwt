package com.eleven.shiro.core.entity.system;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Eleven
 * @version 2019/4/27/17:20
 */
@Data
public class SysLog implements Serializable {

    @TableId
    private String id;

    private String username;

    private String uid;

    private String ip;

    private Integer ajax;

    private String uri;

    private String params;

    private String httpMethod;

    private String classMethod;

    private String actionName;

    private Date createDate;


}
