package com.qiyewan.crm_joint.web;

import com.qiyewan.crm_joint.domain.ContractService;
import com.qiyewan.crm_joint.domain.ContractServiceDetail;
import com.qiyewan.crm_joint.service.ContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContractController {
    @Autowired
    private com.qiyewan.crm_joint.service.ContractService contractServiceService;
    @Autowired
    private ContractDetailService contractDetailService;

    @CrossOrigin
    @GetMapping("/contracts")
    public List<ContractService> showContracts(@RequestParam String customerId) {
        return contractServiceService.getContracts(customerId);
    }

    @CrossOrigin
    @GetMapping("/contract-details")
    public List<ContractServiceDetail> showContractDetails(@RequestParam String contractServiceId) {
        return contractDetailService.getContractDetails(contractServiceId);
    }
}