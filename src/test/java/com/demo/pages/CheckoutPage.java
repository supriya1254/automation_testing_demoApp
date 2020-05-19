package com.demo.pages;

import com.demo.stepDefinitions.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CheckoutPage {
    private WebDriver driver = Hooks.driver;

    @FindBy(how = How.XPATH, using = "//div[@id='cart']/button/i")
    private WebElement shoppingCartPopupBtn;
    @FindBy(how = How.XPATH, using = "//div[@id='cart']/ul/li[2]/div/p/a[2]/strong")
    private WebElement checkoutLink;
    @FindBy(how = How.XPATH, using = "//input[@id='button-payment-address']")
    private WebElement billingContinueBtn;
    @FindBy(how = How.XPATH, using = "//input[@name='agree']")
    private WebElement policy_Checkbox;
    @FindBy(how = How.XPATH, using = "//input[@id='button-payment-method']")
    private WebElement finalContinueBtn;

    public Boolean shoppingCartPopupButton() {
        clickOn(driver,shoppingCartPopupBtn,10);
        return  true;
    }

    public Boolean CheckoutLink() {
        clickOn(driver,checkoutLink,10);
        return  true;
    }

    public Boolean billContinueButton() {
        clickOn(driver,billingContinueBtn,20);
        return  true;
    }

    public Boolean policyCheckbox() {
        clickOn(driver,policy_Checkbox,20);
        return  true;
    }

    public Boolean finalContinueButton() {
        clickOn(driver,finalContinueBtn,20);
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
