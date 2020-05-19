package com.demo.stepDefinitions;

import com.demo.pages.CheckoutPage;
import com.demo.pages.ShoppingCartPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class CheckoutSteps {
    private WebDriver driver;
    private CheckoutPage checkoutPage;

    public CheckoutSteps() {
        this.driver = Hooks.driver;
        checkoutPage = PageFactory.initElements(Hooks.driver, CheckoutPage.class);
    }

    @Then("^user clicks on shopping cart popup on right side$")
    public void user_clicks_on_shopping_cart_popup_on_right_side() {
        assertTrue("shopping cart popup", checkoutPage.shoppingCartPopupButton());
    }

    @Then("^user clicks on Checkout link$")
    public void user_clicks_on_Checkout_link() {
        assertTrue("checkout link", checkoutPage.CheckoutLink());
    }
/*
    @When("^user is on 'Checkout' page$")
    public void user_is_on_Checkout_page() {
        assertTrue("checkout link", checkoutPage.CheckoutLink());
    }

    @Then("^user will choose existing address$")
    public void user_will_choose_existing_address() {

    }*/

    @Then("^Click on 'Continue' Button$")
    public void click_on_Continue_Button() {
        assertTrue("Continue button inside the billing section", checkoutPage.billContinueButton());
    }

    @Then("^user will click on policy checkbox$")
    public void user_will_click_on_policy_checkbox() {
        assertTrue("policy checkbox", checkoutPage.policyCheckbox());
    }

    @Then("^Clicks on 'Continue' button$")
    public void clicks_on_Continue_button() {
        assertTrue("final submit", checkoutPage.finalContinueButton());
    }
}
