package com.example.shardingsphere;

import com.example.customtest.CustomTestApplication;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest(classes = CustomTestApplication.class)
class CustomTestApplicationTests {

    @Test
    void contextLoads() {
    }


}
