package org.aurifolia.cloud.ginkgo.user.dto;

import lombok.Data;
import java.time.LocalDateTime;

/**
 * 角色权限关联DTO
 */
@Data
public class RolePermDTO {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 权限ID
     */
    private Long permId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;
}