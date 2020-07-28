package com.example.poetry.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2018/12/7
 * Time: 14:39
 * To change this template use File | Settings | File Templates.
 * Description:
 * This is an interesting start
 */
@RestController
public class DistanceController {
    @RequestMapping(value = "/welcome")
    public String HelloWord(){
        System.out.println("测试");
        return "测试一下";
    }
}
