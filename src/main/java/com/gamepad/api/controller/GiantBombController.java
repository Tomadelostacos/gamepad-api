package com.gamepad.api.controller;

import com.gamepad.api.model.User;
import com.gamepad.api.service.RestService;
import com.gamepad.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/giant")
public class GiantBombController {

    @Autowired
    private RestService giantService;

    String baseUrl = "https://www.giantbomb.com/api/";

    @GetMapping(value="/")
    public List<User> getAllGames()
    {
        //return giantService.getAllUsers();
        return null;
    }
}
