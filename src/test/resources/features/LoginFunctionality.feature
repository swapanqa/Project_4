Feature: Pretty Green Login Functionality

  Background:
Given Not a validated user
When User browse to website
Then Homepage should display
When User click login link
Then Browser display Login page



Scenario: 1. Valid user with valid password
When User enter user email as "steveemmet@yahoo.com"
And User enter password as "Pickles123"
And User click login button
Then Homepage should display
And Logout button should be present


Scenario: 2. Valid user with invalid password
When User enter user email as "steveemmet@yahoo.com"
And User enter password as "Pickles123XX"
And User click login button
Then Login error message should display


Scenario: 3. Valid user logout
When User enter user email as "steveemmet@yahoo.com"
And User enter password as "Pickles123"
And User click login button
Then Homepage should display
And Logout button should be present
When User clicks logout button
Then Logout success message should display


