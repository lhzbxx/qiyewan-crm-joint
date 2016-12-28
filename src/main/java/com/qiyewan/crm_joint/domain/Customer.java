package com.qiyewan.crm_joint.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity(name = "m_customer")
@Data
public class Customer {
    @Id
    private String id;
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
    private String paymentNum;
    private String companyName;
    private String companyAddress;
    private String legalPerson;
    private String registeredCapital;
    private String employees;
    private String businessLicense;
    private String otherContact;
    private String intentionDate;
    private String formalDate;
    private String memo;
    private String sysStatus;
    private String creUser;
    @Temporal(TemporalType.TIMESTAMP)
    private Date cre_date;
    private String upd_user;
    @Temporal(TemporalType.TIMESTAMP)
    private Date upd_date;
    private String owner;

    public Customer() {}
}
