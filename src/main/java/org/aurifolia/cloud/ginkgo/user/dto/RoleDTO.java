package org.aurifolia.cloud.ginkgo.user.dto;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 角色DTO
 */
@Data
public class RoleDTO {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 角色描述
     */
    private String roleDesc;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 角色关联的权限列表
     */
    private List<PermDTO> perms;
}