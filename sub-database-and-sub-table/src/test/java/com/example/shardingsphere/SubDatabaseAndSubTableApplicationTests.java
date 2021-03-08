package com.example.shardingsphere;

import com.example.subdatabaseandsubtable.SubDatabaseAndSubTableApplication;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest(classes = SubDatabaseAndSubTableApplication.class)
class SubDatabaseAndSubTableApplicationTests {

    @Test
    void contextLoads() {
    }


}
