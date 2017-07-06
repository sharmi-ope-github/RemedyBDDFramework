Feature: As a Change user when I remove the Change Template then the default change process should be set.

  @Sprint13-RI169-Test1
  Scenario Outline: Remove existing template from Change Request during Change creation
    Given I am creating a new Change Request in the Draft Status "<Username>","<Password>","<InitialStatus>"
    And already I have selected a change template "<Summary>","<TemplateName>","<ChangeClass>","<ChangeType>"
    When I remove the change template "<TemplateName>"
    Then the Change Type and Change Class fields should be made editable "<ChangeClassFinal>","<ProcessFlowNameFinal>"

    Examples: 
      | Username | Password | InitialStatus | Summary      | TemplateName | ChangeClass  | ChangeType | ChangeClassFinal | ProcessFlowNameFinal |
      | snarasi1 | test     | Draft         | Test Summary | Cell Upgrade | Pre-approved | Impact     | Normal           | Standard Process     |

  @Sprint13-RI169-Test2
  Scenario Outline: Remove existing template from Change Request during Change creation and replace it with a new one
    Given I am creating a new Change Request in the Draft Status "<Username>","<Password>","<InitialStatus>"
    And already I have selected a change template "<Summary>","<TemplateName>","<ChangeClass>","<ChangeType>"
    When I remove the change template "<TemplateName>"
    Then the Change Type and Change Class fields should be made editable after removing the first template "<ChangeClassFinal>","<ProcessFlowNameFinal>"
    And I select a new template "<NewTemplateName>"
    And the Change Type and Change Class fields gets reset based on the new template "<NewTemplateName>","<NewChangeClass>","<NewChangeType>","<NewProcessFlowName>"

    Examples: 
      | Username | Password | InitialStatus | Summary      | TemplateName | ChangeClass  | ChangeType | ChangeClassFinal | ProcessFlowNameFinal | NewTemplateName        | NewChangeClass | NewChangeType |NewProcessFlowName|
      | snarasi1 | test     | Draft         | Test Summary | Cell Upgrade | Pre-approved | Impact     | Normal           | Standard Process     | MARSS - SMS Shortcodes | Pre-approved   | Impact        |Standard Process     |
