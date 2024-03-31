Feature: Example of Cucumber data table implementation

  Scenario: List of fruits I like
    Then user should see fruits I like in list
    | kiwi             |
    | banana           |
    | cucumber         |
    | orange           |
    | mango            |
    | grape            |


  Scenario: Get to dropdown of cydeo page
    Given User is on dropdown of pracice cydep
    Then user should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |
