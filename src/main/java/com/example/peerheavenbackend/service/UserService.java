package com.example.peerheavenbackend.service;

import com.example.peerheavenbackend.domain.User;

public interface UserService {
    void createUser(User user);

    User getUserByEmail(String email);
}
