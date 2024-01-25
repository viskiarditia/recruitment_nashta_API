@Login
Feature: Sign In Recruitment Nashta Group
  Background:
    Given Login with valid data json
    When Send request post Login
    Then the response status code should be 201 Created
#    And Validate json schema response login

  Scenario: SG 001 - Sign In Valid Data
    And the response should match the JSON schema

  Scenario: SG 002 - Sign In for user without email
    Given an invalid user without a email
    When Send request post Login
    Then the response status code should be 400 Bad Request

  Scenario: SG 003 - Sign In for user without password
    Given an invalid user without a password
    When Send request post Login
    Then the response status code should be 400 Bad Request

  Scenario: SG 004 - Sign In for user invalid data unregister
    Given an invalid unregistered user
    When Send request post Login
    Then the response status code should be 404 Not Found

