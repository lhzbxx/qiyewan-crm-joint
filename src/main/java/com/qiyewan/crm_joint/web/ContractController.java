package com.qiyewan.crm_joint.web;

import com.qiyewan.crm_joint.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContractController {
    @Autowired
    private CustomerService customerService;

//    @CrossOrigin
//    @GetMapping("/customers")
//    public Page<Customer> showCustomers() {
//        return customerService;
//    }
}