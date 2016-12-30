package com.qiyewan.crm_joint.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "t_contract_details")
@Data
public class ContractDetail {
    @Id
    private String id;
    private String contractSno;
    private String product;
    private Float price;
    private Integer number;
    private Float totalPrice;
    private String status;

    public ContractDetail() {}
}
