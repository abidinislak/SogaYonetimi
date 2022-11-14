package com.abidinislak.sogaManagement;

import com.abidinislak.sogaManagement.model.User;
import com.abidinislak.sogaManagement.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserTest {



    @Autowired
    UserRepository repo;

    @Test
    public void saveUserTest(){

        User tempUSer=new User((short)1,"test 1","test 1 lstname");

        repo.save(tempUSer);


        assert(tempUSer!=null);

    }
}
