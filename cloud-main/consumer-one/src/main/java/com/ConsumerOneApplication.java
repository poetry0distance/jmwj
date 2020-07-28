package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * User: wangtao
 * Date: 2020/7/22
 *
 * @author false
 * Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerOneApplication.class,args);
    }
}
