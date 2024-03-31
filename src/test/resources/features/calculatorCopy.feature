Feature: Calculator Tests



  Scenario: Test Adding
    Given testThis
    When push "5"
    And push "+"
    And push "6"
    And push "+"
    And push "5"
    Then result is "16"


  Scenario: Test Subtracting
    Given testThis
    When push "9"
    And push "–"
    And push "3"
    Then result is "6"



  Scenario Outline: Testing whole functionality
    Given testThis
    When push "<button1>"
    And push "<operator>"
    And push "<button2>"
    Then result is "<result>"
    Examples:
    | button1 | operator | button2 | result |
    | 5       | +        | 6       | 11     |
    | 8       | ×        | 8       | 64     |
    










