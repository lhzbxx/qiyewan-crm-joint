package com.qiyewan.crm_joint.domain;

import com.qiyewan.crm_joint.common.CityCode;
import com.qiyewan.crm_joint.common.Order;
import com.qiyewan.crm_joint.common.OrderDetail;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "t_website_order")
@Data
public class WebsiteOrder {
    @Id
    private Long id;
    private String area;
    private String orderNo;
    private String mobile;
    private String customerId;
    private String productNo;
    private String productName;
    private Integer productNumber;
    private Float productAmount;
    private Date startDate;
    private String status = "1";
    private Date creDate = new Date();
    private Date synDate = new Date();

    public WebsiteOrder() {}

    public WebsiteOrder(Order order, OrderDetail orderDetail, String mobile, String customerId) {
        this.id = order.getId();
        this.area = CityCode.convert(orderDetail.getRegion().substring(0, 2));
        this.mobile = mobile;
        this.orderNo = order.getSerialId();
        this.customerId = customerId;
        this.startDate = order.getCreateAt();
        this.productNo = orderDetail.getProductSerialId();
        this.productName = orderDetail.getName();
        this.productNumber = orderDetail.getAmount();
        this.productAmount = orderDetail.getUnitPrice();
    }
}
