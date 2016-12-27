package com.qiyewan.crm_joint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lhzbxx on 2016/10/26.
 *
 * 用户和用户认证
 */

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerService customerService;
}
