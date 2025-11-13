package org.aurifolia.cloud.ginkgo.user.service.impl;

import org.aurifolia.cloud.ginkgo.user.entity.PermInfo;
import org.aurifolia.cloud.ginkgo.user.repository.PermInfoMapper;
import org.aurifolia.cloud.ginkgo.user.service.PermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 权限服务实现类
 */
@Service
public class PermServiceImpl implements PermService {

    @Autowired
    private PermInfoMapper permInfoMapper;

    @Override
    public boolean createPerm(PermInfo permInfo) {
        permInfo.setCreateTime(LocalDateTime.now());
        permInfo.setUpdateTime(LocalDateTime.now());
        permInfo.setDeleted(0);
        return permInfoMapper.insert(permInfo) > 0;
    }

    @Override
    public boolean updatePerm(PermInfo permInfo) {
        permInfo.setUpdateTime(LocalDateTime.now());
        return permInfoMapper.updateById(permInfo) > 0;
    }

    @Override
    public PermInfo getPermById(Long id) {
        return permInfoMapper.selectById(id);
    }

    @Override
    public PermInfo getPermByName(String permName) {
        return permInfoMapper.selectByPermName(permName);
    }

    @Override
    public List<PermInfo> getAllPerms() {
        return permInfoMapper.selectAll();
    }

    @Override
    public boolean deletePerm(Long id) {
        return permInfoMapper.deleteById(id) > 0;
    }
}