$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Sprint15/RI 469-RI 470-RI 471-SRD to Create and Update Change Templates.feature");
formatter.feature({
  "line": 1,
  "name": "As a user of ITSM I want to be able to raise a service request to Create or Modify existing Change Management templates.",
  "description": "",
  "id": "as-a-user-of-itsm-i-want-to-be-able-to-raise-a-service-request-to-create-or-modify-existing-change-management-templates.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 199,
  "name": "Request to remove a change template",
  "description": "",
  "id": "as-a-user-of-itsm-i-want-to-be-able-to-raise-a-service-request-to-create-or-modify-existing-change-management-templates.;request-to-remove-a-change-template",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 198,
      "name": "@Sprint15-RI469-RI470-RI471-Test16"
    }
  ]
});
formatter.step({
  "line": 200,
  "name": "I navigate to Change Template Request Form \"\u003cUsername\u003e\",\"\u003cPassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 201,
  "name": "I am requesting to remove a change template \"\u003cLANID\u003e\",\"\u003cOUC\u003e\",\"\u003cEmail\u003e\",\"\u003cContactNumber\u003e\",\"\u003cManagerName\u003e\",\"\u003cRequestType\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 202,
  "name": "I enter the template details for removal \"\u003cTemplateName\u003e\",\"\u003cJustificationForRemoval\u003e\",\"\u003cChgMgmtGrpTemplateRelateTo\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 203,
  "name": "submit the Change Template service request form",
  "keyword": "And "
});
formatter.step({
  "line": 204,
  "name": "the system will create a Work Order to Change Management \"\u003cWOSummary\u003e\",\"\u003cWOPriority\u003e\",\"\u003cWOSupportGroupName\u003e\",\"\u003cWOCompany\u003e\",\"\u003cWOOptCatTier1\u003e\",\"\u003cWOOptCatTier2\u003e\",\"\u003cWOOptCatTier3\u003e\",\"\u003cWOProdCatTier1\u003e\",\"\u003cWOProdCatTier2\u003e\",\"\u003cWOProdCatTier3\u003e\",\"\u003cWOProductName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 205,
  "name": "the Work Order Notes field will contain all the details provided in the Service Request for Remove an existing Change Template \"\u003cLANID\u003e\",\"\u003cOUC\u003e\",\"\u003cEmail\u003e\",\"\u003cContactNumber\u003e\",\"\u003cManagerName\u003e\",\"\u003cRequestType\u003e\",\"\u003cTemplateName\u003e\",\"\u003cJustificationForRemoval\u003e\",\"\u003cChgMgmtGrpTemplateRelateTo\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 207,
  "name": "",
  "description": "",
  "id": "as-a-user-of-itsm-i-want-to-be-able-to-raise-a-service-request-to-create-or-modify-existing-change-management-templates.;request-to-remove-a-change-template;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "LANID",
        "OUC",
        "Email",
        "ContactNumber",
        "ManagerName",
        "RequestType",
        "TemplateName",
        "JustificationForRemoval",
        "ChgMgmtGrpTemplateRelateTo",
        "WOSummary",
        "WOPriority",
        "WOSupportGroupName",
        "WOCompany",
        "WOOptCatTier1",
        "WOOptCatTier2",
        "WOOptCatTier3",
        "WOProdCatTier1",
        "WOProdCatTier2",
        "WOProdCatTier3",
        "WOProductName"
      ],
      "line": 208,
      "id": "as-a-user-of-itsm-i-want-to-be-able-to-raise-a-service-request-to-create-or-modify-existing-change-management-templates.;request-to-remove-a-change-template;;1"
    },
    {
      "cells": [
        "snarasi1",
        "test",
        "snarasi1",
        "TBC",
        "Sharmendiran.Narasimhan@O2.COM",
        "07720869911",
        "Ummer",
        "Remove a change template",
        "TestTemplate",
        "Remove template details",
        "Change Management - IT - Billing \u0026 Charging",
        "Remove Change Template",
        "Low",
        "Change Management - IT - Billing \u0026 Charging",
        "TELEFONICA UK",
        "Remove",
        "Data",
        "Change Template",
        "Application",
        "COTS/Bespoke",
        "Software",
        "BMC Remedy ITSM"
      ],
      "line": 209,
      "id": "as-a-user-of-itsm-i-want-to-be-able-to-raise-a-service-request-to-create-or-modify-existing-change-management-templates.;request-to-remove-a-change-template;;2"
    }
  ],
  "keyword": "Examples"
});
