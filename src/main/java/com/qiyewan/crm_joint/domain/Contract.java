package com.qiyewan.crm_joint.domain;

import lombok.Data;

import javax.persistence.Entity;

@Entity(name = "t_contract_service")
@Data
public class Contract {
    private String sno;
    private String area;
    private String contract_sno;
    private String bo_pid;
    private String product_series;
    private String current_product_service_node;
    private String status;
    private String customer_id;
    private String service_person;
    private String start_month;
    private String end_month;
    private String sys_status;
    private String sys_uuid;
    private String memo;
    private String cre_user;
    private String cre_date;
    private String upd_user;
    private String upd_date;
    private String owner;

    public Contract() {}
}
