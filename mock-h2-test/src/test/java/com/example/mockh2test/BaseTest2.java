package com.example.mockh2test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class BaseTest2 {

    @Before
    public void init()  {
        MockitoAnnotations.initMocks(this);
    }


}