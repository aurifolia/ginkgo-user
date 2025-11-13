package org.aurifolia.cloud.ginkgo.user.domain.repository;

import org.aurifolia.cloud.ginkgo.user.domain.model.UserInfo;
import java.util.List;

public interface UserInfoRepository {
    /**
     * 插入用户信息
     * @param userInfo 用户信息
     * @return 影响行数
     */
    int insert(UserInfo userInfo);

    /**
     * 根据ID更新用户信息
     * @param userInfo 用户信息
     * @return 影响行数
     */
    int updateById(UserInfo userInfo);

    /**
     * 根据ID查询用户信息
     * @param id 用户ID
     * @return 用户信息
     */
    UserInfo selectById(Long id);

    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @return 用户信息
     */
    UserInfo selectByUsername(String username);

    /**
     * 查询所有未删除的用户列表
     * @return 用户列表
     */
    List<UserInfo> selectAll();

    /**
     * 根据ID删除用户（逻辑删除）
     * @param id 用户ID
     * @return 影响行数
     */
    int deleteById(Long id);
}