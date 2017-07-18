Feature: LoginFeature
  This login feature deals with the login funcionality application

  Scenario Outline: Login with correct username and password using Scenario outline
    Given I navigate to the login page
    And I entered <username> and <password>
    And I click login button
    Then I should see the wrong data message

    Examples:
      | username | password    |
      | execute  | automation  |
      | execute1 | automation1 |
      | execute2 | automation2 |
      | execute3 | automation3 |
      | execute4 | automation4 |