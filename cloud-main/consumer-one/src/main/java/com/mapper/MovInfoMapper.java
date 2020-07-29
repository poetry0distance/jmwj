package com.mapper;

import com.entity.MovInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * User: wasu
 * Date: 2020/7/29
 *
 * @author false
 * Description:
 */
@Mapper
public interface MovInfoMapper {

    /**
     * 查询所有
     * @return
     */
    List<MovInfo> selectAll();
}
