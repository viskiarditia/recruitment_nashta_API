Feature: Forgot Password

  Scenario: SG 005 - Get current weather
    Given a registered user who forgot the password
    When the user sends a POST request to recover the password
    Then the response status code should be 200 OK
    And the user should receive a password recovery email

  Scenario: SG 006 - Get forecast weather
    Given an unregistered user who forgot the password
    When the user sends a POST request to recover the password
    Then the response status code should be 404 Not Found
    And the response should contain an error message for user not found