package com.jwt;


import com.JWT.EnableJWT;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableJWT
@SpringBootApplication
public class JWT8015Application {
    public static void main(String[] args) {
        SpringApplication.run(JWT8015Application.class,args);
    }
}
