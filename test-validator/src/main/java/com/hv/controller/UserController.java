package com.hv.controller;

import com.hv.entity.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;


@RestController
@RequestMapping("/user")
@Validated //开启校验功能
public class UserController {

    //简单数据类型校验
    @GetMapping("/delete")
    public String delete(@NotBlank(message = "id不能为空") String id){
        return "id="+id;
    }

    //对象属性校验
    @PostMapping("/save")
    public User save(@Validated @RequestBody User user){
        return user;
    }
}
