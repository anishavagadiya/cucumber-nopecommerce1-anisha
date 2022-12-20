@regression
Feature: Electronic Test
  As user I want to explore Computer page of nop commerce website

  @smoke
  Scenario: User should navigate to cellphone page successfully
    Given I am on homepage
    When I mouse hoover on Electronic tab
    And I mouse hoover and click on cell phone
    And Verify text "Cell phones"

  @sanity
  Scenario: User should verity that product added successfully and place order successfully
    Given I am on homepage
    When I mouse hoover on Electronic tab
    And I mouse hoover and click on cell phone
    And Verify text "Cell phones"
    And I click on list view tab
    And I click on NokiaLumia
    And Verify title "Nokia Lumia 1020"
    And Verify the price "$349.00"
    And I Change quantity
    And I click on add to cartbtn
    And Verify message "The product has been added to your shopping cart"
    And I click on crossbar
    And mouse hoover on shopping cart
    And I click on go to cart button
    And I should be able to see "Shopping cart" text
    And Verify the Quantity "2"
    And Verify the total price "$698.00"
    And I click on check box
    And I click on checkout
    And Verify Text "Welcome, Please Sign In!"
    And I click on register tab
    And Verify  "Register"
    And I enter firstname "JO"
    And I enter Lastname "Sharma"
    And I enter emailid "Jo@example.com"
    And I enter Password "abc123"
    And I enter ConfirmPossword "abc123"
    And I click on register
    And Verify the Message "Your registration completed"
    And Click on Continue register tab
    And i click on login link
    And













