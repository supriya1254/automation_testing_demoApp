Feature: Shopping Cart

  @Smoke
  Scenario: Available products could be added to shopping cart and all prices are calculated correctly
    When User on the home page
    Then Click on 'My Account' menu item on the top
    Then Click on Login Link
    And  Entered the login details
      |username |password|
      |John.satty1@gmail.com|Test1234|
    And  Click on Login button
    When User on the home page
    Then search and add the product to the cart
    |product|
    |MacBook|
    And Item count and prices should be displayed correctly on shopping cart button
    When user is on 'Shopping Cart' page
    Then user Click on 'Checkout' button



