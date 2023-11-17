package com.dev.userservice.web;

import com.dev.userservice.dao.UserRepository;
import com.dev.userservice.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping
    private List<User> getusers(){
        return userRepository.findAll();
    }


}
