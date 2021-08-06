package com.rocketmqp.communal;

import com.rocketmqp.util.SendMsgBody;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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
public class CommunalAssembleSetMsgBody {
    /**
     * 瓶装当前的消息体
     * @return
     */
    public SendMsgBody assembleBody(Object obj){
        SendMsgBody sendMsgBody = new SendMsgBody();
        // 基于uuid生成bodyId
        UUID uuid = UUID.randomUUID();
        //获取当前的主机信息
        String s = null;
        try {
            s = sysInfo();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        sendMsgBody.setUid(uuid);
        sendMsgBody.setTopic(s);
        sendMsgBody.setObj(obj);
        return sendMsgBody;
    }

    /**
     * 返回当前服务器的信息
     * @return
     */
    public String sysInfo() throws UnknownHostException {
        Runtime r = Runtime.getRuntime();
        InetAddress addr;
        addr = InetAddress.getLocalHost();
        String ip = addr.getHostAddress();
        Map<String, String> map = System.getenv();
        String computerName = map.get("COMPUTERNAME");// 获取计算机名
        String userDomain = map.get("USERDOMAIN");// 获取计算机域名
        Date dateAndTime = new Date();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(computerName).append(userDomain).append(ip).append(dateAndTime);
        return stringBuffer.toString();
    }
}
