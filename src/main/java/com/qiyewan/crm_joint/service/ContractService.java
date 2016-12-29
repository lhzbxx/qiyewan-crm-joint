package com.qiyewan.crm_joint.service;

import com.qiyewan.crm_joint.domain.Contract;

import java.util.List;

public interface ContractService {
    List<Contract> getContracts(String customerId);
}
