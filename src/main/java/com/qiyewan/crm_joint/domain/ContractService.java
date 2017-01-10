package com.qiyewan.crm_joint.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "t_contract_service")
@Data
public class ContractService {
    @Id
    private String sno;
    private String area;
    // 合同编号
    private String contractSno;
    private String boPid;
    // 服务
    private String productSeries;
    // 当前服务
    private String currentProductServiceNode;
    private String status;
    private String customerId;
    private String servicePerson;
    private String startMonth;
    private String endMonth;
    private String sysStatus;
    private String sysUuid;
    private String memo;
    private Date creDate;
    private Date updDate;

    public ContractService() {}
}
