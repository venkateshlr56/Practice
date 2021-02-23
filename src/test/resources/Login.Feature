@f12
Feature: Validate the Login functionality for Facebook application

  Scenario: Validate for Valid username and password in Facebook application
    Given User is on Facebook login page
    When User should enter the valid username and password
    And User Should click the login button
    Then User should land to Facebook homepage after providig valid username and password
