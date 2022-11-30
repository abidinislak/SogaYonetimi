package com.abidinislak.sogaManagement.service;

import com.abidinislak.sogaManagement.model.Payment;
import com.abidinislak.sogaManagement.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {


    @Autowired
    PaymentRepository repository;


    public List<Payment> findByUSerName(Integer username) {


        return repository.findByUser(username);
    }

    public Payment save(Payment payment) {
        return repository.save(payment);

    }


    public Boolean saveMultipleDues(List<Payment> payments) {


        repository.saveAll(payments);

        return true;
    }
}
