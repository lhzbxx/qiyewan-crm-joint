package com.qiyewan.crm_joint.service;

import com.qiyewan.crm_joint.domain.ContractService;
import com.qiyewan.crm_joint.domain.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements com.qiyewan.crm_joint.service.ContractService {
    @Autowired
    private ContractRepository contractRepository;

    @Override
    public List<ContractService> getContracts(String customerId) {
        return contractRepository.findByCustomerId(customerId);
    }
}
