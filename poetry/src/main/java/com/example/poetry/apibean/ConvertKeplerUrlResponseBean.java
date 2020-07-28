package com.example.poetry.apibean;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/15
 * Time: 15:11
 * To change this template use File | Settings | File Templates.
 * Description: 开普勒批量转换推广链接接口 响应参数bean
 */
@Data
public class ConvertKeplerUrlResponseBean {
    /**
     * 系统错误码
     */
    private String code;
    /**
     * 系统错误码说明
     */
    private String msg;
    /**
     * 	返回结果值
     */
    private String message;
    /**
     * 无佣金的商品链接
     */
    private String commonUrls;
    /**
     * 	有佣金的商品链接
     */
    private String keplerUrls;
}


