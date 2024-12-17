@activity2
  Feature: Login Test
    @SmokeTest
    Scenario: Testing Login
      Given User is on the Login page
      When User enters "admin" and "password"
      Then Read the page title and confirmation message
      And Close the Browser