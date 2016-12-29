package com.qiyewan.crm_joint.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "t_contract")
@Data
public class Contract {
    @Id
    private String contractSno;
    private String area;
    private String salesLeadsId;
    private String responsiblePerson;
    private String status;
    private String customerId;
    private String contractAmount;
    private String contractDate;

    public Contract() {}
}
