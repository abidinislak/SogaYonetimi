package com.abidinislak.sogaManagement.service;

import com.abidinislak.sogaManagement.model.CarPlate;
import com.abidinislak.sogaManagement.repository.CarPlateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarPlateServise {



    @Autowired
    CarPlateRepository repo;


    public void save(CarPlate carPlate) {

        repo.save(carPlate);


    }

    public void deleteById(Integer carPlateId) {

        repo.deleteById(carPlateId);


    }
}
