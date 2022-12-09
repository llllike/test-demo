package com.cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;



@MapperScan("com.cache.mapper")
@SpringBootApplication
@EnableRedisCache
public class cache8019Application {
    public static void main(String[] args) {
        SpringApplication.run(cache8019Application.class,args);
    }
}
