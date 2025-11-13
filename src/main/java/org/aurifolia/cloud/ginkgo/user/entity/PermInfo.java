package org.aurifolia.cloud.ginkgo.user.entity;

import lombok.Data;
import java.time.LocalDateTime;

/**
 * 权限信息实体类
 */
@Data
public class PermInfo {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 权限名
     */
    private String permName;

    /**
     * 权限描述
     */
    private String permDesc;

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