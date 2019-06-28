@tag
Feature: Title of your feature
  I want to use this template for my feature file
  
   @login
  Scenario Outline: Title of your scenario outline
		Given User Enter a login Page
    Given Enter a Username "<name>"
    When Enter a Password "<value>"
    Then click the login Button
   
    Examples: 
    
      | name    | value      |
      | lalitha |password123 |