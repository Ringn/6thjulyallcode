Feature: login functionality using background keyword

Background:
Given user is at login page
When user enter username
And user enter password
And user clicks on login btn

Scenario: verify title
Then get title & verify

Scenario: verify profile
When user click on profile tab
Then verify profile name

Scenario: logout from app
When user click on profile tab
Then user click on logout btn
