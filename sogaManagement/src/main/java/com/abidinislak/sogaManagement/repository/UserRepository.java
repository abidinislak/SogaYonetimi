package com.abidinislak.sogaManagement.repository;

import com.abidinislak.sogaManagement.model.User;
import com.abidinislak.sogaManagement.model.modelUtil.testReturn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Short> {

    User findByUserName(String username);


//    select soga.user.user_name,sum(soga.payment.amount) ,sum(soga.dues.amount)
//    FROM soga.user
//    left join soga.payment on soga.user.id=soga.payment.user_id
//    left join soga.dues on soga.user.id=soga.dues.user_id
//
//    group by soga.user.user_name


    @Query(value = "   select soga.user.user_name  as aaa,sum(soga.payment.amount) as bbb,sum(soga.dues.amount) as ccc FROM soga.user left join soga.payment on soga.user.id=soga.payment.user_id    left join soga.dues on soga.user.id=soga.dues.user_id group by soga.user.user_name", nativeQuery = true)
    List<testReturn> getUserListWithWverthing();
}

