package org.aurifolia.cloud.ginkgo.user.dto;

import lombok.Data;
import java.time.LocalDateTime;

/**
 * 权限DTO
 */
@Data
public class PermDTO {
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
     * 创建时间
     */
    private LocalDateTime createTime;
}