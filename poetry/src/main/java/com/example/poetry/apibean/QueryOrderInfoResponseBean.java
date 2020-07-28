package com.example.poetry.apibean;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/15
 * Time: 14:01
 * To change this template use File | Settings | File Templates.
 * Description: 查询订单列表接口(详情) 响应参数bean
 */
@Data
public class QueryOrderInfoResponseBean {
    /**
     * 订单号
     */
    private int orderId;
    /**
     * 父单号
     */
    private int parentId;
    /**
     * 下单时间 时间戳
     */
    private int orderTime;
    /**
     * 完成时间 时间戳（没有完成，返回0）
     */
    private int finishTime;
    /**
     * 结算时间 yyyyMMdd
     */
    private int payMonth;
    /**
     * 有效码 -
     * 1：未知
     * 2.无效-拆单
     * 3.无效-取消
     * 4.无效-京东帮帮主订单
     * 5.无效-账号异常
     * 6.无效-赠品类目不返佣
     * 7.无效-校园订单
     * 8.无效-企业订单
     * 9.无效-团购订单
     * 10.无效-开增值税专用发票订单
     * 11.无效-乡村推广员下单
     * 12.无效-自己推广自己下单
     * 13.无效-违规订单
     * 14.无效-来源与备案网址不符
     * 15.待付款
     * 16.已付款
     * 17.已完成
     * 18.已结算
     */
    private int validCode;
    /**
     * 下单设备 1.pc 2.无线
     */
    private int orderEmt;
    /**
     * plus会员 1:是，0:否
     */
    private int plus;
    /**
     * 	渠道推广方ID
     */
    private int unionId;
    /**
     * 商家ID
     */
    private int popId;
    /**
     * 无说明？
     */
    private String unionUserName;
    /**
     * 商品ID
     */
    private int skuId;
    /**
     * 商品名称
     */
    private String skuName;
    /**
     * 商品数量
     */
    private int skuNum;
    /**
     * 商品退货数量
     */
    private int skuReturnNum;
    /**
     * 商品售后中数量
     */
    private int frozenSkuNum;
    /**
     * 商品单价
     */
    private Long price;
    /**
     * 	实际支付金额
     */
    private Long payPrice;
    /**
     * 	佣金比例
      */
    private double commissionRate;
    /**
     * 	一级分成比例
     */
    private double subSideRate;
    /**
     * 一级补贴比例
     */
    private double subsidyRate;
    /**
     * 	最终比例 (一级分佣比例*二级分佣比例)
     */
    private double finalRate;
    /**
     * 	预估计佣金额
     */
    private Long estimateCosPrice;
    /**
     * sku行总的预估佣金
     */
    private Long estimateCommission;
    /**
     * 	推广渠道方分得的预估佣金
     */
    private Long estimateFee;
    /**
     * 	实际计佣金额
     */
    private Long actualCosPrice;
    /**
     * 	sku行总的实际佣金
     */
    private Long actualCommission;
    /**
     * 	推广渠道方分得的实际佣金
     */
    private Long actualFee;
    /**
     * 	同跨店：0影响 1直接2同店 3跨店
     */
    private int traceType;
    /**
     * 推广位ID
     */
    private int spId;
    /**
     * 	网站ID
     */
    private int siteId;
    /**
     * 	母账号简称
     */
    private String unionAlias;
    /**
     * 子账号ID，pid格式:子站长ID_子站长网站ID_子站长推广位ID
     */
    private String pid;
    /**
     * 无说明？
     */
    private int unionTrafficGroup;
    /**
     * 	一级类目
     */
    private int firstLevel;
    /**
     * 	二级类目
     */
    private int secondLevel;
    /**
     * 三级类目
     */
    private int thirdLevel;
    /**
     * 无说明？
     */
    private String subUnionId;
    /**
     * 无说明？
     */
    private String unionTag;
    /**
     * 无说明？
     */
    private String euId;
    /**
     * 	系统错误码
     */
    private String code;
    /**
     * 	系统错误码说明
     */
    private String msg;
    /**
     * 	描述信息
     */
    private String message;
    /**
     * 无说明?
     */
    private String uuid;
    /**
     * 无说明?
     */
    private int totalNum;
    /**
     * 是否存在下一个条目 按照unionId查询时，该值是正确的
     */
    private Boolean hasNext;
}
