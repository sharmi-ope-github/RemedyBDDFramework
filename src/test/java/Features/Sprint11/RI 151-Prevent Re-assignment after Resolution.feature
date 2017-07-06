Feature: As an Incident user I want the assignee fields to be available before the Incident is resolved and not available after the incident is resolved so that the assignee cannot be changed retrospectively.The Assignee Group and Assignee fields should be locked in 'Resolved', 'Closed' and 'Cancelled' States.

  Scenario Outline: Set Incident to resolved
    Given That an Incident has been assigned "<Username>","<Password>","<Incident ID>","<Assigned Group>","<Assignee>"
    When an Incident is set to status Resolved "<Resolution>","<CI+ Detail>","<Status Reason>"
    Then the Assigned Group and Assignee fields will be locked

    Examples: 
      | Username | Password | Incident ID     | Assigned Group        | Assignee          | Resolution      | CI+ Detail  | Status Reason                        |
      | rnaraya2 |        1 | INC000000329757 | BMR Programme Support | Rukmini Narayanan | Test Resolution | [ts] 2g ran | Resolved, no further action required |

  Scenario Outline: Set Incident to cancelled
    Given that an Incident is set to "<Status>","<Username>","<Password>","<Incident ID>","<Status Reason>"
    When I search and Open the incident "<Incident ID>"
    Then the Assigned Group and Assignee fields will be locked

    Examples: 
      | Username | Password | Incident ID     | Status    | Status Reason         |
      | rnaraya2 |        1 | INC000000329828 | Cancelled | No longer a Causal CI |

  Scenario Outline: Set Incident to Closed
    Given that an Incident is set to "<Status>","<Username>","<Password>","<Incident ID>","<Status Reason>"
    When I search and Open the incident
    Then the Assigned Group and Assignee fields will be locked

    Examples: 
      | Username | Password | Incident ID     | Status | Status Reason   |
      | rnaraya2 |        1 | INC000000329830 | Closed | User compliance |

  Scenario Outline: Re-open Resolved Incident
    Given that an Incident is "<Initial Status>","<Username>","<Password>","<Incident ID>"
    When the Incident is re-opened "<Status>"
    Then the Assigned Group and Assignee fields will be editable again

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Status      |
      | rnaraya2 |        1 | INC000000329830 | Resolved       | In Progress |

  Scenario Outline: Assigned Group and Assignee fields are not locked when status is not Resolved (or) Cancelled (or) Closed
    Given I search an Incident record "<Username>","<Password>","<Incident ID>"
    When Verify the Incident status
    Then Assigned Group and Assignee fields are not locked when status is not Resolved/Cancelled/Closed

    Examples: 
      | Username | Password | Incident ID     | Status      |
      | rnaraya2 |        1 | INC000000329840 | Pending     |
      | rnaraya2 |        1 | INC000000329842 | Assigned    |
      | rnaraya2 |        1 | INC000000329844 | In Progress |

  Scenario Outline: Assignee field is not locked when status updated to Resolved without Assignee and we can re-open the incident successfully after entering Assignee details
    Given Incident is in Assigned status and Assignee is not set "<Username>","<Password>","<Incident ID>","<AssignedGroup>"
    When an Incident is set to status Resolved "<Resolution>","<CI+ Detail>","<Status Reason>"
    Then Assigned Group is locked and Assignee is editable "<Assignee>"
    And I can Re-Open the Incident successfully

    Examples: 
      | Username | Password | Incident ID     | Assigned Group        | Resolution      | CI+ Detail  | Status Reason                        | Assignee          |
      | rnaraya2 |        1 | INC000000330040 | BMR Programme Support | Test Resolution | [ts] 2g ran | Resolved, no further action required | Rukmini Narayanan |

  
  Scenario Outline: Assignee field is not locked when status updated to Resolved without Assignee we can close the incident successfully after entering Assignee details
    Given Incident is in Assigned status and Assignee is not set "<Username>","<Password>","<Incident ID>","<AssignedGroup>"
    When an Incident is set to status Resolved "<Resolution>","<CI+ Detail>","<Status Reason>"
    Then Assigned Group is locked and Assignee is editable "<Assignee>"
    And I can Close the Incident successfully "<Closure Reason>"

    Examples: 
      | Username | Password | Incident ID     | Assigned Group        | Resolution      | CI+ Detail  | Status Reason                        | Assignee          | Closure Reason  |
      | rnaraya2 |        1 | INC000000330046 | BMR Programme Support | Test Resolution | [ts] 2g ran | Resolved, no further action required | Rukmini Narayanan | User compliance |
