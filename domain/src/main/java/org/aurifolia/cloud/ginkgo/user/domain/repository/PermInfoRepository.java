package org.aurifolia.cloud.ginkgo.user.domain.repository;

import org.aurifolia.cloud.ginkgo.user.domain.model.PermInfo;
import java.util.List;

public interface PermInfoRepository {
    /**
     * 插入权限信息
     * @param permInfo 权限信息
     * @return 影响行数
     */
    int insert(PermInfo permInfo);

    /**
     * 根据ID更新权限信息
     * @param permInfo 权限信息
     * @return 影响行数
     */
    int updateById(PermInfo permInfo);

    /**
     * 根据ID查询权限信息
     * @param id 权限ID
     * @return 权限信息
     */
    PermInfo selectById(Long id);

    /**
     * 根据权限名查询权限信息
     * @param permName 权限名
     * @return 权限信息
     */
    PermInfo selectByPermName(String permName);

    /**
     * 查询所有未删除的权限列表
     * @return 权限列表
     */
    List<PermInfo> selectAll();

    /**
     * 根据ID删除权限（逻辑删除）
     * @param id 权限ID
     * @return 影响行数
     */
    int deleteById(Long id);
}