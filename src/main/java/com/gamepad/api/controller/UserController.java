package com.gamepad.api.controller;

import com.gamepad.api.model.User;
import com.gamepad.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value="/")
    public List<User> getAllUser()
    {
        return userService.getAllUsers();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value="/register")
    @ResponseStatus(code= HttpStatus.CREATED)
    public void addUser(@RequestBody User userRecord)
    {
        userService.addUser(userRecord);
    }

    @GetMapping(path="/get", produces= "application/json")
    public User getUser() {
        User user = new User();
        user.setMail("email@email.com");
        user.setPassword("azerty");
        return user;
    }

}