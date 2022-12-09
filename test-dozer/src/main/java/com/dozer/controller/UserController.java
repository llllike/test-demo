package com.dozer.controller;

import com.dozer.DozerUtils;
import com.dozer.dto.UserDTO;
import com.dozer.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private DozerUtils dozerUtils;

    @GetMapping("/mapper")
    public UserEntity mapper(){
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(10);
        userDTO.setUserName("itcast");
        userDTO.setUserAge(20);
        UserEntity user = dozerUtils.map(userDTO, UserEntity.class);
        System.out.println(user);
        return user;
    }
}
