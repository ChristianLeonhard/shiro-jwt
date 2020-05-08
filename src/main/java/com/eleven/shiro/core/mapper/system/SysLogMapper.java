package com.eleven.shiro.core.mapper.system;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.eleven.shiro.core.entity.system.SysLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Eleven
 * @version 2019/4/28/9:56
 */
@Mapper
@Repository
public interface SysLogMapper extends BaseMapper<SysLog> {
}
