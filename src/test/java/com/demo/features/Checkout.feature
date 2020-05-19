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


    Scenario: Guest Checkout
      When User on the home page
      Then search and add the product to the cart
        |product|
        |MacBook|
      When User on the home page
      Then user clicks on shopping cart popup on right side
      And user clicks on Checkout link
      #When user is on 'Checkout' page
      When user should click on 'Guest Checkout' checkbox
      And Click on Continue button
      And User should enter the 'Personal Details' for Billing
      |firstname|lastname|email|telephone|address|city|postcode|country|region|
      |Jerry    |Nick    |John.satty1@gmail.com|987654321|88, euro street|Riga|1039|Latvia|Alojas|
      And Click on  'Continue' Button for billing process
      And click on 'Flat Rate' radio button on Payment Method
      And Click on  'Continue' Button for Delivery Method
      And click on 'Cash On Delivery' radio button and policy checkbox





