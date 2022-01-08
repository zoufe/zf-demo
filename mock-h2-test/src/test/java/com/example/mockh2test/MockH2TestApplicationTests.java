package com.example.mockh2test;

import com.example.mockh2test.dao.domain.AlertLog;
import com.example.mockh2test.dao.domain.AlertLogMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;


public class MockH2TestApplicationTests extends BaseTest1{
    @Autowired
    private AlertLogMapper alertLogMapper;
    @Test
    public  void contextLoads() {
        HashMap hashMap = new HashMap();
        hashMap.get("");
        AlertLog alertLog = alertLogMapper.selectById(1);
        System.out.println(alertLog);
    }

}
