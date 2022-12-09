package com.antiSamy.controller;

import com.antiSamy.entity.User;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/save")
    public User save(@RequestBody User user){
        return user;
    }

}
