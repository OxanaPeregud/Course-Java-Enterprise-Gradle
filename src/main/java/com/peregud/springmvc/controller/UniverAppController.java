package com.peregud.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UniverAppController {

    @RequestMapping("/")
    public String viewHomePage() {
        return "select-table";
    }
}
