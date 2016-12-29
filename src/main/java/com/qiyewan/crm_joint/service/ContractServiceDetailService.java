package com.qiyewan.crm_joint.service;

import com.qiyewan.crm_joint.domain.ContractServiceDetail;

import java.util.List;

public interface ContractServiceDetailService {
    List<ContractServiceDetail> getContractServiceDetails(String contractServiceId);
}
