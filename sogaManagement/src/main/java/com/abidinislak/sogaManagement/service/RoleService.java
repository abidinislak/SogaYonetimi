package com.abidinislak.sogaManagement.service;

import com.abidinislak.sogaManagement.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {


    @Autowired
    RoleRepository repo;

}
