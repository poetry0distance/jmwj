package com.example.poetry.apibean;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/15
 * Time: 13:40
 * To change this template use File | Settings | File Templates.
 * Description:  url批量转换开普勒推广链接 响应参数bean
 */
@Data
public class ConvertCpslinkResponseBean {

    /**
     * 状态码
     */
    private int code;
    /**
     *状态码描述信息
     */
    private String msg;
    /**
     *	转换后的url信息
     */
    private String urls;
}
