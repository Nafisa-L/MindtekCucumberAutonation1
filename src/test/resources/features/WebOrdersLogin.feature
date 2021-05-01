@HR-7
Feature: Validating Login functionality
  @smoke
  Scenario: Validating login functionality with valid credentials
    Given User navigates to application
    When User provide username "Tester" and password "test"
    Then User validates application is on homepage

  @smoke
    Scenario: Validating login functionality with invalid credentials
      Given User navigates to application
      When User provide username "Tester" and password "tester"
      Then User validates error login message "Invalid Login or Password."
