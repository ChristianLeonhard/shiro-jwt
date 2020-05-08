package com.eleven.shiro.common.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.eleven.shiro.common.bean.ResponseCode;
import com.eleven.shiro.common.bean.ResponseResult;
import com.eleven.shiro.common.service.QueryService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @param <E>  控制器对象实体
 * @param <FD> 查找DTO
 * @param <S>  服务对象
 * @author Eleven
 * @version 2019/5/25/13:27
 */
public interface QueryController<E, FD, S extends QueryService<E, FD>> {

    S getService();

    @PostMapping("/list")
    @ApiOperation(value = "分页获取所有列表")
    @ApiImplicitParam(paramType = "header", name = "Authorization", value = "身份认证Token", required = true)
    default ResponseResult<Page<E>> list(@RequestBody FD findDTO) {
        return ResponseResult.e(ResponseCode.OK, getService().list(findDTO));
    }

}
