package com.spring.library.controllers;

import com.spring.library.models.User;
import com.spring.library.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("users")
    public List<User> findAllUsers(){
        return service.findAllUsers();
    }

    @GetMapping("user/{id}")
    public Optional<User> findById(@PathVariable("id") Long id){
        return service.findUserById(id);
    }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return service.saveUser(user);
    }
    @PutMapping("user")
    public User updateUser(@RequestBody User user) {
        return service.updateUser(user);
    }
    @DeleteMapping("user/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        try {
            service.deleteUser(id);
            return "User with ID " + id + " has been deleted!";
        }catch(Exception e)
        {
            return e.getMessage();
        }
    }
}
