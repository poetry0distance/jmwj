package com.rocketmqp.util;

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
public enum MsgType {

    GeneralMessage("GeneralMessage", "普通消息"),
    TransactionMessage("TransactionMessage", "事务消息"),
    DelayedMessage("DelayedMessage", "延时消息"),
    SequentialMessage("SequentialMessage", "顺序消息");

    MsgType(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    private String name;
    private String desc;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
}
