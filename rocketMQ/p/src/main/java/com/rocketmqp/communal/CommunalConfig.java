package com.rocketmqp.communal;

import com.rocketmqp.util.SendMsgBody;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.*;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * <p>Title: EMP </p>
 * Description: <br>
 * Copyright: CorpRights terminus.io<br>
 * Company: terminus.io<br>
 *
 * @author wang.tao
 * @version 1.0-SNAPSHOT
 * @date 2021-08-06
 */
@Component
@Slf4j
public class CommunalConfig {

    @Value("${rocket.group}")
    public String rocketGroup ;
    @Value("${rocket.topic}")
    public String rocketTopic ;
    @Value("${rocket.tag}")
    public String rocketTag ;
    @Value("${aliyun.topic}")
    public Boolean topic ;

    @Resource
    private DefaultMQProducer defaultMQProducer;

    /**
     * 事务消息
     * @param msgInfo
     * @return
     */
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

    /**
     * 普通消息
     * 发送至 MQ
     */
    public void sendGeneralMessage(SendMsgBody sendMsgBody) throws RemotingException, MQClientException, InterruptedException {
        Message msg = new Message(
                // 普通消息所属的Topic，切勿使用普通消息的Topic来收发其他类型的消息。
                rocketTopic,
                // Message Tag，可理解为Gmail中的标签，对消息进行再归类，方便Consumer指定过滤条件在消息队列RocketMQ版的服务器过滤。
                rocketTag,
                "open_account_key",
                // Message Body，任何二进制形式的数据，消息队列RocketMQ版不做任何干预，需要Producer与Consumer协商好一致的序列化和反序列化方式。
                sendMsgBody.toString().getBytes());

        // 异步发送消息, 发送结果通过callback返回给客户端。
        defaultMQProducer.send(msg, new SendCallback() {
            @Override
            public void onSuccess(SendResult sendResult) {
                // 发送成功的回调方法
                System.out.println("success send to mq"+sendResult);
            }
            @Override
            public void onException(Throwable throwable) {
                // 发送失败的回调方法
                System.out.println("err send to mq"+throwable);
            }
        });
    }

    /**
     * 顺序消息
     * @param sendMsgBody
     */
    public void sendSequentialMessage(SendMsgBody sendMsgBody){
        Message  msg = new Message(
                // 普通消息所属的Topic，切勿使用普通消息的Topic来收发其他类型的消息。
                rocketTopic,
                // Message Tag，可理解为Gmail中的标签，对消息进行再归类，方便Consumer指定过滤条件在消息队列RocketMQ版的服务器过滤。
                rocketTag,
                "open_account_key",
                // Message Body，任何二进制形式的数据，消息队列RocketMQ版不做任何干预，需要Producer与Consumer协商好一致的序列化和反序列化方式。
                sendMsgBody.toString().getBytes());
        String shardingKey = String.valueOf(sendMsgBody.getUid());
        try {
            SendResult send = defaultMQProducer.send(msg);
            // 发送消息，只要不抛异常就是成功。
            if (send != null) {
                System.out.println(new Date() + " Send mq message success. Topic is:" + msg.getTopic() + " msgId is: " );
            }
        }
        catch (Exception e) {
            // 消息发送失败，需要进行重试处理，可重新发送这条消息或持久化这条数据进行补偿处理。
            e.printStackTrace();
        }
    }

    /**
     * 事务消息
     * @param sendMsgBody
     */
    public void sendTransactionMessage(SendMsgBody sendMsgBody) throws MQClientException {
        TransactionMQProducer producer = new TransactionMQProducer("my-transaction-producer");
        // 回调
        producer.setTransactionListener(new TransactionListener() {
            @Override
            public LocalTransactionState executeLocalTransaction(Message message, Object arg) {
                LocalTransactionState state = null;
                //msg-4返回COMMIT_MESSAGE
                if(message.getKeys().equals("msg-1")){
                    state = LocalTransactionState.COMMIT_MESSAGE;
                }
                //msg-5返回ROLLBACK_MESSAGE
                else if(message.getKeys().equals("msg-2")){
                    state = LocalTransactionState.ROLLBACK_MESSAGE;
                }else{
                    //这里返回unknown的目的是模拟执行本地事务突然宕机的情况（或者本地执行成功发送确认消息失败的场景）
                    state = LocalTransactionState.UNKNOW;
                }
                System.out.println(message.getKeys() + ",state:" + state);
                return state;
            }
            /**
             * 回查询
             * @param messageExt
             * @return
             */
            @Override
            public LocalTransactionState checkLocalTransaction(MessageExt messageExt) {
                if (null != messageExt.getKeys()) {
                    switch (messageExt.getKeys()) {
                        case "msg-3":
                            System.out.println("msg-3 unknow");
                            return LocalTransactionState.UNKNOW;
                        case "msg-4":
                            System.out.println("msg-4 COMMIT_MESSAGE");
                            return LocalTransactionState.COMMIT_MESSAGE;
                        case "msg-5":
                            //查询到本地事务执行失败，需要回滚消息。
                            System.out.println("msg-5 ROLLBACK_MESSAGE");
                            return LocalTransactionState.ROLLBACK_MESSAGE;
                    }
                }
                return LocalTransactionState.COMMIT_MESSAGE;
            }
        });
        producer.start();

        try {
            Message msg = new Message(rocketTopic, rocketTag, sendMsgBody.toString().getBytes());
            producer.sendMessageInTransaction(msg, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 顺序消息
     */
    public void sendDelayedMessage(){

    }
}
