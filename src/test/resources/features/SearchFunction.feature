Feature: Website Search Feature

  Scenario: 1. User searches for specific color item
    Given Not a validated user
    When User browse to website
    Then Homepage should display
    When User enters searchword as "yellow"
    And User clicks search button
    Then Search yellow title page should display
    And All items should contain yellow in the product title