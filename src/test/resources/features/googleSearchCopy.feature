Feature: Google search functionality
  Agile story: As a user, when I am on the Google search page
  I should be able to search whatever I want and see relevant information

  Scenario: Search page title verification
    Given user goes to Google page
    Then user should see Google Title

  Scenario: Search functionality result title verification
    Given user goes to Google page
    When user types "como estas" and click enter


  Scenario Outline: Search functionality in Data Driven Testing Format
    Given user goes to Google page
    When user type "capital of <country>" and clicks enter
    Examples:
    |country      | capital      |
    |Turkey       | Ankara       |



