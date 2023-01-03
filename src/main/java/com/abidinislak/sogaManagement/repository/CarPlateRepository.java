package com.abidinislak.sogaManagement.repository;

import com.abidinislak.sogaManagement.model.CarPlate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarPlateRepository extends JpaRepository<CarPlate,Integer> {
}
