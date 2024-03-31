Feature: DDT example with cloudTables

  Scenario: Adding one person
    Given User is going cloudTable homepage
    When user click on new button on homepage
    When user enters "Biga" to FirstName
    And user enters "A" to LastName
    And user enters "KungFu" to position
    And user enters "12345" to salary
    And user click Create button
    Then user should be able to find person at the search box "positive"
    And user deletes the person created
    Then user should be able to find person at the search box "negative"


  Scenario Outline:
    Given User is going cloudTable homepage
    When user click on new button on homepage
    When user enters "<firstName>" to FirstName
    And user enters "<lastName>" to LastName
    And user enters "<position>" to position
    And user enters "<salary>" to salary
    And user click Create button
    Then user should be able to find person at the search box "positive"
    And user deletes the person created
    Then user should be able to find person at the search box "negative"
    Examples:
      | firstName | lastName | position | salary |
      | Mari      | Terez    | acco     | 9999   |
      | Kate      | Firez    | kuku     | 1      |


