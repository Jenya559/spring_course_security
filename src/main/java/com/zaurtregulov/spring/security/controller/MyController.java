package com.zaurtregulov.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MyController {

    @GetMapping("/")
    public String getInfoForAllEmps(){
        return "view-for-all-employees";
    }

    @GetMapping("/hr_info")
    public String getInfoOnlyForHr(){
        return "view-for-hr";
    }

    @GetMapping("/manager_info")
    public String getInfoOnlyForManagers(){
        return "view-for-managers";
    }
}
