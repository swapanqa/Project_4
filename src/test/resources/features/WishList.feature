Feature: Pretty Green Wishlist

  Scenario: 1. User wants to add item to Wishlist
    Given User browse to website
    When User selects catagory from Shop Online menu
    Then User selects item from catagory
    And User selects size of item
    When User clicks add to Wishlist
    Then User Wishlist page should display
    And Item should display on page