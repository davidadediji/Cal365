package com.cal365;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Cal365Application {
    public static void main(String[] args) {
        SpringApplication.run(Cal365Application.class, args);
    }
}



