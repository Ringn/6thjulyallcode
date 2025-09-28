Feature: Verify the Login page

  Scenario: verify the login with email and password
    Given user is on login page
    When user enter email and password
    Then verify the successful login

  Scenario: Validate title
    Given user is at the login screen
    Then page title should get display
