package com.jwt.controller;

import com.JWT.entity.Token;
import com.JWT.utils.JwtTokenUtils;
import com.JWT.entity.UserInfo;
import com.jwt.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private JwtTokenUtils jwtTokenUtils;

    @GetMapping("/token")
    public String getToken1() throws Exception{
        UserInfo<user> userUserInfo = new UserInfo<>();
        userUserInfo.setT(new user("张三","1"));
        userUserInfo.setId("1");
        Token token = jwtTokenUtils.generateUserToken(userUserInfo);
        return token.toString();
    }
    @GetMapping("/msg/{token}")
    public UserInfo getMsg1(@PathVariable String token)throws Exception{
        UserInfo userInfo = jwtTokenUtils.getUserInfo(token, "1");
        return userInfo;
    }
}
