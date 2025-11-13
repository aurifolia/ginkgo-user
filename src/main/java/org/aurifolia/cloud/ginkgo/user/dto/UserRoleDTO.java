package org.aurifolia.cloud.ginkgo.user.dto;

import lombok.Data;
import java.time.LocalDateTime;

/**
 * 用户角色关联DTO
 */
@Data
public class UserRoleDTO {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;
}