Feature: TemperatureConverter
  Scenario: Converting Fahrenheits to Celsius
    Given I have a converter
    When I convert 100.0 degree Fahrenheits to Celsius
    Then I should get 37.7778 Celsius
