package org.aurifolia.cloud.ginkgo.user.service;

import org.aurifolia.cloud.ginkgo.user.entity.UserRoleRela;
import java.util.List;

/**
 * 用户角色关联服务接口
 */
public interface UserRoleService {
    /**
     * 给用户分配角色
     * @param userRoleRela 用户角色关联信息
     * @return 是否成功
     */
    boolean assignRoleToUser(UserRoleRela userRoleRela);

    /**
     * 根据用户ID和角色ID查询关联信息
     * @param userId 用户ID
     * @param roleId 角色ID
     * @return 用户角色关联信息
     */
    UserRoleRela getRoleByUserIdAndRoleId(Long userId, Long roleId);

    /**
     * 根据用户ID查询角色关联列表
     * @param userId 用户ID
     * @return 角色关联列表
     */
    List<UserRoleRela> getRolesByUserId(Long userId);

    /**
     * 根据角色ID查询用户关联列表
     * @param roleId 角色ID
     * @return 用户关联列表
     */
    List<UserRoleRela> getUsersByRoleId(Long roleId);

    /**
     * 移除用户的某个角色
     * @param userId 用户ID
     * @param roleId 角色ID
     * @return 是否成功
     */
    boolean removeRoleFromUser(Long userId, Long roleId);
}