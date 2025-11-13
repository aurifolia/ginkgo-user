package org.aurifolia.cloud.ginkgo.user.service.impl;

import org.aurifolia.cloud.ginkgo.user.entity.UserInfo;
import org.aurifolia.cloud.ginkgo.user.repository.UserInfoMapper;
import org.aurifolia.cloud.ginkgo.user.service.UserService;
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
    private UserInfoMapper userInfoMapper;

    @Override
    public boolean createUser(UserInfo userInfo) {
        userInfo.setCreateTime(LocalDateTime.now());
        userInfo.setUpdateTime(LocalDateTime.now());
        userInfo.setLocked(0);
        userInfo.setFrozen(0);
        userInfo.setDeleted(0);
        return userInfoMapper.insert(userInfo) > 0;
    }

    @Override
    public boolean updateUser(UserInfo userInfo) {
        userInfo.setUpdateTime(LocalDateTime.now());
        return userInfoMapper.updateById(userInfo) > 0;
    }

    @Override
    public UserInfo getUserById(Long id) {
        return userInfoMapper.selectById(id);
    }

    @Override
    public UserInfo getUserByUsername(String username) {
        return userInfoMapper.selectByUsername(username);
    }

    @Override
    public List<UserInfo> getAllUsers() {
        return userInfoMapper.selectAll();
    }

    @Override
    public boolean deleteUser(Long id) {
        return userInfoMapper.deleteById(id) > 0;
    }
}