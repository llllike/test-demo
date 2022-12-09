package com.logba;


import com.logba.annotation.EnableLogback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableLogback
@SpringBootApplication
public class logback8012Application {
    public static void main(String[] args) {
        SpringApplication.run(logback8012Application.class,args);
    }
}
