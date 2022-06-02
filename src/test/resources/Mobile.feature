#Author: Gomz@your.domain.com
Feature: Mobile purchase validation

  Background: 
    Given User launches flipkart application
    And User login flipkart by using credentials

  Scenario: Mobile validation
    When User search mobiles
    And user select the mobile
    And User navigates into new window and click on add to cart
    Then user validate the cart page

  Scenario: Mobile validation one Dim list
    When User search mobiles by using one dim list
      | realme | iPhone | SAMSUNG |
    And user select the mobile
    And User navigates into new window and click on add to cart
    Then user validate the cart page

  Scenario: Mobile validation one Dim Map
    When User search mobiles by using one dim Map
      | Phone1 | iPhone  |
      | Phone2 | realme  |
      | Phone3 | SAMSUNG |
    And user select the mobile
    And User navigates into new window and click on add to cart
    Then user validate the cart page

  Scenario Outline: 
    When User search mobiles "<Phone>"
    And user select the mobile
    And User navigates into new window and click on add to cart
    Then user validate the cart page

    Examples: 
      | Phone   |
      | iPhone  |
      | realme  |
      | SAMSUNG |
