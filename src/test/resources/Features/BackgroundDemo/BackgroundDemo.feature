Feature: Check home page functionality

  Background: user is logged in
    Given user is on the login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to homepage

  Scenario: check logout link is there
    # Given user is logged in
    When user clicks on welcome link
    Then logout link is displayed

  Scenario: verify quick launch toolbar is present
    # Given user is logged in
    When user clicks on dashboard link
    Then quick launch toolbar is displayed
