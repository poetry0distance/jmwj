package com.example.poetry.apibean;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/15
 * Time: 13:50
 * To change this template use File | Settings | File Templates.
 * Description: 获取推广商品信息接口 请求参数bean
 */
@Data
public class GoodsInfoBean {

    /**
     * 商品编号,支持同时查询100个sku
     * 必须: 是
     */
    private String skuIds;
}
