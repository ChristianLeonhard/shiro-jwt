package com.eleven.shiro.core.controller.system;

import com.eleven.shiro.common.bean.ResponseCode;
import com.eleven.shiro.common.bean.ResponseResult;
import com.eleven.shiro.common.controller.QueryController;
import com.eleven.shiro.core.dto.system.log.FindLogDTO;
import com.eleven.shiro.core.entity.system.SysLog;
import com.eleven.shiro.core.service.system.SysLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Eleven
 * @version 2019/4/28/10:22
 */
@RestController
@RequestMapping(value = "/system/log")
@Api(tags = {"日志管理"})
@CrossOrigin
public class LogController implements QueryController<SysLog, FindLogDTO, SysLogService> {

    @Autowired
    private SysLogService sysLogService;

    @Override
    public SysLogService getService() {
        return sysLogService;
    }

    @PostMapping("/remove")
    @ApiOperation("批量删除")
    @ApiImplicitParam(paramType = "header", name = "Authorization", value = "身份认证Token")
    public ResponseResult removeList(@RequestBody @ApiParam("ID集合") List<String> logList) {
        sysLogService.remove(logList);
        return ResponseResult.e(ResponseCode.OK);
    }

}
