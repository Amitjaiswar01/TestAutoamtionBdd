Feature: Verify the user is able to sign in

  Scenario Outline: Verify user can login
    Given Navigate the link: https://magento.softwaretestingboard.com/
    When Click on Sign In Link
    And Fill form with correct details
    And Click on Sign In button
    Then User should be logged in