package com.example.poetry.apibean;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/15
 * Time: 13:56
 * To change this template use File | Settings | File Templates.
 * Description: 查询订单列表接口(详情) 请求参数bean
 */
@Data
public class QueryOrderInfoBean {
    /**
     * unionId
     * 必须: 是
     */
    private int unionId;
    /**
     * 子站长联盟ID（pid所属的联盟ID），
     * 若入参子站长联盟ID，则下面的出参是子站长的订单数据，非母站长的订单数据。
     *  必须: 否
     */
    private int childUnionId;
    /**
     * 操作类型，
     * 1.下单时间
     * 2.完成时间，用户确认收货的时间。
     * 3.更新时间，订单信息最后一次发生变化的时间。
     * 必须: 是
     */
    private int optType;
    /**
     * 	不支持照天查询，仅支持按照1小时、1分钟、1秒查询，详情如下：
     * 	yyyyMMddHH,时，例如：2019010200，表示从2019年1月2日0点（含）---2019年1月2日1点（不含），
     * 	若要查1天的数据，则需要依次查询24次。 yyyyMMddHHmm分，
     * 	例如：201901020000，表示从2019年1月2日0点0分（含）---2019年1月2日0点1分（不含）
     * 	yyyyMMddHHmmss秒，例如：20190102000000，
     * 	表示从2019年1月2日0点0分0秒（含）---2019年1月2日0点0分1秒（不含）
     * 	必须: 是
     */
    private String time;
    /**
     * 	默认从1开始
     * 	必须: 否
     */
    private int pageNo;
    /**
     * 	默认500条
     * 	必须: 否
     */
    private int pageSize;
}
