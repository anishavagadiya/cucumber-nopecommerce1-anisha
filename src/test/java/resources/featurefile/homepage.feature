@regression
Feature: HomePage Test
  As user I want to login into nop commerce website

@smoke
  Scenario: User should navigate to selected manu successfully
    Given I am on homepage
    When I click on Computers Tab
    And I should navigate to computer page successfully

