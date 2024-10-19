package com.burymydeadhoreses.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrivateDataController {

    @GetMapping("/public-data")
    public String privateData(Model model) {
        return "public-data";
    }
}
