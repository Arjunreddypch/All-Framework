Feature: Login Feature

Scenario Outline: Valid login
  Given I navigate to the login page
  When I login with username "<Username>" and password "<Password>"
  Then I should see the dashboard