package com.qiyewan.crm_joint.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity(name = "m_customer")
@Data
public class Customer {
    private Long id;
    private String area;
    private String status;
    private String source;
    private String type;
    private String channel;
    private String name;
    private String mobile;
    private String attention;
    private String telephone;
    private String fax;
    private String email;
    private String address;
    private String payment_num;
    private String company_name;
    private String company_address;
    private String legal_person;
    private String registered_capital;
    private String employees;
    private String business_license;
    private String other_contact;
    private String intention_date;
    private String formal_date;
    private String memo;
    private String sys_status;
    private String cre_user;
    @Temporal(TemporalType.TIMESTAMP)
    private Date cre_date;
    private String upd_user;
    @Temporal(TemporalType.TIMESTAMP)
    private Date upd_date;
    private String owner;

    public Customer() {}
}
