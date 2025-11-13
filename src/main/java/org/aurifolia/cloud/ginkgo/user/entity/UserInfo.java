package org.aurifolia.cloud.ginkgo.user.entity;

import lombok.Data;
import java.time.LocalDateTime;

/**
 * 用户信息实体类
 */
@Data
public class UserInfo {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户别名
     */
    private String surname;

    /**
     * 是否锁定(0=未锁定，1=锁定)
     */
    private Integer locked;

    /**
     * 是否冻结(0=未冻结，1=冻结)
     */
    private Integer frozen;

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