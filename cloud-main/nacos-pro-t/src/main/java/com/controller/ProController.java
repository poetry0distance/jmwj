package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: wangtao
 * Date: 2020/8/5
 *
 * @author false
 * Description:
 */
@RestController
public class ProController {

    @Value("${server.port}")
    private String servicePort;
    @GetMapping("/proInfo")
    public String proInfo(){
        return "nacos pro rollback"+servicePort;
    }
}
