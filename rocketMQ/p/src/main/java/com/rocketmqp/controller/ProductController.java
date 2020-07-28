package com.rocketmqp.controller;

import com.rocketmqp.service.RocketMqService;
import org.apache.rocketmq.client.producer.SendResult;
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

    @RequestMapping("/sendMsg")
    public void sendMsg (){
        String msg = "OpenAccount Msg"+"-->生产消息";
//        SendResult sendResult = null;
        try {
            rocketMqService.sendMsg(msg) ;
        } catch (Exception e) {
            e.printStackTrace();
        }
//        return sendResult ;
    }
}
