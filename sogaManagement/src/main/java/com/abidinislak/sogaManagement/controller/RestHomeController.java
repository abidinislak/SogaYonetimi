package com.abidinislak.sogaManagement.controller;

import com.abidinislak.sogaManagement.model.CarPlate;
import com.abidinislak.sogaManagement.model.Phone;
import com.abidinislak.sogaManagement.model.User;
import com.abidinislak.sogaManagement.service.CarPlateServise;
import com.abidinislak.sogaManagement.service.PhoneServise;
import com.abidinislak.sogaManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestHomeController {

    @Autowired
    UserService userService;


    @Autowired
    PhoneServise phoneServise;
    @Autowired
    CarPlateServise carPlateServise;
    @RequestMapping(value = "/userUpdate", method = RequestMethod.POST)
    public String updateUSer( @RequestBody User user) {

        User temp = userService.save(user);
        if (temp != null && temp.getId() > 0) {

            return "asdasdas";
        } else return "404";


    }








    @PostMapping("/saveUserPhone")
    @ResponseBody
    public String jqueryPost(@Param("userid") Integer userid,@Param("phoneNumber")  String phoneNumber ) {


        Phone phone=new Phone(phoneNumber);

        phone.setUser(userService.findByid(userid));


phoneServise.save(phone);


        return "Succes saved";
    }




    @PostMapping("/saveUserPlate")
    @ResponseBody
    public String saveUserPlate(@Param("userid")Integer userid,@Param("plateNumber") String plateNumber ){
        CarPlate carPlate=new CarPlate();
        carPlate.setPlate(plateNumber);
        carPlate.setUser(userService.findByid(userid));

        carPlateServise.save(carPlate);


        return "oldu";
    }

}
