package com.cache.controller;


import com.cache.pojo.TbUser;
import com.cache.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {
    @Autowired
    TbUserService userService;

    @GetMapping("/user/{id}")
    public TbUser getUser(@PathVariable int id){
        TbUser tbUser=userService.findUserById(id);
        System.out.println(tbUser);
        return tbUser;
    }

}
