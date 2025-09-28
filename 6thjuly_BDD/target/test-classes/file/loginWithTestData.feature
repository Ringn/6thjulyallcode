
Feature: Login Functonality

Scenario: Verify with credentials
Given user is present at login page
When user enter UN as "abcd"
And user enter PWD as "xyz"
And user enter pin 1234
Then user profile picture should display

