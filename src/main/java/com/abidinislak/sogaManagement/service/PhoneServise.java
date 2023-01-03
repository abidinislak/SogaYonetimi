package com.abidinislak.sogaManagement.service;

import com.abidinislak.sogaManagement.model.Phone;
import com.abidinislak.sogaManagement.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneServise {



    @Autowired
    PhoneRepository repo;

    public Phone save(Phone phone){


        return repo.save(phone);
    }

    public void delete(Integer phoneId) {

            repo.deleteById(phoneId);

    }
}
