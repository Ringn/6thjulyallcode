Feature: Login Functonality

  Scenario: Verify with credentials
    Given the user is at login page
    When user enter UN;
    And user enter PD
    And the user click on login button
    Then the user should redirect to home page
