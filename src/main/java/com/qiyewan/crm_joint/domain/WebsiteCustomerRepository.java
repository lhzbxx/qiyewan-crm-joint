package com.qiyewan.crm_joint.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebsiteCustomerRepository extends JpaRepository<WebsiteCustomer, Long> {
}
