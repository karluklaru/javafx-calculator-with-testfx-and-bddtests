Feature: calculations

  Scenario: Add
    Given Application is started
    When I click the button with value "one"
    And I click the button with value "add"
    And I click the button with value "six"
    And I click the button with value "equals"
    Then The label show answer "7.0"

  Scenario: Subtract
    Given Application is started
    When I click the button with value "five"
    And I click the button with value "subtract"
    And I click the button with value "three"
    And I click the button with value "equals"
    Then The label show answer "2.0"

  Scenario: Multiply
    Given Application is started
    When I click the button with value "two"
    And I click the button with value "multiply"
    And I click the button with value "four"
    And I click the button with value "equals"
    Then The label show answer "8.0"

  Scenario: Divide
    Given Application is started
    When I click the button with value "nine"
    And I click the button with value "divide"
    And I click the button with value "three"
    And I click the button with value "equals"
    Then The label show answer "3.0"

  Scenario: Divide by 0
    Given Application is started
    When I click the button with value "seven"
    And I click the button with value "divide"
    And I click the button with value "zero"
    And I click the button with value "equals"
    Then The label show error "Нельзя делить на ноль"