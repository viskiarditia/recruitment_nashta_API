Feature: Forgot Password

  Scenario: SG 005 - Forgot Password valid data
    Given a registered user who forgot the password
    When Send request post to recover the password
    Then the response status code should be 200 OK
    And the user should receive a password recovery email

  Scenario: SG 006 - Forgot Password invalid data unregister
    Given an unregistered user who forgot the password
    When Send request post to recover the password
    Then the response status code should be 404 Not Found