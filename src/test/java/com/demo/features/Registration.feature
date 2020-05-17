Feature: Users are able to create their accounts via email

  Scenario: User Registration
    When User on the home page
    Then Click on 'My Account' menu item on the top
    Then Click on Register Link
    And  Entered the user details for registration
      |firstname | lastname|email|telephone|password|confirm_password|
      |John   |Sathy     |John.satty1@gmail.com|9877654345|Test1234|Test1234|
    And  Checked the policy checkbox
    And  Click on Continue button


