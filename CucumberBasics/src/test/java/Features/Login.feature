Feature: LoginFeature
  This login feature deals with the login funcionality application

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter the user email address as Email:admin
    And I entered the following for Login
      | username | password       |
      | admin    | adminspassword |
    And I click login button
    Then I should see the userform page


  Scenario Outline: Login with correct username and password using Scenario outline
    Given I navigate to the login page
    And I entered <username> and <password>
    And I click login button
    Then I should see the userform page

    Examples:
      | username | password    |
      | execute  | automation  |
      | execute1 | automation1 |
      | execute2 | automation2 |
      | execute3 | automation3 |
      | execute4 | automation4 |