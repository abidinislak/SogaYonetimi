package com.abidinislak.sogaManagement.repository;

import com.abidinislak.sogaManagement.model.User;
import com.abidinislak.sogaManagement.model.modelUtil.UserList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserName(String username);

    @Query(value = "   select soga.user.user_name  as userNumber,soga.user.person_name  as username,sum(soga.payment.amount) as payments,sum(soga.dues.amount) as dues FROM soga.user left join soga.payment on soga.user.id=soga.payment.user_id    left join soga.dues on soga.user.id=soga.dues.user_id \n" +
            "   group by soga.user.user_name,soga.user.person_name", nativeQuery = true)
    List<UserList> getUserListWithWverthing();
}

