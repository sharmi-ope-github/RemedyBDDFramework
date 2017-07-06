Feature: As a Change Implementer I want to be able to view the change history so that I know what has happened to the change throughout its  life-cycle

  @Test1
  Scenario Outline: On creating a new Change record following fields gets audited in the Change Audit Log
    Change Coordinator Group
    Change Manager Group
    Class
    Impact
    Product Categorization
    Risk Level
    Scheduled Date
    Service
    Status
    Summary

    Given I am raising a new change request "<Username>","<Password>","<CoordinatorGroup>","<ManagerGroup>","<Impact>","<Risk Level>","<Service>","<Summary>","<Class>","<ChangeType>","<ChangeReason>","<ProdCat1>","<ProdCat2>","<ProdCat3>","<ScheduledStartDate>","<ScheduledEndDate>"
    When I access audit history from audit log
    Then I request and verify the update history from audit log for fields "<Username>","<Class>","<ChangeType>","<Impact>","<ProdCat1>","<ProdCat2>","<ProdCat3>","<Risk Level>","<ScheduledStartDate>","<ScheduledEndDate>","<CoordinatorGroup>","<Service>","<Status>","<Status Reason>","<ManagerGroup>","<Summary>"
    And I logout and close the browser

    Examples: 
      | Username | Password | Class  | ChangeType | ChangeReason | Impact             | Risk Level                 | CoordinatorGroup  | Service        | Summary                                     | ProdCat1 | ProdCat2          | ProdCat3 | ScheduledStartDate   | ScheduledEndDate     | Status | ManagerGroup          | Status Reason |
      | rnaraya2 |        1 | Normal | BAU        | Maintenance  | 3-Moderate/Limited | Risk Level 3 - Medium Risk | Business Adoption | [ts] enhancers | Test RI-75 User Story-Risk Level Validation | Network  | Core Transmission | Circuit  | 4/05/2017 8:30:00 PM | 4/06/2017 7:30:00 PM | Draft  | BMR Programme Support | Test          |

  @Test2
  Scenario Outline: Update in the Risk Level gets audited in the Change Audit Log
    Given I am searching an existing change record "<Username>","<Password>","<Change ID>"
    When I select answer to Risk question as "<Question1>","<Question2>","<Question3>","<Save_Button>"
    When I request the "Risk Level" update history from audit log
    Then Following Risk Level information is displayed in the audit history "<Username>","<expected risk value>"
    And I click on the view button
    Then The corresponding Risk Level audit details will be displayed "<Username>","<expected risk value>"
    And I logout and close the browser

    Examples: 
      | Username | Password | Change ID       | expected risk value     | Save_Button      | Question1                       | Question2                                               | Question3                                            |
      | rnaraya2 |        1 | CRQ000000248905 | Risk Level 2 - Low Risk | cm_edit_save_btn | Yes Multiple times successfully | Unable to pre implementation test, post testing planned | Back out plan has been executed successfully in live |

  @Test3
  Scenario Outline: Update in the Change Status gets audited in the Change Audit Log
    Given I am searching an existing change record "<Username>","<Password>","<Change ID>"
    And I am updating Status on the Change record "<Status>","<Status Reason>","<Save_Button>"
    When I request the "Status" update history from audit log
    Then Following Status information is displayed in the audit history "<Username>","<Status>","<Status Reason>"
    And I click on the view button
    Then The corresponding Status audit details will be displayed "<Username>","<Status>","<Status Reason>"
    And I logout and close the browser

    Examples: 
      | Username | Password | Change ID       | Save_Button      | Status    | Status Reason      |
      | rnaraya2 |        1 | CRQ000000248905 | cm_edit_save_btn | Cancelled | No Longer Required |
