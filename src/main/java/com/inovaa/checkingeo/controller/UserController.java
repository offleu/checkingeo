package com.inovaa.checkingeo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inovaa.checkingeo.entinty.User;
import com.inovaa.checkingeo.service.UserService;

@RestController
@RequestMapping ("/user")

public class UserController {

    private final UserService service;

    public UserController (UserService service) {

        this.service = service;
    }

    @PostMapping
    public User salvar (@RequestBody User user) {
        return service.salvar(user);
    }

    @GetMapping
    public List <User> listAll() {
        return service.listAll();
    }

}
