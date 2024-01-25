Feature: Job Order Request
  Scenario Outline: JOR <ID> - <Description>
    Given the Sign In API is available
    And a valid user with the following credentials:
      | email                       | password    |
      | putra.nurfajri@nashta.co.id | Nashta@2023 |

    When the user sends a POST request to login
    Then the response status code should be 200 OK
    And the response should contain a valid access token
    And the user is activated
    And Set method to <Method>
    When Set path to <Path>
    Examples:
      | ID  | Description                           | Method | Path                                                      |
      | 001 | Update Job Order Request              | GET    | Param Company Organization "link address/curl"            |
      | 002 | Add Job Order Request                 | POST   | HR Job position "link address/curl"                       |
      | 003 | Delete Job Order Request              | DELETE | Request Page "link address/curl"                          |
      | 004 | Job Order Request Approval            | GET    | Job Order Request Approval "link address/curl"            |
      | 005 | Job Order Request Rejected            | GET    | Job Order Request Rejected "link address/curl"            |
      | 006 | Job Order Request Revised             | GET    | Job Order Request Revised "link address/curl"             |
      | 007 | Job Order Request In Progress         | GET    | Job Order Request In Progress "link address/curl"         |
      | 008 | Job Order Request In History Approval | GET    | Job Order Request In History Approval "link address/curl" |
      | 009 | Job Order Request In History Rejected | GET    | Job Order Request In History Rejected "link address/curl" |
      | 010 | Job Order Request In History Revised  | GET    | Job Order Request In History Revised "link address/curl"  |
      | 011 | Cancel Job Order Request              | POST   | Cancel Job Order Request "link address/curl"              |
      | 012 | Get One Job Order Request             | GET    | Get One Job Order Request "link address/curl"             |
      | 013 | List Job Posting                      | GET    | List Job Posting "link address/curl"                      |
      | 014 | List Request Approved                 | GET    | List Request Approved "link address/curl"                 |
      | 015 | List Request Rejected                 | GET    | List Request Rejected "link address/curl"                 |
      | 016 | List Request Revised                  | GET    | List Request Revised "link address/curl"                  |
      | 017 | List Request InProgress               | GET    | List Request InProgress "link address/curl"               |
      | 018 | List Request Draft                    | GET    | List Request Draft "link address/curl"                    |

#  Scenario: JOR 001 - Update Job Order Request
#    And Set method to GET
#    When Set path to Param Company Organization"link address/curl"
#
#  Scenario: JOR 002 - Add Job Order Request
#    And Set method to POST
#    When Set path to HR Job position "link address/curl"
#
#  Scenario: JOR 003 - Delete Job Order Request
#    And Set method to DELETE
#    When Set path to Request Page "link address/curl"
#
#  Scenario: JOR 004 - Job Order Request Approval
#    And Set method to GET
#    When Set path to Job Order Request Approval "link address/curl"
#
#  Scenario: JOR 005 - Job Order Request Rejected
#    And Set method to GET
#    When Set path to Job Order Request Rejected "link address/curl"
#
#  Scenario: JOR 006 - Job Order Request Revised
#    And Set method to GET
#    When Set path to Job Order Request Revised "link address/curl"
#
#  Scenario: JOR 007 - Job Order Request In Progress
#    And Set method to GET
#    When Set path to Job Order Request In Progress "link address/curl"
#
#  Scenario: JOR 008 - Job Order Request In History Approval
#    And Set method to GET
#    When Set path to Job Order Request In History Approval "link address/curl"
#
#  Scenario: JOR 009 - Job Order Request In History Rejected
#    And Set method to GET
#    When Set path to Job Order Request In History Rejected "link address/curl"
#
#  Scenario: JOR 010 - Job Order Request In History Revised
#    And Set method to GET
#    When Set path to Job Order Request In History Revised "link address/curl"
#
#  Scenario: JOR 011 - Cancel Job Order Request
#    And Set method to POST
#    When Set path to Cancel Job Order Request "link address/curl"
#
#  Scenario: JOR 012 - Get One Job Order Request
#    And Set method to GET
#    When Set path to Get One Job Order Request "link address/curl"
#
#  Scenario: JOR 013 - List Job Posting
#    And Set method to GET
#    When Set path to List Job Posting "link address/curl"
#
#  Scenario: JOR 014 - List Request Approved
#    And Set method to GET
#    When Set path to List Request Approved "link address/curl"
#
#  Scenario: JOR 015 - List Request Rejected
#    And Set method to GET
#    When Set path to List Request Rejected "link address/curl"
#
#  Scenario: JOR 016 - List Request Revised
#    And Set method to GET
#    When Set path to List Request Revised "link address/curl"
#
#  Scenario: JOR 017 - List Request InProgress
#    And Set method to GET
#    When Set path to List Request InProgress "link address/curl"
#
#  Scenario: JOR 018 - List Request Draft
#    And Set method to GET
#    When Set path to List Request Draft "link address/curl"
#
#
#
