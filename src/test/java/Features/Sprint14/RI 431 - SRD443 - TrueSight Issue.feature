Feature: As an ITSM user I want to be able to raise a service request to create an Incident for either Access, Functionality or Performance issues in the TrueSight application. I also want to be able to raise a service request to reset my TrueSight password.

  @Sprint14-RI431-Test1
  Scenario Outline: Raise Request to report a TrueSight Issue - Access Issue - Single User
    Given I am raising the Service Reqeust %TrueSight Issue% on behalf of an user "<Username>","<Password>","<RequestedForFullName>"
    And Test condition AccessIssue-SingleUser and provide all the mandatory details "<RequestedForLANID>","<RequestedForOUC>","<RequestedForLineManager>","<RequestedForEmail>","<RequestedForTelephoneNumber>","<RequestedForRole>","<TypeOfTrueSightIssue>","<AffectedUser>","<LoginPageAvailability>","<LoginSuccessfully>","<FirewallAccessIssue>","<AdditionalInformation>"
    When I submit the TrueSight Issue Serviec Request form
    Then the system will create a Incident Record to correct support group "<INCSummary>","<INCImpact>","<INCUrgency>","<INCPriority>","<INCSupportGroupName>","<INCCompany>","<INCOptCatTier1>","<INCOptCatTier2>","<INCProdCatTier1>","<INCProdCatTier2>","<INCProdCatTier3>","<INCProductName>"
    And the Incident record Notes field will contain all the details provided in the Service Request for condition AccessIssue-SingleUser "<RequestedForLANID>","<RequestedForOUC>","<RequestedForLineManager>","<RequestedForEmail>","<RequestedForTelephoneNumber>","<RequestedForRole>","<TypeOfTrueSightIssue>","<AffectedUser>","<LoginPageAvailability>","<LoginSuccessfully>","<FirewallAccessIssue>","<AdditionalInformation>"

    Examples: 
      | Username | Password | RequestedForFullName | RequestedForLANID | RequestedForOUC | RequestedForLineManager | RequestedForEmail       | RequestedForTelephoneNumber | RequestedForRole | TypeOfTrueSightIssue | AffectedUser | LoginPageAvailability | LoginSuccessfully | FirewallAccessIssue | AdditionalInformation   | INCSummary                         | INCImpact          | INCUrgency | INCPriority | INCSupportGroupName    | INCCompany    | INCOptCatTier1 | INCOptCatTier2 | INCProdCatTier1 | INCProdCatTier2 | INCProdCatTier3 | INCProductName |
      | snarasi1 | test     | Prashanth Dosala     | dosalap1          | TBC             | Kevin TRUNKFIELD        | Prashanth.Dosala@o2.com |                 07831581132 | Tester           | Access Issue         | single       | yes                   | no                | yes                 | Test additional details | TrueSight Access Issue Single User | 3-Moderate/Limited | 3-Medium   | Medium      | Truesight Support Team | TELEFONICA UK | Availability   | Access         | Application     | COTS            | Software        | Truesight      |

  @Sprint14-RI431-Test2
  Scenario Outline: Raise Request to report a TrueSight Issue - Access Issue - Multiple User
    Given I am raising the Service Reqeust %TrueSight Issue% on behalf of an user "<Username>","<Password>","<RequestedForFullName>"
    And Test condition AccessIssue-MultipleUser and provide all the mandatory details "<RequestedForLANID>","<RequestedForOUC>","<RequestedForLineManager>","<RequestedForEmail>","<RequestedForTelephoneNumber>","<RequestedForRole>","<TypeOfTrueSightIssue>","<AffectedUser>","<NumberOfUsersImpacted>","<LoginPageAvailability>","<LoginSuccessfully>","<FirewallAccessIssue>","<AdditionalInformation>"
    When I submit the TrueSight Issue Serviec Request form
    Then the system will create a Incident Record to correct support group "<INCSummary>","<INCImpact>","<INCUrgency>","<INCPriority>","<INCSupportGroupName>","<INCCompany>","<INCOptCatTier1>","<INCOptCatTier2>","<INCProdCatTier1>","<INCProdCatTier2>","<INCProdCatTier3>","<INCProductName>"
    And the Incident record Notes field will contain all the details provided in the Service Request for condition AccessIssue-MultipleUser "<RequestedForLANID>","<RequestedForOUC>","<RequestedForLineManager>","<RequestedForEmail>","<RequestedForTelephoneNumber>","<RequestedForRole>","<TypeOfTrueSightIssue>","<AffectedUser>","<NumberOfUsersImpacted>","<LoginPageAvailability>","<LoginSuccessfully>","<FirewallAccessIssue>","<AdditionalInformation>"

    Examples: 
      | Username | Password | RequestedForFullName | RequestedForLANID | RequestedForOUC | RequestedForLineManager | RequestedForEmail       | RequestedForTelephoneNumber | RequestedForRole | TypeOfTrueSightIssue | AffectedUser | NumberOfUsersImpacted | LoginPageAvailability | LoginSuccessfully | FirewallAccessIssue | AdditionalInformation   | INCSummary                            | INCImpact          | INCUrgency | INCPriority | INCSupportGroupName    | INCCompany    | INCOptCatTier1 | INCOptCatTier2 | INCProdCatTier1 | INCProdCatTier2 | INCProdCatTier3 | INCProductName |
      | snarasi1 | test     | Prashanth Dosala     | dosalap1          | TBC             | Kevin TRUNKFIELD        | Prashanth.Dosala@o2.com |                 07831581132 | Tester           | Access Issue         | multiple     | Ten                   | no                    | yes               | no                  | Test additional details | TrueSight Access Issue Multiple Users | 3-Moderate/Limited | 2-High     | Medium      | Truesight Support Team | TELEFONICA UK | Availability   | Access         | Application     | COTS            | Software        | Truesight      |

  @Sprint14-RI431-Test3
  Scenario Outline: Raise Request to report a TrueSight Issue - Functionality Issue - Single User
    Given I am raising the Service Reqeust %TrueSight Issue% on behalf of an user "<Username>","<Password>","<RequestedForFullName>"
    And Test condition FunctionalityIssue-SingleUser and provide all the mandatory details "<RequestedForLANID>","<RequestedForOUC>","<RequestedForLineManager>","<RequestedForEmail>","<RequestedForTelephoneNumber>","<RequestedForRole>","<TypeOfTrueSightIssue>","<AffectedUser>","<IssueDescription>"
    When I submit the TrueSight Issue Serviec Request form
    Then the system will create a Incident Record to correct support group "<INCSummary>","<INCImpact>","<INCUrgency>","<INCPriority>","<INCSupportGroupName>","<INCCompany>","<INCOptCatTier1>","<INCOptCatTier2>","<INCProdCatTier1>","<INCProdCatTier2>","<INCProdCatTier3>","<INCProductName>"
    And the Incident record Notes field will contain all the details provided in the Service Request for condition FunctionalityIssue-SingleUser "<RequestedForLANID>","<RequestedForOUC>","<RequestedForLineManager>","<RequestedForEmail>","<RequestedForTelephoneNumber>","<RequestedForRole>","<TypeOfTrueSightIssue>","<AffectedUser>","<IssueDescription>"

    Examples: 
      | Username | Password | RequestedForFullName | RequestedForLANID | RequestedForOUC | RequestedForLineManager | RequestedForEmail       | RequestedForTelephoneNumber | RequestedForRole | TypeOfTrueSightIssue | AffectedUser | IssueDescription        | INCSummary                                | INCImpact          | INCUrgency | INCPriority | INCSupportGroupName    | INCCompany    | INCOptCatTier1 | INCOptCatTier2 | INCProdCatTier1 | INCProdCatTier2 | INCProdCatTier3 | INCProductName |
      | snarasi1 | test     | Prashanth Dosala     | dosalap1          | TBC             | Kevin TRUNKFIELD        | Prashanth.Dosala@o2.com |                 07831581132 | Tester           | Functionality Issue  | single       | Test additional details | TrueSight Functionality Issue Single User | 3-Moderate/Limited | 3-Medium   | Medium      | Truesight Support Team | TELEFONICA UK | Quality        | Connectivity   | Application     | COTS            | Software        | Truesight      |

  @Sprint14-RI431-Test4
  Scenario Outline: Raise Request to report a TrueSight Issue - Functionality Issue - Multiple User
    Given I am raising the Service Reqeust %TrueSight Issue% on behalf of an user "<Username>","<Password>","<RequestedForFullName>"
    And Test condition FunctionalityIssue-MultipleUser and provide all the mandatory details "<RequestedForLANID>","<RequestedForOUC>","<RequestedForLineManager>","<RequestedForEmail>","<RequestedForTelephoneNumber>","<RequestedForRole>","<TypeOfTrueSightIssue>","<AffectedUser>","<NumberOfUsersImpacted>","<IssueDescription>"
    When I submit the TrueSight Issue Serviec Request form
    Then the system will create a Incident Record to correct support group "<INCSummary>","<INCImpact>","<INCUrgency>","<INCPriority>","<INCSupportGroupName>","<INCCompany>","<INCOptCatTier1>","<INCOptCatTier2>","<INCProdCatTier1>","<INCProdCatTier2>","<INCProdCatTier3>","<INCProductName>"
    And the Incident record Notes field will contain all the details provided in the Service Request for condition FunctionalityIssue-MultipleUser "<RequestedForLANID>","<RequestedForOUC>","<RequestedForLineManager>","<RequestedForEmail>","<RequestedForTelephoneNumber>","<RequestedForRole>","<TypeOfTrueSightIssue>","<AffectedUser>","<NumberOfUsersImpacted>","<IssueDescription>"

    Examples: 
      | Username | Password | RequestedForFullName | RequestedForLANID | RequestedForOUC | RequestedForLineManager | RequestedForEmail       | RequestedForTelephoneNumber | RequestedForRole | TypeOfTrueSightIssue | AffectedUser | NumberOfUsersImpacted | IssueDescription        | INCSummary                                   | INCImpact          | INCUrgency | INCPriority | INCSupportGroupName    | INCCompany    | INCOptCatTier1 | INCOptCatTier2 | INCProdCatTier1 | INCProdCatTier2 | INCProdCatTier3 | INCProductName |
      | snarasi1 | test     | Prashanth Dosala     | dosalap1          | TBC             | Kevin TRUNKFIELD        | Prashanth.Dosala@o2.com |                 07831581132 | Tester           | Functionality Issue  | multiple     | Ten                   | Test additional details | TrueSight Functionality Issue Multiple Users | 3-Moderate/Limited | 2-High     | Medium      | Truesight Support Team | TELEFONICA UK | Quality        | Connectivity   | Application     | COTS            | Software        | Truesight      |

  @Sprint14-RI431-Test5
  Scenario Outline: Raise Request to report a TrueSight Issue - Performance Issue - Single User
    Given I am raising the Service Reqeust %TrueSight Issue% on behalf of an user "<Username>","<Password>","<RequestedForFullName>"
    And Test condition PerformanceIssue-SingleUser and provide all the mandatory details "<RequestedForLANID>","<RequestedForOUC>","<RequestedForLineManager>","<RequestedForEmail>","<RequestedForTelephoneNumber>","<RequestedForRole>","<TypeOfTrueSightIssue>","<AffectedUser>","<IssueDescription>"
    When I submit the TrueSight Issue Serviec Request form
    Then the system will create a Incident Record to correct support group "<INCSummary>","<INCImpact>","<INCUrgency>","<INCPriority>","<INCSupportGroupName>","<INCCompany>","<INCOptCatTier1>","<INCOptCatTier2>","<INCProdCatTier1>","<INCProdCatTier2>","<INCProdCatTier3>","<INCProductName>"
    And the Incident record Notes field will contain all the details provided in the Service Request for condition PerformanceIssue-SingleUser "<RequestedForLANID>","<RequestedForOUC>","<RequestedForLineManager>","<RequestedForEmail>","<RequestedForTelephoneNumber>","<RequestedForRole>","<TypeOfTrueSightIssue>","<AffectedUser>","<IssueDescription>"

    Examples: 
      | Username | Password | RequestedForFullName | RequestedForLANID | RequestedForOUC | RequestedForLineManager | RequestedForEmail       | RequestedForTelephoneNumber | RequestedForRole | TypeOfTrueSightIssue | AffectedUser | IssueDescription        | INCSummary                              | INCImpact          | INCUrgency | INCPriority | INCSupportGroupName | INCCompany    | INCOptCatTier1 | INCOptCatTier2 | INCProdCatTier1 | INCProdCatTier2 | INCProdCatTier3 | INCProductName |
      | snarasi1 | test     | Prashanth Dosala     | dosalap1          | TBC             | Kevin TRUNKFIELD        | Prashanth.Dosala@o2.com |                 07831581132 | Tester           | Performance Issue    | single       | Test additional details | TrueSight Performance Issue Single User | 3-Moderate/Limited | 3-Medium   | Medium      | IT Platforms        | TELEFONICA UK | Performance    | Degraded       | Application     | COTS            | Software        | Truesight      |

  @Sprint14-RI431-Test6
  Scenario Outline: Raise Request to report a TrueSight Issue - Performance Issue - Multiple User
    Given I am raising the Service Reqeust %TrueSight Issue% on behalf of an user "<Username>","<Password>","<RequestedForFullName>"
    And Test condition PerformanceIssue-MultipleUser and provide all the mandatory details "<RequestedForLANID>","<RequestedForOUC>","<RequestedForLineManager>","<RequestedForEmail>","<RequestedForTelephoneNumber>","<RequestedForRole>","<TypeOfTrueSightIssue>","<AffectedUser>","<NumberOfUsersImpacted>","<IssueDescription>"
    When I submit the TrueSight Issue Serviec Request form
    Then the system will create a Incident Record to correct support group "<INCSummary>","<INCImpact>","<INCUrgency>","<INCPriority>","<INCSupportGroupName>","<INCCompany>","<INCOptCatTier1>","<INCOptCatTier2>","<INCProdCatTier1>","<INCProdCatTier2>","<INCProdCatTier3>","<INCProductName>"
    And the Incident record Notes field will contain all the details provided in the Service Request for condition PerformanceIssue-MultipleUser "<RequestedForLANID>","<RequestedForOUC>","<RequestedForLineManager>","<RequestedForEmail>","<RequestedForTelephoneNumber>","<RequestedForRole>","<TypeOfTrueSightIssue>","<AffectedUser>","<NumberOfUsersImpacted>","<IssueDescription>"

    Examples: 
      | Username | Password | RequestedForFullName | RequestedForLANID | RequestedForOUC | RequestedForLineManager | RequestedForEmail       | RequestedForTelephoneNumber | RequestedForRole | TypeOfTrueSightIssue | AffectedUser | NumberOfUsersImpacted | IssueDescription        | INCSummary                                 | INCImpact          | INCUrgency | INCPriority | INCSupportGroupName | INCCompany    | INCOptCatTier1 | INCOptCatTier2 | INCProdCatTier1 | INCProdCatTier2 | INCProdCatTier3 | INCProductName |
      | snarasi1 | test     | Prashanth Dosala     | dosalap1          | TBC             | Kevin TRUNKFIELD        | Prashanth.Dosala@o2.com |                 07831581132 | Tester           | Performance Issue    | multiple     | Ten                   | Test additional details | TrueSight Performance Issue Multiple Users | 3-Moderate/Limited | 2-High     | Medium      | IT Platforms        | TELEFONICA UK | Performance    | Degraded       | Application     | COTS            | Software        | Truesight      |

  @Sprint14-RI431-Test7
  Scenario Outline: Raise Request to report a TrueSight Issue - Password Reset
    Given I am raising the Service Reqeust %TrueSight Issue% on behalf of an user "<Username>","<Password>","<RequestedForFullName>"
    And Test condition Password Reset and provide all the mandatory details "<RequestedForLANID>","<RequestedForOUC>","<RequestedForLineManager>","<RequestedForEmail>","<RequestedForTelephoneNumber>","<RequestedForRole>","<TypeOfTrueSightIssue>","<TrueSightUserID>"
    When I submit the TrueSight Issue Serviec Request form
    Then the system will create a Work Order to correct support group "<WOSummary>","<WOPriority>","<WOSupportGroupName>","<WOCompany>","<WOOptCatTier1>","<WOOptCatTier2>","<WOOptCatTier3>","<WOProdCatTier1>","<WOProdCatTier2>","<WOProdCatTier3>","<WOProductName>"
    And the WorkOrder Notes field will contain all the details provided in the Service Request for condition Password Reset "<RequestedForLANID>","<RequestedForOUC>","<RequestedForLineManager>","<RequestedForEmail>","<RequestedForTelephoneNumber>","<RequestedForRole>","<TypeOfTrueSightIssue>","<TrueSightUserID>"

    Examples: 
      | Username | Password | RequestedForFullName | RequestedForLANID | RequestedForOUC | RequestedForLineManager | RequestedForEmail       | RequestedForTelephoneNumber | RequestedForRole | TypeOfTrueSightIssue | TrueSightUserID | WOSummary                | WOPriority | WOSupportGroupName     | WOCompany     | WOOptCatTier1 | WOOptCatTier2    | WOOptCatTier3  | WOProdCatTier1 | WOProdCatTier2 | WOProdCatTier3 | WOProductName |
      | snarasi1 | test     | Prashanth Dosala     | dosalap1          | TBC             | Kevin TRUNKFIELD        | Prashanth.Dosala@o2.com |                 07831581132 | Tester           | Password Reset       | snarasi1        | TrueSight Password Reset | Low        | Truesight Support Team | TELEFONICA UK | Modify        | Access/System ID | Password Reset | Application    | COTS           | Software       | Truesight     |
