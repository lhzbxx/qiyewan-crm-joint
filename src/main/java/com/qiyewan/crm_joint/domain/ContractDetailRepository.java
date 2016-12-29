package com.qiyewan.crm_joint.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractDetailRepository extends JpaRepository<ContractDetail, Long> {
    List<ContractDetail> findByContractServiceId(String contractServiceId);
}
