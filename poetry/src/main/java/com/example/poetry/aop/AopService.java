package com.example.poetry.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/8/29
 * Time: 14:48
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Component
@Aspect
public class AopService {
    @Pointcut("execution(* com.example.poetry.aop.TestService.service())")
    public void lService() {
    }

    @Before("execution(* com.example.poetry.aop.TestService.service())")
    public void before() {
        System.out.println("带租客看房");
        System.out.println("谈价格");
    }

    @After("execution(* com.example.poetry.aop.TestService.service())")
    public void after() {
        System.out.println("交钥匙");
    }
}
