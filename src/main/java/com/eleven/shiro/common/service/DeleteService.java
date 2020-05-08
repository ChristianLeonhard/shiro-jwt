package com.eleven.shiro.common.service;

/**
 * @param <UID> 对象ID
 * @author Eleven
 * @version 2019/5/25/13:14
 * @see BaseService 注释配置请参见BaseService
 */
public interface DeleteService<UID> {

    void remove(UID id);

}
