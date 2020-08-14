package com.config;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * User: wangtao
 * Date: 2020/8/5
 *
 * @author false
 * Description:轮寻算法
 */
@Component
public class RotationLoadBalancerConfig implements LoadBalancerConfig{
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    @Override
    public ServiceInstance getSingleAddres(List<ServiceInstance> serviceInstances) {
        int index = atomicInteger.incrementAndGet() % serviceInstances.size();
        ServiceInstance serviceInstance = serviceInstances.get(index);
        return serviceInstance;
    }
}
