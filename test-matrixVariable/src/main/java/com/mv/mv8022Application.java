package com.mv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.mv.EnableMatrixVariable;



@SpringBootApplication
@EnableMatrixVariable
public class mv8022Application {
    public static void main(String[] args) {
        SpringApplication.run(mv8022Application.class,args);
    }
}
