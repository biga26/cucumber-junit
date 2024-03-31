Feature: User should be able to login using correct credentials

  Background: user is on the login page
    Given user goes to login page2

  Scenario: Positive login scenario2
    When user enters login "Test" text
    And user enters password "Tester" text
    And And user click login button2
    Then userShould see url contains orders

  Scenario: Positive login scenario
    When user enters user "Test" and password "Tester" and login


