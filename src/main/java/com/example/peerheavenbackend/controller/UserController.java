package com.example.peerheavenbackend.controller;

import com.example.peerheavenbackend.domain.User;
import com.example.peerheavenbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController{

    @Autowired
    UserService userService;
    
    @PostMapping(path = "/v1/user/create",consumes = "application/json")
    public void createUser(@RequestBody  User user){
        userService.createUser(user);
    }
    @GetMapping(path = "/v1/user/get/{email}",produces = "application/json")
    public ResponseEntity<Object> getUserByEmail(@PathVariable("email")String email){
        try{
            User user= userService.getUserByEmail(email);
            return new ResponseEntity<Object>(user,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @GetMapping("/health")
    public  String isOk(){
        return "OK";
    }
}
