package com.NEWS.news.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.NEWS.Exceptions.MyException;
import com.NEWS.news.services.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping(path = "/")
public class MainController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping(path = "/login")
    public String logIn() {
        return "login";
    }

    /*
     * @GetMapping(path = "/register")
     * public String register() {
     * return "reg";
     * }
     */
    @PostMapping("/register")
    public String register(@RequestParam String name, @RequestParam String email, @RequestParam String password,
            ModelMap model) {
        try {

            userService.newUser(email, name, password);
            model.put("success", "El usuario ha sido creado correctamente");
            return "index";
        } catch (MyException e) {
            model.put("error", e.getMessage());
            return "reg";
        }

    }

}
