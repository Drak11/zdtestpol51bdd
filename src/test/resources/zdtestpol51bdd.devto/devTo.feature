Feature: devTo basic features
  Scenario: Open first seeng blog
    Given I go to devto main page
    When I click on first blog displayed
    Then I should be redirected to blog page