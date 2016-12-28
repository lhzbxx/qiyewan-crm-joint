package com.qiyewan.crm_joint.domain;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Entity(name = "m_website_customer")
@Data
public class WebsiteCustomer {
    private Long id;
    private String mobile;
    private String customerId;
    private String status;
    private Date creDate = new Date();
    private Date synDate = new Date();

    public WebsiteCustomer() {}
}
