package com.abidinislak.sogaManagement.security;

import com.abidinislak.sogaManagement.model.User;
import com.abidinislak.sogaManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class SogaUserDetailsService implements UserDetailsService {

    @Autowired
    UserService service;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = service.findByUserName(username);

        if (user != null) {

            return new SogaUserDetails(user);

        }


        throw new UsernameNotFoundException("Böyle bir kullanıcı Bulunamadı");

    }


}
