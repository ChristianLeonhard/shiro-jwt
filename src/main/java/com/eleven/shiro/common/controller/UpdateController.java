package com.eleven.shiro.common.controller;

import com.eleven.shiro.common.annotation.SysLogs;
import com.eleven.shiro.common.bean.ResponseCode;
import com.eleven.shiro.common.bean.ResponseResult;
import com.eleven.shiro.common.service.UpdateService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @param <UD>  更新DTO
 * @param <UID> 对象ID
 * @param <S>   服务对象
 * @author Eleven
 * @version 2019/5/25/13:27
 */
public interface UpdateController<UID, UD, S extends UpdateService<UID, UD>> {

    S getService();

    @PostMapping("/update/{id}")
    @ApiOperation(value = "更新指定ID对象的信息")
    @SysLogs("更新指定ID对象的信息")
    @ApiImplicitParam(paramType = "header", name = "Authorization", value = "身份认证Token", required = true)
    default ResponseResult update(@PathVariable("id") UID id, @RequestBody @Validated UD updateDTO) {
        getService().update(id, updateDTO);
        return ResponseResult.e(ResponseCode.OK);
    }

}
