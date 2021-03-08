package com.example.subtable;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.subtable.mapper")
public class SubTableApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubTableApplication.class, args);
    }

}
