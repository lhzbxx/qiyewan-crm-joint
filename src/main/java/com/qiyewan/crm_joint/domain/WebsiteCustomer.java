package com.qiyewan.crm_joint.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

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

    public void generateSerialId() {
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss", Locale.ENGLISH);
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+08:00"));
        this.customerId = "W"
                + sdf.format(this.creDate).substring(2, 5)
                + this.id;
    }
}
