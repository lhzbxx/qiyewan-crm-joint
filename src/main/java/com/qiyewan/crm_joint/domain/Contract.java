package com.qiyewan.crm_joint.domain;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Entity(name = "t_contract_service")
@Data
public class Contract {
    private String sno;
    private String area;
    private String contractSno;
    private String boPid;
    private String productSeries;
    private String currentProductServiceNode;
    private String status;
    private String customerId;
    private String servicePerson;
    private String startMonth;
    private String endMonth;
    private String sysStatus;
    private String sysUuid;
    private String memo;
    private String creUser;
    private Date creDate;
    private String updUser;
    private Date updDate;
    private String owner;

    public Contract() {}
}
