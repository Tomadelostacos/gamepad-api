package com.gamepad.api.service;

import com.gamepad.api.model.User;
import com.gamepad.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers()
    {
        List<User> userRecords = new ArrayList<>();
        userRepository.findAll().forEach(userRecords::add);
        return userRecords;
    }
    public void addUser(User userRecord)
    {
        userRepository.save(userRecord);
    }
}
