package com.inovaa.checkingeo.controller;

import com.inovaa.checkingeo.dto.LoginRequest;
import com.inovaa.checkingeo.dto.LoginResponse;
import com.inovaa.checkingeo.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/auth")

public class AuthController {

    private final AuthService service;

    public AuthController (AuthService service) {
        this.service = service;
    }

    @PostMapping ("/login")
            public LoginResponse login (
            @RequestBody LoginRequest request) {


        return service.login(request);
    }
}
