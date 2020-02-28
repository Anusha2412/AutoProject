
@Search-feature
Feature: Search
  As a user
  I want to search products
  So that I can see all related products

  Scenario:
    Given I am on home page
    And I look for product "Hair Straighteners"
    And Brand "BaByliss"
    And Colour "Black"
    And rating review "3or only"
    When I apply filters of price review "£15-£50"
    Then I should be able to see all related products
