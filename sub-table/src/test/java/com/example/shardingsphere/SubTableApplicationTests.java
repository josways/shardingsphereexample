package com.example.shardingsphere;

import com.example.subtable.SubTableApplication;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest(classes = SubTableApplication.class)
class SubTableApplicationTests {

    @Test
    void contextLoads() {
    }


}
