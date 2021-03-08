package com.example.shardingsphere;

import com.example.subdatabase.SubDatabaseApplication;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest(classes = SubDatabaseApplication.class)
class SubDatabaseApplicationTests {

    @Test
    void contextLoads() {
    }


}
