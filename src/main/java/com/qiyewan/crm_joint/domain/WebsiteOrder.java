package com.qiyewan.crm_joint.domain;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Entity(name = "m_website_order")
@Data
public class WebsiteOrder {
    private Long id;
    private String area;
    private String orderNo;
    private String mobile;
    private String customerId;
    private String productNo;
    private String productName;
    private Integer productNumber;
    private Float productAmount;
    private Float orderAmount;
    private Date startDate;
    private String status;
    private Date creDate = new Date();
    private Date synDate = new Date();

    public WebsiteOrder() {}
}
