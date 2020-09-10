package com.service;

import com.entity.MovInfo;

import java.util.List;

/**
 * User: wasu
 * Date: 2020/8/20
 *
 * @author false
 * Description:
 */
public interface CacheService {
    List<MovInfo> list();

    String sysOut() throws Exception;
}
