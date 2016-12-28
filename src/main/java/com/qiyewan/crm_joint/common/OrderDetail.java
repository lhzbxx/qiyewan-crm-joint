package com.qiyewan.crm_joint.common;

import lombok.Data;

@Data
public class OrderDetail {
    private Long id;
    // 区域名称
    private String region;
    // 区域编号
    private String regionCode;
    // 产品编号
    private String productSerialId;
    // 产品名称
    private String name;
    // 数量
    private Integer amount;
    // 单价
    private Float unitPrice;
    // 数量量词
    private String unit;
    // 描述
    private String summary;
    // 封面
    private String cover;
    // 是否已评价
    private Boolean isReviewed;
    // 参与人数
    private Integer member;

    public OrderDetail() {}
}
