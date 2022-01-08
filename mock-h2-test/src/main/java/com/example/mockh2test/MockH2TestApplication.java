package com.example.mockh2test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
@MapperScan("com.example.mockh2test.dao")
public class MockH2TestApplication {

    public static void main(String[] args) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();

        SpringApplication.run(MockH2TestApplication.class, args);
    }

}
