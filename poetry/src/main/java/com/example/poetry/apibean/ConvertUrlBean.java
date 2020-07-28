package com.example.poetry.apibean;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/14
 * Time: 17:07
 * To change this template use File | Settings | File Templates.
 * Description: 券品二合一推广转换接口 请求参数bean
 */
@Data
public class ConvertUrlBean {

    /**
     * App平台需传值，请访问京东联盟media.jd.com，
     * 推广管理--APP管理中查找AppId。
     * 小程序或微信公众号等非APP端可传0.
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
    private String materialId;
    /**
     * 	pid（可不传，此字段需要向联盟申请账号权限）
     * 必须: 否
     */
    private String pId;
    /**
     * 自定义信息，支持数字，字母，下划线，
     * 不支持中文及其他符号（需要向运营人员申请后才可使用）
     * 必须: 否
     */
    private String subUnionId;
    /**
     * 传1表示返回短链接，传0表示返回长链接
     * 必须: 是
     */
    private int shortUrl;
    /**
     *传1为联盟格式链接，默认不传为开普勒格式链接 。
     * 注：如果需要出参开普勒KM链接，
     * kplClick默认不传且shortUrl不传，
     * 则出参clickURL输出开普勒KM链接。
     * 必须: 否
     */
    private int kplClick;
    /**
     *优惠券链接
     * 必须: 是
     */
    private String couponUrl;
}
