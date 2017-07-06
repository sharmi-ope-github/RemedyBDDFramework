package StepDefinitions;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sprint11_StepDefinitions extends StepDefinitions.Keywords {

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
	public static Method verifyfieldisreadonly_method;
	public static Method verifyfieldisnotempty_method;
	public static Method verifyinputtext_method;
	public static Method switchtodefaultwindow_method;
	public static Method getfielddetail_method;
	public static Method verifyfieldisnotreadOnly_method;
	public static Method verifyassignedgroupdetails_method;
	public static Method verifyfieldisempty_method;

	public Sprint11_StepDefinitions() throws NoSuchMethodException, SecurityException {
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
		verifylinktext_mehtod = keywords.getClass().getMethod("verifyLinkText", String.class, String.class);
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
	}

	@Given("^That an Incident has been assigned \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void searchAndAssignIncident(String Username, String Password, String IncidentID, String AssignedGroup,
			String Assignee, String InitialStatus) throws Throwable {
		APP_LOGS.debug("Running Test Step: @Given(That an Incident has been assigned)");

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
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", InitialStatus));

		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "assigned_group", AssignedGroup));
		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "assignee_field", Assignee));

	}

	@When("^an Incident is set to status Resolved \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void resolveIncident(String Resolution, String ResolutionCI, String StatusReason, String ResolutionOptCat1) throws Throwable {

		APP_LOGS.debug("Running Test Step: @When(an Incident is set to status Resolved)");

		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolve_btn", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolved_resolution_field", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_editor", ""));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "summary_editor", Resolution));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_ok_btn", ""));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolved_status_reason", StatusReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolution_cat_tier1", ResolutionOptCat1));

		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "search_resolution_ci", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "resolution_ci_search", ResolutionCI));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolution_ci_search_btn", ""));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolution_ci_search_select", ""));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));

	//	APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_btn", ""));
	//	APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", "Resolved"));
	}

	@Then("^the Assigned Group and Assignee fields will be locked$")
	public void verifyFieldReadOnly() throws Throwable {
		APP_LOGS.debug("Running Test Step: @Then(the Assigned Group and Assignee fields will be locked)");

		APP_LOGS.debug((String) scrolltoelement_method.invoke(keywords, "cm_vendor_ticket_number_field", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));

		APP_LOGS.debug((String) verifyfieldisreadonly_method.invoke(keywords, "assigned_group", "Assigned Group"));
		APP_LOGS.debug((String) verifyfieldisreadonly_method.invoke(keywords, "assignee_field", "Assignee"));

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));

	}

	@Given("^that an Incident is set to \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void incidentStatusUpdate(String Status, String Username, String Password, String IncidentID,
			String StatusReason) throws Throwable {
		APP_LOGS.debug("Running Test Step: @Given(that an Incident is set to status " + Status + ")");

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

		APP_LOGS.debug((String) scrolltoelement_method.invoke(keywords, "cm_vendor_ticket_number_field", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "status_dropdown", Status));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "status_reason", StatusReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

	}

	@When("^I search and Open the incident \"([^\"]*)\"$")
	public void searchAnIncidentRecord(String IncidentID) throws Throwable {
		APP_LOGS.debug("Running Test Step: @Given(I search and Open the incident " + IncidentID + ")");
		
		
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "incident_refresh_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));

		APP_LOGS.debug((String) scrolltoelement_method.invoke(keywords, "cm_vendor_ticket_number_field", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

	}

	@Given("^that an Incident is \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verifyIncidentStatus(String InitialStatus, String Username, String Password, String IncidentID)
			throws Throwable {
		APP_LOGS.debug("Running Test Step: @Given(that an Incident is " + InitialStatus + ")");

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

	}

	@When("^the Incident is re-opened \"([^\"]*)\"$")
	public void reOpenAnIncidentRecord(String Status) throws Throwable {
		APP_LOGS.debug("Running Test Step: @When(the Incident is re-opened)");

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "progress_incident_closure", "Reopen"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", Status));

	}

	@Then("^the Assigned Group and Assignee fields will be editable again$")
	public void verifyFieldNotReadOnly() throws Throwable {
		APP_LOGS.debug("Running Test Step: @Then(the Assigned Group and Assignee fields will be editable again)");

		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "assigned_group", "Assigned Group"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "assignee_field", "Assignee"));

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));
	}

	@Given("^I search an Incident record \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verifyIncident(String Username, String Password, String IncidentID) throws Throwable {
		APP_LOGS.debug("Running Test Step: @Given(I search an Incident record " + IncidentID + ")");

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

	}

	@When("^Verify the Incident status \"([^\"]*)\"$")
	public void getIncidentStatus(String status) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @When(Verify the Incident status)");
		
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", status));

		APP_LOGS.debug("The status of the Incident is :"
				+ (String) getfielddetail_method.invoke(keywords, "status_field", ""));
		

	}

	@Then("^Assigned Group and Assignee fields are not locked when status is not Resolved/Cancelled/Closed$")
	public void verifyFieldNotLocked() throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @Then(Assigned Group and Assignee fields are not locked when status is not Resolved/Cancelled/Closed)");

		APP_LOGS.debug((String) verifyassignedgroupdetails_method.invoke(keywords, "assigned_group", "Assigned Group"));
		APP_LOGS.debug((String) verifyassignedgroupdetails_method.invoke(keywords, "assignee_field", "Assignee"));

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));
	}

	@Given("^Incident is in Assigned status and Assignee is not set \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verifyIncidentWithoutAssignee(String Username, String Password, String IncidentID, String AssignedGroup)
			throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @Given(Incident is in Assigned status and Assignee is not set " + IncidentID + ")");

		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "user_name", Username));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "password", Password));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "login_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "10000"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "application_link", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "700"));
		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "incident_management", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "700"));
		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "search_incident", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "800"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "search_incident", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "incident_id_field", IncidentID));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "search_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "assigned_group", AssignedGroup));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "assignee_field", "Assignee"));

	}

	@Then("^Assigned Group is locked and Assignee is editable \"([^\"]*)\"$")
	public void verifyAssigneeIsEditable(String Assignee) throws Throwable {
		APP_LOGS.debug("Running Test Step: @Then(Assigned Group is locked and Assignee is editable)");

		APP_LOGS.debug((String) scrolltoelement_method.invoke(keywords, "cm_vendor_ticket_number_field", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));

		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", "Resolved"));

		APP_LOGS.debug((String) verifyfieldisreadonly_method.invoke(keywords, "assigned_group", "Assigned Group"));

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "assignee_field", "Assignee"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "assignee_field", "Assignee"));
		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "assignee_field", Assignee));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

	}

	@And("^I can Re-Open the Incident successfully$")
	public void reOpenResolvedIncidentRecord() throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(I can Re-Open the Incident successfully)");

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "progress_incident_closure", "Reopen"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", "In Progress"));

		APP_LOGS.debug((String) verifyassignedgroupdetails_method.invoke(keywords, "assigned_group", "Assigned Group"));
		APP_LOGS.debug((String) verifyassignedgroupdetails_method.invoke(keywords, "assignee_field", "Assignee"));

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));

	}

	@And("^I can Close the Incident successfully \"([^\"]*)\"$")
	public void closeResolvedIncidentRecord(String ClosureReason) throws Throwable {
		
		APP_LOGS.debug(
				"Running Test Step: @And(I can Close the Incident successfully)");

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "progress_incident_closure", "Close"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));

		APP_LOGS.debug((String) switchtoparentwindow_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolved_status_reason", ClosureReason));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "closure_status_reason_ok_btn", ""));
		// APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords,
		// "", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", "Closed"));

		APP_LOGS.debug((String) verifyassignedgroupdetails_method.invoke(keywords, "assigned_group", "Assigned Group"));
		APP_LOGS.debug((String) verifyassignedgroupdetails_method.invoke(keywords, "assignee_field", "Assignee"));

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));

	}

	@Given("^An incident is not Resolved and Restore Date is NOT set \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verifyIncidentWithoutRestoredDate(String Username, String Password, String IncidentID, String InitialStatus)
			throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @Given(An incident is not Resolved and Restore Date is NOT set " + IncidentID + ")");

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

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_date_system_tab", ""));

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "in_restored_date", "Restored Date"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "in_restored_date", "Restored Date"));
		APP_LOGS.debug(
				(String) verifyfieldisreadonly_method.invoke(keywords, "in_last_resolved_date", "Last Resolved Date"));
		APP_LOGS.debug(
				(String) verifyfieldisempty_method.invoke(keywords, "in_last_resolved_date", "Last Resolved Date"));

	}

	@Then("^Restored Date is set to the Last Resovled Date and displayed as read-only$")
	public void restoreDateSetWithLastResolvedDate() throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @Then(Restored Date is set to the Last Resovled Date and displayed as read-only)");

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_date_system_tab", ""));
		APP_LOGS.debug((String) verifyfieldisreadonly_method.invoke(keywords, "in_restored_date", "Restored Date"));
		APP_LOGS.debug(
				(String) verifyfieldisreadonly_method.invoke(keywords, "in_last_resolved_date", "Last Resolved Date"));

		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "in_restored_date", "Restored Date"));
		APP_LOGS.debug(
				(String) verifyfieldisnotempty_method.invoke(keywords, "in_last_resolved_date", "Last Resolved Date"));

		APP_LOGS.debug(
				(String) saveattributetoxls_method.invoke(keywords, "in_last_resolved_date", "LastResolvedDate"));
		APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "in_restored_date",
				(String) getruntimeproperty_method.invoke(keywords, "LastResolvedDate", "")));

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));

	}
	
	@Given("^An incident is not Resolved and Restore Date set manually \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verifyIncidentWithRestoredDateNotResolved(String Username, String Password, String IncidentID,String RestoredDate)
			throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @Given(An incident is not Resolved and Restore Date set manually " + IncidentID + ")");

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

		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", "In Progress"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_date_system_tab", ""));

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "in_restored_date", "Restored Date"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "in_restored_date", "Restored Date"));
		APP_LOGS.debug(
				(String) verifyfieldisreadonly_method.invoke(keywords, "in_last_resolved_date", "Last Resolved Date"));
		APP_LOGS.debug(
				(String) verifyfieldisempty_method.invoke(keywords, "in_last_resolved_date", "Last Resolved Date"));
		
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "in_restored_date", RestoredDate));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

	}
	
	@Then("^Restored Date field is read-only and same as user entered \"([^\"]*)\"$")
	public void restoreDateSetAsUserEntered(String RestoredDate) throws Throwable {
		APP_LOGS.debug("Running Test Step: @Then(Restored Date field is read-only and same as user entered )");

		
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_date_system_tab", ""));
		APP_LOGS.debug((String) verifyfieldisreadonly_method.invoke(keywords, "in_restored_date", "Restored Date"));
		APP_LOGS.debug(
				(String) verifyfieldisreadonly_method.invoke(keywords, "in_last_resolved_date", "Last Resolved Date"));

		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "in_restored_date", "Restored Date"));
		APP_LOGS.debug(
				(String) verifyfieldisnotempty_method.invoke(keywords, "in_last_resolved_date", "Last Resolved Date"));

		APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "in_restored_date", RestoredDate));

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));

	}


	@Given("^An incident is in Resolved status with Restore Date \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verifyResolvedWithRestoredDate(String Username, String Password, String IncidentID, String InitialStatus)
			throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @Given(An incident is in Resolved status with Restore Date " + IncidentID + ")");

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

		
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_date_system_tab", ""));
		APP_LOGS.debug((String) verifyfieldisreadonly_method.invoke(keywords, "in_restored_date", "Restored Date"));
		APP_LOGS.debug(
				(String) verifyfieldisreadonly_method.invoke(keywords, "in_last_resolved_date", "Last Resolved Date"));

		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "in_restored_date", "Restored Date"));
		APP_LOGS.debug(
				(String) verifyfieldisnotempty_method.invoke(keywords, "in_last_resolved_date", "Last Resolved Date"));

	}
	
	@When("^an incident is progressed to Closed status from Resolved \"([^\"]*)\",\"([^\"]*)\"$")
	public void progressIncidentFromResolvedToClosedStatus(String Status, String ClosureReason) throws Throwable {
		
		APP_LOGS.debug("Running Test Step: @When(an incident is progressed to Closed status from Resolved)");

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "progress_incident_closure", Status));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));

		APP_LOGS.debug((String) switchtoparentwindow_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolved_status_reason", ClosureReason));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "closure_status_reason_ok_btn", ""));
		// APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords,
		// "", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", Status));

	}
	
	@Then("^Restored date is read only and not NULL$")
	public void restoreDateReadOnlyAndNotNull() throws Throwable {
		APP_LOGS.debug("Running Test Step: @Then(Restored date is read only and not NULL)");

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_date_system_tab", ""));
		
		APP_LOGS.debug((String) verifyfieldisreadonly_method.invoke(keywords, "in_restored_date", "Restored Date"));
		APP_LOGS.debug(
				(String) verifyfieldisreadonly_method.invoke(keywords, "in_last_resolved_date", "Last Resolved Date"));

		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "in_restored_date", "Restored Date"));
		APP_LOGS.debug(
				(String) verifyfieldisnotempty_method.invoke(keywords, "in_last_resolved_date", "Last Resolved Date"));
		
		
		APP_LOGS.debug("The Restore Date set on the Incident is :"
				+ (String) getfielddetail_method.invoke(keywords, "in_restored_date", ""));
		APP_LOGS.debug("The Last Resolved Date set on the Incident is :"
				+ (String) getfielddetail_method.invoke(keywords, "in_last_resolved_date", ""));
		

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));

	}
	

	@When("^an incident is progressed to Closed status from Assigned/InProgress \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void progressIncidentFromAssignedInProgressToClosedStatus(String Status, String Assignee, String Resolution, String ResolutionCI) throws Throwable {
		
		APP_LOGS.debug("Running Test Step: @When(an incident is progressed to Closed status from Assigned/InProgress)");

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "progress_incident_closure", "Next Stage|Closed"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));

		APP_LOGS.debug((String) switchtoparentwindow_method.invoke(keywords, "", ""));
		
		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "assignee_field", Assignee));
		
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolved_resolution_field", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_editor", ""));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "summary_editor", Resolution));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_ok_btn", ""));

		
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "search_resolution_ci", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "resolution_ci_search", ResolutionCI));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolution_ci_search_btn", ""));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolution_ci_search_select", ""));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", Status));

	}
	
	@When("^an incident is progressed to Cancelled status from Assigned/InProgress \"([^\"]*)\",\"([^\"]*)\"$")
	public void progressIncidentFromAssignedInProgressToCancelledStatus(String Status, String CancelReason) throws Throwable {
		
		APP_LOGS.debug("Running Test Step: @When(an incident is progressed to Cancelled status from Assigned/InProgress)");

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "progress_incident_closure", "Next Stage|Cancel"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));

		APP_LOGS.debug((String) switchtoparentwindow_method.invoke(keywords, "", ""));
				
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "in_cancel_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolved_status_reason", CancelReason));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "closure_status_reason_ok_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "status_field", Status));

	}
	
	@Then("^Restored Date is set to NULL and displayed as read-only$")
	public void restoreDateReadOnlyAndNull() throws Throwable {
		APP_LOGS.debug("Running Test Step: @Then(Restored Date is set to NULL and displayed as read-only)");

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_date_system_tab", ""));
		
		APP_LOGS.debug((String) verifyfieldisreadonly_method.invoke(keywords, "in_restored_date", "Restored Date"));
		APP_LOGS.debug(
				(String) verifyfieldisreadonly_method.invoke(keywords, "in_last_resolved_date", "Last Resolved Date"));

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "in_restored_date", "Restored Date"));
		APP_LOGS.debug(
				(String) verifyfieldisnotempty_method.invoke(keywords, "in_last_resolved_date", "Last Resolved Date"));
		
		
		APP_LOGS.debug("The Last Resolved Date set on the Incident is :"
				+ (String) getfielddetail_method.invoke(keywords, "in_last_resolved_date", ""));
		

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));

	}
	
	@Then("^Restored Date becomes editable(NULL) and Last Resolved Date becomes ReadOnly(NULL)$")
	public void restoredDateEditableNull() throws Throwable {
		APP_LOGS.debug("Running Test Step: @Then(Restored Date becomes editable(NULL) and Last Resolved Date becomes ReadOnly(NULL))");

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_date_system_tab", ""));
		
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "in_restored_date", "Restored Date"));
		APP_LOGS.debug(
				(String) verifyfieldisreadonly_method.invoke(keywords, "in_last_resolved_date", "Last Resolved Date"));

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "in_restored_date", "Restored Date"));
		APP_LOGS.debug(
				(String) verifyfieldisempty_method.invoke(keywords, "in_last_resolved_date", "Last Resolved Date"));
		
		
		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));

	}
}
