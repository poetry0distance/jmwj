package com.config;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * User: wasu
 * Date: 2020/8/5
 *
 * @author false
 * Description:
 */
public interface LoadBalancerConfig {
    ServiceInstance getSingleAddres(List<ServiceInstance> serviceInstances);
}
