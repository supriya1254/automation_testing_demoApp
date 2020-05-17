package com.demo.stepDefinitions;

import com.demo.pages.RegistrationPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

import static org.junit.Assert.assertTrue;

public class RegistrationSteps {
    private WebDriver driver;
    private RegistrationPage registrationPage;

    public RegistrationSteps() {
        this.driver = Hooks.driver;
        registrationPage = PageFactory.initElements(Hooks.driver,RegistrationPage.class);
    }

    @When("^User on the home page$")
    public void user_on_the_home_page() {
        driver.get("http://www.demoshop24.com/");
    }

    @Then("^Click on 'My Account' menu item on the top$")
    public void click_on_My_Account_menu_item_on_the_top() {
        assertTrue("My Account Menu", registrationPage.clickOnMyAcc());
    }

    @Then("^Click on Register Link$")
    public void click_on_Register_Link() {
        assertTrue("Register Link", registrationPage.ClickOnRegisterLink());
    }

    @Then("^Entered the user details for registration$")
    public void entered_the_user_details_for_registration(DataTable data)  {
       List<List<String>> userDataList = data.raw();
          assertTrue("User registration details",
                registrationPage.userRegInfo(
                        (userDataList.get(1).get(0)),
                        (userDataList.get(1).get(1)),
                        (userDataList.get(1).get(2)),
                        (userDataList.get(1).get(3)),
                        (userDataList.get(1).get(4)),
                        (userDataList.get(1).get(5))
                        ));
    }

    @Then("^Checked the policy checkbox$")
    public void checked_the_policy_checkbox()  {
        assertTrue("Policy checkbox",registrationPage.ClickOnPolicyCheckbox());
    }

    @Then("^Click on Continue button$")
    public void click_on_Continue_button() {
        assertTrue("Continue Button",registrationPage.ClickOnContinueBtn());
    }
}

