Feature: Calculator
  As a user
  I want to use a calculator
  So that I can calculate with numbers

  Scenario: Add a number
    Given I have a calculator with value 0
    When I add 3
    Then The value of the calculator is now 3

  Scenario: Add a number
    Given I have a calculator with value 5
    When I add 3
    Then The value of the calculator is now 8

  Scenario: Subtract a number
    Given I have a calculator with value 5
    When I subtract 3
    Then The value of the calculator is now 2

  Scenario: Multiply a number
    Given I have a calculator with value 5
    When I multiply 2
    Then The value of the calculator is now 10

  Scenario: Multiply and Add a number
    Given I have a calculator with value 5
    When I multiply 2
    And I add 2
    Then The value of the calculator is now 12

  Scenario Outline: Multiply numbers
    Given I have a calculator with value <values>
    When I multiply 2
    Then The value of the calculator is now <results>

    Examples: 
      | values | results |
      |      5 |      10 |
      |     10 |      20 |
