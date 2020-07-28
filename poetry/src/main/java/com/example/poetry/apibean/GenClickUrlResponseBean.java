package com.example.poetry.apibean;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/14
 * Time: 17:03
 * To change this template use File | Settings | File Templates.
 * Description: 批量生成推广链接 响应结果bean
 */
@Data
public class GenClickUrlResponseBean {

    /**
     * 	系统编号
     */
    private String code;
    /**
     * 系统说明
     */
    private String msg;
    /**
     * 0：成功，1：商品列表id空，2：未开通权限，3：获取失败
     */
    private int clickUrlCode;
    /**
     * 获取结果描述
     */
    private String clickUrlMsg;
    /**
     * key:skuId,value:{success:,message:,clickURL:}
     */
    private String skuId;
}
