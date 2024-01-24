Feature: Sign In Recruitment Nashta Group

  Background:
    Given the Sign In API is available
    And a valid user with the following credentials:
      | email                       | password    |
      | putra.nurfajri@nashta.co.id | Nashta@2023 |

    When the user sends a POST request to login
    Then the response status code should be 200 OK
    And the response should contain a valid access token
    And the user is activated

  Scenario: SG 001 - Sign In Valid Data
    When the user sends a POST request to login
    Then the response status code should be 200 OK
    And the response should match the JSON schema

  Scenario: SG 002 - Sign In for user without username
    Given an invalid user without a username
    When the user sends a POST request to login
    Then the response status code should be 400 Bad Request
    And the response should contain an error message for missing username


  Scenario: SG 003 - Sign In for user without password
    Given an invalid user without a password
    When the user sends a POST request to login
    Then the response status code should be 400 Bad Request
    And the response should contain an error message for missing password

  Scenario: SG 004 - Sign In for user invalid data unregister
    Given an unregistered user with the following credentials:
      | username           | password           |
      | invalid_username   | invalid_password   |
    When the user sends a POST request to login
    Then the response status code should be 401 Unauthorized
    And the response should contain an error message for invalid credentials


  Scenario: SG 005 - Forgot Password
    Given a registered user who forgot the password
    When the user sends a POST request to recover the password
    Then the response status code should be 200 OK
    And the user should receive a password recovery email

  Scenario: SG 006 - Forgot Password invalid data unregister
    Given an unregistered user who forgot the password
    When the user sends a POST request to recover the password
    Then the response status code should be 404 Not Found
    And the response should contain an error message for user not found

