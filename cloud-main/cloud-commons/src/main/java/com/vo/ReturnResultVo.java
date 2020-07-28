package com.vo;

import com.common.ReturnDate;
import lombok.Data;

import javax.annotation.Resource;

/**
 * User: wangtao
 * Date: 2020/7/22
 * @author false
 * Description: 接口返回封装类
 */
@Data
public class ReturnResultVo<T> {
    private Integer code;
    private String msg;
    private T result;
}
