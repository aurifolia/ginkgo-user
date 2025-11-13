package org.aurifolia.cloud.ginkgo.user.interfaces.controller;

import org.aurifolia.cloud.ginkgo.user.application.service.UserRoleService;
import org.aurifolia.cloud.ginkgo.user.domain.model.UserRoleRela;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 用户角色关联控制器
 */
@RestController
@RequestMapping("/user-roles")
public class UserRoleController {

    @Autowired
    private UserRoleService userRoleService;

    /**
     * 给用户分配角色
     * @param userRoleRela 用户角色关联信息
     * @return 是否成功
     */
    @PostMapping
    public boolean assignRoleToUser(@RequestBody UserRoleRela userRoleRela) {
        return userRoleService.assignRoleToUser(userRoleRela);
    }

    /**
     * 根据用户ID和角色ID查询关联信息
     * @param userId 用户ID
     * @param roleId 角色ID
     * @return 用户角色关联信息
     */
    @GetMapping("/user/{userId}/role/{roleId}")
    public UserRoleRela getRoleByUserIdAndRoleId(@PathVariable Long userId, @PathVariable Long roleId) {
        return userRoleService.getRoleByUserIdAndRoleId(userId, roleId);
    }

    /**
     * 根据用户ID查询角色关联列表
     * @param userId 用户ID
     * @return 角色关联列表
     */
    @GetMapping("/user/{userId}")
    public List<UserRoleRela> getRolesByUserId(@PathVariable Long userId) {
        return userRoleService.getRolesByUserId(userId);
    }

    /**
     * 根据角色ID查询用户关联列表
     * @param roleId 角色ID
     * @return 用户关联列表
     */
    @GetMapping("/role/{roleId}")
    public List<UserRoleRela> getUsersByRoleId(@PathVariable Long roleId) {
        return userRoleService.getUsersByRoleId(roleId);
    }

    /**
     * 移除用户的某个角色
     * @param userId 用户ID
     * @param roleId 角色ID
     * @return 是否成功
     */
    @DeleteMapping("/user/{userId}/role/{roleId}")
    public boolean removeRoleFromUser(@PathVariable Long userId, @PathVariable Long roleId) {
        return userRoleService.removeRoleFromUser(userId, roleId);
    }
}