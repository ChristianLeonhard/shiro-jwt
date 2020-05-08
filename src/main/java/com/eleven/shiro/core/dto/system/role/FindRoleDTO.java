package com.eleven.shiro.core.dto.system.role;

import com.eleven.shiro.core.dto.SplitPageDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Eleven
 * @version 2019/4/19/9:42
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class FindRoleDTO extends SplitPageDTO {

    private Boolean hasResource = true;

}
