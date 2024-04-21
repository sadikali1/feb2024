@Tag2
Feature: Calculator file

  Background: test background
    Given I am a calculator

	@Smoke @Calc @NormalTest
  Scenario: check addition of two numbers
    Given two integer numbers 10 and 20
    When I added both numbers
    Then I verify result is 30

	@Regression @DataDriven @Calc
  Scenario Outline: check addition of two integer with multiple set of data
    Given two integer numbers <data1> and <data2>
    When I added both numbers
    Then I verify result is <result>

    Examples: test data
      | data1 | data2 | result |
      |    10 |    20 |     30 |
      |    15 |    20 |     35 |
      |    11 |    22 |     33 |
      |    30 |    40 |     60 |
      |    30 |    20 |     50 |
