package com.wisekrakr.vote4stuff.web.controllers;

import com.wisekrakr.vote4stuff.util.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping(Constants.PAGE_LOGIN)
    public String loginView(){
        return Constants.PAGE_LOGIN.substring(1);
    }
}
