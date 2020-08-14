package com.controller;

import com.config.LoadBalancerConfig;
import com.config.TemplateConfig;
import org.omg.CORBA.ServiceInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * User: wangtao
 * Date: 2020/8/5
 *
 * @author false
 * Description:
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private LoadBalancerConfig loadBalancerConfig;
    @GetMapping("/info")
    public String info(){
        //获取注册中心服务提供方地址
        List<ServiceInstance> serviceInstances = discoveryClient.getInstances("nacos-order-pro");
        ServiceInstance serviceInstance = loadBalancerConfig.getSingleAddres(serviceInstances);
        URI rpcMemberUrl = serviceInstance.getUri();
        String result = restTemplate.getForObject(rpcMemberUrl+"/proInfo",String.class);
        return result;
    }
}
