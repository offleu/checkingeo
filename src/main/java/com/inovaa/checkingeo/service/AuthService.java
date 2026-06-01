package com.inovaa.checkingeo.service;

import com.inovaa.checkingeo.dto.LoginRequest;
import com.inovaa.checkingeo.dto.LoginResponse;
import com.inovaa.checkingeo.entinty.User;
import com.inovaa.checkingeo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service

public class AuthService {

    private final UserRepository userRepository;

    public AuthService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public LoginResponse login (LoginRequest request) {

        User user = userRepository
                .findByEmail(request.getEmail())
                .orElseThrow(() ->
                        new RuntimeException("Usúario não encontrado"));

        if (!user.getPassword().equals(request.getPassword())) {
            throw new RuntimeException("Senha Invalida");
        }

        return new LoginResponse(
                user.getId(),
                user.getName(),
                user.getRole().name()
        );
    }
}
