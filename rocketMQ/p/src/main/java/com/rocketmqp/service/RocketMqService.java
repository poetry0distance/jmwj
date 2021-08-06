package com.rocketmqp.service;

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
public interface RocketMqService {

    void sentMsgByType(String type,Object obj);
}
