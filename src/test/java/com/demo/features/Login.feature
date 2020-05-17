Feature: Registered user is able login

  Scenario: User Login
    When User on the home page
    Then Click on 'My Account' menu item on the top
    Then Click on Login Link
    And  Entered the login details
      |username |password|
      |John.satty1@gmail.com|Test1234|
    And  Click on Login button


