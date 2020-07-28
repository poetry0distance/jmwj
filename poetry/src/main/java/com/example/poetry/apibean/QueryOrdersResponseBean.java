package com.example.poetry.apibean;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/15
 * Time: 13:45
 * To change this template use File | Settings | File Templates.
 * Description: 查询订单接口 响应参数bean
 */
@Data
public class QueryOrdersResponseBean {

    /**
     * 	系统错误码
     */
    private String coed;
    /**
     * 系统错误码说明
     */
    private String msg;
    /**
     * 以JSONArray的字符串格式返回查询结果——
     * time：查询时间（yyyyMMddHH或yyyyMMddHHmm;
     * start：页码;
     * limit：每页数量;
     * unionId：联盟编号;
     * success：接 口调用是否成功（1：成功，0：失败）;
     * errors：接口调用失败信息描述;
     * data：返回数据;
     * subUnion：子联盟ID(需要联系运营开放白名单才能拿到数据);
     * orderTime：下单时间;
     * orderId：订单编号;
     * parentId:父单id，父单拆分后，子单中parentId为父单的id;
     * popId：订 单PopId;
     * SplitType:拆分类型；
     * totalMoney：订单金额（会员价 包含优惠，不含运费,是各个商品会员价的总和）;
     * cosPrice：订单计算佣金使用金额（不含优惠和运费，订单未完成时此字段为0）,如果一个订单有多个商品，此字段为各 个商品计算佣金金额的总和;
     * unionUserName：扩展信息(需要联系运营开放白名单才能拿到数据 ) ；
     * yn:是否有效，1有效，0无效；
     * sourceEmt：推广方式来源1.pc 2.无线；
     * details：商品详情;
     * wareId：商品编号;
     * quantity：商品数量；
     * firstLevle：一级类目；
     * secondLevel：二级类 目；
     * thirdLevle：三级类目；
     * totalPrice：商品金额（单个商品的京东价包含优惠，减去了单品优惠），预估佣金使用此 金额。预估计算佣金的金额；
     * ygcosFee：预估佣金金额；
     * hasMore：是否还有数据(true：还有数据 false:已查询完毕 ，没有数据了);
     * plus: 1是，0不是
     */
    private String result;
}
