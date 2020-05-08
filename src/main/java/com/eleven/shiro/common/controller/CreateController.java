package com.eleven.shiro.common.controller;

import com.eleven.shiro.common.annotation.SysLogs;
import com.eleven.shiro.common.bean.ResponseCode;
import com.eleven.shiro.common.bean.ResponseResult;
import com.eleven.shiro.common.service.CreateService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @param <AD> 添加DTO
 * @param <S>  服务对象
 * @author Eleven
 * @version 2019/5/25/12:54
 */
public interface CreateController<AD, S extends CreateService<AD>> {

    S getService();

    @PostMapping("/add")
    @ApiOperation(value = "添加新增")
    @SysLogs("添加新增")
    @ApiImplicitParam(paramType = "header", name = "Authorization", value = "身份认证Token", required = true)
    default ResponseResult add(@RequestBody @Validated AD a) {
        getService().add(a);
        return ResponseResult.e(ResponseCode.OK);
    }
}
