package com.wisekrakr.vote4stuff.web.controllers;

import com.wisekrakr.vote4stuff.util.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homeView(){
        return Constants.PAGE_HOME.substring(1);
    }
}
