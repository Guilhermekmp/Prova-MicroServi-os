package com.kstore.login.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginControler {

    @GetMapping
    public String test() {
        return "Calling Service Login";
    }
}
