package com.trans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.trans.EnableEmail;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.concurrent.ScheduledFuture;


@SpringBootApplication
@EnableEmail
public class trans8020Application {


    public static void main(String[] args) {
        SpringApplication.run(trans8020Application.class,args);
    }
}
