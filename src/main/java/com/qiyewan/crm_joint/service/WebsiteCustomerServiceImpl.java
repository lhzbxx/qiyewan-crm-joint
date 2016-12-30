package com.qiyewan.crm_joint.service;

import com.qiyewan.crm_joint.domain.WebsiteCustomer;
import com.qiyewan.crm_joint.domain.WebsiteCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebsiteCustomerServiceImpl implements WebsiteCustomerService {
    @Autowired
    private WebsiteCustomerRepository websiteCustomerRepository;

    @Override
    public void save(WebsiteCustomer websiteCustomer) {
        websiteCustomerRepository.save(websiteCustomer);
    }
}
