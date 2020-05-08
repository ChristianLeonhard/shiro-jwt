package com.eleven.shiro.core.service.system;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.eleven.shiro.common.service.QueryService;
import com.eleven.shiro.core.dto.system.log.FindLogDTO;
import com.eleven.shiro.core.entity.system.SysLog;

import java.util.List;

/**
 * @author Eleven
 * @version 2019/4/28/9:56
 */
public interface SysLogService extends IService<SysLog>, QueryService<SysLog, FindLogDTO> {

    Page<SysLog> list(FindLogDTO findLogDTO);

    void remove(List<String> idList);

}
