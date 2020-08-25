package com.mapper;

import com.entity.MovInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * User: wasu
 * Date: 2020/8/20
 *
 * @author false
 * Description:
 */
@Mapper
public interface MovInfoMapper {
    List<MovInfo> selectAll();
}
