package org.aurifolia.cloud.ginkgo.user.infrastructure.repository;

import org.aurifolia.cloud.ginkgo.user.domain.model.PermInfo;
import org.aurifolia.cloud.ginkgo.user.domain.repository.PermInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class PermInfoRepositoryImpl implements PermInfoRepository {
    
    @Autowired
    private PermInfoMapper permInfoMapper;

    @Override
    public int insert(PermInfo permInfo) {
        return permInfoMapper.insert(permInfo);
    }

    @Override
    public int updateById(PermInfo permInfo) {
        return permInfoMapper.updateById(permInfo);
    }

    @Override
    public PermInfo selectById(Long id) {
        return permInfoMapper.selectById(id);
    }

    @Override
    public PermInfo selectByPermName(String permName) {
        return permInfoMapper.selectByPermName(permName);
    }

    @Override
    public List<PermInfo> selectAll() {
        return permInfoMapper.selectAll();
    }

    @Override
    public int deleteById(Long id) {
        return permInfoMapper.deleteById(id);
    }
}