package com.shiftedtech.qa.framework.steps;



import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;






public class SearchFunctionSteps extends StepBase {


    @When("^User enters searchword as \"([^\"]*)\"$")
    public void user_enters_searchword_as_yellow(String searchword) throws Throwable {

        typeText(By.xpath(".//*[@id='searchForm']/div/div[1]/span/input[2]"), searchword);
    }

    @Then("^User clicks search button")
    public void user_clicks_search_button() throws Throwable {

        click(By.cssSelector(".button.search__submit"));
    }

    @Then("^Search yellow title page should display$")
    public void search_yellow_title_page_should_display() throws Throwable {
        String title = driver.getTitle();
        Assert.assertEquals("Search: yellow", title);
    }

    @Then("^All items should contain yellow in the product title$")
    public void all_items_should_contain_yellow_in_the_product_title() throws Throwable {

        searchFunctionPage.verifyCorrectSearchword();


    }

}