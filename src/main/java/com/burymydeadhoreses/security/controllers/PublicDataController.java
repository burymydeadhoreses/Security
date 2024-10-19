package com.burymydeadhoreses.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PublicDataController {

    @GetMapping("/private-data")
    public String privateData(Model model) {
        return "private-data";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }
}
