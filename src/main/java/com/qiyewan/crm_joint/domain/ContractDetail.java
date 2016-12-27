package com.qiyewan.crm_joint.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.UUID;

@Entity(name = "t_contract_service_detail")
@Data
public class ContractDetail {
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
    private String uuid = UUID.randomUUID().toString();
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt = new Date();
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt = new Date();

    public ContractDetail() {}
}
