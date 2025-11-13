package org.aurifolia.cloud.ginkgo.user.service;

import org.aurifolia.cloud.ginkgo.user.entity.RoleInfo;
import java.util.List;

/**
 * 角色服务接口
 */
public interface RoleService {
    /**
     * 创建角色
     * @param roleInfo 角色信息
     * @return 是否成功
     */
    boolean createRole(RoleInfo roleInfo);

    /**
     * 更新角色信息
     * @param roleInfo 角色信息
     * @return 是否成功
     */
    boolean updateRole(RoleInfo roleInfo);

    /**
     * 根据ID获取角色信息
     * @param id 角色ID
     * @return 角色信息
     */
    RoleInfo getRoleById(Long id);

    /**
     * 根据角色名获取角色信息
     * @param roleName 角色名
     * @return 角色信息
     */
    RoleInfo getRoleByName(String roleName);

    /**
     * 获取所有角色列表
     * @return 角色列表
     */
    List<RoleInfo> getAllRoles();

    /**
     * 删除角色（逻辑删除）
     * @param id 角色ID
     * @return 是否成功
     */
    boolean deleteRole(Long id);
}