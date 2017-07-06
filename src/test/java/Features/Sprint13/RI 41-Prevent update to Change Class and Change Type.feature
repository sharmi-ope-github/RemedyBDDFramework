Feature: As a Change user when I select a Change Template the Change Class and Change Type fields should be locked to ensure the correct approval process flow in the selected template is followed.

  @Sprint13-RI41-Test1
  Scenario Outline: Adding a Change Template to an unsaved Change Request (PAC-Conflict)
    Given I am creating a new Change Request in the Draft Status "<Username>","<Password>","<InitialStatus>"
    When I select a Change Template "<Summary>","<TemplateName>"
    Then the Change Class and Change Type fields should be made Read Only during creation "<ChangeClass>","<ChangeType>"

    Examples: 
      | Username | Password | InitialStatus | Summary                     | TemplateName           | ChangeClass  | ChangeType |
      | snarasi1 | test     | Draft         | Test Summary - PAC-Conflict | MARSS - SMS Shortcodes | Pre-approved | Impact     |

  @Sprint13-RI41-Test2
  Scenario Outline: Opening an existing Change Request with a Change Template
    Given I am searching an existing change record "<Username>","<Password>","<ChangeID>"
    And the Change Request has been created with a Change Template "<InitialStatus>","<TemplateName>"
    Then the Change Class and Change Type fields should be made Read Only for an existing Change record "<ChangeClass>","<ChangeType>"

    Examples: 
      | Username | Password | InitialStatus | ChangeID        | TemplateName | ChangeClass  | ChangeType |
      | snarasi1 | test     | Draft         | CRQ000000249763 | Cell Upgrade | Pre-approved | Impact     |

  @Sprint13-RI41-Test3
  Scenario Outline: Creating a new Change record by Copying (Copy Change) from an existing Change Record with a Change Template
    Given I am searching an existing change record "<Username>","<Password>","<ChangeID>"
    And the Change Request has been created with a Change Template along with Class and Type made Read Only "<InitialStatus>","<TemplateName>","<ChangeClass>","<ChangeType>"
    When I copy change to create a new change record "<ChangeClass>","<ChangeType>"
    Then the Change Class and Change Type fields should be made Read Only in the new copied change record "<TemplateName>","<ChangeClass>","<ChangeType>"

    Examples: 
      | Username | Password | InitialStatus | ChangeID        | TemplateName | ChangeClass  | ChangeType |
      | snarasi1 | test     | Draft         | CRQ000000249763 | Cell Upgrade | Pre-approved | Impact     |
