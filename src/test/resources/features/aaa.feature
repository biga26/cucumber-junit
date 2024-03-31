Feature: Everycode is here


  Scenario: Calculator
    Given user is on calculator page
    When user clicks "9" on calculator

    
    And user clicks "–" on calculator
    And user clicks "5" on calculator
    Then result should be "4" on calculator
