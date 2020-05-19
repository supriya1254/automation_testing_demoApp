Feature: Checkout

  Scenario: Checkout functionality should allow user to buy desired Products
    When User on the home page
    Then Click on 'My Account' menu item on the top
    Then Click on Login Link
    And  Entered the login details
      |username |password|
      |John.satty1@gmail.com|Test1234|
    And  Click on Login button
    When User on the home page
    Then user clicks on shopping cart popup on right side
    And user clicks on Checkout link
    And Click on 'Continue' Button
    And user will click on policy checkbox
    And Clicks on 'Continue' button


