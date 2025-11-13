package org.aurifolia.cloud.ginkgo.user.service.impl;

import org.aurifolia.cloud.ginkgo.user.entity.RoleInfo;
import org.aurifolia.cloud.ginkgo.user.repository.RoleInfoMapper;
import org.aurifolia.cloud.ginkgo.user.service.RoleService;
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
    private RoleInfoMapper roleInfoMapper;

    @Override
    public boolean createRole(RoleInfo roleInfo) {
        roleInfo.setCreateTime(LocalDateTime.now());
        roleInfo.setUpdateTime(LocalDateTime.now());
        roleInfo.setDeleted(0);
        return roleInfoMapper.insert(roleInfo) > 0;
    }

    @Override
    public boolean updateRole(RoleInfo roleInfo) {
        roleInfo.setUpdateTime(LocalDateTime.now());
        return roleInfoMapper.updateById(roleInfo) > 0;
    }

    @Override
    public RoleInfo getRoleById(Long id) {
        return roleInfoMapper.selectById(id);
    }

    @Override
    public RoleInfo getRoleByName(String roleName) {
        return roleInfoMapper.selectByRoleName(roleName);
    }

    @Override
    public List<RoleInfo> getAllRoles() {
        return roleInfoMapper.selectAll();
    }

    @Override
    public boolean deleteRole(Long id) {
        return roleInfoMapper.deleteById(id) > 0;
    }
}