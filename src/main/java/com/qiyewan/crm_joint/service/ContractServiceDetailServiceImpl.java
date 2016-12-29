package com.qiyewan.crm_joint.service;

import com.qiyewan.crm_joint.domain.ContractService;
import com.qiyewan.crm_joint.domain.ContractServiceDetail;
import com.qiyewan.crm_joint.domain.ContractServiceDetailRepository;
import com.qiyewan.crm_joint.domain.ContractServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceDetailServiceImpl implements ContractServiceDetailService {
    @Autowired
    private ContractServiceDetailRepository contractServiceDetailRepository;

    @Override
    public List<ContractServiceDetail> getContractServiceDetails(String customerId) {
        return contractServiceDetailRepository.findByCustomerId(customerId);
    }
}