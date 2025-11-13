package org.aurifolia.cloud.ginkgo.user.entity;

import lombok.Data;
import java.time.LocalDateTime;

/**
 * 角色信息实体类
 */
@Data
public class RoleInfo {
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
     * 是否删除(0=未删除，1=删除)
     */
    private Integer deleted;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;
}