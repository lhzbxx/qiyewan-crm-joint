package com.qiyewan.crm_joint.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
    @Temporal(TemporalType.TIMESTAMP)
    private Date creDate;
    private String updUser;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updDate;
    private String owner;

    public ContractDetail() {}
}
