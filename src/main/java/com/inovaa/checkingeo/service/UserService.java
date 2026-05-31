package com.inovaa.checkingeo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inovaa.checkingeo.entinty.User;
import com.inovaa.checkingeo.repository.UserRepository;

@Service

public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User salvar (User user) {
        return repository.save(user);
    }

    public List<User> listAll () {
        return repository.findAll();
    }

}
