package com.dev.userservice.web;

import com.dev.userservice.dao.UserRepository;
import com.dev.userservice.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    private User getById(@PathVariable long id) {
        return userRepository.findById(id).get();
    }

    @PostMapping
    private User saveUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }
    @DeleteMapping("/{id}")
    private void deleteUser(@PathVariable Long id){
        userRepository.deleteById(id);
    }

    /*@PutMapping("/{id}")
    private User updateUser(@RequestBody User newUser,@PathVariable long id){
       User ExUser=userRepository.findById(id).get();
       ExUser=newUser;
       return userRepository.save(ExUser);
    }
*/


}
