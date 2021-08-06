package com.rocketmqp.service;

import com.rocketmqp.communal.CommunalAssembleSetMsgBody;
import com.rocketmqp.communal.CommunalConfig;
import com.rocketmqp.util.MsgType;
import com.rocketmqp.util.SendMsgBody;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
public class RocketMqServiceImpl implements RocketMqService{
    @Autowired
    private CommunalConfig communalConfig;
    @Autowired
    private CommunalAssembleSetMsgBody communalAssembleSetMsgBody;


    /**
     * 发送普通消息
     * @param type
     */
    @SneakyThrows
    @Override
    public void sentMsgByType(String type,Object obj) {
        SendMsgBody sendMsgBody = communalAssembleSetMsgBody.assembleBody(obj);
        if (type.equals(MsgType.GeneralMessage.getName())){
            communalConfig.sendGeneralMessage(sendMsgBody);
        }
        if (type.equals(MsgType.DelayedMessage.getName())){
            communalConfig.sendDelayedMessage();
        }
        if (type.equals(MsgType.TransactionMessage.getName())){
            communalConfig.sendTransactionMessage(sendMsgBody);
        }
       if (type.equals(MsgType.SequentialMessage.getName())){
           communalConfig.sendSequentialMessage(sendMsgBody);
        }
    }
}
