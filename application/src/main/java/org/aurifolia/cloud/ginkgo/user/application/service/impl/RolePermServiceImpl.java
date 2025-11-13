package org.aurifolia.cloud.ginkgo.user.application.service.impl;

import org.aurifolia.cloud.ginkgo.user.domain.model.RolePermRela;
import org.aurifolia.cloud.ginkgo.user.domain.repository.RolePermRelaRepository;
import org.aurifolia.cloud.ginkgo.user.application.service.RolePermService;
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
    private RolePermRelaRepository rolePermRelaRepository;

    @Override
    public boolean assignPermToRole(RolePermRela rolePermRela) {
        rolePermRela.setCreateTime(LocalDateTime.now());
        return rolePermRelaRepository.insert(rolePermRela) > 0;
    }

    @Override
    public RolePermRela getPermByRoleIdAndPermId(Long roleId, Long permId) {
        return rolePermRelaRepository.selectByRoleIdAndPermId(roleId, permId);
    }

    @Override
    public List<RolePermRela> getPermsByRoleId(Long roleId) {
        return rolePermRelaRepository.selectByRoleId(roleId);
    }

    @Override
    public List<RolePermRela> getRolesByPermId(Long permId) {
        return rolePermRelaRepository.selectByPermId(permId);
    }

    @Override
    public boolean removePermFromRole(Long roleId, Long permId) {
        return rolePermRelaRepository.deleteByRoleIdAndPermId(roleId, permId) > 0;
    }
}