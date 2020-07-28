package com.example.poetry.apibean;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/15
 * Time: 15:27
 * To change this template use File | Settings | File Templates.
 * Description: 秒杀接口 请求参数bean 响应参数bean未建
 */
@Data
public class MiaoShaAreaListBean {
    /**
     * 客户端版本比如 mcoupon
     * 必须: 是
     */
    private String client;
    /**
     * 分辨率大小
     * 必须: 是
     */
    private String screen;
    /**
     * 客户端版本
     * 必须: 是
     */
    private String clientVersion;
    /**
     * gid  例:'gid':'-1'
     * 必须: 是
     */
    private String gid;
}
