package com.abidinislak.sogaManagement;


import com.abidinislak.sogaManagement.model.Phone;
import com.abidinislak.sogaManagement.model.User;
import com.abidinislak.sogaManagement.repository.PhoneRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class PhoneRepositoryTest {

    @Autowired
    PhoneRepository repo;


    @Autowired
    EntityManager entityManager;


    @Test
    public void savePhoneTest(){

        Phone temp=new Phone("test");


        var saved=repo.save(temp);

        assertTrue(saved.getId()>0);



    }


    @Test
    public void saveWithUserPhonwTest(){

        Phone temp=new Phone("asdasdasd");

        User TempUser=entityManager.find(User.class,1);


        temp.setUser(TempUser);


        var savedPhone=repo.save(temp);


        assertTrue(savedPhone.getUser().getId()>0);





    }
}
