package com.common;

import lombok.Data;

import javax.annotation.Resource;

/**
 * User: wangtao
 * Date: 2020/7/22
 *
 * @author false
 * Description: 返回参数类
 */
@Data
public class ReturnDate<T> {
    private T data;
    ReturnDate(){}

    ReturnDate(T data){
        this.data = data;
    }

}
