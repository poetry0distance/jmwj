package com.service.impl;

import com.entity.MovInfo;
import com.mapper.MovInfoMapper;
import com.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.retry.annotation.Retryable;
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

    @Override
    public String sysOut() throws Exception{
        secondString(0);
//        try {
//            secondString(0);
//        }catch (Exception e){
//            System.out.println("方法异常");
//            throw new Exception();
//        }

        return "success";
    }

    public String secondString(int num){
        int n = 10;
        int m = 0;
        try {
            System.out.println("第一次尝试");
            m = n/num;
        }catch (Exception e){
            System.out.println("第二次尝试");
//            num = 20;
            m = n/num;

        }
        return "success";
    }
}
