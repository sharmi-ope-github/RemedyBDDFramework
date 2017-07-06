Feature: As an Incident user when I move an Incident from the Assigned, In Progress & Pending states to either the Resolved or Closed state I want to ensure the Modify Incident popup is displayed. The Modify Incident popup should be displayed consistently across all supported methods for updating the Incident status.
  Incident Status Update Methods:
  
    Status Menu on Incident
    Next Stage button on Incident
    Resolve button on Incident
    Process Flow Bar
  
  NB: Only the Status Menu status transition to Resolved does not launch the Modify Incident popup. The current popup that is launched when the Status Reason is null should be removed, as the Modify Incident popup contains the Status Reason field for data entry.

  @Sprint12-RI156-Test1
  Scenario Outline: Modify Incident popup mandatory on Status Menu Transition from "Assigned" to "Resolved" status
    Given Incident is in Assigned status and Assignee is not set "<Username>","<Password>","<Incident ID>","<AssignedGroup>"
    When I select the Resolved Status from the Status menu
    Then the Modify Incident pop-up form will be displayed with the new fields
    And Resolution Category Tier 1 is mandatory when updating status from Assigned to Resolved using Status dropdown "<Resolution>","<CI+ Detail>","<Status Reason>","<ResolutionOptCat1>","<Assignee>"

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | Resolution      | CI+ Detail  | Status Reason                        | ResolutionOptCat1 |
      | snarasi1 | test     | INC000000332378 | Assigned       | BMR Programme Support | Rukmini Narayanan | Test Resolution | [ts] 2g ran | Resolved, no further action required | Enabled           |

  @Sprint12-RI156-Test2(preparelogfile)
  Scenario Outline: Modify Incident popup mandatory on Status Menu Transition from "InProgress" to "Resolved" status
    Given That an Incident has been assigned "<Username>","<Password>","<Incident ID>","<Assigned Group>","<Assignee>","<Initial Status>"
    When I select the Resolved Status from the Status menu
    Then the Modify Incident pop-up form will be displayed with the new fields
    And Resolution Category Tier 1 is mandatory when updating status from InProgress to Resolved using Status dropdown "<Resolution>","<CI+ Detail>","<Status Reason>","<ResolutionOptCat1>"

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | Resolution      | CI+ Detail  | Status Reason                        | ResolutionOptCat1 |
      | rnaraya2 |        1 | INC000000332556 | In Progress    | BMR Programme Support | Rukmini Narayanan | Test Resolution | [ts] 2g ran | Resolved, no further action required | Enabled           |

  @Sprint12-RI156-Test3
  Scenario Outline: Modify Incident popup mandatory on Status Menu Transition from "Pending" to "Resolved" status
    Given Incident is in Pending status and Assignee is set "<Username>","<Password>","<Incident ID>","<AssignedGroup>","<InitialStatus>","<Assignee>"
    When I select the Resolved Status from the Status menu
    Then the Modify Incident pop-up form will be displayed with the new fields
    And Resolution Category Tier 1 is mandatory when updating status from Pending to Resolved using Status dropdown "<Resolution>","<CI+ Detail>","<Status Reason>","<ResolutionOptCat1>","<Assignee>"

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | Resolution      | CI+ Detail  | Status Reason                        | ResolutionOptCat1 |
      | rnaraya2 |        1 | INC000000332557 | Pending        | BMR Programme Support | Rukmini Narayanan | Test Resolution | [ts] 2g ran | Resolved, no further action required | Enabled           |

  @Sprint12-RI156-Test4
  Scenario Outline: Modify Incident popup mandatory on Status Menu Transition from "Assigned" to "Closed" status
    Given Incident is in Assigned status and Assignee is not set "<Username>","<Password>","<Incident ID>","<AssignedGroup>"
    When I select the Closed Status from the Status menu
    Then the Modify Incident pop-up form will be displayed with the new fields
    And Resolution Category Tier 1 is mandatory when updating status from Assigned to Closed using Status dropdown "<Resolution>","<CI+ Detail>","<Status Reason>","<ResolutionOptCat1>","<Assignee>"

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | Resolution      | CI+ Detail  | Status Reason   | ResolutionOptCat1 |
      | snarasi1 | test     | INC000000326096 | Assigned       | BMR Programme Support | Rukmini Narayanan | Test Resolution | [ts] 2g ran | User compliance | Enabled           |

  @Sprint12-RI156-Test5
  Scenario Outline: Modify Incident popup mandatory on Status Menu Transition from "InProgress" to "Closed" status
    Given That an Incident has been assigned "<Username>","<Password>","<Incident ID>","<Assigned Group>","<Assignee>","<Initial Status>"
    When I select the Closed Status from the Status menu
    Then the Modify Incident pop-up form will be displayed with the new fields
    And Resolution Category Tier 1 is mandatory when updating status from InProgress to Closed using Status dropdown "<Resolution>","<CI+ Detail>","<Status Reason>","<ResolutionOptCat1>"

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | Resolution      | CI+ Detail  | Status Reason   | ResolutionOptCat1 |
      | snarasi1 | test     | INC000000332581 | In Progress    | BMR Programme Support | Rukmini Narayanan | Test Resolution | [ts] 2g ran | User compliance | Enabled           |

  @Sprint12-RI156-Test6
  Scenario Outline: Modify Incident popup mandatory on Status Menu Transition from "Pending" to "Closed" status
    Given Incident is in Pending status and Assignee is set "<Username>","<Password>","<Incident ID>","<AssignedGroup>","<InitialStatus>","<Assignee>"
    When I select the Closed Status from the Status menu
    Then the Modify Incident pop-up form will be displayed with the new fields
    And Resolution Category Tier 1 is mandatory when updating status from Pending to Closed using Status dropdown "<Resolution>","<CI+ Detail>","<Status Reason>","<ResolutionOptCat1>","<Assignee>"

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | Resolution      | CI+ Detail  | Status Reason   | ResolutionOptCat1 |
      | snarasi1 | test     | INC000000332560 | Pending        | BMR Programme Support | Rukmini Narayanan | Test Resolution | [ts] 2g ran | User compliance | Enabled           |
