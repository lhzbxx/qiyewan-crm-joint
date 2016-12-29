package com.qiyewan.crm_joint.web;

import com.qiyewan.crm_joint.domain.ContractService;
import com.qiyewan.crm_joint.domain.ContractServiceDetail;
import com.qiyewan.crm_joint.service.ContractDetailService;
import com.qiyewan.crm_joint.service.ContractServiceDetailService;
import com.qiyewan.crm_joint.service.ContractServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContractController {
    @Autowired
    private ContractService contractServiceService;
    @Autowired
    private ContractDetailService contractDetailService;
    @Autowired
    private ContractServiceService contractServiceService;
    @Autowired
    private ContractServiceDetailService contractServiceDetailService;

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

    @CrossOrigin
    @GetMapping("/contract-services")
    public List<ContractService> showContractServices(@RequestParam String customerId) {
        return contractServiceService.getContracts(customerId);
    }

    @CrossOrigin
    @GetMapping("/contract-service-details")
    public List<ContractServiceDetail> showContractServiceDetails(@RequestParam String contractServiceId) {
        return contractDetailService.getContractDetails(contractServiceId);
    }
}