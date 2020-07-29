package com.service.impl;

import com.entity.MovInfo;
import com.mapper.MovInfoMapper;
import com.service.MovInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: wangtao
 * Date: 2020/7/29
 * @author false
 * Description:
 */
@Service
public class MovInfoServiceImpl implements MovInfoService {

    @Resource
    private MovInfoMapper movInfoMapper;

    @Override
    public List<MovInfo> selectAll() {
        return movInfoMapper.selectAll();
    }
}
