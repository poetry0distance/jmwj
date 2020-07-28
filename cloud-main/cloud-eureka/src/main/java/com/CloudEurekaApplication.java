package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * User: wangtao
 * Date: 2020/7/22
 *
 * @author false
 * Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaApplication.class,args);
    }
}
