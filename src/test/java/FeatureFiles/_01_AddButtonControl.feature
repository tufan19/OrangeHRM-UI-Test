Feature: Admin/User Management Page

  Background:
    Given Navigate to Website
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Admin Page

  @SmokeTest  @Regression
  Scenario: Add button functionality
    Then Add button should be displayed
