package com.shiftedtech.qa.framework.steps;

import com.shiftedtech.qa.framework.pages.HomePage;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class HomePageSteps extends StepBase {

    @Then("^Pretty Green Homepage should display$")
    public void pretty_Green_homepage_display() throws Throwable {
        
        homePage.verifyPageTitle();
    }

    @Then("^Homepage should display$")
    public void home_page_should_display() throws Throwable {

        homePage.verifyPageTitle();
    }
}
