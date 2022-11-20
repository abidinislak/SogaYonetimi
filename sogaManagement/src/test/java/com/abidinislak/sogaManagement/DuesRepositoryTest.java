package com.abidinislak.sogaManagement;


import com.abidinislak.sogaManagement.model.Dues;
import com.abidinislak.sogaManagement.model.User;
import com.abidinislak.sogaManagement.repository.DuesRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class DuesRepositoryTest {


    @Autowired
    DuesRepository repo;


    @Autowired
    EntityManager entityManager;

    @Test
    public void saveDuesTest() {


        Dues temp = new Dues();

        temp.setDiscription("testing");
        temp.setAmount(34.234f);
        temp.setUser(entityManager.find(User.class, 1));


        repo.save(temp);

        assertTrue(temp.getId() > 0);


    }


}
