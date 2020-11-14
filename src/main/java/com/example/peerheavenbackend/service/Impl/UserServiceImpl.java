package com.example.peerheavenbackend.service.Impl;

import com.example.peerheavenbackend.domain.User;
import com.example.peerheavenbackend.repository.UserRepository;
import com.example.peerheavenbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUserByEmail(String email) {
        List<Optional<User>> l=userRepository.getUserByEmail(email);
        if(l.size()>1){
            throw new RuntimeException();
        }else{
            return l.get(0).get();
        }
    }
}
