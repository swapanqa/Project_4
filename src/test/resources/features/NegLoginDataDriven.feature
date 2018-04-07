Feature: Negative Login Data Driven Test

  Background:
    Given Not a validated user
    When User browse to website
    Then Homepage should display
    When User click login link
    Then Browser display Login page


  Scenario Outline: 1.User login negative testing
    When User enter user email as "<EmailAddress>"
    And User enter password as "<Password>"
    And User click login button
    Then Login error message should display
    Examples:
      |EmailAddress           |Password     |
      |steveemmet@yahoo.com   |Pickles123XX |
      |steveemmetXX@yahoo.com |Pickles123   |
      |steveemmetXX@yahoo.com |Pickles123XX |
      |steveemmet@yahoo.com   |             |
      |                       |Pickles123   |
      |                       |             |
