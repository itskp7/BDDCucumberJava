Feature: check login funtionality

  @smoke
  Scenario: 
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to homepage

  Scenario: 
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to homepage
 