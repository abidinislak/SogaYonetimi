package com.abidinislak.sogaManagement.repository;

import com.abidinislak.sogaManagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Short> {
}
