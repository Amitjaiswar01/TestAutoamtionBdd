Feature: Verify the User can craete a new account

  Scenario: Creating a New Account
    Given Navigate to link: https://magento.softwaretestingboard.com/
    When Click on Create an Account Link
    And Fill the form with correct details
    And Click on Create an Account button
    Then User data should be created