package com.eleven.shiro.common.service;

/**
 * @param <AD> 添加DTO
 * @author Eleven
 * @version 2019/5/25/13:13
 * @see BaseService 注释配置请参见BaseService
 */
public interface CreateService<AD> {

    void add(AD addDTO);

}
