Feature: As an ITSM user I want to be able to raise a service request to create, amend or remove TrueSight roles on behalf of another user.

  @Sprint14-RI430-Test1
  Scenario Outline: Raise Request to Add (or) Modify (or) Remove access to TrueSight where Organisation!=Other and Status=Permanent (or) Contractor
    Given I am raising the Service Reqeust %TrueSight ID Request% on behalf of an user "<Username>","<Password>","<RequestedForFullName>"
    And Test condition Organisation!=Other and Status=Permanent/Contractor "<RequesterEmail>","<RequesterTelephoneNumber>","<RequesterGrade>","<RequestedForLANID>","<RequestedForOUC>","<RequestedForEIN>","<RequestedForLineManager>","<RequestedForLocation>","<RequestedForEmail>","<RequestedForTelephoneNumber>","<RequestedForDepartment>","<Organisation>","<TeamName>","<RoleName>","<Grade>","<Status>"
    When I select "<TypeOfRequest>" and provide all other mandatory details "<Status>"
    And I submit the TrueSightID Serviec Request form
    Then the system will create a Work Order to correct support group "<WOSummary>","<WOPriority>","<WOSupportGroupName>","<WOCompany>","<WOOptCatTier1>","<WOOptCatTier2>","<WOOptCatTier3>","<WOProdCatTier1>","<WOProdCatTier2>","<WOProdCatTier3>","<WOProductName>"
    And the Work Order Notes field will contain all the details provided in the Service Request for condition Organisation!=Other and Status=Permanent/Contractor "<RequesterEmail>","<RequesterTelephoneNumber>","<RequesterGrade>","<RequestedForLANID>","<RequestedForOUC>","<RequestedForEIN>","<RequestedForLineManager>","<RequestedForLocation>","<RequestedForEmail>","<RequestedForTelephoneNumber>","<RequestedForDepartment>","<Organisation>","<TeamName>","<RoleName>","<Grade>","<Status>","<TypeOfRequest>"

    Examples: 
      | Username | Password | RequestedForFullName | RequesterEmail                 | RequesterTelephoneNumber | RequesterGrade | RequestedForLANID | RequestedForOUC | RequestedForEIN | RequestedForLineManager | RequestedForLocation | RequestedForEmail       | RequestedForTelephoneNumber | RequestedForDepartment | Organisation | TeamName | RoleName | Grade       | Status    | TypeOfRequest | WOSummary          | WOPriority | WOSupportGroupName  | WOCompany     | WOOptCatTier1 | WOOptCatTier2    | WOOptCatTier3 | WOProdCatTier1 | WOProdCatTier2 | WOProdCatTier3 | WOProductName |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | MPG2           | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Capita       | Testing  | Tester   | TestAnalyst | Permanent | New Role      | TrueSight New Role | Low        | Identity Management | TELEFONICA UK | Add           | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |

  @Sprint14-RI430-Test2
  Scenario Outline: Raise Request to Add (or) Modify (or) Remove access to TrueSight where Organisation=Other and Status=Permanent (or) Contractor
    Given I am raising the Service Reqeust %TrueSight ID Request% on behalf of an user "<Username>","<Password>","<RequestedForFullName>"
    And Test condition Organisation=Other and Status=Permanent/Contractor "<RequesterEmail>","<RequesterTelephoneNumber>","<RequesterGrade>","<RequestedForLANID>","<RequestedForOUC>","<RequestedForEIN>","<RequestedForLineManager>","<RequestedForLocation>","<RequestedForEmail>","<RequestedForTelephoneNumber>","<RequestedForDepartment>","<Organisation>","<OrganisationDetails>","<TeamName>","<RoleName>","<Grade>","<Status>"
    When I select "<TypeOfRequest>" and provide all other mandatory details "<Status>"
    And I submit the TrueSightID Serviec Request form
    Then the system will create a Work Order to correct support group "<WOSummary>","<WOPriority>","<WOSupportGroupName>","<WOCompany>","<WOOptCatTier1>","<WOOptCatTier2>","<WOOptCatTier3>","<WOProdCatTier1>","<WOProdCatTier2>","<WOProdCatTier3>","<WOProductName>"
    And the Work Order Notes field will contain all the details provided in the Service Request for condition Organisation=Other and Status=Permanent/Contractor "<RequesterEmail>","<RequesterTelephoneNumber>","<RequesterGrade>","<RequestedForLANID>","<RequestedForOUC>","<RequestedForEIN>","<RequestedForLineManager>","<RequestedForLocation>","<RequestedForEmail>","<RequestedForTelephoneNumber>","<RequestedForDepartment>","<Organisation>","<OrganisationDetails>","<TeamName>","<RoleName>","<Grade>","<Status>","<TypeOfRequest>"

    Examples: 
      | Username | Password | RequestedForFullName | RequesterEmail                 | RequesterTelephoneNumber | RequesterGrade | RequestedForLANID | RequestedForOUC | RequestedForEIN | RequestedForLineManager | RequestedForLocation | RequestedForEmail       | RequestedForTelephoneNumber | RequestedForDepartment | Organisation | OrganisationDetails | TeamName | RoleName | Grade       | Status     | TypeOfRequest | WOSummary             | WOPriority | WOSupportGroupName  | WOCompany     | WOOptCatTier1 | WOOptCatTier2    | WOOptCatTier3 | WOProdCatTier1 | WOProdCatTier2 | WOProdCatTier3 | WOProductName |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | PSG5           | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Other        | NTTData             | Testing  | Tester   | TestAnalyst | Permanent  | New Role      | TrueSight New Role    | Low        | Identity Management | TELEFONICA UK | Add           | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | PSG6           | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Other        | NTTData             | Testing  | Tester   | TestAnalyst | Permanent  | Modify Role   | TrueSight Modify Role | Low        | Identity Management | TELEFONICA UK | Modify        | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | PSGB           | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Other        | NTTData             | Testing  | Tester   | TestAnalyst | Permanent  | Remove Role   | TrueSight Remove Role | Low        | Identity Management | TELEFONICA UK | Remove        | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | PSGD           | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Other        | NTTData             | Testing  | Tester   | TestAnalyst | Contractor | New Role      | TrueSight New Role    | Low        | Identity Management | TELEFONICA UK | Add           | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | PTG            | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Other        | NTTData             | Testing  | Tester   | TestAnalyst | Contractor | Modify Role   | TrueSight Modify Role | Low        | Identity Management | TELEFONICA UK | Modify        | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | RCG/P          | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Other        | NTTData             | Testing  | Tester   | TestAnalyst | Contractor | Remove Role   | TrueSight Remove Role | Low        | Identity Management | TELEFONICA UK | Remove        | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |

  @Sprint14-RI430-Test3
  Scenario Outline: Raise Request to Add (or) Modify (or) Remove access to TrueSight where Organisation!=Other and Status=Workpackage/3rd Party
    Given I am raising the Service Reqeust %TrueSight ID Request% on behalf of an user "<Username>","<Password>","<RequestedForFullName>"
    And Test condition Organisation!=Other and Status=Workpackage/3rd Party "<RequesterEmail>","<RequesterTelephoneNumber>","<RequesterGrade>","<RequestedForLANID>","<RequestedForOUC>","<RequestedForEIN>","<RequestedForLineManager>","<RequestedForLocation>","<RequestedForEmail>","<RequestedForTelephoneNumber>","<RequestedForDepartment>","<Organisation>","<TeamName>","<RoleName>","<Grade>","<Status>","<ManagedServiceProvider>"
    When I select "<TypeOfRequest>" and provide all other mandatory details "<Status>"
    And I submit the TrueSightID Serviec Request form
    Then the system will create a Work Order to correct support group "<WOSummary>","<WOPriority>","<WOSupportGroupName>","<WOCompany>","<WOOptCatTier1>","<WOOptCatTier2>","<WOOptCatTier3>","<WOProdCatTier1>","<WOProdCatTier2>","<WOProdCatTier3>","<WOProductName>"
    And the Work Order Notes field will contain all the details provided in the Service Request for condition Organisation!=Other and Status=Workpackage/3rd Party "<RequesterEmail>","<RequesterTelephoneNumber>","<RequesterGrade>","<RequestedForLANID>","<RequestedForOUC>","<RequestedForEIN>","<RequestedForLineManager>","<RequestedForLocation>","<RequestedForEmail>","<RequestedForTelephoneNumber>","<RequestedForDepartment>","<Organisation>","<TeamName>","<RoleName>","<Grade>","<Status>","<ManagedServiceProvider>","<TypeOfRequest>"

    Examples: 
      | Username | Password | RequestedForFullName | RequesterEmail                 | RequesterTelephoneNumber | RequesterGrade | RequestedForLANID | RequestedForOUC | RequestedForEIN | RequestedForLineManager | RequestedForLocation | RequestedForEmail       | RequestedForTelephoneNumber | RequestedForDepartment | Organisation       | TeamName | RoleName | Grade       | Status                | ManagedServiceProvider | TypeOfRequest | WOSummary             | WOPriority | WOSupportGroupName  | WOCompany     | WOOptCatTier1 | WOOptCatTier2    | WOOptCatTier3 | WOProdCatTier1 | WOProdCatTier2 | WOProdCatTier3 | WOProductName |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | PSGB           | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Cornerstone        | Testing  | Tester   | TestAnalyst | Workpackage/3rd Party | NTTData UK LTD         | New Role      | TrueSight New Role    | Low        | Identity Management | TELEFONICA UK | Add           | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | PSGD           | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Cornerstone        | Testing  | Tester   | TestAnalyst | Workpackage/3rd Party | NTTData UK LTD         | Modify Role   | TrueSight Modify Role | Low        | Identity Management | TELEFONICA UK | Modify        | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | PTG            | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Cornerstone        | Testing  | Tester   | TestAnalyst | Workpackage/3rd Party | NTTData UK LTD         | Remove Role   | TrueSight Remove Role | Low        | Identity Management | TELEFONICA UK | Remove        | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | RCGS/30        | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Telefonica Digital | Testing  | Tester   | TestAnalyst | Workpackage/3rd Party | NTTData UK LTD         | New Role      | TrueSight New Role    | Low        | Identity Management | TELEFONICA UK | Add           | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | MPG2           | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Telefonica Digital | Testing  | Tester   | TestAnalyst | Workpackage/3rd Party | NTTData UK LTD         | Modify Role   | TrueSight Modify Role | Low        | Identity Management | TELEFONICA UK | Modify        | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | MPG4           | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Telefonica Digital | Testing  | Tester   | TestAnalyst | Workpackage/3rd Party | NTTData UK LTD         | Remove Role   | TrueSight Remove Role | Low        | Identity Management | TELEFONICA UK | Remove        | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | PCGU           | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Telefonica HQ      | Testing  | Tester   | TestAnalyst | Workpackage/3rd Party | NTTData UK LTD         | New Role      | TrueSight New Role    | Low        | Identity Management | TELEFONICA UK | Add           | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | PSG1           | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Telefonica HQ      | Testing  | Tester   | TestAnalyst | Workpackage/3rd Party | NTTData UK LTD         | Modify Role   | TrueSight Modify Role | Low        | Identity Management | TELEFONICA UK | Modify        | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | PSG2           | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Telefonica HQ      | Testing  | Tester   | TestAnalyst | Workpackage/3rd Party | NTTData UK LTD         | Remove Role   | TrueSight Remove Role | Low        | Identity Management | TELEFONICA UK | Remove        | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | PTG            | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Telefonica UK      | Testing  | Tester   | TestAnalyst | Workpackage/3rd Party | NTTData UK LTD         | New Role      | TrueSight New Role    | Low        | Identity Management | TELEFONICA UK | Add           | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | RCG/P          | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Telefonica UK      | Testing  | Tester   | TestAnalyst | Workpackage/3rd Party | NTTData UK LTD         | Modify Role   | TrueSight Modify Role | Low        | Identity Management | TELEFONICA UK | Modify        | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | RCGS/1         | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Telefonica UK      | Testing  | Tester   | TestAnalyst | Workpackage/3rd Party | NTTData UK LTD         | Remove Role   | TrueSight Remove Role | Low        | Identity Management | TELEFONICA UK | Remove        | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | MPG4           | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | TGT                | Testing  | Tester   | TestAnalyst | Workpackage/3rd Party | NTTData UK LTD         | New Role      | TrueSight New Role    | Low        | Identity Management | TELEFONICA UK | Add           | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | Nominee        | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | TGT                | Testing  | Tester   | TestAnalyst | Workpackage/3rd Party | NTTData UK LTD         | Modify Role   | TrueSight Modify Role | Low        | Identity Management | TELEFONICA UK | Modify        | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | PA             | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | TGT                | Testing  | Tester   | TestAnalyst | Workpackage/3rd Party | NTTData UK LTD         | Remove Role   | TrueSight Remove Role | Low        | Identity Management | TELEFONICA UK | Remove        | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | PSG2           | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Unify              | Testing  | Tester   | TestAnalyst | Workpackage/3rd Party | NTTData UK LTD         | New Role      | TrueSight New Role    | Low        | Identity Management | TELEFONICA UK | Add           | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | PSG3           | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Unify              | Testing  | Tester   | TestAnalyst | Workpackage/3rd Party | NTTData UK LTD         | Modify Role   | TrueSight Modify Role | Low        | Identity Management | TELEFONICA UK | Modify        | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | PSG4           | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Unify              | Testing  | Tester   | TestAnalyst | Workpackage/3rd Party | NTTData UK LTD         | Remove Role   | TrueSight Remove Role | Low        | Identity Management | TELEFONICA UK | Remove        | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |

  @Sprint14-RI430-Test4
  Scenario Outline: Raise Request to Add (or) Modify (or) Remove access to TrueSight where Organisation=Other and Status=Workpackage/3rd Party
    Given I am raising the Service Reqeust %TrueSight ID Request% on behalf of an user "<Username>","<Password>","<RequestedForFullName>"
    And Test condition Organisation=Other and Status=Workpackage/3rd Party "<RequesterEmail>","<RequesterTelephoneNumber>","<RequesterGrade>","<RequestedForLANID>","<RequestedForOUC>","<RequestedForEIN>","<RequestedForLineManager>","<RequestedForLocation>","<RequestedForEmail>","<RequestedForTelephoneNumber>","<RequestedForDepartment>","<Organisation>","<OrganisationDetails>","<TeamName>","<RoleName>","<Grade>","<Status>","<ManagedServiceProvider>"
    When I select "<TypeOfRequest>" and provide all other mandatory details "<Status>"
    And I submit the TrueSightID Serviec Request form
    Then the system will create a Work Order to correct support group "<WOSummary>","<WOPriority>","<WOSupportGroupName>","<WOCompany>","<WOOptCatTier1>","<WOOptCatTier2>","<WOOptCatTier3>","<WOProdCatTier1>","<WOProdCatTier2>","<WOProdCatTier3>","<WOProductName>"
    And the Work Order Notes field will contain all the details provided in the Service Request for condition Organisation=Other and Status=Workpackage/3rd Party "<RequesterEmail>","<RequesterTelephoneNumber>","<RequesterGrade>","<RequestedForLANID>","<RequestedForOUC>","<RequestedForEIN>","<RequestedForLineManager>","<RequestedForLocation>","<RequestedForEmail>","<RequestedForTelephoneNumber>","<RequestedForDepartment>","<Organisation>","<OrganisationDetails>","<TeamName>","<RoleName>","<Grade>","<Status>","<ManagedServiceProvider>","<TypeOfRequest>"

    Examples: 
      | Username | Password | RequestedForFullName | RequesterEmail                 | RequesterTelephoneNumber | RequesterGrade | RequestedForLANID | RequestedForOUC | RequestedForEIN | RequestedForLineManager | RequestedForLocation | RequestedForEmail       | RequestedForTelephoneNumber | RequestedForDepartment | Organisation | OrganisationDetails | TeamName | RoleName | Grade       | Status                | ManagedServiceProvider | TypeOfRequest | WOSummary             | WOPriority | WOSupportGroupName  | WOCompany     | WOOptCatTier1 | WOOptCatTier2    | WOOptCatTier3 | WOProdCatTier1 | WOProdCatTier2 | WOProdCatTier3 | WOProductName |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | RCGS/1         | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Other        | NTTData             | Testing  | Tester   | TestAnalyst | Workpackage/3rd Party | NTTData UK LTD         | New Role      | TrueSight New Role    | Low        | Identity Management | TELEFONICA UK | Add           | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | RCGS/10        | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Other        | NTTData             | Testing  | Tester   | TestAnalyst | Workpackage/3rd Party | NTTData UK LTD         | Modify Role   | TrueSight Modify Role | Low        | Identity Management | TELEFONICA UK | Modify        | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
      | snarasi1 | test     | Prashanth Dosala     | Sharmendiran.Narasimhan@O2.COM |              07720869911 | RCGS/2         | dosalap1          | TBC             |       810965841 | Kevin TRUNKFIELD        | Bath Road            | Prashanth.Dosala@o2.com |                 07831581132 | TBC                    | Other        | NTTData             | Testing  | Tester   | TestAnalyst | Workpackage/3rd Party | NTTData UK LTD         | Remove Role   | TrueSight Remove Role | Low        | Identity Management | TELEFONICA UK | Remove        | Access/System ID | Single        | Application    | COTS           | Software       | Truesight     |
