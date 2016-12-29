package com.qiyewan.crm_joint.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractServiceDetailRepository extends JpaRepository<ContractServiceDetail, Long> {
    List<ContractServiceDetail> findByContractServiceId(String contractServiceId);
}
