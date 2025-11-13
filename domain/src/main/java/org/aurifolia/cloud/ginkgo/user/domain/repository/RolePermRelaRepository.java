package org.aurifolia.cloud.ginkgo.user.domain.repository;

import org.aurifolia.cloud.ginkgo.user.domain.model.RolePermRela;
import java.util.List;

public interface RolePermRelaRepository {
    /**
     * 插入角色权限关联信息
     * @param rolePermRela 角色权限关联信息
     * @return 影响行数
     */
    int insert(RolePermRela rolePermRela);

    /**
     * 根据角色ID和权限ID查询关联信息
     * @param roleId 角色ID
     * @param permId 权限ID
     * @return 角色权限关联信息
     */
    RolePermRela selectByRoleIdAndPermId(Long roleId, Long permId);

    /**
     * 根据角色ID查询权限关联列表
     * @param roleId 角色ID
     * @return 权限关联列表
     */
    List<RolePermRela> selectByRoleId(Long roleId);

    /**
     * 根据权限ID查询角色关联列表
     * @param permId 权限ID
     * @return 角色关联列表
     */
    List<RolePermRela> selectByPermId(Long permId);

    /**
     * 删除角色权限关联信息
     * @param roleId 角色ID
     * @param permId 权限ID
     * @return 影响行数
     */
    int deleteByRoleIdAndPermId(Long roleId, Long permId);
}