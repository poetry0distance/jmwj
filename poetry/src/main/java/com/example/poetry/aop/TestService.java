package com.example.poetry.aop;

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
public class TestService {
    public void service() {
        // 仅仅只是实现了核心的业务功能
        System.out.println("签合同");
        System.out.println("收房租");
    }

    public static void main(String[] args){
        TestService testService = new TestService();
        testService.service();
    }

}
