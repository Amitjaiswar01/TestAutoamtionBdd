Feature: Verify the SignIn Flow

  Scenario: Verify the SignIn flow functionality
    Given Navigate the main link: https://magento.softwaretestingboard.com/
    When Click on SignIn Link on the page
    And Click on Create an Account buttton
    And Fill all the personal details and click on submit button
    Then Verify the logged in Url
    When Click on caret and signed out
    Then Verify the User is sign Out
    When Again click on Sign In link
    And Add the register email and password
    Then Verify the user logged in successfully in session
