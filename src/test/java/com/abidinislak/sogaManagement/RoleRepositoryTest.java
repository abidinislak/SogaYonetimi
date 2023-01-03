package com.abidinislak.sogaManagement;

import com.abidinislak.sogaManagement.model.Role;
import com.abidinislak.sogaManagement.repository.RoleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
public class RoleRepositoryTest {


    @Autowired
    RoleRepository repo;

    @Test
    public void saveRoleTest() {


        Role temRole = new Role();

        temRole.setRoleName("user");

        Role temRole2 = new Role();

        temRole2.setRoleName("admin");


        repo.saveAll(Arrays.asList(temRole, temRole2));

        assertTrue(temRole.getId() > 0 || temRole2.getId() > 0);


    }


    @Test
    public void findAllTest() {

        var list = (List<Role>) repo.findAll();

        for (var role :
                list) {
            System.err.println(role.getRoleName());

        }
        assertTrue(list.size() > 0);

    }
}
