package com.shiftedtech.qa.framework.steps;

import com.shiftedtech.qa.framework.pages.HomePage;
import com.shiftedtech.qa.framework.utils.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class BeforeAfterHook extends StepBase {

    @Before
    public void setup() {


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
    }

    @After
    public void teardown(){

        DriverFactory.getInstance().removeDriver();
        //homePage = null;
    }

}
