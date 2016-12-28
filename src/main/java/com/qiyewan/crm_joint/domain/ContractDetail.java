package com.qiyewan.crm_joint.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "t_contract_service_detail")
@Data
public class ContractDetail {
    @Id
    private Long id;
    private String contractServiceId;
    // 产品编号
    private String productServiceId;
    // 服务节点
    private String productServiceName;
    // 状态
    private String status;
    // 备注
    private String memo;
    private String creUser;
    private Date creDate;
    private String updUser;
    private Date updDate;
    private String owner;

    public ContractDetail() {}
}
