package com.example.poetry.apibean;

import lombok.Data;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/15
 * Time: 10:50
 * To change this template use File | Settings | File Templates.
 * Description: 腾讯系订单列表 响应参数bean
 */
@Data
public class TencentOrderListResponseBean {
    /**
     * 店铺id
     */
    private int shopId;
    /**
     * 店铺名
     */
    private String shopName;
    /**
     * 总价格
     */
    private String totalPrice;
    /**
     * 	订单ID
     */
    private int orderId;
    /**
     * 父单id
     * 0 为无父单
     */
    private int parentId;
    /**
     * 订单有效标识
     * 0=无效 1=有效
     */
    private int yn;
    /**
     * 	订单状态位
     */
    private String sendPay;
    /**
     * 订单类型
     */
    private int orderType;
    /**
     * 订单提交时间
     */
    private String dateSubmit;
    /**
     * 是否有子单
     */
    private Boolean hasSubOrders;
    /**
     * 	订单状态
     */
    private int state;
    /**
     * 	订单状态名称
     */
    private String stateName;
    /**
     * 支付类型
     */
    private int payType;
    /**
     * 总商品数
     */
    private int totalItems;
    /**
     * 自动取消订单时间（单位 s）
     */
    private String autoCancelTime;
    /**
     * 	商品名
     */
    private String itemName;
    /**
     * 商品价格
     */
    private Long itemPrice;
    /**
     * 	数量
     */
    private int itemNum;
    /**
     * 商品sku
     */
    private int itemSkuid;
    /**
     * 商品图片地址
     */
    private String itemPicture;
    /**
     * 物流信息
     */
    private String wlStateDesc;
    /**
     * 	物流时间
     */
    private String createTime;
    /**
     * 	系统错误码
     */
    private String code;
    /**
     * 系统错误码说明
     */
    private String msg;
    /**
     * 	订单总数量
     */
    private int totalNum;
    /**
     * 	业务错误码
     */
    private String errCode;
    /**
     * 业务错误码说明
     */
    private String errMsg;
    /**
     * 请求是否成功
     */
    private Boolean isSuccess;
}
