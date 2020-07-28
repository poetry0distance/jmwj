package com.example.poetry.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * User: wangtao
 * Date: 2020/7/16
 *
 * @author false
 * Description:
 */
@Configuration
public class Config {

    public void config(){
        AnnotationConfigApplicationContext af = new AnnotationConfigApplicationContext();
        af.getBeanDefinitionCount();
    }
}
