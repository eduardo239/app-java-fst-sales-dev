package io.eduardo.proj_10.service;

import java.util.List;

import io.eduardo.proj_10.entity.User;
import io.eduardo.proj_10.repository.UserRepository;

public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAllProducts() {
        return repository.findAll();
    }
}
