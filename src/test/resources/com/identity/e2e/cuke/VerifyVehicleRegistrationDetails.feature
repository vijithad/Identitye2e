Feature: Verify List of Vehicle Registration Details from DVLA
  Scenario: Succesful Vehicle Registration Details
    When I open DVLA Vehicle View website
    And I click on StartNow Link
    And I Enter Vehicle Registration Number and proceed
    Then I verify details on Vehicle Details page
#    And I verify address and proceed
#    Then I verify shipping details and proceed
