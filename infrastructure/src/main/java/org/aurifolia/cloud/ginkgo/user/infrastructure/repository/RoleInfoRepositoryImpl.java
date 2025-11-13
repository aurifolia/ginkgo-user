package org.aurifolia.cloud.ginkgo.user.infrastructure.repository;

import org.aurifolia.cloud.ginkgo.user.domain.model.RoleInfo;
import org.aurifolia.cloud.ginkgo.user.domain.repository.RoleInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class RoleInfoRepositoryImpl implements RoleInfoRepository {
    
    @Autowired
    private RoleInfoMapper roleInfoMapper;

    @Override
    public int insert(RoleInfo roleInfo) {
        return roleInfoMapper.insert(roleInfo);
    }

    @Override
    public int updateById(RoleInfo roleInfo) {
        return roleInfoMapper.updateById(roleInfo);
    }

    @Override
    public RoleInfo selectById(Long id) {
        return roleInfoMapper.selectById(id);
    }

    @Override
    public RoleInfo selectByRoleName(String roleName) {
        return roleInfoMapper.selectByRoleName(roleName);
    }

    @Override
    public List<RoleInfo> selectAll() {
        return roleInfoMapper.selectAll();
    }

    @Override
    public int deleteById(Long id) {
        return roleInfoMapper.deleteById(id);
    }
}