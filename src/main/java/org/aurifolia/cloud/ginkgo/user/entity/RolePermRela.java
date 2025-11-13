package org.aurifolia.cloud.ginkgo.user.entity;

import lombok.Data;
import java.time.LocalDateTime;

/**
 * 角色和权限关联实体类
 */
@Data
public class RolePermRela {
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