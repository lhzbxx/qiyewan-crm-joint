package com.qiyewan.crm_joint.web;

import com.qiyewan.crm_joint.domain.Contract;
import com.qiyewan.crm_joint.domain.ContractDetail;
import com.qiyewan.crm_joint.service.ContractDetailService;
import com.qiyewan.crm_joint.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContractController {
    @Autowired
    private ContractService contractService;
    @Autowired
    private ContractDetailService contractDetailService;

    @CrossOrigin
    @GetMapping("/contracts")
    public List<Contract> showContracts(@RequestParam String customerId) {
        return contractService.getContracts(customerId);
    }

    @CrossOrigin
    @GetMapping("/contract-details")
    public List<ContractDetail> showContractDetails(@RequestParam String contractServiceId) {
        return contractDetailService.getContractDetails(contractServiceId);
    }
}