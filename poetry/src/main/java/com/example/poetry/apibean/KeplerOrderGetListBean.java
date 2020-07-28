package com.example.poetry.apibean;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/15
 * Time: 14:29
 * To change this template use File | Settings | File Templates.
 * Description: 开普勒订单详情接口 请求参数bean
 */
@Data
public class KeplerOrderGetListBean {
    /**
     * 可选参数，如果传了orderId则只匹配该订单号，
     * 返回对应的订单信息；如果未传orderId，则根据其他参数返回时间段范围内的订单详情列表
     * 必须: 否
     */
    private int orderId;
    /**
     * 	查询起始时间 yyyymmddhhmmss格式
     * 必须: 是
     */
    private String beginTime;
    /**
     * 	查询截止时间 yyyymmddhhmmss格式
     * 必须: 是
     */
    private String endTime;
    /**
     * 	分页查询的页码，必须大于0
     * 必须: 是
     */
    private int pageIndex;
    /**
     * 	每页查询数量，必须大于0，如果超过20，默认按20计算
     * 必须: 是
     */
    private int pageSize;

}
