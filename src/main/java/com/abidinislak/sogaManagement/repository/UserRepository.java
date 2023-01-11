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

    // @Query(value = " select  soga.user.user_name  as userNumber, soga.user.person_name  as username, soga.user.person_last_name as lastName, sum(soga.payment.amount) as payments, sum(soga.dues.amount) as dues, (sum(soga.payment.amount) - sum(soga.dues.amount)) as balance FROM soga.user left join soga.payment on soga.user.id=soga.payment.user_id    left join soga.dues on soga.user.id=soga.dues.user_id group by soga.user.user_name,soga.user.person_name", nativeQuery = true)





//    @Query(value = "SELECT soga.user.user_name  as userNumber,\n" +
//            "soga.user.person_name  as username,\n" +
//            "soga.user.person_last_name  as lastName, \n" +
//            "       py.payments AS payments,\n" +
//            "      du.dues as dues,\n" +
//            "      (py.payments - du.dues) as balance \n" +
//            "      \n" +
//            "FROM soga.user\n" +
//            "LEFT JOIN ( SELECT user_id AS id, SUM(soga.payment.amount) payments\n" +
//            "            FROM soga.payment\n" +
//            "            GROUP BY user_id\n" +
//            "          ) py ON soga.user.id = py.id\n" +
//            "LEFT JOIN ( SELECT user_id AS  id, SUM(soga.dues.amount) dues\n" +
//            "            FROM soga.dues\n" +
//            "            GROUP BY user_id\n" +
//            "          ) du ON soga.user.id = du.id\n" +
//            "ORDER BY soga.user.user_name", nativeQuery = true)
//    List<UserList> getUserListWithWverthing();
@Query(value = "   SELECT soga.user.user_name  as userNumber, soga.user.person_name  as username,soga.user.person_last_name  as lastName,   CASE   WHEN py.payments IS NULL THEN 0  ELSE py.payments END AS payments,CASE  WHEN du.dues  IS NULL THEN 0 ELSE du.dues END as dues,   ( (CASE   WHEN py.payments IS NULL THEN 0  ELSE py.payments END) - (CASE  WHEN du.dues  IS NULL THEN 0 ELSE du.dues END)) as balance    FROM soga.user LEFT JOIN ( SELECT user_id AS id, SUM(soga.payment.amount) payments FROM soga.payment GROUP BY user_id) py ON soga.user.id = py.id LEFT JOIN ( SELECT user_id AS id, SUM(soga.dues.amount) dues FROM soga.dues  GROUP BY user_id) du ON soga.user.id = du.id ORDER BY soga.user.user_name\n", nativeQuery = true)
    List<UserList> getUserListWithWverthing();

//    SELECT soga.user.user_name  as userNumber, soga.user.person_name  as username,soga.user.person_last_name  as lastName,CASE   WHEN py.payments IS NULL THEN 0  ELSE py.payments END AS payments,CASE  WHEN du.dues  IS NULL THEN 0 ELSE du.dues END as dues,(py.payments - du.dues) as balance FROM soga.user LEFT JOIN ( SELECT user_id AS id, SUM(soga.payment.amount) payments FROM soga.payment GROUP BY user_id) py ON soga.user.id = py.id LEFT JOIN ( SELECT user_id AS id, SUM(soga.dues.amount) dues FROM soga.dues  GROUP BY user_id) du ON soga.user.id = du.id ORDER BY soga.user.user_name



}

