package com.demo.pages;

import com.demo.stepDefinitions.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegistrationPage {
    private WebDriver driver = Hooks.driver;

    @FindBy(how = How.XPATH, using = "//div[@id='top-links']/ul/li[2]/a")
    private WebElement myAccountMenu;
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Register')]")
    private WebElement registerLink;
    @FindBy(how = How.XPATH, using = "//input[@id='input-firstname']")
    private WebElement firstName;
    @FindBy(how = How.XPATH, using = "//input[@id='input-lastname']")
    private WebElement lastName;
    @FindBy(how = How.XPATH, using = "//input[@id='input-email']")
    private WebElement emailAdd;
    @FindBy(how = How.XPATH, using = "//input[@id='input-telephone']")
    private WebElement telephoneNo;
    @FindBy(how = How.XPATH, using = "//input[@id='input-password']")
    private WebElement password;
    @FindBy(how = How.XPATH, using = "//input[@id='input-confirm']")
    private WebElement confirm_password;
    @FindBy(how = How.XPATH, using = "//input[@name='agree']")
    private WebElement policy_checkbox;
    @FindBy(how = How.XPATH, using = "//input[@value='Continue']")
    private WebElement continueBtn;



    public Boolean clickOnMyAcc() {
        clickOn(driver,myAccountMenu,10);
        return  true;
    }

    public Boolean ClickOnRegisterLink() {
        clickOn(driver,registerLink,10);
        return  true;
    }

    public Boolean userRegInfo(String fname, String lname, String email, String telephone, String pass, String confirm_pass)
    {
        sendKeys(driver,firstName,5,fname);
        sendKeys(driver,lastName,5,lname);
        sendKeys(driver,emailAdd,20,email);
        sendKeys(driver,telephoneNo,5,telephone);
        sendKeys(driver,password,5,pass);
        sendKeys(driver,confirm_password,5,confirm_pass);
        return true;
    }

    public Boolean ClickOnPolicyCheckbox() {
        clickOn(driver,policy_checkbox,10);
        return  true;
    }

    public Boolean ClickOnContinueBtn() {
        clickOn(driver,continueBtn,10);
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
