package org.aurifolia.cloud.ginkgo.user.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.aurifolia.cloud.ginkgo.user.entity.UserRoleRela;
import java.util.List;

@Mapper
public interface UserRoleRelaMapper {
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
    UserRoleRela selectByUserIdAndRoleId(@Param("userId") Long userId, @Param("roleId") Long roleId);

    /**
     * 根据用户ID查询角色关联列表
     * @param userId 用户ID
     * @return 角色关联列表
     */
    List<UserRoleRela> selectByUserId(@Param("userId") Long userId);

    /**
     * 根据角色ID查询用户关联列表
     * @param roleId 角色ID
     * @return 用户关联列表
     */
    List<UserRoleRela> selectByRoleId(@Param("roleId") Long roleId);

    /**
     * 删除用户角色关联信息
     * @param userId 用户ID
     * @param roleId 角色ID
     * @return 影响行数
     */
    int deleteByUserIdAndRoleId(@Param("userId") Long userId, @Param("roleId") Long roleId);
}