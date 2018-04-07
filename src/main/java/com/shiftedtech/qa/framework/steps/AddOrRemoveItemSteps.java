package com.shiftedtech.qa.framework.steps;

import com.shiftedtech.qa.framework.pages.ShoppingCartPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.FindsByXPath;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;

public class AddOrRemoveItemSteps extends StepBase {

    @When("^User selects catagory from Shop Online menu$")
    public void user_selects_catagory_from_Shop_Online_menu() throws Throwable {
        delayFor(2000);
        WebElement element = driver.findElement(By.xpath("//span[text()='Shop online']/../.."));

        delayFor(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();

        WebElement itemToClick = driver.findElement(By.xpath("//*[@class='category-child'][@href='/category/polos/']"));
        itemToClick.click();

        delayFor(5000);
    }


    @Then("^User selects item from catagory$")
    public void user_selects_item_from_catagory() throws Throwable {
        click(By.xpath("//div[4]/div[1]/a/div/img[1]"));
    }

    @Then("^User selects size of item$")
    public void user_selects_size_of_item() throws Throwable {
        click(By.linkText("L"));
    }

    @When("^User clicks add button$")
    public void user_clicks_add_button() throws Throwable {
        click(By.cssSelector("#add-to-cart"));
    }

    @Then("^Item should be shown in shopping cart$")
    public void item_should_be_shown_in_shopping_cart() throws Throwable {
        Boolean isPresent = driver.findElements(By.cssSelector(".cart__products__image")).size() > 0;
    }

    @When("^User browse to homepage$")
    public void user_browse_to_homepage() throws Throwable {
        click(By.cssSelector(".medium-4.small-6.columns.logo>img"));
        String title = driver.getTitle();
        Assert.assertEquals("Pretty Green | Online Shop", title);

    }

    @Then("^Cart should have one item in it$")
    public void cart_should_have_one_item_in_it() throws Throwable {
        delayFor(2000);
        WebElement shoppingCart = driver.findElement(By.xpath("//li[8]/a/span"));
        String text = shoppingCart.getText();
        Assert.assertEquals("1", text);
        System.out.println("Cart has 1 item in it.");


    }

    @When("^User adds an additional item to cart$")
    public void user_adds_an_additional_item_to_cart() throws Throwable {
        shoppingCartPage.addAdditionalItemToCart();

    }

    @When("^Value of items in users cart is greater than 240 USD$")
    public void value_of_items_in_users_cart_is_greater_than_240_USD() throws Throwable {
        shoppingCartPage.verifyFreeShipping();
    }

    @Then("^Shipping should be free$")
    public void shipping_should_be_free() throws Throwable {

        WebElement freeShip = driver.findElement(By.xpath("//div[contains(text(),'Free Shipping')]"));
        String successText = freeShip.getText();
        assertThat(successText, CoreMatchers.containsString("Free Shipping"));
    }

    @When("^User clicks add to Wishlist$")
    public void user_clicks_add_to_wishlist() throws Throwable{
        click(By.cssSelector("#add-to-wishlist"));
    }

    @Then("^User Wishlist page should display$")
    public void user_wishlist_page_should_display() throws Throwable{
        String title = driver.getTitle();
        Assert.assertEquals("Wishlist | Pretty Green | Online Shop", title);
    }

    @Then("^Item should display on page$")
    public void item_should_display_on_page() throws Throwable{
        Boolean isPresent = driver.findElements(By.xpath("//div[3]/div/a/img")).size() > 0;
    }


}