package org.aurifolia.cloud.ginkgo.user.infrastructure.repository;

import org.apache.ibatis.annotations.Param;
import org.aurifolia.cloud.ginkgo.user.domain.model.UserInfo;
import org.aurifolia.cloud.ginkgo.user.domain.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserInfoRepositoryImpl implements UserInfoRepository {
    
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public int insert(UserInfo userInfo) {
        return userInfoMapper.insert(userInfo);
    }

    @Override
    public int updateById(UserInfo userInfo) {
        return userInfoMapper.updateById(userInfo);
    }

    @Override
    public UserInfo selectById(Long id) {
        return userInfoMapper.selectById(id);
    }

    @Override
    public UserInfo selectByUsername(String username) {
        return userInfoMapper.selectByUsername(username);
    }

    @Override
    public List<UserInfo> selectAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public int deleteById(Long id) {
        return userInfoMapper.deleteById(id);
    }
}