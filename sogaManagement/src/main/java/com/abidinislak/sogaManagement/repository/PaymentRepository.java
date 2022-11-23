package com.abidinislak.sogaManagement.repository;

import com.abidinislak.sogaManagement.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {


    @Query(value = "SELECT * FROM soga.payment where user_id=:userid ", nativeQuery = true)
    List<Payment> findByUser(@Param("userid") Integer userid);


}
