Feature: basic calculator functions
  Scenario: adding two numbers
    Given I have a calculator
    When I add 2 and 3
    Then I should get 5
  Scenario: subtraction two numbers
    Given I have a calculator
    When I substract 3 and 1
    Then I should get 2
  Scenario: dividing two numbers
    Given I have a calculator
    When I divide 6 by 2
    Then I should get 3
  Scenario: multiplication two numbers
    Given I have a calculator
    When I multiply 2 and 2
    Then I should get 4



