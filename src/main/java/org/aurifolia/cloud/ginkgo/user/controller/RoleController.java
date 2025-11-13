package org.aurifolia.cloud.ginkgo.user.controller;

import org.aurifolia.cloud.ginkgo.user.entity.RoleInfo;
import org.aurifolia.cloud.ginkgo.user.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 角色控制器
 */
@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    /**
     * 创建角色
     * @param roleInfo 角色信息
     * @return 是否成功
     */
    @PostMapping
    public boolean createRole(@RequestBody RoleInfo roleInfo) {
        return roleService.createRole(roleInfo);
    }

    /**
     * 更新角色信息
     * @param roleInfo 角色信息
     * @return 是否成功
     */
    @PutMapping
    public boolean updateRole(@RequestBody RoleInfo roleInfo) {
        return roleService.updateRole(roleInfo);
    }

    /**
     * 根据ID获取角色信息
     * @param id 角色ID
     * @return 角色信息
     */
    @GetMapping("/{id}")
    public RoleInfo getRoleById(@PathVariable Long id) {
        return roleService.getRoleById(id);
    }

    /**
     * 根据角色名获取角色信息
     * @param roleName 角色名
     * @return 角色信息
     */
    @GetMapping("/name/{roleName}")
    public RoleInfo getRoleByName(@PathVariable String roleName) {
        return roleService.getRoleByName(roleName);
    }

    /**
     * 获取所有角色列表
     * @return 角色列表
     */
    @GetMapping
    public List<RoleInfo> getAllRoles() {
        return roleService.getAllRoles();
    }

    /**
     * 删除角色（逻辑删除）
     * @param id 角色ID
     * @return 是否成功
     */
    @DeleteMapping("/{id}")
    public boolean deleteRole(@PathVariable Long id) {
        return roleService.deleteRole(id);
    }
}