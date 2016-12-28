package com.qiyewan.crm_joint.service;

import com.qiyewan.crm_joint.domain.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomers(String phone);
}
