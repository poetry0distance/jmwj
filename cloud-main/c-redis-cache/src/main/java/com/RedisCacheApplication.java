package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

/**
 * User: wangtao
 * Date: 2020/8/20
 *
 * @author false
 * Description:
 */
@SpringBootApplication
public class RedisCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisCacheApplication.class,args);
    }
}
