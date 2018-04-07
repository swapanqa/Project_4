package com.shiftedtech.qa.framework.steps;

import com.shiftedtech.qa.framework.pages.HomePage;
import com.shiftedtech.qa.framework.pages.LoginPage;
import com.shiftedtech.qa.framework.pages.SearchFunctionPage;
import com.shiftedtech.qa.framework.pages.ShoppingCartPage;
import com.shiftedtech.qa.framework.utils.WebElementUtils;
import com.shiftedtech.qa.framework.utils.DriverFactory;
import org.openqa.selenium.WebDriver;

public class StepBase extends WebElementUtils {


       protected HomePage homePage = new HomePage();

       protected LoginPage loginPage = new LoginPage();

       protected ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

       protected SearchFunctionPage searchFunctionPage = new SearchFunctionPage();

}

