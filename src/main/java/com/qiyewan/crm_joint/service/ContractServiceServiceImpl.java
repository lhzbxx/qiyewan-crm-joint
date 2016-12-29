package com.qiyewan.crm_joint.service;

import com.qiyewan.crm_joint.domain.ContractService;
import com.qiyewan.crm_joint.domain.ContractServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceServiceImpl implements ContractServiceService {
    @Autowired
    private ContractServiceRepository contractServiceRepository;

    @Override
    public List<ContractService> getContractServices(String contractSno) {
        return contractServiceRepository.findByContractSno(contractSno);
    }
}
