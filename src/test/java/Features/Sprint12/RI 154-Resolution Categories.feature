Feature: As an Incident user I want to ensure the Resolution Category Tier 1 is mandated so that it is clear what work is required to resolve the incident. The Incident user should be able to enter all the Resolution Category and Resolution Product Category tiers if known at the time of Incident Resolution.

  @Sprint12-RI154-Test1
  Scenario Outline: Display Resolution Categories and mandate Resolution Category Tier 1 (Status update from Resolution and Recovery to Incident Closure using Process Flow Bar)
    Given That an Incident has been assigned "<Username>","<Password>","<Incident ID>","<Assigned Group>","<Assignee>","<Initial Status>"
    When Incident Closure is selected from the Resolution and Recovery Stage-Process Flow Bar
    Then the Modify Incident pop-up form will be displayed with the new fields
    And Resolution Category Tier 1 is mandatory when updating status from InProgress to Resolved "<Resolution>","<CI+ Detail>","<Status Reason>","<ResolutionOptCat1>"

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | Resolution      | CI+ Detail  | Status Reason                        | ResolutionOptCat1 |
      | snarasi1 | test     | INC000000332546 | In Progress    | BMR Programme Support | Rukmini Narayanan | Test Resolution | [ts] 2g ran | Resolved, no further action required | Enabled           |

  @Sprint12-RI154-Test2
  Scenario Outline: Display Resolution Categories and mandate Resolution Category Tier 1 (Status update from Investigation and Diagnosis to Incident Closure using Process Flow Bar)
    Given Incident is in Assigned status and Assignee is not set "<Username>","<Password>","<Incident ID>","<AssignedGroup>"
    When Incident Closure is selected from the Investigation and Diagnosis Stage-Process Flow Bar
    Then the Modify Incident pop-up form will be displayed with the new fields
    And Resolution Category Tier 1 is mandatory when updating status from Assigned to Resolved "<Resolution>","<CI+ Detail>","<Status Reason>","<ResolutionOptCat1>","<Assignee>"

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | Resolution      | CI+ Detail  | Status Reason                        | ResolutionOptCat1 |
      | snarasi1 | test     | INC000000332547 | Assigned       | BMR Programme Support | Rukmini Narayanan | Test Resolution | [ts] 2g ran | Resolved, no further action required | Enabled           |

  @Sprint12-RI154-Test3
  Scenario Outline: Display Resolution Categories and mandate Resolution Category Tier 1 (Status update from Resolution and Recovery to Closed using Process Flow Bar)
    Given That an Incident has been assigned "<Username>","<Password>","<Incident ID>","<Assigned Group>","<Assignee>","<Initial Status>"
    When Closed is selected from the Resolution and Recovery Stage-Process Flow Bar
    Then the Modify Incident pop-up form will be displayed with the new fields
    And Resolution Category Tier 1 is mandatory when updating status from InProgress to Closed "<Resolution>","<CI+ Detail>","<Status Reason>","<ResolutionOptCat1>"

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | Resolution      | CI+ Detail  | Status Reason   | ResolutionOptCat1 |
      | snarasi1 | test     | INC000000332548 | In Progress    | BMR Programme Support | Rukmini Narayanan | Test Resolution | [ts] 2g ran | User compliance | Enabled           |

  @Sprint12-RI154-Test4
  Scenario Outline: Display Resolution Categories and mandate Resolution Category Tier 1 (Status update from Investigation and Diagnosis to Closed using Process Flow Bar)
    Given Incident is in Assigned status and Assignee is not set "<Username>","<Password>","<Incident ID>","<AssignedGroup>"
    When Closed is selected from the Investigation and Diagnosis Stage-Process Flow Bar
    Then the Modify Incident pop-up form will be displayed with the new fields
    And Resolution Category Tier 1 is mandatory when updating status from Assigned to Closed "<Resolution>","<CI+ Detail>","<Status Reason>","<ResolutionOptCat1>","<Assignee>"

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | Resolution      | CI+ Detail  | Status Reason   | ResolutionOptCat1 |
      | snarasi1 | test     | INC000000328037 | Assigned       | BMR Programme Support | Rukmini Narayanan | Test Resolution | [ts] 2g ran | User compliance | Enabled           |

  @Sprint12-RI154-Test5
  Scenario Outline: Display Resolution Categories and mandate Resolution Category Tier 1 (Status update from InProgress to Resolved using NextStage button)
    Given That an Incident has been assigned "<Username>","<Password>","<Incident ID>","<Assigned Group>","<Assignee>","<Initial Status>"
    When I click on NextStage button to progress Incident to Resolved
    Then the Modify Incident pop-up form will be displayed with the new fields
    And Resolution Category Tier 1 is mandatory when updating status from InProgress to Resolved "<Resolution>","<CI+ Detail>","<Status Reason>","<ResolutionOptCat1>"

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | Resolution      | CI+ Detail  | Status Reason                        | ResolutionOptCat1 |
      | snarasi1 | test     | INC000000332550 | In Progress    | BMR Programme Support | Rukmini Narayanan | Test Resolution | [ts] 2g ran | Resolved, no further action required | Enabled           |

  @Sprint12-RI154-Test6
  Scenario Outline: Display Resolution Categories and mandate Resolution Category Tier 1 (Status update from InProgress to Resolved using Resolve button)
    Given That an Incident has been assigned "<Username>","<Password>","<Incident ID>","<Assigned Group>","<Assignee>","<Initial Status>"
    When I click on Resolve button to progress Incident to Resolved
    Then the Modify Incident pop-up form will be displayed with the new fields
    And Resolution Category Tier 1 is mandatory when updating status from InProgress to Resolved "<Resolution>","<CI+ Detail>","<Status Reason>","<ResolutionOptCat1>"

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | Resolution      | CI+ Detail  | Status Reason                        | ResolutionOptCat1 |
      | snarasi1 | test     | INC000000332551 | In Progress    | BMR Programme Support | Rukmini Narayanan | Test Resolution | [ts] 2g ran | Resolved, no further action required | Enabled           |

  @Sprint12-RI154-Test7
  Scenario Outline: Display Resolution Categories and mandate Resolution Category Tier 1 (Status update from Assigned to Resolved using Resolve button)
    Given Incident is in Assigned status and Assignee is not set "<Username>","<Password>","<Incident ID>","<AssignedGroup>"
    When I click on Resolve button to progress Incident to Resolved
    Then the Modify Incident pop-up form will be displayed with the new fields
    And Resolution Category Tier 1 is mandatory when updating status from Assigned to Resolved "<Resolution>","<CI+ Detail>","<Status Reason>","<ResolutionOptCat1>","<Assignee>"

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | Resolution      | CI+ Detail  | Status Reason                        | ResolutionOptCat1 |
      | snarasi1 | test     | INC000000332552 | Assigned       | BMR Programme Support | Rukmini Narayanan | Test Resolution | [ts] 2g ran | Resolved, no further action required | Enabled           |

  @Sprint12-RI154-Test8
  Scenario Outline: Display Resolution Categories and mandate Resolution Category Tier 1 (Status update from Pending to Resolved using Resolve button)
    Given Incident is in Pending status and Assignee is set "<Username>","<Password>","<Incident ID>","<AssignedGroup>","<InitialStatus>","<Assignee>"
    When I click on Resolve button to progress Incident to Resolved
    Then the Modify Incident pop-up form will be displayed with the new fields
    And Resolution Category Tier 1 is mandatory when updating status from Pending to Resolved "<Resolution>","<CI+ Detail>","<Status Reason>","<ResolutionOptCat1>","<Assignee>"

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | Resolution      | CI+ Detail  | Status Reason                        | ResolutionOptCat1 |
      | snarasi1 | test     | INC000000332553 | Pending        | BMR Programme Support | Rukmini Narayanan | Test Resolution | [ts] 2g ran | Resolved, no further action required | Enabled           |
