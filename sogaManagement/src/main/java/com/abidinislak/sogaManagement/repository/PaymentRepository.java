package com.abidinislak.sogaManagement.repository;

import com.abidinislak.sogaManagement.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer> {
}
