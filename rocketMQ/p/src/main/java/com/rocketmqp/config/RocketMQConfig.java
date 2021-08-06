package com.rocketmqp.config;

import com.aliyun.openservices.ons.api.PropertyKeyConst;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2020/6/22
 * Time: 17:03
 * @author false
 * Description:
 */
@Configuration
@Slf4j
public class RocketMQConfig {

    @Value("${rocketmq.producer.groupName}")
    private String groupName;
    @Value("${rocketmq.producer.groupId}")
    private String groupId;
    @Value("${rocketmq.producer.namesrvAddr}")
    private String namesrvAddr;
    @Value("${rocketmq.producer.maxMessageSize}")
    private Integer maxMessageSize ;
    @Value("${rocketmq.producer.sendMsgTimeout}")
    private Integer sendMsgTimeout;
    @Value("${rocketmq.producer.retryTimesWhenSendFailed}")
    private Integer retryTimesWhenSendFailed;
    @Value("${aliyun.AccessKey}")
    private String accessKey;
    @Value("${aliyun.SecretKey}")
    private String secretKey;
    @Value("${aliyun.topic}")
    private Boolean topic;

    @Bean
    public Properties getPropertiesInfo(){
        Properties properties = new Properties();
        if (topic){
            properties.put(PropertyKeyConst.AccessKey,accessKey);
            // AccessKeySecret 阿里云身份验证，在阿里云用户信息管理控制台获取。
            properties.put(PropertyKeyConst.SecretKey, secretKey);
        }
        //设置发送超时时间，单位：毫秒。
        properties.setProperty(PropertyKeyConst.SendMsgTimeoutMillis, String.valueOf(sendMsgTimeout));
        // 设置TCP接入域名，进入消息队列RocketMQ版控制台实例详情页面的接入点区域查看。
        properties.put(PropertyKeyConst.NAMESRV_ADDR, namesrvAddr);
        properties.put(PropertyKeyConst.GROUP_ID,groupId);
        return properties;
    }

    @Bean
    public DefaultMQProducer getRocketMQProducer(){
        DefaultMQProducer producer = new DefaultMQProducer(groupName);
        producer.setNamesrvAddr(namesrvAddr);

        //如果需要同一个jvm中不同的producer往不同的mq集群发送消息，需要设置不同的instanceName

        // 消息最大长度 默认1024*4(4M)
        if(null != maxMessageSize){
            producer.setMaxMessageSize(maxMessageSize);
        }
        // 发送消息超时时间,默认3000
        if(null != sendMsgTimeout){
            producer.setSendMsgTimeout(sendMsgTimeout);
        }
        //如果发送消息失败，设置重试次数，默认为2次
        if(null != retryTimesWhenSendFailed){
            producer.setRetryTimesWhenSendFailed(retryTimesWhenSendFailed);
        }
        try {
            producer.start();
        } catch (MQClientException e) {
            e.printStackTrace();
        }
        return producer;
    }
}
