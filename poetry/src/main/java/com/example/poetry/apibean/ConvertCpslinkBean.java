package com.example.poetry.apibean;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/15
 * Time: 13:38
 * To change this template use File | Settings | File Templates.
 * Description: url批量转换开普勒推广链接 请求参数bean
 */
@Data
public class ConvertCpslinkBean {

    /**
     *批量传入url链接，以逗号进行分隔（支持京东及1号店的首页、商品详情页、频道页、活动页、店铺页）
     * 必须: 是
     */
    private String urls;
    /**
     *	是否唤起APP 1 是 0否
     *必须: 是
     */
    private String type;
    /**
     *自定义信息，支持数字，字母，下划线，不支持中文及其他符号
     * 必须: 否
     */
    private String subUnionId;
}
