Feature: Checkout


    @test
    Scenario: Guest Checkout
      When User on the home page
      Then search and add the product to the cart
        |product|
        |HTC Touch HD|
      When User on the home page
      Then user clicks on shopping cart popup on right side
      And user clicks on Checkout link
      #When user is on 'Checkout' page
      When user should click on 'Guest Checkout' checkbox
      Then User should enter the 'Personal Details' for Billing
      |firstname|lastname|email|telephone|address|city|postcode|
      |Jerry    |Nick    |John.satty1@gmail.com|987654321|88, euro street|Riga|1039|
      And Click on checkbox and 'Continue' Button for billing process
      And click on 'Flat Rate' radio button on Delivery Method
      And Click on  'Continue' Button for Delivery Method
      And click on radio button and policy checkbox and 'Confirm Order' button





