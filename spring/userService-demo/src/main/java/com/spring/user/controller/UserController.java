package com.spring.user.controller;

import com.spring.user.model.User;
import com.spring.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser/id")
    public User getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }

    @GetMapping("/getAll")
    public List<User> getUser(){
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public ResponseEntity<String> createUser(@RequestBody User user){
         userService.addUser(user);
         return ResponseEntity.status(HttpStatus.CREATED).
                 body("user created successfully"+user.getFirstName());
    }

}
