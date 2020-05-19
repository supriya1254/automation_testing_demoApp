package com.demo.stepDefinitions;

import com.demo.pages.CheckoutPage;
import com.demo.pages.GuestCheckoutPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class GuestCheckoutSteps {
    private WebDriver driver;
    private GuestCheckoutPage guestCheckoutPage;

    public GuestCheckoutSteps() {
        this.driver = Hooks.driver;
        guestCheckoutPage = PageFactory.initElements(Hooks.driver, GuestCheckoutPage.class);
    }

     @When("^user should click on 'Guest Checkout' checkbox$")
    public void user_should_click_on_Guest_Checkout_checkbox() {
         assertTrue("guest checkout radio button", guestCheckoutPage.guestRadioButton());
         assertTrue("guest checkout checkbox", guestCheckoutPage.checkoutGuestButton());
    }

    @Then("^User should enter the 'Personal Details' for Billing$")
    public void user_should_enter_the_Personal_Details_for_Billing(DataTable billData)  {
        List<List<String>> billdetails = billData.raw();
        assertTrue("billing details",guestCheckoutPage.personalDetailsForBilling(
                billdetails.get(1).get(0),
                billdetails.get(1).get(1),
                billdetails.get(1).get(2),
                billdetails.get(1).get(3),
                billdetails.get(1).get(4),
                billdetails.get(1).get(5),
                billdetails.get(1).get(6),
                billdetails.get(1).get(7),
                billdetails.get(1).get(8))
        );
    }

    @Then("^Click on  'Continue' Button for billing process$")
    public void click_on_Continue_Button_for_billing_process()  {
        assertTrue("Billing process continue",guestCheckoutPage.billingGuestButton());
    }

     @And("^click on 'Flat Rate' radio button on Payment Method$")
    public void click_on_Flat_Rate_button()  {
         assertTrue("flat rate button",guestCheckoutPage.flatRateRadioButton());
    }

    @Then("^Click on  'Continue' Button for Delivery Method$")
    public void click_on_Continue_Button_for_Delivery_Method()  {
        assertTrue("delivery method continue",guestCheckoutPage.deliveryMethodButton());

    }

    @And("^click on 'Cash On Delivery' radio button and policy checkbox$")
    public void click_on_Cash_On_Delivery_radio_button_and_policy_checkbox()  {
        assertTrue("cash on deliver radio button",guestCheckoutPage.cashOnDeliveryRadioButton());
        assertTrue("policy checkbox",guestCheckoutPage.codPolicyCheckbox());
        //assertTrue("policy checkbox",guestCheckoutPage.());
        assertTrue("policy checkbox",guestCheckoutPage.confirmOrderButton());
    }

    /*@And("^Click on  'Continue' Button for Payment Method$")
    public void click_on_Continue_Button_for_Payment_Method()  {
        assertTrue("payment method continue",guestCheckoutPage.());
    }
    @Then("^Click on  'Confirm Order' Button$")
    public void click_on_Confirm_Order_Button()  {
        assertTrue("Order confirmed button",guestCheckoutPage.confirmOrderButton());

    }*/
}
