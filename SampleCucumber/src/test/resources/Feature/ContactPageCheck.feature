#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@tag
Feature: Contact page validation


  @tag1
  Scenario Outline: Verify navigation to Contact page and fields in Contact page
    Given Application is launched
    When User enters <id> and <password> and click login button
    Then User is navigated to the Home page
    When User clicks on Contact button
    Then Verify Create button and Export button is present in Contact page
    
 

      Examples: 
      | id | password | 
      | jisminthomas@gmail.com | January |
     