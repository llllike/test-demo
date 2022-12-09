package com.mp;


import com.MP.AddMpInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AddMpInterceptor
@MapperScan("com.mp.mapper")
public class MPInterceptor8023Application {
    public static void main(String[] args) {
        SpringApplication.run(MPInterceptor8023Application.class,args);
    }
}
