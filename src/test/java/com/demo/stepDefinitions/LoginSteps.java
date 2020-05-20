package com.demo.stepDefinitions;

import com.demo.pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginSteps() {
        this.driver = Hooks.driver;
        loginPage = PageFactory.initElements(Hooks.driver,LoginPage.class);
    }
    @Then("^Click on Login Link$")
    public void click_on_Login_Link()  {
        assertTrue("Login Link", loginPage.clickOnLoginLinkSubMenu());

    }

    @Then("^Entered the login details$")
    public void entered_the_login_details(DataTable data)  {
        List<List<String>> userLoginInfo = data.raw();
        assertTrue("login details",loginPage.EnterLoginInfo((userLoginInfo.get(1).get(0)),(userLoginInfo.get(1).get(1))));
    }

    @Then("^Click on Login button$")
    public void click_on_Login_button()  {
        assertTrue("Login Button",loginPage.ClickOnLoginBtn());
    }

}

