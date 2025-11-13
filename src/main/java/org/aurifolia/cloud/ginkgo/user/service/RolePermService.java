package org.aurifolia.cloud.ginkgo.user.service;

import org.aurifolia.cloud.ginkgo.user.entity.RolePermRela;
import java.util.List;

/**
 * 角色权限关联服务接口
 */
public interface RolePermService {
    /**
     * 给角色分配权限
     * @param rolePermRela 角色权限关联信息
     * @return 是否成功
     */
    boolean assignPermToRole(RolePermRela rolePermRela);

    /**
     * 根据角色ID和权限ID查询关联信息
     * @param roleId 角色ID
     * @param permId 权限ID
     * @return 角色权限关联信息
     */
    RolePermRela getPermByRoleIdAndPermId(Long roleId, Long permId);

    /**
     * 根据角色ID查询权限关联列表
     * @param roleId 角色ID
     * @return 权限关联列表
     */
    List<RolePermRela> getPermsByRoleId(Long roleId);

    /**
     * 根据权限ID查询角色关联列表
     * @param permId 权限ID
     * @return 角色关联列表
     */
    List<RolePermRela> getRolesByPermId(Long permId);

    /**
     * 移除角色的某个权限
     * @param roleId 角色ID
     * @param permId 权限ID
     * @return 是否成功
     */
    boolean removePermFromRole(Long roleId, Long permId);
}