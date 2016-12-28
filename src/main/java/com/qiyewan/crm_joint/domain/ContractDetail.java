package com.qiyewan.crm_joint.domain;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Entity(name = "t_contract_service_detail")
@Data
public class ContractDetail {
    private Long id;
    private String contractServiceId;
    private String productServiceId;
    private String productServiceName;
    private String status;
    private String memo;
    private String creUser;
    private Date creDate;
    private String updUser;
    private Date updDate;
    private String owner;

    public ContractDetail() {}
}
