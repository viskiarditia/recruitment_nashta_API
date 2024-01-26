Feature: Job Order Request
  Background: JOR - Add Data Job Order Request
    Given Valid Data JSON Job Order Request
    When Send request post Job Order Request
    Then the response status code should be 201 Created
    
  Scenario: JOR 002 - Update Job Order Request
    When Send request method to POST path to Param Company Organization
    Then the response status code should be 200 OK
    And Validate json schema response Param Company Organization

  Scenario: JOR 003 - Delete Job Order Request
    When Send request method to DELETE path to Request Page
    Then the response status code should be 204 No Content
    And Validate json schema response Request Page

  Scenario: JOR 004 - Job Order Request Approval
    When Send request method to GET path to Job Order Request Approval
    Then the response status code should be 200 OK
    And Validate json schema response Job Order Request Approval

  Scenario: JOR 005 - Job Order Request Rejected
    When Send request method to GET path to Job Order Request Rejected
    Then the response status code should be 200 OK
    And Validate json schema response Job Order Request Rejected

  Scenario: JOR 006 - Job Order Request Revised
    When Send request method to GET path to Job Order Request Revised
    Then the response status code should be 200 OK
    And Validate json schema response Job Order Request Revised

  Scenario: JOR 007 - Job Order Request In Progress
    When Send request method to GET path to Job Order Request In Progress
    Then the response status code should be 200 OK
    And Validate json schema response Job Order Request In Progress

  Scenario: JOR 008 - Job Order Request In History Approval
    When Send request method to GET path to Job Order Request In History Approval
    Then the response status code should be 200 OK
    And Validate json schema response Job Order Request In History Approval

  Scenario: JOR 009 - Job Order Request In History Rejected
    When Send request method to GET path to Job Order Request In History Rejected
    Then the response status code should be 200 OK
    And Validate json schema response Job Order Request In History Rejected

  Scenario: JOR 010 - Job Order Request In History Revised
    When Send request method to GET path to Job Order Request In History Revised
    Then the response status code should be 200 OK
    And Validate json schema response Job Order Request In History Revised

  Scenario: JOR 011 - Cancel Job Order Request
    When Send request method to POST path to Cancel Job Order Request
    Then the response status code should be 200 OK
    And Validate json schema response Cancel Job Order Request


  Scenario: JOR 012 - Get One Job Order Request
    When Send request method to GET path to Get One Job Order Request
    Then the response status code should be 200 OK
    And Validate json schema response Get One Job Order Request

  Scenario: JOR 013 - List Job Posting
    When Send request method to GET path to List Job Posting
    Then the response status code should be 200 OK
    And Validate json schema response  List Job Posting

  Scenario: JOR 014 - List Request Approved
    When Send request method to GET path to List Request Approved
    Then the response status code should be 200 OK
    And Validate json schema response List Request Approved

  Scenario: JOR 015 - List Request Rejected
    When Send request method to GET path to List Request Rejected
    Then the response status code should be 200 OK
    And Validate json schema response List Request Rejected

  Scenario: JOR 016 - List Request Revised
    When Send request method to GET path to List Request Revised
    Then the response status code should be 200 OK
    And Validate json schema response List Request Revised

  Scenario: JOR 017 - List Request InProgress
    When Send request method to GET path to List Request InProgress
    Then the response status code should be 200 OK
    And Validate json schema response List Request InProgress

  Scenario: JOR 018 - List Request Draft
    When Send request method to GET path to List Request Draft
    Then the response status code should be 200 OK
    And Validate json schema response List Request Draft



