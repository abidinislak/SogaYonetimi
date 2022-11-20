package com.abidinislak.sogaManagement.repository;

import com.abidinislak.sogaManagement.model.Dues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DuesRepository extends JpaRepository<Dues,Integer> {
}
