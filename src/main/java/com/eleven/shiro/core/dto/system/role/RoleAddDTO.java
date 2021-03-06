package com.eleven.shiro.core.dto.system.role;

import com.eleven.shiro.core.entity.system.SysResource;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;
import java.util.List;

/**
 * @author Eleven
 * @version 2019/4/19/14:28
 */
@Data
public class RoleAddDTO {

    @NotBlank(message = "姓名不能为空")
    private String name;

    @Size(min = 1, message = "请至少选择一个权限资源")
    private List<SysResource> resources;

}
