package com.NEWS.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("login")
    public String logIn() {
        return "login";
    }

    @GetMapping("register")
    public String register() {
        return "signUp";
    }

}
