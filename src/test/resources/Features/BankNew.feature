Feature: Feature to open a new account

 Scenario: To open a new account 
    Given The bank website should open
    And Login
    And click on add employee
    And enter all the mandatory details
    Then click on register