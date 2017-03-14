package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Chan on 3/13/17.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
