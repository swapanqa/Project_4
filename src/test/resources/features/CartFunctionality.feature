Feature: Pretty Green Cart Functionality

  Scenario: 1. User wants to add item to cart
    Given User browse to website
    When User selects catagory from Shop Online menu
    Then User selects item from catagory
    And User selects size of item
    When User clicks add button
    Then Item should be shown in shopping cart
    When User browse to homepage
    Then Cart should have one item in it


  Scenario: 2. Free shipping for USA orders
    Given User browse to website
    When User selects catagory from Shop Online menu
    Then User selects item from catagory
    And User selects size of item
    When User clicks add button
    Then Item should be shown in shopping cart
    When User adds an additional item to cart
    And User clicks add button
    When Value of items in users cart is greater than 240 USD
    Then Shipping should be free
