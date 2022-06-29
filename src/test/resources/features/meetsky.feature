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
    Then User should see "Please fill in this field" message

  @METSK-352
  Scenario: User can not login with empty password
    Given User goes to login page
    When User on Meetsky Login page
    And User enters valid username
    And User clicks login button
    Then User should see "Please fill in this field" message in password box

  @METSK-355
  Scenario: User can not login with empty username and empty password
    Given User goes to login page
    When User on Meetsky Login page
    And User clicks login button
    Then User should see "Please fill in this field" message

  @METSK-356
  Scenario: User should see the password in a form of dots by default
    Given User goes to login page
    When User on Meetsky Login page
    And User enters valid password
    Then User should see the password in a form of dots

  @METSK-358
  Scenario: User should see the password explicitly if needed
    Given User goes to login page
    When User on Meetsky Login page
    And User enters valid password
    And User clicks the eye icon to see the password
    Then User should see the password explicitly

  @METSK-360
    Scenario: User can see the "Forgot password?" link on the login page
    and can see the "Reset Password" button on the next page after clicking on forget password link
      Given User goes to login page
      When User on Meetsky Login page
      And User can see the Forgot password? link on the login page
      And User clicks the Forgot Password? link
      Then User can see the "Reset Password" button on the next page after clicking on forget password link

  @METSK-363
  Scenario: User can see valid placeholders on Username and Password fields
    Given User goes to login page
    When User on Meetsky Login page
    Then User can see valid placeholders on Username and Password fields as expected










