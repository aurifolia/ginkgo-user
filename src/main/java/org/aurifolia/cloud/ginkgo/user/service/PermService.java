package org.aurifolia.cloud.ginkgo.user.service;

import org.aurifolia.cloud.ginkgo.user.entity.PermInfo;
import java.util.List;

/**
 * 权限服务接口
 */
public interface PermService {
    /**
     * 创建权限
     * @param permInfo 权限信息
     * @return 是否成功
     */
    boolean createPerm(PermInfo permInfo);

    /**
     * 更新权限信息
     * @param permInfo 权限信息
     * @return 是否成功
     */
    boolean updatePerm(PermInfo permInfo);

    /**
     * 根据ID获取权限信息
     * @param id 权限ID
     * @return 权限信息
     */
    PermInfo getPermById(Long id);

    /**
     * 根据权限名获取权限信息
     * @param permName 权限名
     * @return 权限信息
     */
    PermInfo getPermByName(String permName);

    /**
     * 获取所有权限列表
     * @return 权限列表
     */
    List<PermInfo> getAllPerms();

    /**
     * 删除权限（逻辑删除）
     * @param id 权限ID
     * @return 是否成功
     */
    boolean deletePerm(Long id);
}