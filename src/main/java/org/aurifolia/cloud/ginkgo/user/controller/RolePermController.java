package org.aurifolia.cloud.ginkgo.user.controller;

import org.aurifolia.cloud.ginkgo.user.entity.RolePermRela;
import org.aurifolia.cloud.ginkgo.user.service.RolePermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 角色权限关联控制器
 */
@RestController
@RequestMapping("/role-perms")
public class RolePermController {

    @Autowired
    private RolePermService rolePermService;

    /**
     * 给角色分配权限
     * @param rolePermRela 角色权限关联信息
     * @return 是否成功
     */
    @PostMapping
    public boolean assignPermToRole(@RequestBody RolePermRela rolePermRela) {
        return rolePermService.assignPermToRole(rolePermRela);
    }

    /**
     * 根据角色ID和权限ID查询关联信息
     * @param roleId 角色ID
     * @param permId 权限ID
     * @return 角色权限关联信息
     */
    @GetMapping("/role/{roleId}/perm/{permId}")
    public RolePermRela getPermByRoleIdAndPermId(@PathVariable Long roleId, @PathVariable Long permId) {
        return rolePermService.getPermByRoleIdAndPermId(roleId, permId);
    }

    /**
     * 根据角色ID查询权限关联列表
     * @param roleId 角色ID
     * @return 权限关联列表
     */
    @GetMapping("/role/{roleId}")
    public List<RolePermRela> getPermsByRoleId(@PathVariable Long roleId) {
        return rolePermService.getPermsByRoleId(roleId);
    }

    /**
     * 根据权限ID查询角色关联列表
     * @param permId 权限ID
     * @return 角色关联列表
     */
    @GetMapping("/perm/{permId}")
    public List<RolePermRela> getRolesByPermId(@PathVariable Long permId) {
        return rolePermService.getRolesByPermId(permId);
    }

    /**
     * 移除角色的某个权限
     * @param roleId 角色ID
     * @param permId 权限ID
     * @return 是否成功
     */
    @DeleteMapping("/role/{roleId}/perm/{permId}")
    public boolean removePermFromRole(@PathVariable Long roleId, @PathVariable Long permId) {
        return rolePermService.removePermFromRole(roleId, permId);
    }
}