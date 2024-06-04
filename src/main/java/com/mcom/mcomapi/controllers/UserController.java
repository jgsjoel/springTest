package com.mcom.mcomapi.controllers;

import com.mcom.mcomapi.entities.User;
import com.mcom.mcomapi.repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public Iterable<User> getUsers(){
        return repository.findAll();
    }

    @PostMapping
    public void registerNewUser(@RequestBody User user){
        repository.save(user);
    }


}
