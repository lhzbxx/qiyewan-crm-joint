package com.qiyewan.crm_joint.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "t_contract_detail")
@Data
public class ContractDetail {
    @Id
    private String id;
    private String contractSno;
    private String product;
    private String productServiceType;
    private String periodType;
    private Float price;
    private Integer amount;
    private Float totalPrice;
    private String status;

    public ContractDetail() {}
}
