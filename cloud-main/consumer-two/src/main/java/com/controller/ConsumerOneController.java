package com.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * User: wangtao
 * Date: 2020/7/22
 *
 * @author false
 * Description:
 */
@RestController
@Slf4j
public class ConsumerOneController {

    @Value("${server.port}")
    private String PORT;
    @GetMapping(value = "/getInfoConsumer")
    public String getInfoConsumer(){
        log.info("test consumer-one cli---> consumer");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "consumer"+PORT;
    }
}
