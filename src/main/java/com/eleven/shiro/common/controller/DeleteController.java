package com.eleven.shiro.common.controller;

import com.eleven.shiro.common.annotation.SysLogs;
import com.eleven.shiro.common.bean.ResponseCode;
import com.eleven.shiro.common.bean.ResponseResult;
import com.eleven.shiro.common.service.DeleteService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @param <UID> 对象ID
 * @param <S>   服务对象
 * @author Eleven
 * @version 2019/5/25/13:27
 */
public interface DeleteController<UID, S extends DeleteService<UID>> {

    S getService();

    @PostMapping("/remove/{id}")
    @ApiOperation(value = "删除指定ID的对象")
    @SysLogs("删除指定ID的对象")
    @ApiImplicitParam(paramType = "header", name = "Authorization", value = "身份认证Token", required = true)
    default ResponseResult remove(@PathVariable("id") UID id) {
        getService().remove(id);
        return ResponseResult.e(ResponseCode.OK);
    }

}
