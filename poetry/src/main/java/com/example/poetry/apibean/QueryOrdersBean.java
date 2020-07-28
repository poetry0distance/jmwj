package com.example.poetry.apibean;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/15
 * Time: 13:43
 * To change this template use File | Settings | File Templates.
 * Description: 查询订单接口 请求参数bean
 */
@Data
public class QueryOrdersBean {

    /**
     *时间， 格式: yyyymmddhh
     * 必须: 是
     */
    private String time;
    /**
     *查询开始页数
     * 必须: 是
     */
    private int pageIndex;
    /**
     *	每次查询显示的条数
     * 必须: 是
     */
    private int pageSize;
    /**
     *	联盟ID。开通导购模式后，可在开通信息中获得。
     * 必须: 是
     */
    private String unionId;
}
