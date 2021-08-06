package com.rocketmqp.controller;

import com.rocketmqp.service.RocketMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2020/6/22
 * Time: 17:06
 * @author false
 * Description:
 */
@RestController
@RequestMapping("/rocketP")
public class ProductController {

    @Autowired
    private RocketMqService rocketMqService;

    @RequestMapping("/sendMsg/ordinary")
    public void sendMsgGeneralMessage (){
        String type = "GeneralMessage";
        rocketMqService.sentMsgByType(type,new Object());
    }

    @RequestMapping("/sendMsg/sequential")
    public void sendMsgSequentialMessage (){
        String type = "SequentialMessage";
        rocketMqService.sentMsgByType(type,new Object());
    }
}
