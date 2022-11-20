package com.abidinislak.sogaManagement.service;

import com.abidinislak.sogaManagement.model.User;
import com.abidinislak.sogaManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repo;


    public User findByUserName(String username) {


        return repo.findByUserName(username);
    }
}
