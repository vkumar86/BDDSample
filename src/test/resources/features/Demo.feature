#Author: your.email@your.domain.com

@tag
Feature: Login Tests
  
Background: 
Given Launch login page of Amazon

  @scenario1
  Scenario: Title of your scenario    
    When Click on Login
    Then i should be navigate to login screen
    
    
    @scenario1
  Scenario Outline: Title of your scenario
    
    And Click onm CreateUsers
    And fill the required fields "vinod" and email"vinod@test.com" and marks"70%"
    
    Examples:
    |username|firstname|email|marks|
    |vinod|vinod|vinod@test|70
    
    
     @tag1
  Scenario: Title of your scenario
    Given login to amazon using username as "vinod"
    
    
    
@sanity    
Scenario:
Given I have url 
And Navigate to resetpassword
When I put recorver email id details
And I click on recvert button
Then I should see sucessfull text
    
    
    
    