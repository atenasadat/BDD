@tag
Feature: Calculator

  Scenario: do the operations
    Given Two input values, 16 and "sqr"
    When I do the selected operation on the given operand
    Then I expect the result "4"


  Scenario Outline: do the operations
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>
    Examples:
      | first | second | result          |
      | 16    | sqr    | "4"             |
      | 4     | rvs    | "0.25"          |
      | 81    | sqr    | "9"             |
      | 0     | rvs    | "invalid input" |
      | 5     | rvs    | "0.2"           |