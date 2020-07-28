package com.example.poetry.apibean;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/14
 * Time: 16:54
 * To change this template use File | Settings | File Templates.
 * Description: 批量生成推广链接 请求参数bean
 */
@Data
public class GenClickUrlBean {

    /**
     * skuId
     * 可多个skuId 封装成 java.util.List 类型
     * 必须: 是
     */
    private String skuId;
}
