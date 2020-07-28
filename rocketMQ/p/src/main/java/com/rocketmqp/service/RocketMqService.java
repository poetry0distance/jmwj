package com.rocketmqp.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.LocalTransactionState;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2020/6/22
 * Time: 17:07
 * @author false
 * Description:
 */
@Service
@Slf4j
public class RocketMqService{
    @Value("${rocket.group}")
    public String rocketGroup ;
    @Value("${rocket.topic}")
    public String rocketTopic ;
    @Value("${rocket.tag}")
    public String rocketTag ;

    @Resource
    private DefaultMQProducer defaultMQProducer;

    public LocalTransactionState sendMsg(String msgInfo) {
        // 可以不使用Config中的Group
        defaultMQProducer.setProducerGroup(rocketGroup);
        SendResult sendResult = null;
        try {
            Message sendMsg = new Message(rocketTopic,
                    rocketTag,
                    "open_account_key", msgInfo.getBytes());
            sendResult = defaultMQProducer.send(sendMsg);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("message result ---->"+sendResult);
        boolean status = false;
        log.info("result status------>"+sendResult.isTraceOn());
//        if (sendResult.isTraceOn()){
//            status = true;
//        }
//        return status? LocalTransactionState.COMMIT_MESSAGE: LocalTransactionState.UNKNOW;
        return LocalTransactionState.UNKNOW;
    }

}
