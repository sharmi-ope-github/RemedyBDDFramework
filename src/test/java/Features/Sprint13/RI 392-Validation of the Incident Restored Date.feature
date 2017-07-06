Feature: As an Incident user I want to ensure that when I resolve an Incident the value provided in the Incident Restoration date cannot be greater than the Last Resolved Date and less than the Reported Date

  @Sprint13-RI392-Test1
  Scenario Outline: Restored Date greater than the Last Resolved Date (Status update from Investigation and Diagnosis to Incident Closure using Process Flow Bar)
    Given Incident is in Assigned status and Assignee is not set "<Username>","<Password>","<Incident ID>","<AssignedGroup>"
    And the Restored Date is set to Future Date "<RestoredDate>"
    When Incident Closure is selected from the Investigation and Diagnosis Stage-Process Flow Bar
    Then the Restored Date greater error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332916 | Assigned       | BMR Programme Support | Rukmini Narayanan | 25/05/2017 03:09:00 |

  @Sprint13-RI392-Test2
  Scenario Outline: Restored Date greater than the Last Resolved Date (Status update from Resolution and Recovery to Incident Closure using Process Flow Bar)
    Given That an Incident has been assigned "<Username>","<Password>","<Incident ID>","<Assigned Group>","<Assignee>","<Initial Status>"
    And the Restored Date is set to Future Date "<RestoredDate>"
    When Incident Closure is selected from the Resolution and Recovery Stage-Process Flow Bar
    Then the Restored Date greater error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332917 | In Progress    | BMR Programme Support | Rukmini Narayanan | 25/05/2017 03:09:00 |

  @Sprint13-RI392-Test3
  Scenario Outline: Restored Date greater than the Last Resolved Date (Status update from Resolution and Recovery to Closed using Process Flow Bar)
    Given That an Incident has been assigned "<Username>","<Password>","<Incident ID>","<Assigned Group>","<Assignee>","<Initial Status>"
    And the Restored Date is set to Future Date "<RestoredDate>"
    When Closed is selected from the Resolution and Recovery Stage-Process Flow Bar
    Then the Restored Date greater error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332917 | In Progress    | BMR Programme Support | Rukmini Narayanan | 25/05/2017 03:09:00 |

  @Sprint13-RI392-Test4
  Scenario Outline: Restored Date greater than the Last Resolved Date (Status update from Investigation and Diagnosis to Closed using Process Flow Bar)
    Given Incident is in Assigned status and Assignee is not set "<Username>","<Password>","<Incident ID>","<AssignedGroup>"
    And the Restored Date is set to Future Date "<RestoredDate>"
    When Closed is selected from the Investigation and Diagnosis Stage-Process Flow Bar
    Then the Restored Date greater error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332916 | Assigned       | BMR Programme Support | Rukmini Narayanan | 25/05/2017 03:09:00 |

  @Sprint13-RI392-Test5
  Scenario Outline: Restored Date greater than the Last Resolved Date (Status update from InProgress to Resolved using NextStage button)
    Given That an Incident has been assigned "<Username>","<Password>","<Incident ID>","<Assigned Group>","<Assignee>","<Initial Status>"
    And the Restored Date is set to Future Date "<RestoredDate>"
    When I click on NextStage button to progress Incident to Resolved
    Then the Restored Date greater error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332917 | In Progress    | BMR Programme Support | Rukmini Narayanan | 25/05/2017 03:09:00 |

  @Sprint13-RI392-Test6
  Scenario Outline: Restored Date greater than the Last Resolved Date (Status update from InProgress to Resolved using Resolve button)
    Given That an Incident has been assigned "<Username>","<Password>","<Incident ID>","<Assigned Group>","<Assignee>","<Initial Status>"
    And the Restored Date is set to Future Date "<RestoredDate>"
    When I click on Resolve button to progress Incident to Resolved
    Then the Restored Date greater error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332917 | In Progress    | BMR Programme Support | Rukmini Narayanan | 25/05/2017 03:09:00 |

  @Sprint13-RI392-Test7
  Scenario Outline: Restored Date greater than the Last Resolved Date (Status update from Assigned to Resolved using Resolve button)
    Given Incident is in Assigned status and Assignee is not set "<Username>","<Password>","<Incident ID>","<AssignedGroup>"
    And the Restored Date is set to Future Date "<RestoredDate>"
    When I click on Resolve button to progress Incident to Resolved
    Then the Restored Date greater error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332916 | Assigned       | BMR Programme Support | Rukmini Narayanan | 25/05/2017 03:09:00 |

  @Sprint13-RI392-Test8
  Scenario Outline: Restored Date greater than the Last Resolved Date (Status update from Pending to Resolved using Resolve button)
    Given Incident is in Pending status and Assignee is set "<Username>","<Password>","<Incident ID>","<AssignedGroup>","<InitialStatus>","<Assignee>"
    And the Restored Date is set to Future Date "<RestoredDate>"
    When I click on Resolve button to progress Incident to Resolved
    Then the Restored Date greater error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332918 | Pending        | BMR Programme Support | Rukmini Narayanan | 25/05/2017 03:09:00 |

  @Sprint13-RI392-Test9
  Scenario Outline: Restored Date greater than the Last Resolved Date on Status Menu Transition from Assigned to Resolved status
    Given Incident is in Assigned status and Assignee is not set "<Username>","<Password>","<Incident ID>","<AssignedGroup>"
    And the Restored Date is set to Future Date "<RestoredDate>"
    When I select the Resolved Status from the Status menu
    Then the Restored Date greater error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332916 | Assigned       | BMR Programme Support | Rukmini Narayanan | 25/05/2017 03:09:00 |

  @Sprint13-RI392-Test10
  Scenario Outline: Restored Date greater than the Last Resolved Date on Status Menu Transition from InProgress to Resolved status
    Given That an Incident has been assigned "<Username>","<Password>","<Incident ID>","<Assigned Group>","<Assignee>","<Initial Status>"
    And the Restored Date is set to Future Date "<RestoredDate>"
    When I select the Resolved Status from the Status menu
    Then the Restored Date greater error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332917 | In Progress    | BMR Programme Support | Rukmini Narayanan | 25/05/2017 03:09:00 |

  @Sprint13-RI392-Test11
  Scenario Outline: Restored Date greater than the Last Resolved Date on Status Menu Transition from Pending to Resolved status
    Given Incident is in Pending status and Assignee is set "<Username>","<Password>","<Incident ID>","<AssignedGroup>","<InitialStatus>","<Assignee>"
    And the Restored Date is set to Future Date "<RestoredDate>"
    When I select the Resolved Status from the Status menu
    Then the Restored Date greater error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332918 | Pending        | BMR Programme Support | Rukmini Narayanan | 25/05/2017 03:09:00 |

  @Sprint13-RI392-Test12
  Scenario Outline: Restored Date greater than the Last Resolved Date on Status Menu Transition from Assigned to Closed status
    Given Incident is in Assigned status and Assignee is not set "<Username>","<Password>","<Incident ID>","<AssignedGroup>"
    And the Restored Date is set to Future Date "<RestoredDate>"
    When I select the Closed Status from the Status menu
    Then the Restored Date greater error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332916 | Assigned       | BMR Programme Support | Rukmini Narayanan | 25/05/2017 03:09:00 |

  @Sprint13-RI392-Test13
  Scenario Outline: Restored Date greater than the Last Resolved Date on Status Menu Transition from InProgress to Closed status
    Given That an Incident has been assigned "<Username>","<Password>","<Incident ID>","<Assigned Group>","<Assignee>","<Initial Status>"
    And the Restored Date is set to Future Date "<RestoredDate>"
    When I select the Closed Status from the Status menu
    Then the Restored Date greater error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332917 | In Progress    | BMR Programme Support | Rukmini Narayanan | 25/05/2017 03:09:00 |

  @Sprint13-RI392-Test14
  Scenario Outline: Restored Date greater than the Last Resolved Date on Status Menu Transition from Pending to Closed status
    Given Incident is in Pending status and Assignee is set "<Username>","<Password>","<Incident ID>","<AssignedGroup>","<InitialStatus>","<Assignee>"
    And the Restored Date is set to Future Date "<RestoredDate>"
    When I select the Closed Status from the Status menu
    Then the Restored Date greater error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332918 | Pending        | BMR Programme Support | Rukmini Narayanan | 25/05/2017 03:09:00 |

  @Sprint13-RI392-Test15
  Scenario Outline: Restored Date lesser than the Reported Date (Status update from Investigation and Diagnosis to Incident Closure using Process Flow Bar)
    Given Incident is in Assigned status and Assignee is not set "<Username>","<Password>","<Incident ID>","<AssignedGroup>"
    And the Restored Date set to past date "<RestoredDate>"
    When Incident Closure is selected from the Investigation and Diagnosis Stage-Process Flow Bar
    Then the Restored Date lesser error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332916 | Assigned       | BMR Programme Support | Rukmini Narayanan | 25/04/2017 03:09:00 |

  @Sprint13-RI392-Test16
  Scenario Outline: Restored Date lesser than the Reported Date (Status update from Resolution and Recovery to Incident Closure using Process Flow Bar)
    Given That an Incident has been assigned "<Username>","<Password>","<Incident ID>","<Assigned Group>","<Assignee>","<Initial Status>"
    And the Restored Date set to past date "<RestoredDate>"
    When Incident Closure is selected from the Resolution and Recovery Stage-Process Flow Bar
    Then the Restored Date lesser error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332917 | In Progress    | BMR Programme Support | Rukmini Narayanan | 25/04/2017 03:09:00 |

  @Sprint13-RI392-Test17
  Scenario Outline: Restored Date lesser than the Reported Date (Status update from Resolution and Recovery to Closed using Process Flow Bar)
    Given That an Incident has been assigned "<Username>","<Password>","<Incident ID>","<Assigned Group>","<Assignee>","<Initial Status>"
    And the Restored Date set to past date "<RestoredDate>"
    When Closed is selected from the Resolution and Recovery Stage-Process Flow Bar
    Then the Restored Date lesser error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332917 | In Progress    | BMR Programme Support | Rukmini Narayanan | 25/04/2017 03:09:00 |

  @Sprint13-RI392-Test18
  Scenario Outline: Restored Date lesser than the Reported Date (Status update from Investigation and Diagnosis to Closed using Process Flow Bar)
    Given Incident is in Assigned status and Assignee is not set "<Username>","<Password>","<Incident ID>","<AssignedGroup>"
    And the Restored Date set to past date "<RestoredDate>"
    When Closed is selected from the Investigation and Diagnosis Stage-Process Flow Bar
    Then the Restored Date lesser error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332916 | Assigned       | BMR Programme Support | Rukmini Narayanan | 25/04/2017 03:09:00 |

  @Sprint13-RI392-Test19
  Scenario Outline: Restored Date lesser than the Reported Date (Status update from InProgress to Resolved using NextStage button)
    Given That an Incident has been assigned "<Username>","<Password>","<Incident ID>","<Assigned Group>","<Assignee>","<Initial Status>"
    And the Restored Date set to past date "<RestoredDate>"
    When I click on NextStage button to progress Incident to Resolved
    Then the Restored Date lesser error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332917 | In Progress    | BMR Programme Support | Rukmini Narayanan | 25/04/2017 03:09:00 |

  @Sprint13-RI392-Test20
  Scenario Outline: Restored Date lesser than the Reported Date (Status update from InProgress to Resolved using Resolve button)
    Given That an Incident has been assigned "<Username>","<Password>","<Incident ID>","<Assigned Group>","<Assignee>","<Initial Status>"
    And the Restored Date set to past date "<RestoredDate>"
    When I click on Resolve button to progress Incident to Resolved
    Then the Restored Date lesser error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332917 | In Progress    | BMR Programme Support | Rukmini Narayanan | 25/04/2017 03:09:00 |

  @Sprint13-RI392-Test21
  Scenario Outline: Restored Date lesser than the Reported Date (Status update from Assigned to Resolved using Resolve button)
    Given Incident is in Assigned status and Assignee is not set "<Username>","<Password>","<Incident ID>","<AssignedGroup>"
    And the Restored Date set to past date "<RestoredDate>"
    When I click on Resolve button to progress Incident to Resolved
    Then the Restored Date lesser error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332916 | Assigned       | BMR Programme Support | Rukmini Narayanan | 25/04/2017 03:09:00 |

  @Sprint13-RI392-Test22
  Scenario Outline: Restored Date lesser than the Reported Date (Status update from Pending to Resolved using Resolve button)
    Given Incident is in Pending status and Assignee is set "<Username>","<Password>","<Incident ID>","<AssignedGroup>","<InitialStatus>","<Assignee>"
    And the Restored Date set to past date "<RestoredDate>"
    When I click on Resolve button to progress Incident to Resolved
    Then the Restored Date lesser error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332918 | Pending        | BMR Programme Support | Rukmini Narayanan | 25/04/2017 03:09:00 |

  @Sprint13-RI392-Test23
  Scenario Outline: Restored Date lesser than the Reported Date on Status Menu Transition from Assigned to Resolved status
    Given Incident is in Assigned status and Assignee is not set "<Username>","<Password>","<Incident ID>","<AssignedGroup>"
    And the Restored Date set to past date "<RestoredDate>"
    When I select the Resolved Status from the Status menu
    Then the Restored Date lesser error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332916 | Assigned       | BMR Programme Support | Rukmini Narayanan | 25/04/2017 03:09:00 |

  @Sprint13-RI392-Test24
  Scenario Outline: Restored Date lesser than the Reported Date on Status Menu Transition from InProgress to Resolved status
    Given That an Incident has been assigned "<Username>","<Password>","<Incident ID>","<Assigned Group>","<Assignee>","<Initial Status>"
    And the Restored Date set to past date "<RestoredDate>"
    When I select the Resolved Status from the Status menu
    Then the Restored Date lesser error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332917 | In Progress    | BMR Programme Support | Rukmini Narayanan | 25/04/2017 03:09:00 |

  @Sprint13-RI392-Test25
  Scenario Outline: Restored Date lesser than the Reported Date on Status Menu Transition from Pending to Resolved status
    Given Incident is in Pending status and Assignee is set "<Username>","<Password>","<Incident ID>","<AssignedGroup>","<InitialStatus>","<Assignee>"
    And the Restored Date set to past date "<RestoredDate>"
    When I select the Resolved Status from the Status menu
    Then the Restored Date lesser error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332918 | Pending        | BMR Programme Support | Rukmini Narayanan | 25/04/2017 03:09:00 |

  @Sprint13-RI392-Test26
  Scenario Outline: Restored Date lesser than the Reported Date on Status Menu Transition from Assigned to Closed status
    Given Incident is in Assigned status and Assignee is not set "<Username>","<Password>","<Incident ID>","<AssignedGroup>"
    And the Restored Date set to past date "<RestoredDate>"
    When I select the Closed Status from the Status menu
    Then the Restored Date lesser error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332916 | Assigned       | BMR Programme Support | Rukmini Narayanan | 25/04/2017 03:09:00 |

  @Sprint13-RI392-Test27
  Scenario Outline: Restored Date lesser than the Reported Date on Status Menu Transition from InProgress to Closed status
    Given That an Incident has been assigned "<Username>","<Password>","<Incident ID>","<Assigned Group>","<Assignee>","<Initial Status>"
    And the Restored Date set to past date "<RestoredDate>"
    When I select the Closed Status from the Status menu
    Then the Restored Date lesser error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332917 | In Progress    | BMR Programme Support | Rukmini Narayanan | 25/04/2017 03:09:00 |

  @Sprint13-RI392-Test28
  Scenario Outline: Restored Date lesser than the Reported Date on Status Menu Transition from Pending to Closed status
    Given Incident is in Pending status and Assignee is set "<Username>","<Password>","<Incident ID>","<AssignedGroup>","<InitialStatus>","<Assignee>"
    And the Restored Date set to past date "<RestoredDate>"
    When I select the Closed Status from the Status menu
    Then the Restored Date lesser error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332918 | Pending        | BMR Programme Support | Rukmini Narayanan | 25/04/2017 03:09:00 |

  @Sprint13-RI392-Test29
  Scenario Outline: Error message when Restored Date is lesser than the Reported Date (Assigned Status)
    Given Incident is in Assigned status and Assignee is not set "<Username>","<Password>","<Incident ID>","<AssignedGroup>"
    And the Restored Date set to past date "<RestoredDate>"
    When I click on the Save button in the Incident record
    Then the Restored Date lesser error message is displayed

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Assigned Group        | Assignee          | RestoredDate        |
      | snarasi1 | test     | INC000000332916 | Assigned       | BMR Programme Support | Rukmini Narayanan | 25/04/2017 03:09:00 |

  @Sprint13-RI392-Test30
  Scenario Outline: Error message when Restored Date is lesser than the Reported Date (Incident Creation Process)
    Given A new Incident is created "<Username>","<Password>","<Company>","<Customer>","<Summary>","<Impact>","<Urgency>","<AssignedGroup>","<OpCat1>","<Service>"
    And the Restored Date set to past date "<RestoredDate>"
    When I click on the Save button in the Incident record
    Then the Restored Date lesser error message is displayed during incident creation

    Examples: 
      | Username | Password | AssignedGroup         | Assignee          | RestoredDate        | Company       | Customer | Summary      | Service     | Impact            | Urgency | OpCat1       |
      | snarasi1 | test     | BMR Programme Support | Rukmini Narayanan | 25/04/2017 03:09:00 | TELEFONICA UK | rnaraya2 | Test Summary | [ts] 2g ran | 4-Minor/Localized | 4-Low   | Availability |
