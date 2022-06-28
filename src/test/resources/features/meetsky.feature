Feature: Login Functionality

  @METSK-332
  Scenario: User can login with valid credentials.
    Given User goes to login page
    When User on Meetsky Login page
    And User enters valid username
    And User enters valid password
    And User clicks login button
    Then User should see Files_Meetsky-QA title on the opened files page

  @METSK-338
    Scenario: User can not login with invalid username
      Given User goes to login page
      When User on Meetsky Login page
      And User enters invalid username
      And User enters valid password
      And User clicks login button
      Then User should see "Wrong username or password." warning
  @METSK-340
  Scenario: User can not login with invalid password
    Given User goes to login page
    When User on Meetsky Login page
    And User enters valid username
    And User enters invalid password
    And User clicks login button
    Then User should see "Wrong username or password." warning
  @METSK-343
  Scenario: User can not login with invalid password and invalid username
    Given User goes to login page
    When User on Meetsky Login page
    And User enters invalid username
    And User enters invalid password
    And User clicks login button
    Then User should see "Wrong username or password." warning

  @METSK-344
  Scenario: User can not login with empty username
    Given User goes to login page
    When User on Meetsky Login page
    And User enters valid password
    And User clicks login button
    Then User should see "Please fill in this field" warning





