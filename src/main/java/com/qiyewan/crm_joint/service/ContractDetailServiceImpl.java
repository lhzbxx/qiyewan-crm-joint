package com.qiyewan.crm_joint.service;

import com.qiyewan.crm_joint.domain.ContractServiceDetail;
import com.qiyewan.crm_joint.domain.ContractDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailServiceImpl implements ContractDetailService {
    @Autowired
    private ContractDetailRepository contractDetailRepository;

    @Override
    public List<ContractServiceDetail> getContractDetails(String contractServiceId) {
        return contractDetailRepository.findByContractServiceId(contractServiceId);
    }
}
