package org.aurifolia.cloud.ginkgo.user.infrastructure.repository;

import org.aurifolia.cloud.ginkgo.user.domain.model.RolePermRela;
import org.aurifolia.cloud.ginkgo.user.domain.repository.RolePermRelaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class RolePermRelaRepositoryImpl implements RolePermRelaRepository {
    
    @Autowired
    private RolePermRelaMapper rolePermRelaMapper;

    @Override
    public int insert(RolePermRela rolePermRela) {
        return rolePermRelaMapper.insert(rolePermRela);
    }

    @Override
    public RolePermRela selectByRoleIdAndPermId(Long roleId, Long permId) {
        return rolePermRelaMapper.selectByRoleIdAndPermId(roleId, permId);
    }

    @Override
    public List<RolePermRela> selectByRoleId(Long roleId) {
        return rolePermRelaMapper.selectByRoleId(roleId);
    }

    @Override
    public List<RolePermRela> selectByPermId(Long permId) {
        return rolePermRelaMapper.selectByPermId(permId);
    }

    @Override
    public int deleteByRoleIdAndPermId(Long roleId, Long permId) {
        return rolePermRelaMapper.deleteByRoleIdAndPermId(roleId, permId);
    }
}