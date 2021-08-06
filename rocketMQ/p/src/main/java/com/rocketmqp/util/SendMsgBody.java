package com.rocketmqp.util;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
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
 * 发送消息体
 */
@Data
@ToString
public class SendMsgBody implements Serializable {

    private UUID uid;

    private String topic;

    private Object obj;



}
