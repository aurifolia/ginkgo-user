package org.aurifolia.cloud.ginkgo.user.application.service.impl;

import org.aurifolia.cloud.ginkgo.user.domain.model.PermInfo;
import org.aurifolia.cloud.ginkgo.user.domain.repository.PermInfoRepository;
import org.aurifolia.cloud.ginkgo.user.application.service.PermService;
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
    private PermInfoRepository permInfoRepository;

    @Override
    public boolean createPerm(PermInfo permInfo) {
        permInfo.setCreateTime(LocalDateTime.now());
        permInfo.setUpdateTime(LocalDateTime.now());
        permInfo.setDeleted(0);
        return permInfoRepository.insert(permInfo) > 0;
    }

    @Override
    public boolean updatePerm(PermInfo permInfo) {
        permInfo.setUpdateTime(LocalDateTime.now());
        return permInfoRepository.updateById(permInfo) > 0;
    }

    @Override
    public PermInfo getPermById(Long id) {
        return permInfoRepository.selectById(id);
    }

    @Override
    public PermInfo getPermByName(String permName) {
        return permInfoRepository.selectByPermName(permName);
    }

    @Override
    public List<PermInfo> getAllPerms() {
        return permInfoRepository.selectAll();
    }

    @Override
    public boolean deletePerm(Long id) {
        return permInfoRepository.deleteById(id) > 0;
    }
}