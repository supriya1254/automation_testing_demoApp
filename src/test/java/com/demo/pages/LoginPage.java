package com.demo.pages;

import com.demo.stepDefinitions.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
    private WebDriver driver = Hooks.driver;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Login')]")
    private WebElement loginLink;
    @FindBy(how = How.XPATH, using = "//input[@id='input-email']")
    private WebElement username;
    @FindBy(how = How.XPATH, using = "//input[@id='input-password']")
    private WebElement password;
    @FindBy(how = How.XPATH, using = "//div[@id='content']/div/div[2]/div/form/input")
    private WebElement loginBtn;

    public Boolean clickOnLoginLinkSubMenu() {
        clickOn(driver,loginLink,10);
        return  true;
    }

    public Boolean EnterLoginInfo(String uname, String pass)
    {
        sendKeys(driver,username,5,uname);
        sendKeys(driver,password,5,pass);
        return true;
    }

    public Boolean ClickOnLoginBtn() {
        clickOn(driver,loginBtn,10);
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
