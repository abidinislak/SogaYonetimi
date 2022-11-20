package com.abidinislak.sogaManagement;


import com.abidinislak.sogaManagement.model.Payment;
import com.abidinislak.sogaManagement.model.User;
import com.abidinislak.sogaManagement.repository.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class PaymentRepositoryTest {

    @Autowired
    PaymentRepository repo;


    @Autowired
    EntityManager entityManager;

    @Test
    public void savePaymentTest() {

        Payment temp = new Payment();
        temp.setAmount(12.5f);
        temp.setDiscription("first pamnet");

        entityManager.find(User.class, 1);

        temp.setUser(entityManager.find(User.class, 1));

        temp.setPayDay(new Date());

        repo.save(temp);


        assertTrue(temp.getId() > 0);


    }
}
