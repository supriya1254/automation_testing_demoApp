package com.demo.pages;

import com.demo.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class GuestCheckoutPage {
    private WebDriver driver = Hooks.driver;

    @FindBy(how = How.XPATH, using = "(//input[@name='account'])[2]")
    private WebElement radioGuestBtn;
    @FindBy(how = How.XPATH, using = "//input[@id='button-account']")
    private WebElement checkoutGuestBtn;
    @FindBy(how = How.XPATH, using = "//input[@id='input-payment-firstname']")
    private WebElement firstname;
    @FindBy(how = How.XPATH, using = "//input[@id='input-payment-lastname']")
    private WebElement lastname;
    @FindBy(how = How.XPATH, using = "//fieldset[@id='account']/div[4]/input")
    private WebElement email;
    @FindBy(how = How.XPATH, using = "//input[@id='input-payment-telephone']")
    private WebElement telephone;
    @FindBy(how = How.XPATH, using = "//input[@id='input-payment-address-1']")
    private WebElement address;
    @FindBy(how = How.CSS, using = "#input-payment-city")
    private WebElement city;
    @FindBy(how = How.CSS, using = "#input-payment-postcode")
    private WebElement postCode;
    @FindBy(how = How.XPATH, using = "//select[@id='input-payment-country']")
    private WebElement country;
    @FindBy(how = How.XPATH, using = "//select[@id='input-payment-zone']")
    private WebElement region;
    @FindBy(how = How.XPATH, using = "//input[@name='shipping_address']")
    private WebElement billingCheckbox;
    @FindBy(how = How.CSS, using = "#button-guest")
    private WebElement billingGuestBtn;
    @FindBy(how = How.CSS, using = "#button-shipping-method")
    private WebElement flatRateRadioBtn;
    @FindBy(how = How.CSS, using = ".pull-right > input:nth-child(2)")
    private WebElement deliveryMethodBtn;
    @FindBy(how = How.CSS, using = "#button-payment-method")
    private WebElement cashOnDeliveryContinueRadioBtn;
    @FindBy(how = How.CSS, using = "#button-confirm")
    private WebElement cashOnDeliveryPolicyCheckbox;
    @FindBy(how = How.CSS, using = ".btn-primary")
    private WebElement confirmOrderBtn;

    public Boolean guestRadioButton() {
        clickOn(driver,radioGuestBtn,10);
        return  true;
    }

    public Boolean checkoutGuestButton() {
        clickOn(driver,checkoutGuestBtn,10);
        return  true;
    }

    public Boolean personalDetailsForBilling(String fn,String ln, String em,
                                             String tno,String add,String cty,
                                             String code) {
        sendKeys(driver,firstname,10,fn);
        sendKeys(driver,lastname,10,ln);
        sendKeys(driver,email,10,em);
        sendKeys(driver,telephone,10,tno);
        sendKeys(driver,address,10,add);
        sendKeys(driver,city,10,cty);
        sendKeys(driver,postCode,10,code);
        return  true;
    }

    public Boolean selectCountryAndRegion() {
        Select selectCountry = new Select(country);
        selectCountry.selectByVisibleText("United Kingdom");
        Select selectRegion = new Select(region);
        selectRegion.selectByVisibleText("Caerphilly");
        return  true;
    }


    public Boolean billingChkbox() {
        clickOn(driver,billingCheckbox,20);
        return  true;
    }

    public Boolean billingGuestButton() {
        clickOn(driver,billingGuestBtn,20);
        return  true;
    }

    public Boolean flatRateRadioButton() {
        clickOn(driver,flatRateRadioBtn,20);
        return  true;
    }
    public Boolean deliveryMethodButton() {
        clickOn(driver,deliveryMethodBtn,20);
        return  true;
    }
    public Boolean cashOnDeliveryRadioButton() {
        clickOn(driver,cashOnDeliveryContinueRadioBtn,20);
        return  true;
    }
    public Boolean codPolicyCheckbox() {
        clickOn(driver,cashOnDeliveryPolicyCheckbox,20);
        return  true;
    }
    public Boolean confirmOrderButton() {
        clickOn(driver,confirmOrderBtn,20);
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
