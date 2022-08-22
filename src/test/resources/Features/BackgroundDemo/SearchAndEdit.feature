
Feature: Searching for an employee and editing personal information

  Scenario Outline: Search and edit Employee
    Given user should enter <username> and <password>
    And enter employee id to search
    Then click on edit button
    And change some information and save
    

    Examples: 
      | username  | password |
      | Admin |     admin123 |

