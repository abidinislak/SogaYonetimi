package com.abidinislak.sogaManagement.repository;

import com.abidinislak.sogaManagement.model.Dues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DuesRepository extends JpaRepository<Dues, Integer> {


    @Query(value = "SELECT * FROM soga.dues where user_id=:userid ", nativeQuery = true)
    List<Dues> findByUser(@Param("userid") Integer userid);

}
