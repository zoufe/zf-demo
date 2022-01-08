package com.example.mockh2test;

import com.ninja_squad.dbsetup.DbSetupTracker;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(SpringJUnit4ClassRunner.class)
@PowerMockIgnore({"javax.management.*"})
@ContextConfiguration("classpath:grant/application-context.xml")
public class BaseTest1 {

    protected static DbSetupTracker dbSetupTracker;

    @Before
    public void init()  {
        MockitoAnnotations.initMocks(this);
    }

    @BeforeClass
    public static void onceExecutedBeforeAll() {
        dbSetupTracker = new DbSetupTracker();
    }
}
