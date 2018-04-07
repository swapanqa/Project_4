package com.shiftedtech.qa.framework.pages;

import org.hamcrest.CoreMatchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class SearchFunctionPage extends PageBase {

    public SearchFunctionPage() {
        super();
        PageFactory.initElements(driver, this);
    }


    public void verifyCorrectSearchword() {


        List<WebElement> productList = driver.findElements(By.cssSelector(".category-product__title"));
        System.out.println(productList.size());

        for (int i = 0; i < productList.size(); i++) {
            String itemText = productList.get(i).getText();
            System.out.println(itemText);


            //List<String> verifyList = Arrays.asList(itemText);

            for (int j = 0; j < itemText.length(); j++) {
                assertThat(itemText, CoreMatchers.containsString("YELLOW"));

            }

        }
        System.out.println("All items contain proper searchword.");
    }
}
