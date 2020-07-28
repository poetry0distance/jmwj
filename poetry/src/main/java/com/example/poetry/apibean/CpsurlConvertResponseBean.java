package com.example.poetry.apibean;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/15
 * Time: 15:04
 * To change this template use File | Settings | File Templates.
 * Description: 自定义链接转换接口 响应参数bean
 */
@Data
public class CpsurlConvertResponseBean {
    /**
     *	0: 成功;
     *	1: appKey空;
     *	2: pin空;
     *	3: webId空;
     *	4: positionId空;
     *	5: materalId空;
     *	6: 未开通权限;
     *	7: 转换失败
     */
    private int convertCode;
    /**
     * 转换结果说明
     */
    private String convertMsg;
    /**
     * 	是否成功
     */
    private Boolean success;
    /**
     * 返回信息
     */
    private String message;
    /**
     * 	生成的链接
     */
    private String clickURL;
    /**
     * 	系统错误码
     */
    private String code;
    /**
     * 	系统错误码说明
     */
    private String msg;
}
