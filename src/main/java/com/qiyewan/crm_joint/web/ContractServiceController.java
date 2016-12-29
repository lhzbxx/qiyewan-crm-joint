package com.qiyewan.crm_joint.web;

import com.qiyewan.crm_joint.domain.ContractService;
import com.qiyewan.crm_joint.domain.ContractServiceDetail;
import com.qiyewan.crm_joint.service.ContractServiceDetailService;
import com.qiyewan.crm_joint.service.ContractServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContractServiceController {
    @Autowired
    private ContractServiceService contractServiceService;
    @Autowired
    private ContractServiceDetailService contractServiceDetailService;

    @CrossOrigin
    @GetMapping("/contract-services")
    public List<ContractService> showContractServices(@RequestParam String contractSno) {
        return contractServiceService.getContractServices(contractSno);
    }

    @CrossOrigin
    @GetMapping("/contract-service-details")
    public List<ContractServiceDetail> showContractServiceDetails(@RequestParam String contractServiceId) {
        return contractServiceDetailService.getContractServiceDetails(contractServiceId);
    }
}