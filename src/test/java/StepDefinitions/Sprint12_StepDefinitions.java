package StepDefinitions;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sprint12_StepDefinitions extends StepDefinitions.Keywords {

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
	public static Method verifylinktext_method;
	public static Method logout_method;
	public static Method closenewwindow_method;
	public static Method capturescreenShot_method;
	public static Method keyboardaction_method;
	public static Method switchtoparentwindow_method;
	public static Method verifyauditlogresult_method;
	public static Method entertext_method;
	public static Method scrolltoelement_method;
	public static Method accessauditLog_method;
	public static Method verifyfieldisreadonly_method;
	public static Method verifyfieldisnotempty_method;
	public static Method verifyinputtext_method;
	public static Method switchtodefaultwindow_method;
	public static Method getfielddetail_method;
	public static Method verifyfieldisnotreadOnly_method;
	public static Method verifyassignedgroupdetails_method;
	public static Method verifyfieldisempty_method;
	public static Method verifyfieldisdisplayed_method;
	public static Method verifyfieldismandatory_method;

	public Sprint12_StepDefinitions() throws NoSuchMethodException, SecurityException {
		// when the object of StepDefinitions is created in the below/next Main
		// function, the object of KeyWords is automatically created here by
		// this constructor

		keywords = new StepDefinitions.Keywords();
		method = keywords.getClass().getMethods();// this will return an array
													// off all the methods in
		driver = Hooks.driver; // this class (test t)

		sendkeys_method = keywords.getClass().getMethod("sendKeys", String.class, String.class);
		clickelement_method = keywords.getClass().getMethod("clickElement", String.class, String.class);
		pauseexecution_method = keywords.getClass().getMethod("pauseExecution", String.class, String.class);
		mousehover_method = keywords.getClass().getMethod("mouseHover", String.class, String.class);
		selectmenuoption_method = keywords.getClass().getMethod("selectMenuOption", String.class, String.class);
		switchtonewwindow_method = keywords.getClass().getMethod("switchToNewWindow", String.class, String.class);
		saveattributetoxls_method = keywords.getClass().getMethod("saveAttributeToXls", String.class, String.class);
		getruntimeproperty_method = keywords.getClass().getMethod("getRuntimeProperty", String.class, String.class);
		verifylinktext_method = keywords.getClass().getMethod("verifyLinkText", String.class, String.class);
		logout_method = keywords.getClass().getMethod("logout", String.class, String.class);
		closenewwindow_method = keywords.getClass().getMethod("closeNewWindow", String.class, String.class);
		keyboardaction_method = keywords.getClass().getMethod("keyboardAction", String.class, String.class);
		switchtoparentwindow_method = keywords.getClass().getMethod("switchToParentWindow", String.class, String.class);
		verifyauditlogresult_method = keywords.getClass().getMethod("verifyAuditLogResult", String.class, String.class);
		entertext_method = keywords.getClass().getMethod("enterText", String.class, String.class);
		scrolltoelement_method = keywords.getClass().getMethod("scrollToElement", String.class, String.class);
		accessauditLog_method = keywords.getClass().getMethod("accessAuditLog", String.class, String.class);
		verifyfieldisreadonly_method = keywords.getClass().getMethod("verifyFieldIsReadOnly", String.class,
				String.class);
		verifyfieldisnotempty_method = keywords.getClass().getMethod("verifyFieldIsNotEmpty", String.class,
				String.class);
		verifyinputtext_method = keywords.getClass().getMethod("verifyInputText", String.class, String.class);
		verifyfieldisnotreadOnly_method = keywords.getClass().getMethod("verifyFieldIsNotReadOnly", String.class,
				String.class);
		switchtodefaultwindow_method = keywords.getClass().getMethod("switchToDefaultWindow", String.class,
				String.class);
		getfielddetail_method = keywords.getClass().getMethod("getFieldDetail", String.class, String.class);
		verifyassignedgroupdetails_method = keywords.getClass().getMethod("verifyAssignedGroupDetails", String.class,
				String.class);
		verifyfieldisempty_method = keywords.getClass().getMethod("verifyFieldIsEmpty", String.class, String.class);
		verifyfieldisdisplayed_method = keywords.getClass().getMethod("verifyFieldIsDisplayed", String.class,
				String.class);
		verifyfieldismandatory_method = keywords.getClass().getMethod("verifyFieldIsMandatory", String.class,
				String.class);
	}

	@When("^Incident Closure is selected from the Resolution and Recovery Stage-Process Flow Bar$")
	public void incidentClosureFromResAndRec() throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @When(Incident Closure is selected from the Resolution and Recovery Stage-Process Flow Bar)");

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolution_and_recovery", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "iad_next_stage", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "rar_incident_closure", ""));

		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) switchtoparentwindow_method.invoke(keywords, "", ""));

	}

	@Then("^the Modify Incident pop-up form will be displayed with the new fields$")
	public void modifyIncidentPopUpWithNewFields() throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @Then(the Modify Incident pop-up form will be displayed with the new fields)");

		APP_LOGS.debug(
				(String) verifyfieldisdisplayed_method.invoke(keywords, "resoptcattier1", "Resolution OptCat Tier1"));
		APP_LOGS.debug(
				(String) verifyfieldisdisplayed_method.invoke(keywords, "resoptcattier2", "Resolution OptCat Tier2"));
		APP_LOGS.debug(
				(String) verifyfieldisdisplayed_method.invoke(keywords, "resoptcattier3", "Resolution OptCat Tier3"));

		APP_LOGS.debug(
				(String) verifyfieldisdisplayed_method.invoke(keywords, "resprodcattier1", "Resolution ProdCat Tier1"));
		APP_LOGS.debug(
				(String) verifyfieldisdisplayed_method.invoke(keywords, "resprodcattier2", "Resolution ProdCat Tier2"));
		APP_LOGS.debug(
				(String) verifyfieldisdisplayed_method.invoke(keywords, "resprodcattier3", "Resolution ProdCat Tier3"));

		APP_LOGS.debug((String) verifyfieldisdisplayed_method.invoke(keywords, "resolved_status_reason_field",
				"Status Reason"));

	}

	@And("^Resolution Category Tier 1 is mandatory when updating status from InProgress to Resolved \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void resOptCat1MandatoryINPGTORESO(String Resolution, String ResolutionCI, String StatusReason,
			String ResolutionOptCat1) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(Resolution Category Tier 1 is mandatory when updating status from InProgress to Resolved)");

		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "assignee_field", "Assignee"));
		
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "resol_cat_tier1_field",
				"Resolution OptCat Tier1"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn",
				"Resolution OptCat Tier1"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolution_cat_tier1", ResolutionOptCat1));

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "resolved_resolution_field", "Resolution"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Resolution"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolved_resolution_field", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_editor", ""));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "summary_editor", Resolution));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_ok_btn", ""));

		APP_LOGS.debug(
				(String) verifyfieldisempty_method.invoke(keywords, "resolved_status_reason_field", "Status Reason"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Status Reason"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolved_status_reason", StatusReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "ci_field", "CI+ Detail"));
		
		
		/*APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "ci_field", "CI+ Detail"));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "mandate_error_message",
				"You must associate a configuration item to this incident. (ARERR 45534)"));*/

		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "search_resolution_ci", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "resolution_ci_search", ResolutionCI));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolution_ci_search_btn", ""));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolution_ci_search_select", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));

		//APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_btn", ""));
		//APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", "Resolved"));
		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));

	}

	@When("^Incident Closure is selected from the Investigation and Diagnosis Stage-Process Flow Bar$")
	public void incidentClosureFromInvAndDiag() throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @When(Incident Closure is selected from the Investigation and Diagnosis Stage-Process Flow Bar)");

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "investigation_and_diagnosis", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "iad_next_stage", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "iad_incident_closure", ""));

		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) switchtoparentwindow_method.invoke(keywords, "", ""));

	}

	@And("^Resolution Category Tier 1 is mandatory when updating status from Assigned to Resolved \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void resOptCat1MandatoryASGTORESO(String Resolution, String ResolutionCI, String StatusReason,
			String ResolutionOptCat1, String Assignee) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(Resolution Category Tier 1 is mandatory when updating status from Assigned to Resolved)");

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "assignee_field", "Assignee"));
		APP_LOGS.debug((String)	verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Assignee"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "assignee_field", Assignee));

		
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "resol_cat_tier1_field",
				"Resolution OptCat Tier1"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn",
				"Resolution OptCat Tier1"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolution_cat_tier1", ResolutionOptCat1));

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "resolved_resolution_field", "Resolution"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Resolution"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolved_resolution_field", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_editor", ""));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "summary_editor", Resolution));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_ok_btn", ""));

		APP_LOGS.debug(
				(String) verifyfieldisempty_method.invoke(keywords, "resolved_status_reason_field", "Status Reason"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Status Reason"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolved_status_reason", StatusReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "ci_field", "CI+ Detail"));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "mandate_error_message",
				"You must associate a configuration item to this incident. (ARERR 45534)"));

		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "search_resolution_ci", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "resolution_ci_search", ResolutionCI));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolution_ci_search_btn", ""));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolution_ci_search_select", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", "Resolved"));
		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));

	}

	@When("^Closed is selected from the Resolution and Recovery Stage-Process Flow Bar$")
	public void closedFromResAndRec() throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @When(Closed is selected from the Resolution and Recovery Stage-Process Flow Bar)");

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolution_and_recovery", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "iad_next_stage", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "rar_incident_closed", ""));

		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) switchtoparentwindow_method.invoke(keywords, "", ""));

	}

	@And("^Resolution Category Tier 1 is mandatory when updating status from InProgress to Closed \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void resOptCat1MandatoryINPGTOCLOS(String Resolution, String ResolutionCI, String StatusReason,
			String ResolutionOptCat1) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(Resolution Category Tier 1 is mandatory when updating status from InProgress to Closed)");

		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "assignee_field", "Assignee"));
		
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "resol_cat_tier1_field",
				"Resolution OptCat Tier1"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn",
				"Resolution OptCat Tier1"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolution_cat_tier1", ResolutionOptCat1));

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "resolved_resolution_field", "Resolution"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Resolution"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolved_resolution_field", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_editor", ""));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "summary_editor", Resolution));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_ok_btn", ""));

		APP_LOGS.debug(
				(String) verifyfieldisempty_method.invoke(keywords, "resolved_status_reason_field", "Status Reason"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Status Reason"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolved_status_reason", StatusReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		

		/*
		 * APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
		 * "ci_field", "CI+ Detail")); APP_LOGS.debug((String)
		 * switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
		 * APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "",
		 * "5000")); APP_LOGS.debug((String)
		 * switchtodefaultwindow_method.invoke(keywords, "", ""));
		 * 
		 * 
		 * APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
		 * "mandate_error_message",
		 * "You must associate a configuration item to this incident. (ARERR 45534)"
		 * ));
		 */
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "ci_field", "CI+ Detail"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "search_resolution_ci", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "resolution_ci_search", ResolutionCI));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolution_ci_search_btn", ""));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolution_ci_search_select", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", "Closed"));
		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));

	}

	@When("^Closed is selected from the Investigation and Diagnosis Stage-Process Flow Bar$")
	public void closedFromInvAndDiag() throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @When(Closed is selected from the Investigation and Diagnosis Stage-Process Flow Bar)");

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "investigation_and_diagnosis", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "iad_next_stage", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "iad_incident_closed", ""));

		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) switchtoparentwindow_method.invoke(keywords, "", ""));

	}

	@And("^Resolution Category Tier 1 is mandatory when updating status from Assigned to Closed \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void resOptCat1MandatoryASGTOCLOS(String Resolution, String ResolutionCI, String StatusReason,
			String ResolutionOptCat1, String Assignee) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(Resolution Category Tier 1 is mandatory when updating status from Assigned to Closed)");

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "assignee_field", "Assignee"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Assignee"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "assignee_field", Assignee));

		
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "resol_cat_tier1_field",
				"Resolution OptCat Tier1"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn",
				"Resolution OptCat Tier1"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolution_cat_tier1", ResolutionOptCat1));

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "resolved_resolution_field", "Resolution"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Resolution"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolved_resolution_field", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_editor", ""));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "summary_editor", Resolution));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_ok_btn", ""));

		APP_LOGS.debug(
				(String) verifyfieldisempty_method.invoke(keywords, "resolved_status_reason_field", "Status Reason"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Status Reason"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolved_status_reason", StatusReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "ci_field", "CI+ Detail"));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "mandate_error_message",
				"You must associate a configuration item to this incident. (ARERR 45534)"));

		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "search_resolution_ci", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "resolution_ci_search", ResolutionCI));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolution_ci_search_btn", ""));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolution_ci_search_select", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", "Closed"));
		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));

	}

	@When("^I click on NextStage button to progress Incident to Resolved$")
	public void INPGTORESONextStageButton() throws Throwable {
		APP_LOGS.debug("Running Test Step: @When(I click on NextStage button to progress Incident to Resolved)");

		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "next_stage_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

	}

	@When("^I click on Resolve button to progress Incident to Resolved$")
	public void INPGTORESOResolveButton() throws Throwable {
		APP_LOGS.debug("Running Test Step: @When(I click on Resolve button to progress Incident to Resolved)");

		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolve_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

	}

	@Given("^Incident is in Pending status and Assignee is set \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verifyIncidentWithoutAssignee(String Username, String Password, String IncidentID, String AssignedGroup,
			String InitialStatus, String Assignee) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @Given(Incident is in Pending status and Assignee is set " + IncidentID + ")");

		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "user_name", Username));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "password", Password));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "login_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "10000"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "application_link", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "incident_management", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "search_incident", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "search_incident", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "incident_id_field", IncidentID));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "search_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", InitialStatus));

		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "assigned_group", AssignedGroup));
		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "assignee_field", Assignee));

	}
	
	@And("^Resolution Category Tier 1 is mandatory when updating status from Pending to Resolved \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void resOptCat1MandatoryPNDGTORESO(String Resolution, String ResolutionCI, String StatusReason,
			String ResolutionOptCat1, String Assignee) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(Resolution Category Tier 1 is mandatory when updating status from Pending to Resolved)");

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "assignee_field", "Assignee"));
		
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "resol_cat_tier1_field",
				"Resolution OptCat Tier1"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn",
				"Resolution OptCat Tier1"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolution_cat_tier1", ResolutionOptCat1));

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "resolved_resolution_field", "Resolution"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Resolution"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolved_resolution_field", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_editor", ""));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "summary_editor", Resolution));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_ok_btn", ""));

		APP_LOGS.debug(
				(String) verifyfieldisempty_method.invoke(keywords, "resolved_status_reason_field", "Status Reason"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Status Reason"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolved_status_reason", StatusReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		
		//APP_LOGS.debug((String)	verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Assignee"));
		//APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		//APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "assignee_field", Assignee));
		
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "ci_field", "CI+ Detail"));

		/*APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "ci_field", "CI+ Detail"));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "mandate_error_message",
				"You must associate a configuration item to this incident. (ARERR 45534)"));
*/
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "search_resolution_ci", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "resolution_ci_search", ResolutionCI));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolution_ci_search_btn", ""));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolution_ci_search_select", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));

		//APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_btn", ""));
		//APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", "Resolved"));
		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));

	}
	
	@When("^I select the Resolved Status from the Status menu$")
	public void ASGTORESOStatusMenu() throws Throwable {
		APP_LOGS.debug("Running Test Step: @When(I select the Resolved Status from the Status menu)");

		
		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "status_dropdown", "Resolved"));
		APP_LOGS.debug((String) switchtoparentwindow_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

	}
	
	@And("^Resolution Category Tier 1 is mandatory when updating status from Assigned to Resolved using Status dropdown \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void resOptCat1MandatoryASGTORESOStausDrop(String Resolution, String ResolutionCI, String StatusReason,
			String ResolutionOptCat1, String Assignee) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(Resolution Category Tier 1 is mandatory when updating status from Assigned to Resolved using Status dropdown)");

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "assignee_field", "Assignee"));
		APP_LOGS.debug((String)	verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Assignee"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "assignee_field", Assignee));

		
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "resol_cat_tier1_field",
				"Resolution OptCat Tier1"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn",
				"Resolution OptCat Tier1"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolution_cat_tier1", ResolutionOptCat1));

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "resolved_resolution_field", "Resolution"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Resolution"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolved_resolution_field", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_editor", ""));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "summary_editor", Resolution));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_ok_btn", ""));
		
		

		APP_LOGS.debug(
				(String) verifyfieldisempty_method.invoke(keywords, "resolved_status_reason_field", "Status Reason"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Status Reason"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolved_status_reason", StatusReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "ci_field", "CI+ Detail"));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "mandate_error_message",
				"You must associate a configuration item to this incident. (ARERR 45534)"));

		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "search_resolution_ci", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "resolution_ci_search", ResolutionCI));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolution_ci_search_btn", ""));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolution_ci_search_select", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", "Resolved"));
		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));

	}
	
	@When("^I select the Closed Status from the Status menu$")
	public void ASGTOCLOSStatusMenu() throws Throwable {
		APP_LOGS.debug("Running Test Step: @When(I select the Closed Status from the Status menu)");

		
		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "status_dropdown", "Closed"));
		APP_LOGS.debug((String) switchtoparentwindow_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

	}
	
	@And("^Resolution Category Tier 1 is mandatory when updating status from InProgress to Resolved using Status dropdown \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void resOptCat1MandatoryINPGTORESOStatusDrop(String Resolution, String ResolutionCI, String StatusReason,
			String ResolutionOptCat1) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(Resolution Category Tier 1 is mandatory when updating status from InProgress to Resolved using Status dropdown)");

		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "assignee_field", "Assignee"));
		
		
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "resol_cat_tier1_field",
				"Resolution OptCat Tier1"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn",
				"Resolution OptCat Tier1"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolution_cat_tier1", ResolutionOptCat1));

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "resolved_resolution_field", "Resolution"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Resolution"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolved_resolution_field", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_editor", ""));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "summary_editor", Resolution));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_ok_btn", ""));
		
		

		APP_LOGS.debug(
				(String) verifyfieldisempty_method.invoke(keywords, "resolved_status_reason_field", "Status Reason"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Status Reason"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolved_status_reason", StatusReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "ci_field", "CI+ Detail"));
	/*	APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "ci_field", "CI+ Detail"));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "mandate_error_message",
				"You must associate a configuration item to this incident. (ARERR 45534)"));
*/
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "search_resolution_ci", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "resolution_ci_search", ResolutionCI));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolution_ci_search_btn", ""));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolution_ci_search_select", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));

		//APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_btn", ""));
		//APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", "Resolved"));
		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));

	}
	
	@And("^Resolution Category Tier 1 is mandatory when updating status from Pending to Resolved using Status dropdown \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void resOptCat1MandatoryPNDGTORESOStatusDrop (String Resolution, String ResolutionCI, String StatusReason,
			String ResolutionOptCat1, String Assignee) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(Resolution Category Tier 1 is mandatory when updating status from Pending to Resolved using Status dropdown)");

		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "assignee_field", "Assignee"));
		
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "resol_cat_tier1_field",
				"Resolution OptCat Tier1"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn",
				"Resolution OptCat Tier1"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolution_cat_tier1", ResolutionOptCat1));

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "resolved_resolution_field", "Resolution"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Resolution"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolved_resolution_field", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_editor", ""));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "summary_editor", Resolution));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_ok_btn", ""));
		
		

		APP_LOGS.debug(
				(String) verifyfieldisempty_method.invoke(keywords, "resolved_status_reason_field", "Status Reason"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Status Reason"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolved_status_reason", StatusReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "ci_field", "CI+ Detail"));
		
	/*	APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "ci_field", "CI+ Detail"));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "mandate_error_message",
				"You must associate a configuration item to this incident. (ARERR 45534)"));
*/
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "search_resolution_ci", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "resolution_ci_search", ResolutionCI));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolution_ci_search_btn", ""));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolution_ci_search_select", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));
		
		

		//APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_btn", ""));
		//APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", "Resolved"));
		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));

	}
	
	@And("^Resolution Category Tier 1 is mandatory when updating status from Assigned to Closed using Status dropdown \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void resOptCat1MandatoryASGTOCLSDStausDrop(String Resolution, String ResolutionCI, String StatusReason,
			String ResolutionOptCat1, String Assignee) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(Resolution Category Tier 1 is mandatory when updating status from Assigned to Closed using Status dropdown)");

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "assignee_field", "Assignee"));
		APP_LOGS.debug((String)	verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Assignee"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "assignee_field", Assignee));

		
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "resol_cat_tier1_field",
				"Resolution OptCat Tier1"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn",
				"Resolution OptCat Tier1"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolution_cat_tier1", ResolutionOptCat1));

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "resolved_resolution_field", "Resolution"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Resolution"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolved_resolution_field", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_editor", ""));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "summary_editor", Resolution));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_ok_btn", ""));
		
		APP_LOGS.debug(
				(String) verifyfieldisempty_method.invoke(keywords, "resolved_status_reason_field", "Status Reason"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Status Reason"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolved_status_reason", StatusReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "ci_field", "CI+ Detail"));

	/*	APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "ci_field", "CI+ Detail"));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "mandate_error_message",
				"You must associate a configuration item to this incident. (ARERR 45534)"));
*/
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "search_resolution_ci", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "resolution_ci_search", ResolutionCI));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolution_ci_search_btn", ""));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolution_ci_search_select", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		
		
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));
		
	//	APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
	//	APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

	//	APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_btn", ""));
	//	APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", "Closed"));
		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));

	}
	
	@And("^Resolution Category Tier 1 is mandatory when updating status from InProgress to Closed using Status dropdown \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void resOptCat1MandatoryINPGTOCLSDStatusDrop(String Resolution, String ResolutionCI, String StatusReason,
			String ResolutionOptCat1) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(Resolution Category Tier 1 is mandatory when updating status from InProgress to Closed using Status dropdown)");

		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "assignee_field", "Assignee"));
		
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "resol_cat_tier1_field",
				"Resolution OptCat Tier1"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn",
				"Resolution OptCat Tier1"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolution_cat_tier1", ResolutionOptCat1));

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "resolved_resolution_field", "Resolution"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Resolution"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolved_resolution_field", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_editor", ""));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "summary_editor", Resolution));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_ok_btn", ""));
		
		

		APP_LOGS.debug(
				(String) verifyfieldisempty_method.invoke(keywords, "resolved_status_reason_field", "Status Reason"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Status Reason"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolved_status_reason", StatusReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "ci_field", "CI+ Detail"));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "mandate_error_message",
				"You must associate a configuration item to this incident. (ARERR 45534)"));

		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "search_resolution_ci", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "resolution_ci_search", ResolutionCI));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolution_ci_search_btn", ""));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolution_ci_search_select", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", "Closed"));
		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));

	}
	
	@And("^Resolution Category Tier 1 is mandatory when updating status from Pending to Closed using Status dropdown \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void resOptCat1MandatoryPNDGTOCLSDStatusDrop (String Resolution, String ResolutionCI, String StatusReason,
			String ResolutionOptCat1, String Assignee) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(Resolution Category Tier 1 is mandatory when updating status from Pending to Closed using Status dropdown)");

		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "assignee_field", "Assignee"));
		
		
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "resol_cat_tier1_field",
				"Resolution OptCat Tier1"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn",
				"Resolution OptCat Tier1"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolution_cat_tier1", ResolutionOptCat1));

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "resolved_resolution_field", "Resolution"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Resolution"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolved_resolution_field", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_editor", ""));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "summary_editor", Resolution));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_ok_btn", ""));
		
		

		APP_LOGS.debug(
				(String) verifyfieldisempty_method.invoke(keywords, "resolved_status_reason_field", "Status Reason"));
		APP_LOGS.debug((String) verifyfieldismandatory_method.invoke(keywords, "resolved_save_btn", "Status Reason"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolved_status_reason", StatusReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "ci_field", "CI+ Detail"));
		
	/*	APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "ci_field", "CI+ Detail"));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "mandate_error_message",
				"You must associate a configuration item to this incident. (ARERR 45534)"));
*/
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "search_resolution_ci", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "resolution_ci_search", ResolutionCI));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolution_ci_search_btn", ""));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolution_ci_search_select", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));

		//APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_btn", ""));
		//APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", "Closed"));
		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));

	}

}
