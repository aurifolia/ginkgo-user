package org.aurifolia.cloud.ginkgo.user.domain.repository;

import org.aurifolia.cloud.ginkgo.user.domain.model.UserRoleRela;
import java.util.List;

public interface UserRoleRelaRepository {
    /**
     * 插入用户角色关联信息
     * @param userRoleRela 用户角色关联信息
     * @return 影响行数
     */
    int insert(UserRoleRela userRoleRela);

    /**
     * 根据用户ID和角色ID查询关联信息
     * @param userId 用户ID
     * @param roleId 角色ID
     * @return 用户角色关联信息
     */
    UserRoleRela selectByUserIdAndRoleId(Long userId, Long roleId);

    /**
     * 根据用户ID查询角色关联列表
     * @param userId 用户ID
     * @return 角色关联列表
     */
    List<UserRoleRela> selectByUserId(Long userId);

    /**
     * 根据角色ID查询用户关联列表
     * @param roleId 角色ID
     * @return 用户关联列表
     */
    List<UserRoleRela> selectByRoleId(Long roleId);

    /**
     * 删除用户角色关联信息
     * @param userId 用户ID
     * @param roleId 角色ID
     * @return 影响行数
     */
    int deleteByUserIdAndRoleId(Long userId, Long roleId);
}