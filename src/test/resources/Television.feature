Feature: TV purchase validation

  Background: 
    Given User launches flipkart application
    And User login flipkart by using credentials

  Scenario: TV validation
    When User search TV
    And user select the TV
    And User navigates into new window and click on add to cart
    Then user validate the cart page
