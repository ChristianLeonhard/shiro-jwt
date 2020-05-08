package com.eleven.shiro.common.service;

import com.baomidou.mybatisplus.plugins.Page;

/**
 * @param <E>  控制器对象实体
 * @param <FD> 查找DTO
 * @author Eleven
 * @version 2019/5/25/13:14
 * @see BaseService 注释配置请参见BaseService
 */
public interface QueryService<E, FD> {

    Page<E> list(FD findDTO);

}
