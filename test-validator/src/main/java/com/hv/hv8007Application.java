package com.hv;

import com.validator.annotion.EnableFormValidator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@EnableFormValidator
public class hv8007Application {
    public static void main(String[] args) {
        SpringApplication.run(hv8007Application.class,args);
    }
}

