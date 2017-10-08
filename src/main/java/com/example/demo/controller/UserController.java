package com.example.demo.controller;

import com.example.demo.model.ApplicationUser;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    @PostMapping("/signup")
    public String signUp(@RequestBody ApplicationUser applicationUser) {
        if (userRepository.findByUsername(applicationUser.getUsername()) == null) {
            applicationUser.setPassword(bCryptPasswordEncoder.encode(applicationUser.getPassword()));
            userRepository.save(applicationUser);
            return "alma";
        } else {
            return "körte";
        }
    }

    @GetMapping("/alma")
    @ResponseBody
    public String getRes() {
        return "kiskutyafasza jwt login működik geci!";
    }
}
