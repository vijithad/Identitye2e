
  Feature: Get Vehicles

    Scenario: Get Vehicles should not read the txt files
      Given there are 4 xslx files and 6 csv files and a txt file containing 5 vehicles each
      When get vehicles is called
      Then only 50 vehicles are returned