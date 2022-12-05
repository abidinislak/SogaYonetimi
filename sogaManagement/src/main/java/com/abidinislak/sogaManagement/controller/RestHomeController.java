package com.abidinislak.sogaManagement.controller;

import com.abidinislak.sogaManagement.model.User;
import com.abidinislak.sogaManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHomeController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/userUpdate", method = RequestMethod.POST)
    public String updateUSer( @RequestBody User user) {

        User temp = userService.save(user);
        if (temp != null && temp.getId() > 0) {

            return "asdasdas";
        } else return "404";


    }
}
