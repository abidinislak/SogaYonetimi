package com.abidinislak.sogaManagement.repository;

import com.abidinislak.sogaManagement.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends CrudRepository<Role,Integer> {
}
