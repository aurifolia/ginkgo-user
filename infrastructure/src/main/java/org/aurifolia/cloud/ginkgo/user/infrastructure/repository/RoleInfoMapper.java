package org.aurifolia.cloud.ginkgo.user.infrastructure.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.aurifolia.cloud.ginkgo.user.domain.model.RoleInfo;
import java.util.List;

@Mapper
public interface RoleInfoMapper {
    /**
     * 插入角色信息
     * @param roleInfo 角色信息
     * @return 影响行数
     */
    int insert(RoleInfo roleInfo);

    /**
     * 根据ID更新角色信息
     * @param roleInfo 角色信息
     * @return 影响行数
     */
    int updateById(RoleInfo roleInfo);

    /**
     * 根据ID查询角色信息
     * @param id 角色ID
     * @return 角色信息
     */
    RoleInfo selectById(@Param("id") Long id);

    /**
     * 根据角色名查询角色信息
     * @param roleName 角色名
     * @return 角色信息
     */
    RoleInfo selectByRoleName(@Param("roleName") String roleName);

    /**
     * 查询所有未删除的角色列表
     * @return 角色列表
     */
    List<RoleInfo> selectAll();

    /**
     * 根据ID删除角色（逻辑删除）
     * @param id 角色ID
     * @return 影响行数
     */
    int deleteById(@Param("id") Long id);
}