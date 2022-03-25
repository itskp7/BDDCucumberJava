Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login button
    Then user is navigated to homepage

    Examples: #Below is called a data table
      | username | password |
      | Krunal   |    12345 |
      | Ashish   |    12345 |
