Feature: As an Incident Handler I want the Restored Date to be auto populated if blank with the Last Resolved Date when the Incident is "Resolved" so that it is clear when the Service is Restored. The Restored Date field should be made read-only when the Incident is in the "Resolved", "Closed" or "Cancelled" State.

 @Sprint11-Test1
  Scenario Outline: Restored Date is Read Only at Resolved Status and populated with Last Resolved Date, if NOT populated manually before resolving
    Given An incident is not Resolved and Restore Date is NOT set "<Username>","<Password>","<Incident ID>","<Initial Status>"
    When an Incident is set to status Resolved "<Resolution>","<CI+ Detail>","<Status Reason>"
    Then Restored Date is set to the Last Resolved Date and displayed as read-only

    Examples: 
      | Username | Password | Incident ID     | Resolution      | CI+ Detail  | Initial Status | Status Reason                        |
      | rnaraya2 |        1 | INC000000332068 | Test Resolution | [ts] 2g ran | In Progress    | Resolved, no further action required |

  @Done
  Scenario Outline: Restored Date is Read Only at Resolved Status and same as user entered, if populated manually before resolving
    Given An incident is not Resolved and Restore Date set manually "<Username>","<Password>","<Incident ID>","<RestoredDate>"
    When an Incident is set to status Resolved "<Resolution>","<CI+ Detail>","<Status Reason>"
    Then Restored Date field is read-only and same as user entered "<RestoredDate>"

    Examples: 
      | Username | Password | Incident ID     | Resolution      | CI+ Detail  | Status Reason                        | RestoredDate         |
      | rnaraya2 |        1 | INC000000330046 | Test Resolution | [ts] 2g ran | Resolved, no further action required | 4/12/2017 8:30:00 PM |

  @Done
  Scenario Outline: Restored Date is Read Only and same as Last Resolved Date/as User defined when status updated from Resolved to Closed
    Given An incident is in Resolved status with Restore Date "<Username>","<Password>","<Incident ID>","<Initial Status>"
    When an incident is progressed to Closed status from Resolved "<Status>","<Status Reason>"
    Then Restored date is read only and not NULL

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Status | Status Reason   |
      | rnaraya2 |        1 | INC000000330046 | Resolved       | Closed | User compliance |

  @Done
  Scenario Outline: Restored Date is Read Only and same as Last Resolved Date when status updated from Assigned/InProgress to Closed
    Given An incident is not Resolved and Restore Date is NOT set "<Username>","<Password>","<Incident ID>","<Initial Status>"
    When an incident is progressed to Closed status from Assigned/InProgress "<Status>","<Assignee>","<Resolution>","<CI+ Detail>"
    Then Restored Date is set to the Last Resolved Date and displayed as read-only

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Status | Resolution      | CI+ Detail  | Assignee          |
      | rnaraya2 |        1 | INC000000330046 | Assigned       | Closed | Test Resolution | [ts] 2g ran | Rukmini Narayanan |

  @Done
  Scenario Outline: Restored Date is Read Only at Cancelled Status and same as User defined (if populated manually before cancellation)
    Given An incident is not Resolved and Restore Date set manually "<Username>","<Password>","<Incident ID>","<Initial Status>","<RestoredDate>"
    When an incident is progressed to Cancelled status from Assigned/InProgress "<Status>","<Cancel Reason>"
    Then Restored Date field is read-only and same as user entered "<RestoredDate>"

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Status    | RestoredDate         | Cancel Reason         |
      | rnaraya2 |        1 | INC000000330046 | Assigned       | Cancelled | 4/12/2017 8:30:00 PM | No longer a Causal CI |

  @Done
  Scenario Outline: Restored Date is Read Only at Cancelled Status and will be NULL (if not populated manually before cancellation)
    Given An incident is not Resolved and Restore Date is NOT set "<Username>","<Password>","<Incident ID>","<Initial Status>"
    When an incident is progressed to Cancelled status from Assigned/InProgress "<Status>","<Cancel Reason>"
    Then Restored Date is set to NULL and displayed as read-only

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Status | Status Reason   |
      | rnaraya2 |        1 | INC000000330046 | Assigned       | Closed | User compliance |
@Done
  Scenario Outline: Restored Date becomes editable(NULL) and Last Resolved Date as ReadOnly (NULL) when we reopen an incident from Resolved status
    Given An incident is in Resolved status with Restore Date "<Username>","<Password>","<Incident ID>","<Initial Status>"
    When the Incident is re-opened "<Status>"
    Then Restored Date becomes editable(NULL) and Last Resolved Date becomes ReadOnly(NULL)

    Examples: 
      | Username | Password | Incident ID     | Initial Status | Status      |
      | rnaraya2 |        1 | INC000000330046 | Resolved       | In Progress |
