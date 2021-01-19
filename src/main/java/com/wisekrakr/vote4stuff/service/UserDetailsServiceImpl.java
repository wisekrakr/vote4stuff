package com.wisekrakr.vote4stuff.service;

import com.wisekrakr.vote4stuff.repositories.UserRepository;
import com.wisekrakr.vote4stuff.web.security.CustomSecurityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) {

        try {
            return new CustomSecurityUser(userRepository.findByUsername(s));
        }catch (Throwable t){
            throw new IllegalArgumentException("Could not load invalid user",t);
        }
    }
}
