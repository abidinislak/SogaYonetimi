package com.abidinislak.sogaManagement;

import com.abidinislak.sogaManagement.model.Phone;
import com.abidinislak.sogaManagement.model.Role;
import com.abidinislak.sogaManagement.model.User;
import com.abidinislak.sogaManagement.model.modelUtil.UserList;
import com.abidinislak.sogaManagement.repository.PhoneRepository;
import com.abidinislak.sogaManagement.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserTest {


    @Autowired
    UserRepository repo;


    @Autowired
    PhoneRepository repoPhone;


    @Autowired
    EntityManager entityManager;

    @Test
    public void saveUserTest() {

        User tempUSer = new User("1", "eeee", "eeee");

        repo.save(tempUSer);


        assert (tempUSer != null);

    }


    @Test
    public void findByUserNameTest() {


        User tenmp = repo.findByUserName("22");


        assertEquals("abidin", tenmp.getPersonName());
    }

    @Test
    public void saveUserWithRoleTest() {

        User temp = new User();

        temp.setUserName("21");

        temp.setPersonName("asdas");
        temp.setPassword("21");

        Role role = entityManager.find(Role.class, 1);
        User temp2 = new User();

        temp2.setUserName("2");

        temp2.setPersonName("ilhan");
        temp2.setPassword("2");


        Role role2 = entityManager.find(Role.class, 1);


        temp2.addRole(role2);
        temp.addRole(role);

        repo.saveAll(Arrays.asList(temp, temp2));


        assertTrue(temp.getRoles().size() > 0);


    }

    @Test
    public void getUserListWithWverthingTest() {


        List<UserList> temp = repo.getUserListWithWverthing();


        for (var obje : temp
        ) {

//            System.err.println(obje.getAaa());

        }

    }

@Test
public void saveUserWithPhoneNumber(){


        User user=repo.findById(1).get();



        Phone temp=new Phone("sdqwd");
        temp.setUser(user);

var tempPhone=repoPhone.save(temp);

user.addPhone(tempPhone);


        repo.save(user);


assertTrue(user.getPhone().size()>0);










}


@Test
public void findAllUSers(){


        var user=repo.findAll();

        assertTrue(user.size()>0);


}

@Test

    public void listPhoneTest(){

        var user=repo.findById(1);


    for (var phone :
            user.get().getPhone()) {
        System.err.println(phone);
    }

        assertTrue(user.get().getPhone().size()>0);




}


}
