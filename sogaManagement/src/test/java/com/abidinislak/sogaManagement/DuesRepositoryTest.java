package com.abidinislak.sogaManagement;


import com.abidinislak.sogaManagement.model.Dues;
import com.abidinislak.sogaManagement.model.User;
import com.abidinislak.sogaManagement.repository.DuesRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

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
        temp.setAmount(234.234f);
        temp.setUser(entityManager.find(User.class, 1));
        temp.setDuesPayDay(new Date());

        repo.save(temp);


    }


    @Test
    public void duesListTest() {

        List<Dues> lis = repo.findAll();

        assertNotNull(lis);


    }


}
