package com.demo.stepDefinitions;

import com.demo.pages.RegistrationPage;
import com.demo.pages.ShoppingCartPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import static org.junit.Assert.assertTrue;

public class ShoppingCartSteps {
    private WebDriver driver;
    private ShoppingCartPage shoppingCartPage;
    @FindBy(how = How.XPATH, using = "//input[@name='quantity[4540]']")
    private WebElement productQuantity;

    public ShoppingCartSteps() {
        this.driver = Hooks.driver;
        shoppingCartPage = PageFactory.initElements(Hooks.driver, ShoppingCartPage.class);
    }

    @Then("^search and add the product to the cart$")
    public void search_and_add_the_product_to_the_cart(DataTable data) {
        List<List<String>> productName = data.raw();
        assertTrue("search product",shoppingCartPage.searchItem(productName.get(1).get(0)));
        assertTrue("click on search button", shoppingCartPage.ClickOnSearchBtn());
        assertTrue("add to cart",shoppingCartPage.ClickOnAddToCartBtn());
    }

   /* @Then("^Item count and prices should be displayed correctly on shopping cart button$")
    public void item_count_and_prices_should_be_displayed_correctly_on_shopping_cart_button_link() throws Throwable {
        shoppingCartPage.changeProductQuantity();
    }*/


    @When("^user is on 'Shopping Cart' page$")
    public void user_is_on_Shopping_Cart_page() {
        assertTrue("cart link", shoppingCartPage.ClickOnCartLink());
    }

    @Then("^user Click on 'Checkout' button$")
    public void user_Click_on_Checkout_button() {
        assertTrue("checkout button",shoppingCartPage.ClickOnCheckoutBtn());
    }

}
