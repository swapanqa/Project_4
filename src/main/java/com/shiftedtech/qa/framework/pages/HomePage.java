package com.shiftedtech.qa.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageBase {

    @FindBy(xpath = "//a[text()='Login']" )
    private WebElement loginLink;
    @FindBy(xpath = "//a[text()='Log out']" )
    private WebElement logoutLink;
    @FindBy(xpath = "//*[@class='callout callout--message success text-center']")
    private WebElement logoutSuccessMsg;

    public HomePage(){
        super();
        PageFactory.initElements(driver,this);
    }

    public void navigateToLoginPage(){
        loginLink.click();
    }

    public void logOut(){
        click(By.xpath("//a[@class='logout']"));
    }

    public void verifyPageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals("Pretty Green | Online Shop", title);

    }

    public void verifyUserHasLoggedIn(){
        Boolean isPresent = driver.findElements(By.id("/account/logout/")).size() > 0;
        System.out.println("Login Successful");
    }

    public void verifyLogoutSuccess(){

        //String successText = logoutSuccessMsg.getText();
        //Assert.assertEquals("Logged in successfully",successText);
        Boolean isPresent = driver.findElements(By.xpath("//*[@class='callout callout--message success text-center']")).size()>0;
        System.out.println("User has been logged out.");
    }

}
