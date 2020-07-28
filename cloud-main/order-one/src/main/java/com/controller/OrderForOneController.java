package com.controller;

import com.feigns.FeignServiceConsumer;
import com.vo.ReturnResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * User: wangtao
 * Date: 2020/7/22
 *
 * @author false
 * Description:
 */
@RestController
@Slf4j
public class OrderForOneController {
    @Autowired
    private FeignServiceConsumer feignServiceConsumer;

    @GetMapping(value = "/getInfo")
    public ReturnResultVo getInfo(){
        ReturnResultVo s = feignServiceConsumer.getInfoConsumer();
        log.info("test order-one cli--->"+s);
        return s;
    }
}
