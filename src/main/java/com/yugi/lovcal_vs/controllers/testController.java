package com.yugi.lovcal_vs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
    @RequestMapping(value = "/welcome")
    public String test() {
        return "welcome";
    }
}