package com.example.poetry.apibean;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/10/15
 * Time: 14:34
 * To change this template use File | Settings | File Templates.
 * Description: 开普勒订单详情接口 响应参数bean
 */
@Data
public class KeplerOrderGetListResponseBean {
    /**
     * 	返回码
     */
    private String code;
    /**
     * 	错误描述
     */
    private String msg;
    /**
     * 1成功，0失败
     */
    private int success;
    /**
     * 	success为0时，errors为响应的失败描述；否则为空
     */
    private String errors;
    /**
     * 	日期 为 YYYYMMDDhhmmss格式
     */
    private String begintime;
    /**
     * 	日期 为 YYYYMMDDhhmmss格式
     */
    private String endTime;
    /**
     * true还有其他订单，可继续翻页；false没有更多订单了
     */
    private Boolean hasMore;
    /**
     * 查询页
     */
    private int pageIndex;
    /**
     * 	每页大小
     */
    private int pageSize;
    /**
     * 	appKey
     * 	例如: HD8Y2P3ND2D-32JD32H8FH32D
     */
    private String appKey;
    /**
     * 	订单号
     */
    private int orderId;
    /**
     * 父订单号
     */
    private int parentId;
    /**
     * 	订单状态 -1未知 1新订单 2等待付款 3等待付款确定 4延迟付款确定 5 已付款
     */
    private int status;
    /**
     * 	配送方式 参考http://kepler.jd.com/console/docCenterCatalog/docContent?channelId=31
     */
    private int idShipmentType;
    /**
     * 	配送状态：0新增，1妥投，2拒收
     */
    private int idShipmentStatus;
    /**
     * 支付方式 参考 http://kepler.jd.com/console/docCenterCatalog/docContent?channelId=32
     * 1	货到付款
     * 2	邮局汇款
     * 3	自提
     * 4	在线支付
     * 5	公司转帐
     * 8	分期付款
     * 12	月结
     * 16	校园自提
     * 17	好邻居自提
     * 18	社区自提
     * 19	自提柜
     * 99	混合支付
     * 165	银联手机支付
     */
    private int idPaymentType;
    /**
     * 	支付状态：0未支付，1支付成功
     */
    private int idPaymentStatus;
    /**
     * 	订单类型 参考http://kepler.jd.com/console/docCenterCatalog/docContent?channelId=33
     * 	0	一般订单
     * 2	拍卖订单
     * 8	服务产品
     * 11	售后调货
     * 15	返修发货
     * 16	直接赔偿
     * 18	厂商直送
     * 19	客服补件
     * 21	PopFbp
     * 22	PopSop
     * 23	PopLbp
     * 25	POp SOPL
     * 28	团购(虚拟)
     * 33	电子礼品卡
     * 34	游戏点卡
     * 35	机票
     * 36	彩票
     * 37	手机充值(新)
     * 38	电子书订单
     * 39	酒店订单
     * 42	通用合约计划
     * 43	电影票
     * 44	景点门票
     * 45	租车
     * 46	火车票
     * 47	旅游
     * 49	实物礼品卡
     * 51	误购取件费订单
     * 53	票务订单
     * 54	线下礼品卡订单
     * 55	域名订单
     * 56	节能补贴订单
     * 57	应用商店订单
     * 58	数字音乐
     * 61	EPT订单
     * 62	网页游戏
     * 63	POP拍卖
     * 64	非车险保险订单
     * 65	车险订单
     * 66	数字音乐IAP订单
     * 67	电子书IAP订单
     * 68	POP拍卖保证金订单
     * 69	京东服务产品订单
     * 70	软件服务订单
     * 71	培训服务订单
     * 72	模板服务订单
     * 73	需求外包
     * 74	生活缴费订单
     * 75	LOC
     * 76	云产品订单
     * 77	LSP
     * 78	电商云订单
     * 79	电商云平台订单
     * 80	服务市场代销
     * 81	电商云代销
     * 82	汽车票订单
     * 83	国际机票订单
     * 84	拍拍对接快捷支付实物订单
     * 85	拍拍对接快捷支付虚拟订单
     * 86	合约机虚拟订单
     * 87	手机流量充值
     * 88	B2B订单
     * 89 	移动仓库订单
     * 90	易车订单
     * 91 	会员PLUS
     * 92	客服外包订单
     * 93	会唐商旅订单
     * 94	运营商手机流量充值订单
     * 95	供应商罗盘订单
     * 96	sop虚拟订单
     * 97	京东万象订单
     * 98	一元抢宝订单
     * 99	中石油充值订单
     * 100	年货卡
     * 101	千寻订单
     * 102	自营售码订单
     * 103	拍摄服务
     * 104	京东图库
     * 105	在线视频教育
     * 106	山姆会员虚拟卡售卡订单
     * 107	海外房产订单
     * 108	京东售后服务产品
     * 109	卡密充值
     * 110	问诊单
     * 111	国际酒店
     * 112	FCS
     * 113	捐赠订单
     * 114	京答订单
     * 115	商家资质认证订单
     * 116	场馆预订订单
     * 117	在线问卷调研订单
     * 118	迪士尼订单
     * 119	京麦平台自营订单
     * 120	京麦平台POP订单
     * 121	抢宝自营模式（GO专享）订单
     * 122	车险订单
     * 123	城市一卡通充值订单
     * 124	京东通信能力开放平台订单
     */
    private int orderType;
    /**
     * 	原始应付金额
     */
    private Long totalPrice;
    /**
     * 	第三方app信息
     * 	例如: 小金花
     */
    private String keplerCustomerInfo;
    /**
     * 子联盟ID
     */
    private int subUnion;
    /**
     * 	订单创建时间
     * 	例如: 20160101010101
     */
    private String createDate;
    /**
     * 订单更新时间
     * 	例如: 20160101010101
     */
    private String updateTime;
    /**
     * 图片url
     *  例: jfs/t1882/251/1848938783/346075/9739d4c5/5673c76eNcfee2d55.jpg
     */
    private String imgUrl;
    /**
     * 	商店名称
     */
    private String shopName;
    /**
     * 	价钱
     */
    private Long price;
    /**
     * 	数量
     */
    private int num;
    /**
     * 	二级分类
     */
    private int cid2;
    /**
     * 一级分类
     */
    private int cid;
    /**
     * 	商品名称
     */
    private String name;
    /**
     * 	sku
     */
    private int id;
    /**
     * 	操作系统
     * 	例: ios
     */
    private String os;
    /**
     * 订单是否有效；0表示无效，1表示有效
     */
    private int yn;





}
