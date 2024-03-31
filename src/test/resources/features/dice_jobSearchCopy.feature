Feature: DiceJob


  Scenario: User enters dice job urlCopy
    Given user enters dice job url
    When user enters word
    When push search button
    Then user gets total job number
