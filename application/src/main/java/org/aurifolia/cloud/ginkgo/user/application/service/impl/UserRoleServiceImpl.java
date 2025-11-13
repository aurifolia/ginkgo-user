package org.aurifolia.cloud.ginkgo.user.application.service.impl;

import org.aurifolia.cloud.ginkgo.user.domain.model.UserRoleRela;
import org.aurifolia.cloud.ginkgo.user.domain.repository.UserRoleRelaRepository;
import org.aurifolia.cloud.ginkgo.user.application.service.UserRoleService;
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
    private UserRoleRelaRepository userRoleRelaRepository;

    @Override
    public boolean assignRoleToUser(UserRoleRela userRoleRela) {
        userRoleRela.setCreateTime(LocalDateTime.now());
        return userRoleRelaRepository.insert(userRoleRela) > 0;
    }

    @Override
    public UserRoleRela getRoleByUserIdAndRoleId(Long userId, Long roleId) {
        return userRoleRelaRepository.selectByUserIdAndRoleId(userId, roleId);
    }

    @Override
    public List<UserRoleRela> getRolesByUserId(Long userId) {
        return userRoleRelaRepository.selectByUserId(userId);
    }

    @Override
    public List<UserRoleRela> getUsersByRoleId(Long roleId) {
        return userRoleRelaRepository.selectByRoleId(roleId);
    }

    @Override
    public boolean removeRoleFromUser(Long userId, Long roleId) {
        return userRoleRelaRepository.deleteByUserIdAndRoleId(userId, roleId) > 0;
    }
}