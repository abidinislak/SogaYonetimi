package com.abidinislak.sogaManagement.service;

import com.abidinislak.sogaManagement.model.Dues;
import com.abidinislak.sogaManagement.repository.DuesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class DuesService {

    @Autowired
    DuesRepository repo;

    public List<Dues> findByUSerName(Integer id) {

        return repo.findByUser(id);
    }


//    public List<Dues> findByUSerName(Integer username) {
//
//
//        return repo.findByUser(username);
//    }
}
