package org.aurifolia.cloud.ginkgo.user.infrastructure.repository;

import org.aurifolia.cloud.ginkgo.user.domain.model.UserRoleRela;
import org.aurifolia.cloud.ginkgo.user.domain.repository.UserRoleRelaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserRoleRelaRepositoryImpl implements UserRoleRelaRepository {
    
    @Autowired
    private UserRoleRelaMapper userRoleRelaMapper;

    @Override
    public int insert(UserRoleRela userRoleRela) {
        return userRoleRelaMapper.insert(userRoleRela);
    }

    @Override
    public UserRoleRela selectByUserIdAndRoleId(Long userId, Long roleId) {
        return userRoleRelaMapper.selectByUserIdAndRoleId(userId, roleId);
    }

    @Override
    public List<UserRoleRela> selectByUserId(Long userId) {
        return userRoleRelaMapper.selectByUserId(userId);
    }

    @Override
    public List<UserRoleRela> selectByRoleId(Long roleId) {
        return userRoleRelaMapper.selectByRoleId(roleId);
    }

    @Override
    public int deleteByUserIdAndRoleId(Long userId, Long roleId) {
        return userRoleRelaMapper.deleteByUserIdAndRoleId(userId, roleId);
    }
}