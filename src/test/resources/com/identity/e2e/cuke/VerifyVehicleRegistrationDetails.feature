Feature: Verify List of Vehicle Registration Details from DVLA
  Scenario Outline: Succesful Vehicle Registration Details
    When I open DVLA Vehicle View website
    And I click on StartNow Link
    And I Enter Vehicle Registration Number "<vehicle>" and proceed
    Then I verify details on Vehicle Details page for "<vehicle>" "<make>" "<color>"


Examples:
    | vehicle | make | color  |
    | RF03MMK    | HONDA    | SILVER |
    | SG10DTF    | NISSAN    | RED |
    | AK02NJF    | SKODA    | ORANGE |