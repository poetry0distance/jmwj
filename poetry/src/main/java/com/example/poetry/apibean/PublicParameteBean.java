package com.example.poetry.apibean;

import lombok.Data;


/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/14
 * Time: 16:40
 * To change this template use File | Settings | File Templates.
 * Description: 接口公共参数
 */
@Data
public class PublicParameteBean {

    /**
     * API接口名称
     * 必须: 是
     */
    private String method;
    /**
     * 采用OAuth授权方式为必填参数
     * 必须: 是
     */
    private String accessToken;
    /**
     * 应用的app_key
     * 必须: 是
     */
    private String appKey;
    /**
     * 签名
     * 必须: 是
     */
    private String sign;
    /**
     * 	时间戳，格式为yyyy-MM-dd HH:mm:ss，
     * 	例如：2011-06-16 13:23:30。
     * 	京东API服务端允许客户端请求时间误差为10分钟
     * 必须: 是
     */
    private String timestamp;
    /**
     * 暂时只支持  json
     * 必须: 否
     */
    private String format;
    /**
     * 版本：1.0
     * 必须: 否
     */
    private String v;
}
