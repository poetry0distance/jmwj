package com.example.poetry.apibean;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/14
 * Time: 17:14
 * To change this template use File | Settings | File Templates.
 * Description: 券品二合一推广转换接口 响应参数bean
 */
@Data
public class ConvertUrlResponseBean {

    /**
     * 0: 成功; 1: appKey空; 2: pin空; 3: webId空; 4: positionId空;
     * 5: materalId空; 6: 未开通权限; 7: 转换失败
     */
    private int convertCode;
    /**
     * 	转换结果说明
     */
    private String convertMsg;
    /**
     *	系统错误码
     */
    private String code;
    /**
     * 是否成功
     */
    private boolean success;
    /**
     * 	返回信息
     */
    private boolean message;
    /**
     * 	生成的开普勒格式链接
     */
    private String clickURL;
    /**
     * 短链接
     */
    private String shortUrl;
    /**
     * 0
     */
    private int errCode;
}
