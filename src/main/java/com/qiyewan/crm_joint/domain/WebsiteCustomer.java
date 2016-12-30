package com.qiyewan.crm_joint.domain;

import com.qiyewan.crm_joint.common.User;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "m_website_customer")
@Data
public class WebsiteCustomer {
    @Id
    private Long id;
    private String mobile;
    private String customerId;
    private String status;
    private Date creDate = new Date();
    private Date synDate = new Date();

    public WebsiteCustomer() {}

    public WebsiteCustomer(User user) {
        this.mobile = user.getPhone();
        this.customerId = user.getCustomerId();
    }
}
