Feature: Login

  Scenario Outline: signup to application with different data
    Given user is at the login page
    When user enters the username "<username>"
    When user enters the password "<password>"
    When user clik on login button
    Then user should login

    Examples: 
      | username | password |
      | Eder     | asg@123  |
      | ash      | ad@123   |
