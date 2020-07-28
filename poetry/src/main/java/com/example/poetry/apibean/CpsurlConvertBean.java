package com.example.poetry.apibean;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/15
 * Time: 15:01
 * To change this template use File | Settings | File Templates.
 * Description: 自定义链接转换接口 请求参数bean
 */
@Data
public class CpsurlConvertBean {
    /**
     * 登录k.jd.com后网站右上角显示的用户名
     * 必须: 是
     */
    private String pin;
    /**
     * 填写APP ID。请访问京东联盟media.jd.com，推广管理--APP管理中查找。
     * 必须: 是
     */
    private String webId;
    /**
     * 默认传0
     * 必须: 是
     */
    private int positionId;
    /**
     * 需要转换的落地页url
     * 必须: 是
     */
    private String materalId;
}

