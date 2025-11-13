package org.aurifolia.cloud.ginkgo.user.interfaces.controller;

import org.aurifolia.cloud.ginkgo.user.application.service.UserService;
import org.aurifolia.cloud.ginkgo.user.domain.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 用户控制器
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 创建用户
     * @param userInfo 用户信息
     * @return 是否成功
     */
    @PostMapping
    public boolean createUser(@RequestBody UserInfo userInfo) {
        return userService.createUser(userInfo);
    }

    /**
     * 更新用户信息
     * @param userInfo 用户信息
     * @return 是否成功
     */
    @PutMapping
    public boolean updateUser(@RequestBody UserInfo userInfo) {
        return userService.updateUser(userInfo);
    }

    /**
     * 根据ID获取用户信息
     * @param id 用户ID
     * @return 用户信息
     */
    @GetMapping("/{id}")
    public UserInfo getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    /**
     * 根据用户名获取用户信息
     * @param username 用户名
     * @return 用户信息
     */
    @GetMapping("/username/{username}")
    public UserInfo getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

    /**
     * 获取所有用户列表
     * @return 用户列表
     */
    @GetMapping
    public List<UserInfo> getAllUsers() {
        return userService.getAllUsers();
    }

    /**
     * 删除用户（逻辑删除）
     * @param id 用户ID
     * @return 是否成功
     */
    @DeleteMapping("/{id}")
    public boolean deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }
}