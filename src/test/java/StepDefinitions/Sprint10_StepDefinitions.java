package StepDefinitions;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Sprint10_StepDefinitions extends StepDefinitions.Keywords {

	public Method method[];
	public StepDefinitions.Keywords keywords;
	public WebDriver driver;
	public static String ChangeId;
	// public static Method openbrowser_method;
	// public static Method load_cofigPropertyFiles_method;
	// public static Method navigate_method;

	public static Method sendkeys_method;
	public static Method clickelement_method;
	public static Method pauseexecution_method;
	public static Method mousehover_method;
	public static Method selectmenuoption_method;
	public static Method switchtonewwindow_method;
	public static Method saveattributetoxls_method;
	public static Method getruntimeproperty_method;
	public static Method verifylinktext_mehtod;
	public static Method logout_method;
	public static Method closenewwindow_method;
	public static Method capturescreenShot_method;
	public static Method keyboardaction_method;
	public static Method switchtoparentwindow_method;
	public static Method verifyauditlogresult_method;
	public static Method entertext_method;
	public static Method scrolltoelement_method;
	public static Method accessauditLog_method;

	public Sprint10_StepDefinitions() throws NoSuchMethodException, SecurityException {
		// when the object of StepDefinitions is created in the below/next Main
		// function, the object of KeyWords is automatically created here by
		// this constructor

		keywords = new StepDefinitions.Keywords();
		method = keywords.getClass().getMethods();// this will return an array
													// off all the methods in
		driver = Hooks.driver; // this class (test t)
		// load_cofigPropertyFiles_method =
		// keywords.getClass().getMethod("loadConfigPropertyFiles",
		// String.class,
		// String.class);
		// openbrowser_method = keywords.getClass().getMethod("openBrowser",
		// String.class, String.class);
		// navigate_method = keywords.getClass().getMethod("navigate",
		// String.class, String.class);
		sendkeys_method = keywords.getClass().getMethod("sendKeys", String.class, String.class);
		clickelement_method = keywords.getClass().getMethod("clickElement", String.class, String.class);
		pauseexecution_method = keywords.getClass().getMethod("pauseExecution", String.class, String.class);
		mousehover_method = keywords.getClass().getMethod("mouseHover", String.class, String.class);
		selectmenuoption_method = keywords.getClass().getMethod("selectMenuOption", String.class, String.class);
		switchtonewwindow_method = keywords.getClass().getMethod("switchToNewWindow", String.class, String.class);
		saveattributetoxls_method = keywords.getClass().getMethod("saveAttributeToXls", String.class, String.class);
		getruntimeproperty_method = keywords.getClass().getMethod("getRuntimeProperty", String.class, String.class);
		verifylinktext_mehtod = keywords.getClass().getMethod("verifyLinkText", String.class, String.class);
		logout_method = keywords.getClass().getMethod("logout", String.class, String.class);
		closenewwindow_method = keywords.getClass().getMethod("closeNewWindow", String.class, String.class);
		keyboardaction_method = keywords.getClass().getMethod("keyboardAction", String.class, String.class);
		switchtoparentwindow_method = keywords.getClass().getMethod("switchToParentWindow", String.class, String.class);
		verifyauditlogresult_method = keywords.getClass().getMethod("verifyAuditLogResult", String.class, String.class);
		entertext_method = keywords.getClass().getMethod("enterText", String.class, String.class);
		scrolltoelement_method = keywords.getClass().getMethod("scrollToElement", String.class, String.class);
		accessauditLog_method = keywords.getClass().getMethod("accessAuditLog", String.class, String.class);
	}

	@And("^I am updating Actual Dates on the Change record \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public String updateChangeActualDates(String ActualStartDate, String ActualEndDate, String Save_Button)
			throws Throwable {

		APP_LOGS.debug("Running Test Step: @And(I am updating Actual Dates on the Change record " + ActualStartDate
				+ " and " + ActualEndDate + ")");

		try {
			APP_LOGS.debug((String) clickelement_method.invoke(keywords, "cm_scheduling_tab", ""));
			APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "cm_actual_start_date", ActualStartDate));
			APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "cm_actual_end_date", ActualEndDate));
			APP_LOGS.debug((String) clickelement_method.invoke(keywords, Save_Button, ""));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
			return StepDefinitions.Constants.KEYWORD_PASS;
		}

		catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@When("^I request the \"([^\"]*)\" update history from audit log$")
	public String openChangeAuditLog(String AuditType) throws Throwable {

		APP_LOGS.debug("Running Test Step: @When(I request the " + AuditType + " update history from audit log)");

		try {
			// APP_LOGS.debug((String) clickelement_method.invoke(keywords,
			// "cm_functions_more_btn", ""));
			// APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords,
			// "cm_view_audit_log", ""));
			// APP_LOGS.debug((String) clickelement_method.invoke(keywords,
			// "change_audit_log_form_audit_tab", ""));

			APP_LOGS.debug((String) accessauditLog_method.invoke(keywords, "", ""));
			APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "change_audit_type_dropdown", AuditType));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
			APP_LOGS.debug((String) clickelement_method.invoke(keywords, "change_audit_result_refresh", ""));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
			return StepDefinitions.Constants.KEYWORD_PASS;
		}

		catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}

	}

	@Then("^Following Actual dates information is displayed in the audit history \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public String verifyActualDateResult(String Username, String ActualStartDate, String ActualEndDate)
			throws Throwable {

		APP_LOGS.debug("Running Test Step: @Then(Following Actual dates information is displayed in the audit history "
				+ ActualStartDate + " and " + ActualEndDate + ")");

		try {

			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm2_modified_by", Username));
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm3", ActualStartDate));
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm4", ActualEndDate));
			APP_LOGS.debug(
					(String) saveattributetoxls_method.invoke(keywords, "audit_clm1_modified_date", "ModifiedDate"));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}

	}

	@And("^I click on the view button$")
	public String viewAuditTypeResultDetails() throws Throwable {

		APP_LOGS.debug("Running Test Step: @And(I click on the view button)");

		try {
			APP_LOGS.debug((String) clickelement_method.invoke(keywords, "audit_clm2_modified_by", ""));
			APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "cm_audittype_result_view_btn", ""));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@Then("^The corresponding actual date audit details will be displayed \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public String actualDateAuditDetails(String Username, String ActualStartDate, String ActualEndDate)
			throws Throwable {

		APP_LOGS.debug("Running Test Step: @Then(The corresponding actual date audit details will be displayed "
				+ ActualStartDate + " and " + ActualEndDate + ")");

		try {
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_modifiedby_detail", Username));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_modifieddate_detail",
					(String) getruntimeproperty_method.invoke(keywords, "ModifiedDate", "")));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_actualstartdate_detail",
					ActualStartDate));
			APP_LOGS.debug(
					(String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_actualenddate_detail", ActualEndDate));
			APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));
			APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "cm_auditlog_result_close_btn", ""));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@And("^I logout and close the browser$")
	public String logoutAndCloseBrowser() throws Throwable {

		APP_LOGS.debug("Running Test Step: @And(I logout and close the browser)");

		try {
			APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
			APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));

			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@And("^I am updating Coordinator Group on the Change record \"([^\"]*)\",\"([^\"]*)\"$")
	public String updateChangeCoordinatorGroup(String CoordinatorGroup, String Save_Button) throws Throwable {

		APP_LOGS.debug("Running Test Step: @And(I am updating Coordinator Group on the Change record)");

		try {
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
			APP_LOGS.debug((String) entertext_method.invoke(keywords, "cm_coordinator_group_field", CoordinatorGroup));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
			APP_LOGS.debug((String) clickelement_method.invoke(keywords, "cm_coordinator_group_field", ""));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
			APP_LOGS.debug((String) keyboardaction_method.invoke(keywords, "cm_coordinator_group_field", "SPACE"));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
			APP_LOGS.debug((String) keyboardaction_method.invoke(keywords, "cm_coordinator_group_field", "BACKSPACE"));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));

			APP_LOGS.debug((String) clickelement_method.invoke(keywords, "cm_group_autocomplete", ""));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "6000"));

			APP_LOGS.debug((String) clickelement_method.invoke(keywords, Save_Button, ""));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "10000"));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@Then("^Following Coordinator Group information is displayed in the audit history \"([^\"]*)\",\"([^\"]*)\"$")
	public String verifyCoordinatorGroupResult(String Username, String CoordinatorGroup) throws Throwable {

		APP_LOGS.debug(
				"Running Test Step: @Then(Following Coordinator Group information is displayed in the audit history)");

		try {

			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm2_modified_by", Username));
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm3", CoordinatorGroup));
			APP_LOGS.debug(
					(String) saveattributetoxls_method.invoke(keywords, "audit_clm1_modified_date", "ModifiedDate"));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@Then("^The corresponding coordinator group audit details will be displayed \"([^\"]*)\",\"([^\"]*)\"$")
	public String coordinatorGroupAuditDetails(String Username, String CoordinatorGroup) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Then(The corresponding coordinator group audit details will be displayed)");

		try {
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_modifiedby_detail", Username));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_modifieddate_detail",
					(String) getruntimeproperty_method.invoke(keywords, "ModifiedDate", "")));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_coordinatorgroup_detail",
					CoordinatorGroup));

			APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));
			APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "cm_auditlog_result_close_btn", ""));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@And("^I am updating Manager Group on the Change record \"([^\"]*)\",\"([^\"]*)\"$")
	public String updateChangeManagerGroup(String ManagerGroup, String Save_Button) throws Throwable {

		APP_LOGS.debug("Running Test Step: @And(I am updating Manager Group on the Change record)");

		try {

			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
			APP_LOGS.debug((String) scrolltoelement_method.invoke(keywords, "cm_vendor_ticket_number_field", ""));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));

			APP_LOGS.debug((String) entertext_method.invoke(keywords, "cm_manager_group_field", ManagerGroup));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
			APP_LOGS.debug((String) clickelement_method.invoke(keywords, "cm_manager_group_field", ""));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
			APP_LOGS.debug((String) keyboardaction_method.invoke(keywords, "cm_manager_group_field", "SPACE"));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
			APP_LOGS.debug((String) keyboardaction_method.invoke(keywords, "cm_manager_group_field", "BACKSPACE"));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));

			APP_LOGS.debug((String) clickelement_method.invoke(keywords, "cm_group_autocomplete", ""));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "6000"));

			APP_LOGS.debug((String) clickelement_method.invoke(keywords, Save_Button, ""));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "10000"));

			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@Then("^Following Manager Group information is displayed in the audit history \"([^\"]*)\",\"([^\"]*)\"$")
	public String verifyManagerGroupResult(String Username, String ManagerGroup) throws Throwable {

		APP_LOGS.debug(
				"Running Test Step: @Then(Following Manager Group information is displayed in the audit history)");

		try {
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm2_modified_by", Username));
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm3", ManagerGroup));
			APP_LOGS.debug(
					(String) saveattributetoxls_method.invoke(keywords, "audit_clm1_modified_date", "ModifiedDate"));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@Then("^The corresponding Manager group audit details will be displayed \"([^\"]*)\",\"([^\"]*)\"$")
	public String managerGroupAuditDetails(String Username, String ManagerGroup) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Then(The corresponding Manager group audit details will be displayed)");

		try {
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_modifiedby_detail", Username));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_modifieddate_detail",
					(String) getruntimeproperty_method.invoke(keywords, "ModifiedDate", "")));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_changemanagergroup_detail",
					ManagerGroup));
			APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));
			APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "cm_auditlog_result_close_btn", ""));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@And("^I am updating Change class and Type on the Change record \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public String updateChangeClassAndType(String Class, String Type, String TimingReason, String Save_Button)
			throws Throwable {

		APP_LOGS.debug("Running Test Step: @And(I am updating Change class and Type on the Change record " + Class
				+ " and " + Type + ")");

		try {
			APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "cm_change_class", Class));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
			APP_LOGS.debug((String) switchtoparentwindow_method.invoke(keywords, "", ""));

			APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "cm_change_type", Type));
			APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "cm_change_type_ok_btn", ""));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

			APP_LOGS.debug((String) clickelement_method.invoke(keywords, "cm_scheduling_tab", ""));
			APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "cm_timing_reason", TimingReason));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

			APP_LOGS.debug((String) clickelement_method.invoke(keywords, Save_Button, ""));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@Then("^Following Change Class and Type information are displayed in the audit history \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public String verifyClassResult(String Username, String Class, String Type) throws Throwable {

		APP_LOGS.debug(
				"Running Test Step: @Then(Following Change Class and Type information are displayed in the audit history "
						+ Class + " and " + Type + ")");

		try {
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm2_modified_by", Username));
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm3", Class));
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm4", Type));
			APP_LOGS.debug(
					(String) saveattributetoxls_method.invoke(keywords, "audit_clm1_modified_date", "ModifiedDate"));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@Then("^The corresponding Change Class and Type audit details will be displayed \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public String classAuditDetails(String Username, String Class, String Type) throws Throwable {

		APP_LOGS.debug(
				"Running Test Step: @Then(The corresponding Change Class and Type audit details will be displayed "
						+ Class + " and " + Type + ")");

		try {
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_modifiedby_detail", Username));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_modifieddate_detail",
					(String) getruntimeproperty_method.invoke(keywords, "ModifiedDate", "")));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_class_detail", Class));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_changetype_detail", Type));
			APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));
			APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "cm_auditlog_result_close_btn", ""));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@And("^I am updating Impact on the Change record \"([^\"]*)\",\"([^\"]*)\"$")
	public String updateChangeImpact(String Impact, String Save_Button) throws Throwable {

		APP_LOGS.debug("Running Test Step: @And(I am updating Impact on the Change record to " + Impact + ")");

		try {

			APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "impact_dropdown", Impact));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

			APP_LOGS.debug((String) clickelement_method.invoke(keywords, Save_Button, ""));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@Then("^Following Impact information is displayed in the audit history \"([^\"]*)\",\"([^\"]*)\"$")
	public String verifyImpactResult(String Username, String Impact) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Then(Following Impact information is displayed in the audit history "
				+ Impact + ")");

		try {

			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm2_modified_by", Username));
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm3", Impact));

			APP_LOGS.debug(
					(String) saveattributetoxls_method.invoke(keywords, "audit_clm1_modified_date", "ModifiedDate"));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@Then("^The corresponding Impact audit details will be displayed \"([^\"]*)\",\"([^\"]*)\"$")
	public String impactAuditDetails(String Username, String Impact) throws Throwable {

		APP_LOGS.debug(
				"Running Test Step: @Then(The corresponding Impact audit details will be displayed  " + Impact + ")");

		try {

			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_modifiedby_detail", Username));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_modifieddate_detail",
					(String) getruntimeproperty_method.invoke(keywords, "ModifiedDate", "")));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_impact_detail", Impact));
			APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));
			APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "cm_auditlog_result_close_btn", ""));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@And("^I am updating Product Categorization on the Change record \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public String updateProductCategorization(String ProdCat1, String ProdCat2, String ProdCat3, String Save_Button)
			throws Throwable {

		APP_LOGS.debug("Running Test Step: @And(I am updating Product Categorization on the Change record to ProdCat1: "
				+ ProdCat1 + ",ProdCat2: " + ProdCat2 + ",ProdCat3: " + ProdCat3 + ")");

		try {
			APP_LOGS.debug((String) clickelement_method.invoke(keywords, "cm_categorization_tab", ""));
			APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "cm_prodcat_tier1", ProdCat1));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
			APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "cm_prodcat_tier2", ProdCat2));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
			APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "cm_prodcat_tier3", ProdCat3));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

			APP_LOGS.debug((String) clickelement_method.invoke(keywords, Save_Button, ""));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@Then("^Following ProdCats information is displayed in the audit history \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public String verifyProductCategorizationResult(String Username, String ProdCat1, String ProdCat2, String ProdCat3)
			throws Throwable {

		APP_LOGS.debug(
				"Running Test Step: @Then(Following ProdCats information is displayed in the audit history ProdCat1: "
						+ ProdCat1 + ",ProdCat2: " + ProdCat2 + ",ProdCat3: " + ProdCat3 + ")");

		try {

			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm2_modified_by", Username));
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm3", ProdCat1));
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm4", ProdCat2));
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm5", ProdCat3));

			APP_LOGS.debug(
					(String) saveattributetoxls_method.invoke(keywords, "audit_clm1_modified_date", "ModifiedDate"));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@Then("^The corresponding ProdCats audit details will be displayed \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public String productCategorizationAuditDetails(String Username, String ProdCat1, String ProdCat2, String ProdCat3)
			throws Throwable {

		APP_LOGS.debug("Running Test Step: @Then(The corresponding ProdCats audit details will be displayed ProdCat1: "
				+ ProdCat1 + ",ProdCat2: " + ProdCat2 + ",ProdCat3: " + ProdCat3 + ")");

		try {
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_modifiedby_detail", Username));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_modifieddate_detail",
					(String) getruntimeproperty_method.invoke(keywords, "ModifiedDate", "")));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_prodcat1_detail", ProdCat1));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_prodcat2_detail", ProdCat2));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_prodcat3_detail", ProdCat3));
			APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));
			APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "cm_auditlog_result_close_btn", ""));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@Then("^Following Risk Level information is displayed in the audit history \"([^\"]*)\",\"([^\"]*)\"$")
	public String verifyRiskLevelResult(String Username, String ExpectedRiskLevel) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Then(Following Risk Level information is displayed in the audit history "
				+ ExpectedRiskLevel + ")");

		try {
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm2_modified_by", Username));
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm3", ExpectedRiskLevel));

			APP_LOGS.debug(
					(String) saveattributetoxls_method.invoke(keywords, "audit_clm1_modified_date", "ModifiedDate"));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@Then("^The corresponding Risk Level audit details will be displayed \"([^\"]*)\",\"([^\"]*)\"$")
	public String riskLevelAuditDetails(String Username, String ExpectedRiskLevel) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Then(The corresponding Risk Level audit details will be displayed "
				+ ExpectedRiskLevel + ")");

		try {
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_modifiedby_detail", Username));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_modifieddate_detail",
					(String) getruntimeproperty_method.invoke(keywords, "ModifiedDate", "")));
			APP_LOGS.debug(
					(String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_risklevel_detail", ExpectedRiskLevel));
			APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));
			APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "cm_auditlog_result_close_btn", ""));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@And("^I am updating Scheduled Dates on the Change record \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public String updateChangeScheduledDates(String ScheduledStartDate, String ScheduledEndDate, String Save_Button)
			throws Throwable {

		APP_LOGS.debug(
				"Running Test Step: @And(I am updating Scheduled Dates on the Change record to ScheduledStartDate:"
						+ ScheduledStartDate + " and ScheduledEndDate: " + ScheduledEndDate + ")");

		try {
			APP_LOGS.debug((String) clickelement_method.invoke(keywords, "cm_scheduling_tab", ""));
			APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "cm_scheduled_start_date", ScheduledStartDate));
			APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "cm_scheduled_end_date", ScheduledEndDate));

			APP_LOGS.debug((String) clickelement_method.invoke(keywords, Save_Button, ""));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@Then("^Following Scheduled dates information is displayed in the audit history \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public String verifyScheduledDateResult(String Username, String ScheduledStartDate, String ScheduledEndDate)
			throws Throwable {

		APP_LOGS.debug(
				"Running Test Step: @Then(Following Scheduled dates information is displayed in the audit history ScheduledStartDate:"
						+ ScheduledStartDate + " and ScheduledEndDate: " + ScheduledEndDate + ")");

		try {

			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm2_modified_by", Username));
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm3", ScheduledStartDate));
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm4", ScheduledEndDate));
			APP_LOGS.debug(
					(String) saveattributetoxls_method.invoke(keywords, "audit_clm1_modified_date", "ModifiedDate"));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@Then("^The corresponding scheduled date audit details will be displayed \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public String scheduledDateAuditDetails(String Username, String ScheduledStartDate, String ScheduledEndDate)
			throws Throwable {

		APP_LOGS.debug(
				"Running Test Step: @Then(The corresponding scheduled date audit details will be displayed ScheduledStartDate:"
						+ ScheduledStartDate + " and ScheduledEndDate: " + ScheduledEndDate + ")");

		try {

			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_modifiedby_detail", Username));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_modifieddate_detail",
					(String) getruntimeproperty_method.invoke(keywords, "ModifiedDate", "")));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_scheduledstartdate_detail",
					ScheduledStartDate));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_scheduledenddate_detail",
					ScheduledEndDate));
			APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));
			APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "cm_auditlog_result_close_btn", ""));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@And("^I am updating Service on the Change record \"([^\"]*)\",\"([^\"]*)\"$")
	public String updateService(String Service, String Save_Button) throws Throwable {

		APP_LOGS.debug("Running Test Step: @And(I am updating Service on the Change record to: " + Service + ")");

		try {
			APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "service_dropdown", Service));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
			APP_LOGS.debug((String) clickelement_method.invoke(keywords, Save_Button, ""));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@Then("^Following Service information is displayed in the audit history \"([^\"]*)\",\"([^\"]*)\"$")
	public String verifyServiceResult(String Username, String Service) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Then(Following Service information is displayed in the audit history: "
				+ Service + ")");

		try {
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm2_modified_by", Username));
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm3", Service));
			APP_LOGS.debug(
					(String) saveattributetoxls_method.invoke(keywords, "audit_clm1_modified_date", "ModifiedDate"));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@Then("^The corresponding Service audit details will be displayed \"([^\"]*)\",\"([^\"]*)\"$")
	public String serviceAuditDetails(String Username, String Service) throws Throwable {

		APP_LOGS.debug(
				"Running Test Step: @Then(The corresponding service audit details will be displayed: " + Service + ")");

		try {
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_modifiedby_detail", Username));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_modifieddate_detail",
					(String) getruntimeproperty_method.invoke(keywords, "ModifiedDate", "")));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_service_detail", Service));
			APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));
			APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "cm_auditlog_result_close_btn", ""));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@And("^I am updating Status on the Change record \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public String updateStatus(String Status, String Status_Reason, String Save_Button) throws Throwable {

		APP_LOGS.debug("Running Test Step: @And(I am updating Status on the Change record to: " + Status + ")");

		try {
			APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "cm_status", Status));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
			APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "cm_status_reason", Status_Reason));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
			APP_LOGS.debug((String) clickelement_method.invoke(keywords, Save_Button, ""));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@Then("^Following Status information is displayed in the audit history \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public String verifyStatusResult(String Username, String Status, String Status_Reason) throws Throwable {

		APP_LOGS.debug(
				"Running Test Step: @Then(Following Status information is displayed in the audit history: Status: "
						+ Status + " Status Reason: " + Status_Reason + ")");

		try {
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm2_modified_by", Username));
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm3", Status));
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm4", Status_Reason));
			APP_LOGS.debug(
					(String) saveattributetoxls_method.invoke(keywords, "audit_clm1_modified_date", "ModifiedDate"));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@Then("^The corresponding Status audit details will be displayed \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public String statusAuditDetails(String Username, String Status, String Status_Reason) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Then(The corresponding Status audit details will be displayed: Status: "
				+ Status + " Status Reason: " + Status_Reason + ")");

		try {
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_modifiedby_detail", Username));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_modifieddate_detail",
					(String) getruntimeproperty_method.invoke(keywords, "ModifiedDate", "")));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_status_detail", Status));
			APP_LOGS.debug(
					(String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_status_reason_detail", Status_Reason));
			APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));
			APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "cm_auditlog_result_close_btn", ""));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@And("^I am updating Summary on the Change record \"([^\"]*)\",\"([^\"]*)\"$")
	public String updateSummary(String Summary, String Save_Button) throws Throwable {

		APP_LOGS.debug("Running Test Step: @And(I am updating Summary on the Change record to: " + Summary + ")");

		try {
			APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_field", ""));
			APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_editor", ""));
			APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "summary_editor", Summary));
			APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_ok_btn", ""));

			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
			APP_LOGS.debug((String) clickelement_method.invoke(keywords, Save_Button, ""));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@Then("^Following Summary information is displayed in the audit history \"([^\"]*)\",\"([^\"]*)\"$")
	public String verifySummaryResult(String Username, String Summary) throws Throwable {

		APP_LOGS.debug(
				"Running Test Step: @Then(Following Summary information is displayed in the audit history: Summary: "
						+ Summary + ")");

		try {
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm2_modified_by", Username));
			APP_LOGS.debug((String) verifyauditlogresult_method.invoke(keywords, "audit_clm3", Summary));
			APP_LOGS.debug(
					(String) saveattributetoxls_method.invoke(keywords, "audit_clm1_modified_date", "ModifiedDate"));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@Then("^The corresponding Summary audit details will be displayed \"([^\"]*)\",\"([^\"]*)\"$")
	public String summaryAuditDetails(String Username, String Summary) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Then(The corresponding Summary audit details will be displayed: Summary: "
				+ Summary + ")");

		try {
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_modifiedby_detail", Username));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_modifieddate_detail",
					(String) getruntimeproperty_method.invoke(keywords, "ModifiedDate", "")));
			APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_auditlog_summary_detail", Summary));
			APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));
			APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "cm_auditlog_result_close_btn", ""));
			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}

	@When("^I access audit history from audit log$")
	public String accessChangeAuditLog() throws Throwable {

		APP_LOGS.debug("Running Test Step: @When(I access audit history from audit log)");

		try {

			APP_LOGS.debug((String) clickelement_method.invoke(keywords, "cm_create_save_btn", ""));
			APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "9000"));

			return StepDefinitions.Constants.KEYWORD_PASS;
		}

		catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}

	}

	@Then("^I request and verify the update history from audit log for fields \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public String changeAuditLogAll(String Username, String Class, String ChangeType, String Impact, String ProdCat1,
			String ProdCat2, String ProdCat3, String RiskLevel, String ScheduledStartDate, String ScheduledEndDate,
			String CoordinatorGroup, String Service, String Status, String Status_Reason, String ManagerGroup,
			String Summary) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Then(I request and verify the update history from audit log for fields: )");

		try {

			APP_LOGS.debug((String) openChangeAuditLog("Change Coordinator Group"));
			APP_LOGS.debug((String) verifyCoordinatorGroupResult(Username, CoordinatorGroup));
			APP_LOGS.debug((String) viewAuditTypeResultDetails());
			APP_LOGS.debug((String) coordinatorGroupAuditDetails(Username, CoordinatorGroup));

			APP_LOGS.debug((String) openChangeAuditLog("Change Manager Group"));
			APP_LOGS.debug((String) verifyManagerGroupResult(Username, ManagerGroup));
			APP_LOGS.debug((String) viewAuditTypeResultDetails());
			APP_LOGS.debug((String) managerGroupAuditDetails(Username, ManagerGroup));

			APP_LOGS.debug((String) openChangeAuditLog("Class"));
			APP_LOGS.debug((String) verifyClassResult(Username, Class, ChangeType));
			APP_LOGS.debug((String) viewAuditTypeResultDetails());
			APP_LOGS.debug((String) classAuditDetails(Username, Class, ChangeType));

			APP_LOGS.debug((String) openChangeAuditLog("Impact"));
			APP_LOGS.debug((String) verifyImpactResult(Username, Impact));
			APP_LOGS.debug((String) viewAuditTypeResultDetails());
			APP_LOGS.debug((String) impactAuditDetails(Username, Impact));

			APP_LOGS.debug((String) openChangeAuditLog("Product Categorization"));
			APP_LOGS.debug((String) verifyProductCategorizationResult(Username, ProdCat1, ProdCat2, ProdCat3));
			APP_LOGS.debug((String) viewAuditTypeResultDetails());
			APP_LOGS.debug((String) productCategorizationAuditDetails(Username, ProdCat1, ProdCat2, ProdCat3));

			APP_LOGS.debug((String) openChangeAuditLog("Risk Level"));
			APP_LOGS.debug((String) verifyRiskLevelResult(Username, RiskLevel));
			APP_LOGS.debug((String) viewAuditTypeResultDetails());
			APP_LOGS.debug((String) riskLevelAuditDetails(Username, RiskLevel));

			APP_LOGS.debug((String) openChangeAuditLog("Scheduled Dates"));
			APP_LOGS.debug((String) verifyScheduledDateResult(Username, ScheduledStartDate, ScheduledEndDate));
			APP_LOGS.debug((String) viewAuditTypeResultDetails());
			APP_LOGS.debug((String) scheduledDateAuditDetails(Username, ScheduledStartDate, ScheduledEndDate));

			APP_LOGS.debug((String) openChangeAuditLog("Service"));
			APP_LOGS.debug((String) verifyServiceResult(Username, Service));
			APP_LOGS.debug((String) viewAuditTypeResultDetails());
			APP_LOGS.debug((String) serviceAuditDetails(Username, Service));

			APP_LOGS.debug((String) openChangeAuditLog("Status"));
			APP_LOGS.debug((String) verifyStatusResult(Username, Status, ""));
			APP_LOGS.debug((String) viewAuditTypeResultDetails());
			APP_LOGS.debug((String) statusAuditDetails(Username, Status, ""));

			APP_LOGS.debug((String) openChangeAuditLog("Summary"));
			APP_LOGS.debug((String) verifySummaryResult(Username, Summary));
			APP_LOGS.debug((String) viewAuditTypeResultDetails());
			APP_LOGS.debug((String) summaryAuditDetails(Username, Summary));

			return StepDefinitions.Constants.KEYWORD_PASS;

		} catch (Exception e) {
			return StepDefinitions.Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}
}
