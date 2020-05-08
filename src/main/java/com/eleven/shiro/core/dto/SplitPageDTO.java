package com.eleven.shiro.core.dto;

import lombok.Data;

/**
 * @author Eleven
 * @version 2019/4/18/14:17
 */
@Data
public abstract class SplitPageDTO {

    private Integer page = 1;

    private Integer pageSize = 10;

    private Boolean asc = false;

}
