package org.aurifolia.cloud.ginkgo.user.entity;

import lombok.Data;
import java.time.LocalDateTime;

/**
 * 用户和角色关联实体类
 */
@Data
public class UserRoleRela {
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