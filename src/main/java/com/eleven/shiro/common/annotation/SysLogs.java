package com.eleven.shiro.common.annotation;

import java.lang.annotation.*;

/**
 * @author Eleven
 * @version 2019/4/27/17:36
 * 系统日志
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLogs {

    String value();

}
