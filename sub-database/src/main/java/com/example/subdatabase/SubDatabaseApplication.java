package com.example.subdatabase;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.subdatabase.mapper")
public class SubDatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubDatabaseApplication.class, args);
    }

}
