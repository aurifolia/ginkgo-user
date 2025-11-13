package org.aurifolia.cloud.ginkgo.user.application.service.impl;

import org.aurifolia.cloud.ginkgo.user.domain.model.UserInfo;
import org.aurifolia.cloud.ginkgo.user.domain.repository.UserInfoRepository;
import org.aurifolia.cloud.ginkgo.user.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 用户服务实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public boolean createUser(UserInfo userInfo) {
        userInfo.setCreateTime(LocalDateTime.now());
        userInfo.setUpdateTime(LocalDateTime.now());
        userInfo.setLocked(0);
        userInfo.setFrozen(0);
        userInfo.setDeleted(0);
        return userInfoRepository.insert(userInfo) > 0;
    }

    @Override
    public boolean updateUser(UserInfo userInfo) {
        userInfo.setUpdateTime(LocalDateTime.now());
        return userInfoRepository.updateById(userInfo) > 0;
    }

    @Override
    public UserInfo getUserById(Long id) {
        return userInfoRepository.selectById(id);
    }

    @Override
    public UserInfo getUserByUsername(String username) {
        return userInfoRepository.selectByUsername(username);
    }

    @Override
    public List<UserInfo> getAllUsers() {
        return userInfoRepository.selectAll();
    }

    @Override
    public boolean deleteUser(Long id) {
        return userInfoRepository.deleteById(id) > 0;
    }
}