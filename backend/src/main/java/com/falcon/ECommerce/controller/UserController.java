package com.falcon.ECommerce.controller;


import com.falcon.ECommerce.model.SignupUser;
import com.falcon.ECommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")

public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("signup")
    public ResponseEntity<String> addUser(@RequestBody SignupUser signupUser)
    {
        return userService.addUser(signupUser);
    }
//    public ResponseEntity<String> authentify(@RequestParam String userName , @RequestParam String password)
//    {
//
//    }



}
