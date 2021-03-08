package com.example.subdatabaseandsubtable;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.subdatabaseandsubtable.mapper")
public class SubDatabaseAndSubTableApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubDatabaseAndSubTableApplication.class, args);
    }

}
