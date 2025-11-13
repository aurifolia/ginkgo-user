package org.aurifolia.cloud.ginkgo.user.application.service;

import org.aurifolia.cloud.ginkgo.user.domain.model.UserInfo;
import java.util.List;

/**
 * 用户服务接口
 */
public interface UserService {
    /**
     * 创建用户
     * @param userInfo 用户信息
     * @return 是否成功
     */
    boolean createUser(UserInfo userInfo);

    /**
     * 更新用户信息
     * @param userInfo 用户信息
     * @return 是否成功
     */
    boolean updateUser(UserInfo userInfo);

    /**
     * 根据ID获取用户信息
     * @param id 用户ID
     * @return 用户信息
     */
    UserInfo getUserById(Long id);

    /**
     * 根据用户名获取用户信息
     * @param username 用户名
     * @return 用户信息
     */
    UserInfo getUserByUsername(String username);

    /**
     * 获取所有用户列表
     * @return 用户列表
     */
    List<UserInfo> getAllUsers();

    /**
     * 删除用户（逻辑删除）
     * @param id 用户ID
     * @return 是否成功
     */
    boolean deleteUser(Long id);
}