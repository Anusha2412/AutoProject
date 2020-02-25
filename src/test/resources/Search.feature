Feature: Search
  As a user
  I want to search products
  So that I can see all related products

  Scenario:
    Given I am home page
    When I search for Hair Straighteners
    Then I should be able to see all products
