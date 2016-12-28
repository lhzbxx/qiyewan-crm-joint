package com.qiyewan.crm_joint.common;

import lombok.Data;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class Order {
    private Long id;
    // 用户ID
    private Long userId;
    // 订单编号
    private String serialId;
    // 订单详情
    private List<OrderDetail> details;
    // 支付方式
    private String payment;
    // 订单状态
    private String orderStage;
    // 总价
    private BigDecimal totalPrice;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;
    private String charge;

    public Order() {}
}
