package com.shiftedtech.qa.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ShoppingCartPage extends PageBase {



public void addAdditionalItemToCart(){
    delayFor(2000);
    WebElement element = driver.findElement(By.xpath("//span[text()='Shop online']/../.."));

    delayFor(2000);
    Actions actions = new Actions(driver);
    actions.moveToElement(element).build().perform();

    WebElement itemToClick = driver.findElement(By.xpath("//*[@class='category-child'][@href='/category/outerwear']"));
    itemToClick.click();

    delayFor(5000);

    click(By.xpath("//div[7]/a/div/img[1]"));
    delayFor(2000);
    click(By.linkText("XL"));
 }

 public void verifyFreeShipping(){
     WebElement orderTotal = driver.findElement(By.cssSelector(".cart__total__price>span"));

     String total = orderTotal.getText();

     total = total.replaceAll("[^0-9]","");

     int i = Integer.parseInt(total.trim());
     if ( i >= 240) {
         WebElement freeShip = driver.findElement(By.xpath("//div[contains(text(),'Free Shipping')]"));
         String text = freeShip.getText();
         Assert.assertEquals("This order qualifies for Free Shipping to United States of America", text);

         System.out.println("This shipment qualifies for free shipping.");
     }




 }



}
