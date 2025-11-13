package org.aurifolia.cloud.ginkgo.user.service.impl;

import org.aurifolia.cloud.ginkgo.user.entity.RolePermRela;
import org.aurifolia.cloud.ginkgo.user.repository.RolePermRelaMapper;
import org.aurifolia.cloud.ginkgo.user.service.RolePermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 角色权限关联服务实现类
 */
@Service
public class RolePermServiceImpl implements RolePermService {

    @Autowired
    private RolePermRelaMapper rolePermRelaMapper;

    @Override
    public boolean assignPermToRole(RolePermRela rolePermRela) {
        rolePermRela.setCreateTime(LocalDateTime.now());
        return rolePermRelaMapper.insert(rolePermRela) > 0;
    }

    @Override
    public RolePermRela getPermByRoleIdAndPermId(Long roleId, Long permId) {
        return rolePermRelaMapper.selectByRoleIdAndPermId(roleId, permId);
    }

    @Override
    public List<RolePermRela> getPermsByRoleId(Long roleId) {
        return rolePermRelaMapper.selectByRoleId(roleId);
    }

    @Override
    public List<RolePermRela> getRolesByPermId(Long permId) {
        return rolePermRelaMapper.selectByPermId(permId);
    }

    @Override
    public boolean removePermFromRole(Long roleId, Long permId) {
        return rolePermRelaMapper.deleteByRoleIdAndPermId(roleId, permId) > 0;
    }
}