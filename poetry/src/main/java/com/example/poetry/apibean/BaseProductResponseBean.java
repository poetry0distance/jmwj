package com.example.poetry.apibean;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/15
 * Time: 10:06
 * To change this template use File | Settings | File Templates.
 * Description: 获取商品基本信息接口 响应参数类
 */
@Data
public class BaseProductResponseBean {

    /**
     * sku 编码
     */
     private String skuId;
    /**
     * 商品名称
     */
     private String name;
    /**
     * 状态
     * 0: 已删除，1: 正常
     */
     private String isDelete;
    /**
     * 上下柜状态
     * 0: 未上架 1: 已上架 2: 非图书商品表示预上架，图书商品表示前台屏蔽 10: POP商品删除状态
     */
     private String state;
    /**
     * 产品编码
     */
     private String barCode;
    /**
     * 商品编号
     * 主 skuId
     */
     private String erpPid;
    /**
     * 颜色
     */
     private String color;
    /**
     * 颜色顺序
     */
     private String colorSequence;
    /**
     * 尺码
     */
     private String size;
    /**
     * 尺码顺序
     */
     private String sizeSequence;
    /**
     * Upc码
     */
     private String upc;
    /**
     * sku 标示
     */
     private String skuMark;
    /**
     * 上下柜日期
     */
     private String saleDate;
    /**
     * 商品的第二分类(3级)
     */
     private String cid2;
    /**
     * 重量
     */
     private String valueWeight;
    /**
     * 重量
     */
     private String weight;
    /**
     * 商品产地(默认:中国大陆)
     */
     private String productArea;
    /**
     * 质保(无质保,一年质保,二年质保等)
     */
     private String wserve;
    /**
     * 图片标签 默认 0 没有标签
     */
     private String allnum;
    /**
     * 	24小时限购数量
     */
     private String maxPurchQty;
    /**
     * 品牌号
     */
     private String branId;
    /**
     * 是否先款商品
     */
     private String valuePayFirst;
    /**
     * 长度
     */
     private String length;
    /**
     * 	宽度
     */
     private String width;
    /**
     * 高度
     */
     private String height;
    /**
     * 商家类型
     */
     private String venderType;
    /**
     * 主商品名称
     */
     private String pname;
    /**
     * 是否序列化
     */
     private String issn;
    /**
     * 	保质期
     */
     private String safeDays;
    /**
     * 销售单位
     */
     private String saleUnit;
    /**
     * 包装规格
     */
     private String packSpecification;
    /**
     * 分类信息
     */
     private String category;
    /**
     * 店内分类
     */
     private String shopCategorys;
    /**
     * 售后电话
     */
     private String phone;
    /**
     * 官网
     */
     private String site;
    /**
     * 英文品牌
     */
     private String ebrand;
    /**
     * 	中文品牌
     */
     private String cbrand;
    /**
     * 型号
     */
     private String model;
    /**
     * 	图片路径
     */
     private String imagePath;
    /**
     * 店铺名称
     */
     private String shopName;
    /**
     * url
     */
     private String url;
}

