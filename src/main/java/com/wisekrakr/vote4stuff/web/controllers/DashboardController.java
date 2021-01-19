package com.wisekrakr.vote4stuff.web.controllers;

import com.wisekrakr.vote4stuff.util.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping(Constants.PAGE_DASHBOARD)
    public String dashboardView(){
        return Constants.PAGE_DASHBOARD.substring(1);
    }

}
