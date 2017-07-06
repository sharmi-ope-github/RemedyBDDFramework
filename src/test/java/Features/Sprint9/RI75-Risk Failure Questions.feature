Feature: RI 75 - Risk Level should be determinded based on answers to the Risk Questions

  @Sprint91
  Scenario Outline: RiskLevel set based on the answers to the Risk Questions during New Change Creation
    Given I am raising a new change request "<Username>","<Password>","<CoordinatorGroup>","<ManagerGroup>","<Impact>","<Risk Level>","<Service>","<Summary>","<Class>","<ChangeType>","<ChangeReason>","<ProdCat1>","<ProdCat2>","<ProdCat3>","<ScheduledStartDate>","<ScheduledEndDate>"
    When I select answer to Risk question as "<Question1>","<Question2>","<Question3>","<Save_Button>"
    Then Risk Level gets set as "<expected risk value>"

    Examples: 
      | Username | Password | Question1                         | Question2                                               | Question3                                            | expected risk value      | Save_Button        | Class  | ChangeType | ChangeReason | Impact             | Risk Level                 | CoordinatorGroup  | Service | Summary                                     | ProdCat1 | ProdCat2          | ProdCat3 | ScheduledStartDate   | ScheduledEndDate     | ManagerGroup          |
      | rnaraya2 |        1 | Yes Multiple times successfully   | Unable to pre implementation test, post testing planned | Back out plan has been executed successfully in live | Risk Level 2 - Low Risk  | cm_create_save_btn | Normal | BAU        | Maintenance  | 3-Moderate/Limited | Risk Level 3 - Medium Risk | Business Adoption | 2G      | Test RI-75 User Story-Risk Level Validation | Network  | Core Transmission | Circuit  | 4/05/2017 8:30:00 PM | 4/06/2017 7:30:00 PM | BMR Programme Support |
      | rnaraya2 |        1 | Attempted and Unsuccessful/Failed | Unable to pre implementation test, post testing planned | Back out plan exists but never used                  | Risk Level 4 - High Risk | cm_create_save_btn | Normal | BAU        | Maintenance  | 3-Moderate/Limited | Risk Level 3 - Medium Risk | Business Adoption | 2G      | Test RI-75 User Story-Risk Level Validation | Network  | Core Transmission | Circuit  | 4/05/2017 8:30:00 PM | 4/06/2017 7:30:00 PM | BMR Programme Support |

  @Sprint9
  Scenario Outline: For an Existing Change Record (In Planning In ProgressS Status) Verifying if riskLevel gets set based on the answers to the Risk Questions
    Given I am searching an existing change record "<Username>","<Password>","<Change ID>"
    When I select answer to Risk question as "<Question1>","<Question2>","<Question3>","<Save_Button>"
    Then Risk Level gets set as "<expected risk value>"

    Examples: 
      | Username | Password | Change ID       | Question1                       | Question2                                               | Question3                                            | expected risk value     | Save_Button      |
      | rnaraya2 |        1 | CRQ000000247418 | Yes Multiple times successfully | Unable to pre implementation test, post testing planned | Back out plan has been executed successfully in live | Risk Level 1 - Low Risk | cm_edit_save_btn |

  @Sprint10
  Scenario Outline: Update in the Actual Date Fields gets audited in the Change Audit Log
    Given I am searching an existing change record "<Username>","<Password>","<Change ID>"
    And I am updating Actual Dates on the Change record "<Actual Start Date>","<Actual End Date>","<Save_Button>"
    When I request the "Actual Dates" update history from audit log
    Then Following Actual dates information is displayed in the audit history "<Username>","<Actual Start Date>","<Actual End Date>"
    And I click on the view button
    Then The corresponding actual date audit details will be displayed "<Username>","<Actual Start Date>","<Actual End Date>"
    And I logout and close the browser

    Examples: 
      | Username | Password | Change ID       | Actual Start Date    | Actual End Date      | Save_Button      |
      | rnaraya2 |        1 | CRQ000000249105 | 3/30/2017 5:30:00 PM | 3/30/2017 6:30:00 PM | cm_edit_save_btn |

  @Sprint10
  Scenario Outline: Update in the Change Coordinator Group gets audited in the Change Audit Log
    Given I am searching an existing change record "<Username>","<Password>","<Change ID>"
    And I am updating Coordinator Group on the Change record "<CoordinatorGroup>","<Save_Button>"
    When I request the "Change Coordinator Group" update history from audit log
    Then Following Coordinator Group information is displayed in the audit history "<Username>","<CoordinatorGroup>"
    And I click on the view button
    Then The corresponding coordinator group audit details will be displayed "<Username>","<CoordinatorGroup>"
    And I logout and close the browser

    Examples: 
      | Username | Password | Change ID       | Save_Button      | CoordinatorGroup      |
      | rnaraya2 |        1 | CRQ000000248955 | cm_edit_save_btn | BMR Programme Support |

  @Sprint10
  Scenario Outline: Update in the Change Manager Group gets audited in the Change Audit Log
    Given I am searching an existing change record "<Username>","<Password>","<Change ID>"
    And I am updating Manager Group on the Change record "<ManagerGroup>","<Save_Button>"
    When I request the "Change Manager Group" update history from audit log
    Then Following Manager Group information is displayed in the audit history "<Username>","<ManagerGroup>"
    And I click on the view button
    Then The corresponding Manager group audit details will be displayed "<Username>","<ManagerGroup>"
    And I logout and close the browser

    Examples: 
      | Username | Password | Change ID       | Save_Button      | ManagerGroup          |
      | rnaraya2 |        1 | CRQ000000248954 | cm_edit_save_btn | IT Programme Delivery |

  @Sprint10
  Scenario Outline: Update in the Change Class and Change Type gets audited in the Change Audit Log
    Given I am searching an existing change record "<Username>","<Password>","<Change ID>"
    And I am updating Change class and Type on the Change record "<Class>","<Type>","<TimingReason>","<Save_Button>"
    When I request the "Class" update history from audit log
    Then Following Change Class and Type information are displayed in the audit history "<Username>","<Class>","<Type>"
    And I click on the view button
    Then The corresponding Change Class and Type audit details will be displayed "<Username>","<Class>","<Type>"
    And I logout and close the browser

    Examples: 
      | Username | Password | Change ID       | Class     | Type       | TimingReason      | Save_Button      |
      | rnaraya2 |        1 | CRQ000000249104 | Expedited | Escalation | Scheduled in time | cm_edit_save_btn |

  @Sprint10
  Scenario Outline: Update in the Impact gets audited in the Change Audit Log
    Given I am searching an existing change record "<Username>","<Password>","<Change ID>"
    And I am updating Impact on the Change record "<Impact>","<Save_Button>"
    When I request the "Impact" update history from audit log
    Then Following Impact information is displayed in the audit history "<Username>","<Impact>"
    And I click on the view button
    Then The corresponding Impact audit details will be displayed "<Username>","<Impact>"
    And I logout and close the browser

    Examples: 
      | Username | Password | Change ID       | Impact              | Save_Button      |
      | rnaraya2 |        1 | CRQ000000248952 | 2-Significant/Large | cm_edit_save_btn |

  @Sprint10
  Scenario Outline: Update in the Product Categorization gets audited in the Change Audit Log
    Given I am searching an existing change record "<Username>","<Password>","<Change ID>"
    And I am updating Product Categorization on the Change record "<ProdCat1>","<ProdCat2>","<ProdCat3>","<Save_Button>"
    When I request the "Product Categorization" update history from audit log
    Then Following ProdCats information is displayed in the audit history "<Username>","<ProdCat1>","<ProdCat2>","<ProdCat3>"
    And I click on the view button
    Then The corresponding ProdCats audit details will be displayed "<Username>","<ProdCat1>","<ProdCat2>","<ProdCat3>"
    And I logout and close the browser

    Examples: 
      | Username | Password | Change ID       | ProdCat1 | ProdCat2          | ProdCat3 | Save_Button      |
      | rnaraya2 |        1 | CRQ000000248951 | Network  | Core Transmission | Circuit  | cm_edit_save_btn |

  @Sprint10
  Scenario Outline: Update in the Scheduled Date Fields gets audited in the Change Audit Log
    Given I am searching an existing change record "<Username>","<Password>","<Change ID>"
    And I am updating Scheduled Dates on the Change record "<Scheduled Start Date>","<Scheduled End Date>","<Save_Button>"
    When I request the "Scheduled Dates" update history from audit log
    Then Following Scheduled dates information is displayed in the audit history "<Username>","<Scheduled Start Date>","<Scheduled End Date>"
    And I click on the view button
    Then The corresponding scheduled date audit details will be displayed "<Username>","<Scheduled Start Date>","<Scheduled End Date>"
    And I logout and close the browser

    Examples: 
      | Username | Password | Change ID       | Scheduled Start Date | Scheduled End Date   | Save_Button      |
      | rnaraya2 |        1 | CRQ000000248949 | 3/30/2017 6:30:00 PM | 3/31/2017 6:30:00 PM | cm_edit_save_btn |

  @Sprint10
  Scenario Outline: Update in the Change Service gets audited in the Change Audit Log
    Given I am searching an existing change record "<Username>","<Password>","<Change ID>"
    And I am updating Service on the Change record "<Service>","<Save_Button>"
    When I request the "Service" update history from audit log
    Then Following Service information is displayed in the audit history "<Username>","<Service>"
    And I click on the view button
    Then The corresponding Service audit details will be displayed "<Username>","<Service>"
    And I logout and close the browser

    Examples: 
      | Username | Password | Change ID       | Save_Button      | Service |
      | rnaraya2 |        1 | CRQ000000248933 | cm_edit_save_btn | 2G      |

  @Sprint10
  Scenario Outline: Update in the Change Summary gets audited in the Change Audit Log
    Given I am searching an existing change record "<Username>","<Password>","<Change ID>"
    And I am updating Summary on the Change record "<Summary>","<Save_Button>"
    When I request the "Summary" update history from audit log
    Then Following Summary information is displayed in the audit history "<Username>","<Summary>"
    And I click on the view button
    Then The corresponding Summary audit details will be displayed "<Username>","<Summary>"
    And I logout and close the browser

    Examples: 
      | Username | Password | Change ID       | Save_Button      | Summary                  |
      | rnaraya2 |        1 | CRQ000000248929 | cm_edit_save_btn | Testing Summary Update 1 |
