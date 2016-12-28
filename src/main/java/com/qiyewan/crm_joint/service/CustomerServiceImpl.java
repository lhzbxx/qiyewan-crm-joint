package com.qiyewan.crm_joint.service;

import com.qiyewan.crm_joint.domain.Customer;
import com.qiyewan.crm_joint.domain.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomers(String phone) {
        return customerRepository.findByMobile(phone);
    }
}
