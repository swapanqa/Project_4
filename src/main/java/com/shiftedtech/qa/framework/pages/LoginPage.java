package com.shiftedtech.qa.framework.pages;

import org.hamcrest.CoreMatchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginPage extends PageBase {

    @FindBy(how = How.ID, using="id_username")
    private WebElement emailTextBox;
    @FindBy(id="id_password")
    private WebElement passwordTextbox;
    @FindBy(css = ".expanded.button")
    private WebElement loginButton;
    @FindBy(xpath = "//*[@class='fi-alert']")
    private WebElement alertMsg;

    public LoginPage() {
        super();
        PageFactory.initElements(driver,this);
    }

    private WebElement getAlertMsg(){
        WebElement alertMsg;

        alertMsg = waitForElementDisplayed(By.xpath("//*[@class='fi-alert']"),2);
        return  alertMsg;
    }


    public void login(String email, String password){
        typeText(emailTextBox,email);
        typeText(passwordTextbox,password);
        click(loginButton);
    }

    public void verifyLoginNotSuccess(){
        Boolean isPresent = driver.findElements(By.xpath("//*[@class='fi-alert']")).size()>0;

        System.out.println("Unsuccessful login attempt");
    }
}

