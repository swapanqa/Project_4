package com.shiftedtech.qa.framework.steps;

import com.shiftedtech.qa.framework.pages.HomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginSteps extends StepBase {

    @When("^User click login link$")
    public void user_click_login_link() throws Throwable {

        click(By.linkText("Login"));
    }

    @Then("^Browser display Login page$")
    public void browser_display_Login_page() throws Throwable {
        String title = driver.getTitle();
        Assert.assertEquals("Login | Pretty Green | Online Shop", title);
    }

    @When("^User enter user email as \"([^\"]*)\"$")
    public void user_enter_user_email_as(String email) throws Throwable {
        typeText(By.id("id_username"), email);

    }

    @When("^User enter password as \"([^\"]*)\"$")
    public void user_enter_password_as(String password) throws Throwable {
        typeText(By.id("id_password"), password);
    }

    @When("^User click login button$")
    public void user_click_login_button() throws Throwable {

        click(By.cssSelector(".expanded.button"));

    }


    @Then("^Logout button should be present$")
    public void logout_button_should_be_present() throws Throwable {

        homePage.verifyUserHasLoggedIn();
    }

    @Then("^Login error message should display$")
    public void login_error_messsage_should_display() throws Throwable {

        loginPage.verifyLoginNotSuccess();

    }

    @When("^User clicks logout button$")
    public void user_clicks_logout_button() throws Throwable {

        homePage.logOut();

    }

    @Then("^Logout success message should display$")
    public void logout_success_message_should_display() throws Throwable {

        homePage.verifyLogoutSuccess();

    }


}
