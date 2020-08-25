package com.service.impl;

import com.entity.MovInfo;
import com.mapper.MovInfoMapper;
import com.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: wangtao
 * Date: 2020/8/20
 *
 * @author false
 * Description:
 */
@Service
@CacheConfig(cacheNames = "mov_info_1")
public class CacheServiceImpl implements CacheService {

    @Resource
    private MovInfoMapper movInfoMapper;
    @Cacheable
    @Override
    public List<MovInfo> list(){
        return movInfoMapper.selectAll();
    }
}
