package com.qiyewan.crm_joint.web;

import com.qiyewan.crm_joint.common.Order;
import com.qiyewan.crm_joint.common.OrderDetail;
import com.qiyewan.crm_joint.common.User;
import com.qiyewan.crm_joint.domain.WebsiteCustomer;
import com.qiyewan.crm_joint.domain.WebsiteOrder;
import com.qiyewan.crm_joint.service.WebsiteCustomerService;
import com.qiyewan.crm_joint.service.WebsiteOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebsiteController {
    @Autowired
    private WebsiteCustomerService websiteCustomerService;
    @Autowired
    private WebsiteOrderService websiteOrderService;

    @CrossOrigin
    @PostMapping("/customers")
    public String storeCustomer(@RequestBody User user) {
        websiteCustomerService.save(new WebsiteCustomer(user));
        return "SUCCESS";
    }

    @CrossOrigin
    @PostMapping("/orders")
    public String storeOrder(@RequestBody Order order, @RequestParam String mobile, @RequestParam String customerId) {
        for (OrderDetail orderDetail: order.getDetails()) {
            websiteOrderService.save(new WebsiteOrder(order, orderDetail, mobile, customerId));
        }
        return "SUCCESS";
    }
}