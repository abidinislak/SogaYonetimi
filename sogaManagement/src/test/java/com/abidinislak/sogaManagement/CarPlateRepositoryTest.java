package com.abidinislak.sogaManagement;


import com.abidinislak.sogaManagement.model.CarPlate;
import com.abidinislak.sogaManagement.model.User;
import com.abidinislak.sogaManagement.repository.CarPlateRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CarPlateRepositoryTest {



    @Autowired
    CarPlateRepository repo;

@Autowired
    EntityManager entityManager;

    @Test
    public void saveCarPlateTest(){

        CarPlate carPlate=new CarPlate();

        carPlate.setPlate("06hc556");

        var savedCarPlate=repo.save(carPlate);
        assertTrue(savedCarPlate.getId()>0);



    }


    @Test

    public void saveWithUserTest(){

        CarPlate carPlate=new CarPlate();
        carPlate.setPlate("etst 1");

        User user=entityManager.find(User.class,1);

        carPlate.setUser(user);

        var savedCarPlate=repo.save(carPlate);
        assertTrue(savedCarPlate.getId()>0);
        assertTrue(savedCarPlate.getUser().getId()>0);




    }
}
