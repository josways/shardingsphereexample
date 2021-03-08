package com.example.customtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.customtest.mapper")
public class CustomTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomTestApplication.class, args);
    }

}
