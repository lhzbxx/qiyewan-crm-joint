package com.qiyewan.crm_joint.service;

import com.qiyewan.crm_joint.domain.WebsiteOrder;
import com.qiyewan.crm_joint.domain.WebsiteOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebsiteOrderServiceImpl implements WebsiteOrderService {
    @Autowired
    private WebsiteOrderRepository websiteOrderRepository;

    @Override
    public void save(WebsiteOrder websiteOrder) {
        websiteOrderRepository.save(websiteOrder);
    }
}
