Feature: Verify the User cannot logged in with unregistered data

  Scenario: Sign In through unregistered data
    Given Navigate to magneto homepage link
    When Click on SignIn link from the header section
    And Enter unregistered data
    And Click on Sign in button
    Then User shouldn't able to login on page