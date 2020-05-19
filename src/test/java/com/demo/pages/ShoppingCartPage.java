package com.demo.pages;

import com.demo.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ShoppingCartPage {
    private WebDriver driver = Hooks.driver;

    @FindBy(how = How.XPATH, using = "//input[@name='search']")
    private WebElement searchField;
    @FindBy(how = How.XPATH, using = "//div[@id='search']/span/button")
    private WebElement searchBtn;
    @FindBy(how = How.XPATH, using = "//div[2]/button/span")
    private WebElement addToCartBtn;
    @FindBy(how = How.XPATH, using = "//span[@id='cart-total']")
    private WebElement cartTotal;
    @FindBy(how = How.XPATH, using = "//input[@name='quantity[4583]']")
    private WebElement quantity;
    @FindBy(how = How.XPATH, using = "//div[@id='checkout-cart']//tbody//td[5]")
    private WebElement productPrice;
    @FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
    private WebElement checkoutBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Shopping Cart')]")
    private WebElement cartLink;
    @FindBy(how = How.XPATH, using = "//i[@class='fa fa-refresh']")
    private WebElement refreshBtn;


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

    public Boolean VerifyCartTotal()
    {
        if(cartTotal.isDisplayed())
        {
            return  true;
        }
        return false;
    }

     public void changeProductQuantity(){
        quantity.clear();
        quantity.sendKeys("5");
        assertEquals(5,  quantity.getAttribute("value"));
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
