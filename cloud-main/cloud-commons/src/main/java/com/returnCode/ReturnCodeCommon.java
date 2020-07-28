package com.returnCode;

import lombok.Data;

import javax.annotation.Resource;

/**
 * User: wangtao
 * Date: 2020/7/22
 *
 * @author false
 * Description:
 */
@Data
public class ReturnCodeCommon {
    private Integer SUCCESS_CODE = 1;
    private Integer ERROR_CODE = 0;
    private String SUCCESS_MESSAGE = "接口调用成功";
    private String ERROR_MESSAGE = "接口调用失败";
}
