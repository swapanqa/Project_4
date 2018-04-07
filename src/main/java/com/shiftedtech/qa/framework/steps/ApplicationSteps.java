package com.shiftedtech.qa.framework.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ApplicationSteps extends StepBase{

    @Given("^Not a validated user$")
    public void not_a_validated_user() throws Throwable {
        driver.manage().deleteAllCookies();
    }

    @When("^User browse to website$")
    public void user_browse_to_website() throws Throwable {
        driver.navigate().to("https://www.prettygreen.com");
    }
}
