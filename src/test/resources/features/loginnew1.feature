#Author: your.email@your.domain.com
#Keywords Summary :
@loginfeature
Feature: Verify login flows
  I want to use this template for my feature file

  

  @logintest
  Scenario Outline: Title of your scenario outline
  Given Launch flipkarturl
  Given Launch CO URL
  When I Input <CompanyId>
  And I Input <UserId>
  And I Click on "Next"
  Then I should be navigate to password

    Examples: 
      | CompanyId  | UserId |
      | testid |    testuserid |