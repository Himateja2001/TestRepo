Feature: Login Page

  Scenario: Login to Home page successfully
    Given User is on login page
    When user enters valid credentials
    Then user should be navigated to Home page successfully

