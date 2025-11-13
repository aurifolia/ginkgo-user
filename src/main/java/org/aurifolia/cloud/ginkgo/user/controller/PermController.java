package org.aurifolia.cloud.ginkgo.user.controller;

import org.aurifolia.cloud.ginkgo.user.entity.PermInfo;
import org.aurifolia.cloud.ginkgo.user.service.PermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 权限控制器
 */
@RestController
@RequestMapping("/perms")
public class PermController {

    @Autowired
    private PermService permService;

    /**
     * 创建权限
     * @param permInfo 权限信息
     * @return 是否成功
     */
    @PostMapping
    public boolean createPerm(@RequestBody PermInfo permInfo) {
        return permService.createPerm(permInfo);
    }

    /**
     * 更新权限信息
     * @param permInfo 权限信息
     * @return 是否成功
     */
    @PutMapping
    public boolean updatePerm(@RequestBody PermInfo permInfo) {
        return permService.updatePerm(permInfo);
    }

    /**
     * 根据ID获取权限信息
     * @param id 权限ID
     * @return 权限信息
     */
    @GetMapping("/{id}")
    public PermInfo getPermById(@PathVariable Long id) {
        return permService.getPermById(id);
    }

    /**
     * 根据权限名获取权限信息
     * @param permName 权限名
     * @return 权限信息
     */
    @GetMapping("/name/{permName}")
    public PermInfo getPermByName(@PathVariable String permName) {
        return permService.getPermByName(permName);
    }

    /**
     * 获取所有权限列表
     * @return 权限列表
     */
    @GetMapping
    public List<PermInfo> getAllPerms() {
        return permService.getAllPerms();
    }

    /**
     * 删除权限（逻辑删除）
     * @param id 权限ID
     * @return 是否成功
     */
    @DeleteMapping("/{id}")
    public boolean deletePerm(@PathVariable Long id) {
        return permService.deletePerm(id);
    }
}