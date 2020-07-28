package com.entity;

import lombok.Data;

import javax.annotation.Resource;

/**
 * User: wangtao
 * Date: 2020/7/22
 *
 * @author false
 * Description:
 */
@Data
public class ServiceInfo {
    private Integer port;
    private String serviceName;
}
