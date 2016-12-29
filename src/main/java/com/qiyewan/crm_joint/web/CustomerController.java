package com.qiyewan.crm_joint.web;

import com.qiyewan.crm_joint.domain.Customer;
import com.qiyewan.crm_joint.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @CrossOrigin
    @GetMapping("/customers")
    public List<Customer> showCustomers(@RequestParam String phone) {
        return customerService.getCustomers(phone);
    }
}