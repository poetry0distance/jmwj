package com.example.poetry.apibean;

import lombok.Data;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/15
 * Time: 10:38
 * To change this template use File | Settings | File Templates.
 * Description: 腾讯系订单列表 请求参数bean
 */
@Data
public class TencentOrderListBean {
    /**
     * 客户流程,
     * 微信unionId传34，
     * QQ opendId传35
     */
    private int clientFlow;
    /**
     * 微信unionId 或者 QQ opendId
     */
    private String uid;
    /**
     * 客户端IP
     */
    private String userIp;
    /**
     * uuid用于跟踪日志
     */
    private String logId;
    /**
     * 每页数量
     */
    private int size;
    /**
     * 当前页码
     */
    private int page;
    /**
     * 查询的订单状态
     * 等待付款=1、等待自提=32、等待收获=128、已取消=-1、已完成=1024、有效=2048、全部=4096（默认）
     */
    private int state;
    /**
     * 查询的起始日期
     *
     * 2017-01-01 00:00:00
     */
    private Date startDate;
    /**
     * 查询的结束日期
     *
     * 2019-01-01 00:00:00
     */
    private Date endDate;
}
