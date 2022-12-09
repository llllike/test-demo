package com.mp.controller;

import com.mp.mapper.TableUserMapper;
import com.mp.pojo.TableUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {
    @Autowired
    TableUserMapper tableUserMapper;
    @RequestMapping("/test1")
    public String test1(){
        TableUser tableUser = new TableUser();
        tableUser.setId(1);
        tableUser.setName("张三1");
        tableUser.setVersion(1);
        tableUserMapper.updateById(tableUser);
        System.out.println(tableUser.toString());
        return tableUser.toString();
    }
    @RequestMapping("/test2")
    public String test2(){
        TableUser tableUser = new TableUser();
        tableUser.setId(1);
        tableUser.setName("张三2");
        tableUser.setVersion(2);
        tableUserMapper.updateById(tableUser);
        System.out.println(tableUser.toString());
        return tableUser.toString();
    }
}
