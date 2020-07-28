package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * User: wangtao
 * Date: 2020/7/22
 *
 * @author false
 * Description:
 */
@Configuration
public class Config {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
