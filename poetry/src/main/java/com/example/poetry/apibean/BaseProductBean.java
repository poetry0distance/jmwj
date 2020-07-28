package com.example.poetry.apibean;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/15
 * Time: 10:04
 * To change this template use File | Settings | File Templates.
 * Description: 获取商品基本信息接口 请求参数类
 */
@Data
public class BaseProductBean {
    /**
     * 商品编码
     * 必须: 是
     */
    private String skuId;

    /**
     * 商品基本信息
     * 必须: 是
     */
    private String baseField;
}
