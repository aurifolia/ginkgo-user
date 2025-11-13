package org.aurifolia.cloud.ginkgo.user.application.service.impl;

import org.aurifolia.cloud.ginkgo.user.domain.model.RoleInfo;
import org.aurifolia.cloud.ginkgo.user.domain.repository.RoleInfoRepository;
import org.aurifolia.cloud.ginkgo.user.application.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 角色服务实现类
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleInfoRepository roleInfoRepository;

    @Override
    public boolean createRole(RoleInfo roleInfo) {
        roleInfo.setCreateTime(LocalDateTime.now());
        roleInfo.setUpdateTime(LocalDateTime.now());
        roleInfo.setDeleted(0);
        return roleInfoRepository.insert(roleInfo) > 0;
    }

    @Override
    public boolean updateRole(RoleInfo roleInfo) {
        roleInfo.setUpdateTime(LocalDateTime.now());
        return roleInfoRepository.updateById(roleInfo) > 0;
    }

    @Override
    public RoleInfo getRoleById(Long id) {
        return roleInfoRepository.selectById(id);
    }

    @Override
    public RoleInfo getRoleByName(String roleName) {
        return roleInfoRepository.selectByRoleName(roleName);
    }

    @Override
    public List<RoleInfo> getAllRoles() {
        return roleInfoRepository.selectAll();
    }

    @Override
    public boolean deleteRole(Long id) {
        return roleInfoRepository.deleteById(id) > 0;
    }
}