package org.aurifolia.cloud.ginkgo.user.dto;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 用户DTO
 */
@Data
public class UserDTO {
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
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 用户关联的角色列表
     */
    private List<RoleDTO> roles;
}