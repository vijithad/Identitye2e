Feature: Verify List of Vehicle Registration Details from DVLA
  Scenario Outline: Succesful Vehicle Registration Details
    When I open DVLA Vehicle View website
    And I click on StartNow Link
    And I Enter Vehicle Registration Number and proceed
    Then I verify details on Vehicle Details page for <vehicle> <make> <color>
#    And I verify address and proceed
#    Then I verify shipping details and proceed


Examples:
    | vehicle | make | color  |
    | RF03MMK    | Honda    | Silver |
    | SG10DTF    | Nissan    | Red |
    | s055MPC    | Nissan    | Black |