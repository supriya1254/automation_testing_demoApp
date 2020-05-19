package com.demo.pages;

import com.demo.stepDefinitions.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ShoppingCartPage {
    private WebDriver driver = Hooks.driver;

    @FindBy(how = How.XPATH, using = "//input[@name='search']")
    private WebElement searchField;
    @FindBy(how = How.XPATH, using = "//div[@id='search']/span/button")
    private WebElement searchBtn;
    @FindBy(how = How.XPATH, using = "//div[2]/button/span")
    private WebElement addToCartBtn;
    @FindBy(how = How.XPATH, using = "//input[@name='quantity[4540]']")
    private WebElement productQuantity;
    @FindBy(how = How.XPATH, using = "//div[@id='checkout-cart']//tbody//td[5]")
    private WebElement productPrice;
    @FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
    private WebElement checkoutBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Shopping Cart')]")
    private WebElement cartLink;

    public Boolean searchItem(String productName) {
        sendKeys(driver,searchField,5,productName);
        return  true;
    }

    public Boolean ClickOnSearchBtn() {
        clickOn(driver,searchBtn,10);
        return  true;
    }

    public Boolean ClickOnAddToCartBtn() {
        clickOn(driver,addToCartBtn,10);
        return  true;
    }

    public Boolean ClickOnCheckoutBtn() {
        clickOn(driver,checkoutBtn,20);
        return  true;
    }

    public Boolean ClickOnCartLink() {
        clickOn(driver,cartLink,20);
        return  true;
    }

    //Explicit wait
    public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value)
    {
        new WebDriverWait(driver,timeout).
                until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(value);
    }


    public static void clickOn(WebDriver driver, WebElement element, int timeout)
    {
        new WebDriverWait(driver,timeout).
                until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
}
