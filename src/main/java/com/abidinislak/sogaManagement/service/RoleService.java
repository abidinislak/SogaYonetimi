package com.abidinislak.sogaManagement.service;

import com.abidinislak.sogaManagement.model.Role;
import com.abidinislak.sogaManagement.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {


    @Autowired
    RoleRepository repo;


    public List<Role> findAll() {


        return (List<Role>) repo.findAll();
    }

}
