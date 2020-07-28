package com.example.poetry.apibean;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/15
 * Time: 15:08
 * To change this template use File | Settings | File Templates.
 * Description: 开普勒批量转换推广链接接口 请求参数bean
 */
@Data
public class ConvertKeplerUrlBean {
    /**
     * 可不传此值，默认14
     * 必须: 否
     */
    private String sourceEmt;
    /**
     * 联盟ID,media.jd.com的账户管理中查看联盟ID值。
     * 必须: 是
     */
    private String unionId;
    /**
     * 应用的APPID，media.jd.com，CPS管理--推广管理--APP管理中查找。
     * 必须: 是
     */
    private String webId;
    /**
     * 商品的skuId，最多支持100个，以英文逗号分隔。
     * 必须: 是
     */
    private String skuList;
    /**
     * 	传递应用程序的appKey值
     * 必须: 是
     */
    private String appKey;
    /**
     * 	是否呼起京东APP。type:1 呼起京东APP；type:0 不呼起京东APP
     * 必须: 是
     */
    private String type;
    /**
     * 自定义信息，支持数字，字母，下划线，不支持中文及其他符号
     * 必须: 否
     */
    private String subUnionId;
}
