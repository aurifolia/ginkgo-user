package org.aurifolia.cloud.ginkgo.user.service.impl;

import org.aurifolia.cloud.ginkgo.user.entity.UserRoleRela;
import org.aurifolia.cloud.ginkgo.user.repository.UserRoleRelaMapper;
import org.aurifolia.cloud.ginkgo.user.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 用户角色关联服务实现类
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleRelaMapper userRoleRelaMapper;

    @Override
    public boolean assignRoleToUser(UserRoleRela userRoleRela) {
        userRoleRela.setCreateTime(LocalDateTime.now());
        return userRoleRelaMapper.insert(userRoleRela) > 0;
    }

    @Override
    public UserRoleRela getRoleByUserIdAndRoleId(Long userId, Long roleId) {
        return userRoleRelaMapper.selectByUserIdAndRoleId(userId, roleId);
    }

    @Override
    public List<UserRoleRela> getRolesByUserId(Long userId) {
        return userRoleRelaMapper.selectByUserId(userId);
    }

    @Override
    public List<UserRoleRela> getUsersByRoleId(Long roleId) {
        return userRoleRelaMapper.selectByRoleId(roleId);
    }

    @Override
    public boolean removeRoleFromUser(Long userId, Long roleId) {
        return userRoleRelaMapper.deleteByUserIdAndRoleId(userId, roleId) > 0;
    }
}