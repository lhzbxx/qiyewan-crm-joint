package com.qiyewan.crm_joint.service;

import com.qiyewan.crm_joint.domain.ContractDetail;

import java.util.List;

public interface ContractDetailService {
    List<ContractDetail> getContractDetails(String contractServiceId);
}
