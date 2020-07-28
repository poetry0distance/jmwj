package com.example.poetry.apibean;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/15
 * Time: 13:52
 * To change this template use File | Settings | File Templates.
 * Description: 获取推广商品信息接口 响应参数bean
 */
@Data
public class GoodsInfoResponseBean {
    /**
     * 系统错误码
     */
    private String code;
    /**
     * 系统错误码说明
     */
    private String msg;
    /**
     * 返回商品信息json串——
     * message：接口返回结果描述，
     * result：商品推广信息实体类，
     * sucessed：接口是否调用成功（true:成功，false:失败），
     * skuId：SKUID，
     * goodsName：商品名称，
     * unitPrice：商品单价即京东价,
     * wlUnitPrice：商品无线京东价（单价为-1表示未查询到改商品单价）
     * imgUrl:图片地址
     * commisionRatioPc：PC佣金比例，
     * commisionRatioWl：无线佣金比例，
     * shopId：店铺ID，
     * materialUrl：商品落地页，
     * startDate：推广开始日期，
     * endDate：推广结束日期
     */
    private String result;
}
