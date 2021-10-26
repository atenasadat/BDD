@tag
Feature: Calculator

  Scenario: do the operations
    Given The input value is "16" and the Operation is "sqr"
    When I enter the operand and operation in calculator
    Then I expect the result "4"


  Scenario Outline: do the operations
    Given The input value is <first> and the Operation is <second>
    When I enter the operand and operation in calculator
    Then I expect the result <result>
    Examples:
      | first | second | result          |
      | 16    | sqr    | "4"             |
      | 4     | rvs    | "0.25"          |
      | 81    | sqr    | "9"             |
      | 0     | rvs    | "invalid input" |
      | -5     | rvs    | "-0.2"           |
      | -1    | sqr    | "invalid input" |