package io.eduardo.FSTSales.service;

import java.util.List;

import io.eduardo.FSTSales.entity.User;
import io.eduardo.FSTSales.repository.UserRepository;

public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAllProducts() {
        return repository.findAll();
    }
}
