package StepDefinitions;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sprint14_StepDefinitions extends StepDefinitions.Keywords {
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
	public static Method switchtonewframe_method;
	public static Method switchtothisframe_method;
	public static Method verifyrestoreddatelesserthanreporteddate_method;
	public static Method verifyrestoreddategreaterthanlastresolveddate_method;
	public static Method verifyrestoreddatelesserthanreporteddateduringcreation_method;
	public static Method copychangeandcreatenewchangerecord_method;
	public static Method clearfield_mehtod;
	public static Method getservicerequestid_method;
	public static Method verifyfieldmandatoryinsrdform_method;
	public static Method selectmenuoptionsrdform_method;
	public static Method verifyworkordernotesdetails_method;
	public static Method verifyincidentrecordnotesdetails_method;
	public static Method pagesync_method;

	public Sprint14_StepDefinitions() throws NoSuchMethodException, SecurityException {
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
		switchtonewframe_method = keywords.getClass().getMethod("switchToNewFrame", String.class, String.class);
		switchtothisframe_method = keywords.getClass().getMethod("switchToThisFrame", String.class, String.class);
		verifyrestoreddatelesserthanreporteddate_method = keywords.getClass()
				.getMethod("verifyRestoredDateLesserThanReportedDate", String.class, String.class);
		verifyrestoreddategreaterthanlastresolveddate_method = keywords.getClass()
				.getMethod("verifyRestoredDateGreaterThanLastResolvedDate", String.class, String.class);

		verifyrestoreddatelesserthanreporteddateduringcreation_method = keywords.getClass()
				.getMethod("verifyRestoredDateLesserThanReportedDateDuringCreation", String.class, String.class);

		copychangeandcreatenewchangerecord_method = keywords.getClass().getMethod("copyChangeAndCreateNewChangeRecord",
				String.class, String.class);
		clearfield_mehtod = keywords.getClass().getMethod("clearField", String.class, String.class);
		getservicerequestid_method = keywords.getClass().getMethod("getServiceRequestID", String.class, String.class);
		verifyfieldmandatoryinsrdform_method = keywords.getClass().getMethod("verifyFieldMandatoryInSRDForm",
				String.class, String.class);
		selectmenuoptionsrdform_method = keywords.getClass().getMethod("selectMenuOptionSRDForm", String.class,
				String.class);
		verifyworkordernotesdetails_method = keywords.getClass().getMethod("verifyWorkOrderNotesDetails", String.class,
				String.class);
		verifyincidentrecordnotesdetails_method = keywords.getClass().getMethod("verifyIncidentRecordNotesDetails",
				String.class, String.class);		
		pagesync_method = keywords.getClass().getMethod("pageSync", String.class, String.class);
	}

	@Given("^I am raising the Service Reqeust %TrueSight ID Request% on behalf of an user \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void navigateToTrueSightIDRequestForm(String Username, String Password, String RequestedForFullName)
			throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @Given(I am raising the Service Reqeust %TrueSight ID Request% on behalf of an user)");

		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "user_name", Username));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "password", Password));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "login_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "10000"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "application_link", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "service_request_management", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "request_entry", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "request_entry", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "10000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_request_settings_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_request_on_behalf_of", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) switchtothisframe_method.invoke(keywords, "", "1"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));

		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "obo_fullname_field", RequestedForFullName));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "obo_fullname_search_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "obo_user_search_result", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "obo_user_select_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));

		APP_LOGS.debug((String) switchtoparentwindow_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_request_browse", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) switchtonewframe_method.invoke(keywords, "", ""));

		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "identity_management", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "identity_management", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));

		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "identity_management_subcategory", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "identity_management_subcategory", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));

		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "system_access", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "system_access", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));

		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "system_access_subcategory", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "system_access_subcategory", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));

		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "systems_qtoz", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "systems_qtoz", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "true_sight_id_request", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "request_now_btn", ""));
		APP_LOGS.debug((String) switchtoparentwindow_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

	}

	@And("^Test condition Organisation!=Other and Status=Permanent/Contractor \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void requestOrganisationNotOtherAndStautsPermanentOrContractor(String RequesterEmail,
			String RequesterTelephoneNumber, String RequesterGrade, String RequestedForLANID, String RequestedForOUC,
			String RequestedForEIN, String RequestedForLineManager, String RequestedForLocation,
			String RequestedForEmail, String RequestedForTelephoneNumber, String RequestedForDepartment,
			String Organisation, String TeamName, String RoleName, String Grade, String Status) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(Test condition Organisation!=Other and Status=Permanent(or)Contractor)");

		APP_LOGS.debug((String) switchtothisframe_method.invoke(keywords, "", "2"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "instructions_icon", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "instructions_message",
				"You cannot submit a request for yourself.This form must be used to submit a request ‘on behalf of’ the user and cannot be completed until the user has a LAN ID.Please close this form and click on the settings icon (top RH side).  Select ‘On Behalf of’ and search for the person you wish to submit a request for, highlight them and click on select.  Once you have completed the request, go back to settings and click on ‘Back to Myself’."));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_submission_validation_radio_label",
				"Submission Validation *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,	"truesight_submission_validation_radio_validation_result", "Submission Validation"));
		APP_LOGS.debug(
				(String) clickelement_method.invoke(keywords, "truesight_submission_validation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_submission_validation_radio_field",
				"I have read the instructions and am authorised to submit on behalf of this user."));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requester_email_label",
				"Requester Email *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requester_email_field",
				"Requester Email"));
		APP_LOGS.debug(
				(String) verifyinputtext_method.invoke(keywords, "truesight_requester_email_field", RequesterEmail));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requester_telephone_number_label",
				"Requester Telephone Number *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords,
				"truesight_requester_telephone_number_field", "Requester Telephone Number"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_requester_telephone_number_field",
				RequesterTelephoneNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requester_grade_label",
				"Requester Grade *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,"truesight_requester_grade_validation_result", "Requester Grade"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "truesight_requester_grade_dropdown",
				RequesterGrade));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requester_grade_field_note",
				"This form can only be submitted by managers MPG2 and above or an authorised nominee."));

		APP_LOGS.debug(
				(String) verifylinktext_method.invoke(keywords, "truesight_requested_for_lan_id_label", "LAN ID *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_lan_id_field",
				"Requested For LANID"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_lan_id_field",
				RequestedForLANID));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_ouc_label", "OUC *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_ouc_field",
				"Requested For OUC"));
		APP_LOGS.debug(
				(String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_ouc_field", RequestedForOUC));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_ein_label", "EIN *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_ein_field",
				"Requested For EIN"));
		APP_LOGS.debug(
				(String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_ein_field", RequestedForEIN));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_line_Manager_label",
				"Line Manager *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_line_Manager_field",
				"Requested For Line Manager"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_line_Manager_field",
				RequestedForLineManager));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_location_label",
				"Location *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_location_field",
				"Requested For Location"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_location_field",
				RequestedForLocation));

		APP_LOGS.debug(
				(String) verifylinktext_method.invoke(keywords, "truesight_requested_for_email_label", "Email *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_email_field",
				"Requested For Email"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_email_field",
				RequestedForEmail));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_telephone_number_label",
				"Telephone Number *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_requested_for_telephone_number_field", "Requested For Telephone Number"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords,
				"truesight_requested_for_telephone_number_field", RequestedForTelephoneNumber));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_department_label",
				"Department *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_department_field",
				"Requested For Department"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_department_field",
				RequestedForDepartment));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_select_organisation_label",
				"Please select Organisation *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,"truesight_select_organisation_validation_result", "Please select Organisation"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords,
				"truesight_select_organisation_dropdown", Organisation));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_team_name_label", "Team Name *"));
		APP_LOGS.debug(
				(String) verifyfieldisnotreadOnly_method.invoke(keywords, "truesight_team_name_field", "Team Name"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,"truesight_team_name_validation_result", "Team Name"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_team_name_field", TeamName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_role_name_label", "Role Name *"));
		APP_LOGS.debug(
				(String) verifyfieldisnotreadOnly_method.invoke(keywords, "truesight_role_name_field", "Role Name"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,"truesight_role_name_validation_result", "Role Name"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_role_name_field", RoleName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_role_name_field_note",
				"Please provide the specific job role name for the user."));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_grade_label", "Grade *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "truesight_grade_field", "Grade"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,"truesight_grade_validation_result", "Grade"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_grade_field", Grade));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		String status_radio = "";
		String status = Status;
		if (status.equals("Permanent")) {
			status_radio = "truesight_select_permanent";
		} else if (status.equals("Contractor")) {
			status_radio = "truesight_select_contractor";
		} else if (status.equals("Workpackage/3rd Party")) {
			status_radio = "truesight_select_workpackage_3rdparty";
		}
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_select_status_label", "Status *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,"truesight_select_status_validation_result", "Status"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "" + status_radio + "_radio_btn_label", Status));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "" + status_radio + "_radio_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

	}

	@When("^I select \"([^\"]*)\" and provide all other mandatory details \"([^\"]*)\"$")
	public void submitChangeTemplateServiceRequestForm(String TypeOfRequest, String Status) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(I select " + TypeOfRequest + " and provide all other mandatory details)");

		String role_radio = "";
		String status = "";
		String access_type = "";
		if (Status.equals("Permanent")) {
			status = "permanent";
		} else if (Status.equals("Contractor")) {
			status = "contractor";
		} else if (Status.equals("Workpackage/3rd Party")) {
			status = "workpackage";
		}

		if (TypeOfRequest.equals("New Role")) {
			role_radio = "new_role";
			access_type = "Please select all the role(s) you need access to. *";
		} else if (TypeOfRequest.equals("Modify Role")) {
			role_radio = "modify_role";
			access_type = "Please select all role(s) you require including existing roles you have access to. *";
		} else if (TypeOfRequest.equals("Remove Role")) {
			role_radio = "remove_role";
			access_type = "Please select the role(s) that you want removing. *";
		}

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "" + status + "_type_of_request_label",
				"Type of Request *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,"" + status + "_type_of_request_validation_result", "Type of Request"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords,
				"" + status + "_type_of_request_dropdown", TypeOfRequest));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"" + status + "_" + role_radio + "_select_all_roles_label", access_type));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,"" + status + "_" + role_radio + "_select_all_roles_validation_result", access_type));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"" + status + "_" + role_radio + "_itcc_application_operator_label", "ITCC Application Operator"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords,
				"" + status + "_" + role_radio + "_itcc_application_operator_radio_btn", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"" + status + "_" + role_radio + "_itcc_supervisor_label", "ITCC Supervisor"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords,
				"" + status + "_" + role_radio + "_itcc_supervisor_radio_btn", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"" + status + "_" + role_radio + "_nmc_application_operator_label", "NMC Application Operator"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords,
				"" + status + "_" + role_radio + "_nmc_application_operator_radio_btn", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"" + status + "_" + role_radio + "_nmc_supervisor_label", "NMC Supervisor"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords,
				"" + status + "_" + role_radio + "_nmc_supervisor_radio_btn", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"" + status + "_" + role_radio + "_soa_service_operator_label", "SOA Service Operator"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords,
				"" + status + "_" + role_radio + "_soa_service_operator_radio_btn", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"" + status + "_" + role_radio + "_soa_supervisor_label", "SOA Supervisor"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords,
				"" + status + "_" + role_radio + "_soa_supervisor_radio_btn", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"" + status + "_" + role_radio + "_smart_metering_service_operator_label",
				"Smart Metering Service Operator"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords,
				"" + status + "_" + role_radio + "_smart_metering_service_operator_radio_btn", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"" + status + "_" + role_radio + "_smart_metering_supervisor_label", "Smart Metering Supervisor"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords,
				"" + status + "_" + role_radio + "_smart_metering_supervisor_radio_btn", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"" + status + "_" + role_radio + "_indra_super_admin_label", "Indra SuperAdmin"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords,
				"" + status + "_" + role_radio + "_indra_super_admin_radio_btn", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"" + status + "_" + role_radio + "_application_support_read_only_label",
				"Application Support – Read only"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords,
				"" + status + "_" + role_radio + "_application_support_read_only_radio_btn", ""));

	}

	@And("^I submit the TrueSightID Serviec Request form$")
	public void submitTrueSightIDServiceRequestForm() throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(I submit the TrueSightID Serviec Request form)");

		APP_LOGS.debug((String) switchtoparentwindow_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) getservicerequestid_method.invoke(keywords, "true_sight_id_service_request_submit_btn",
				"RequestID"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "50000"));

	}

	@Then("^the system will create a Work Order to correct support group \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void serviceRequestCreatesWorkOrderToCorrectSupportGroup(String WOSummary, String WOPriority,
			String WOSupportGroupName, String WOCompany, String WOOptCatTier1, String WOOptCatTier2,
			String WOOptCatTier3, String WOProdCatTier1, String WOProdCatTier2, String WOProdCatTier3,
			String WOProductName) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(the system will create a Work Order to correct support group)");

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_request_home_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_request_it_home_page", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "application_link", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "service_request_management", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "search_work_order", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "search_work_order", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "25000"));

		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "associated_request_id_field",
				(String) getruntimeproperty_method.invoke(keywords, "RequestID", "")));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "search_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "Summary_Detail", WOSummary));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "work_order_priority_field", WOPriority));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "wo_request_manager_support_group_name_field",
				WOSupportGroupName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "wo_request_assignee_support_group_name_field",
				WOSupportGroupName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "wo_categorization_tab", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "wo_company_field", WOCompany));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "wo_optcat_tier1_field", WOOptCatTier1));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "wo_optcat_tier2_field", WOOptCatTier2));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "wo_optcat_tier3_field", WOOptCatTier3));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "wo_prodcat_tier1_field", WOProdCatTier1));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "wo_prodcat_tier2_field", WOProdCatTier2));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "wo_prodcat_tier3_field", WOProdCatTier3));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "wo_productname_field", WOProductName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

	}

	@And("^the Work Order Notes field will contain all the details provided in the Service Request for condition Organisation!=Other and Status=Permanent/Contractor \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validateWorkOrderNotesDetailsOrganisationNotOtherAndStautsPermanentOrContractor(String RequesterEmail,
			String RequesterTelephoneNumber, String RequesterGrade, String RequestedForLANID, String RequestedForOUC,
			String RequestedForEIN, String RequestedForLineManager, String RequestedForLocation,
			String RequestedForEmail, String RequestedForTelephoneNumber, String RequestedForDepartment,
			String Organisation, String TeamName, String RoleName, String Grade, String Status, String TypeOfRequest)
			throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(the Work Order Notes field will contain all the details provided in the Service Request for condition Organisation!=Other and Status=Permanent(or)Contractor)");

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Submission Validation : I have read the instructions and am authorised to submit on behalf of this user."));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Requester Email : " + RequesterEmail));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Requester Telephone Number : " + RequesterTelephoneNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Requester Grade : " + RequesterGrade));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"LAN ID : " + RequestedForLANID));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"OUC : " + RequestedForOUC));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"EIN : " + RequestedForEIN));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Line Manager : " + RequestedForLineManager));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Location : " + RequestedForLocation));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Email : " + RequestedForEmail));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Telephone Number : " + RequestedForTelephoneNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Department : " + RequestedForDepartment));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Please select Organisation : " + Organisation));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Team Name : " + TeamName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Role Name : " + RoleName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Grade : " + Grade));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Status : " + Status));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Type of Request : " + TypeOfRequest));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"ITCC Application Operator"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"ITCC Supervisor"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"NMC Application Operator"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"NMC Supervisor"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"SOA Service Operator"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"SOA Supervisor"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Smart Metering Service Operator"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Smart Metering Supervisor"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Indra SuperAdmin"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Application Support – Read only"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "logout_button", ""));

	}

	@And("^Test condition Organisation=Other and Status=Permanent/Contractor \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void requestOrganisationOtherAndStautsPermanentOrContractor(String RequesterEmail,
			String RequesterTelephoneNumber, String RequesterGrade, String RequestedForLANID, String RequestedForOUC,
			String RequestedForEIN, String RequestedForLineManager, String RequestedForLocation,
			String RequestedForEmail, String RequestedForTelephoneNumber, String RequestedForDepartment,
			String Organisation, String OrganisationDetails, String TeamName, String RoleName, String Grade,
			String Status) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(Test condition Organisation=Other and Status=Permanent(or)Contractor)");

		APP_LOGS.debug((String) switchtothisframe_method.invoke(keywords, "", "2"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "instructions_icon", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "instructions_message",
				"This form must be used to submit a request ‘on behalf of’ the user and cannot be completed until the user has a LAN ID. Please close this form and click on the settings icon (top RH side).  Select ‘On Behalf of’ and search for the person you wish to submit a request for, highlight them and click on select.  Once you have completed the request, go back to settings and click on ‘Back to Myself’."));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_submission_validation_radio_label",
				"Submission Validation *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_submission_validation_radio_validation_result", "Submission Validation"));
		APP_LOGS.debug(
				(String) clickelement_method.invoke(keywords, "truesight_submission_validation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_submission_validation_radio_field",
				"I have read the instructions and am authorised to submit on behalf of this user."));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requester_email_label",
				"Requester Email *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requester_email_field",
				"Requester Email"));
		APP_LOGS.debug(
				(String) verifyinputtext_method.invoke(keywords, "truesight_requester_email_field", RequesterEmail));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requester_telephone_number_label",
				"Requester Telephone Number *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords,
				"truesight_requester_telephone_number_field", "Requester Telephone Number"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_requester_telephone_number_field",
				RequesterTelephoneNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requester_grade_label",
				"Requester Grade *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_requester_grade_validation_result", "Requester Grade"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "truesight_requester_grade_dropdown",
				RequesterGrade));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requester_grade_field_note",
				"This form can only be submitted by managers MPG2 and above or an authorised nominee."));

		APP_LOGS.debug(
				(String) verifylinktext_method.invoke(keywords, "truesight_requested_for_lan_id_label", "LAN ID *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_lan_id_field",
				"Requested For LANID"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_lan_id_field",
				RequestedForLANID));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_ouc_label", "OUC *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_ouc_field",
				"Requested For OUC"));
		APP_LOGS.debug(
				(String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_ouc_field", RequestedForOUC));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_ein_label", "EIN *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_ein_field",
				"Requested For EIN"));
		APP_LOGS.debug(
				(String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_ein_field", RequestedForEIN));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_line_Manager_label",
				"Line Manager *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_line_Manager_field",
				"Requested For Line Manager"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_line_Manager_field",
				RequestedForLineManager));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_location_label",
				"Location *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_location_field",
				"Requested For Location"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_location_field",
				RequestedForLocation));

		APP_LOGS.debug(
				(String) verifylinktext_method.invoke(keywords, "truesight_requested_for_email_label", "Email *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_email_field",
				"Requested For Email"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_email_field",
				RequestedForEmail));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_telephone_number_label",
				"Telephone Number *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_requested_for_telephone_number_field", "Requested For Telephone Number"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords,
				"truesight_requested_for_telephone_number_field", RequestedForTelephoneNumber));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_department_label",
				"Department *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_department_field",
				"Requested For Department"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_department_field",
				RequestedForDepartment));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_select_organisation_label",
				"Please select Organisation *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_select_organisation_validation_result", "Please select Organisation"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords,
				"truesight_select_organisation_dropdown", Organisation));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_team_name_label", "Team Name *"));
		APP_LOGS.debug(
				(String) verifyfieldisnotreadOnly_method.invoke(keywords, "truesight_team_name_field", "Team Name"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_team_name_validation_result", "Team Name"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_team_name_field", TeamName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_role_name_label", "Role Name *"));
		APP_LOGS.debug(
				(String) verifyfieldisnotreadOnly_method.invoke(keywords, "truesight_role_name_field", "Role Name"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_role_name_validation_result", "Role Name"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_role_name_field", RoleName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_role_name_field_note",
				"Please provide the specific job role name for the user."));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_grade_label", "Grade *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "truesight_grade_field", "Grade"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_grade_validation_result", "Grade"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_grade_field", Grade));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		String status_radio = "";
		String status = Status;
		if (status.equals("Permanent")) {
			status_radio = "truesight_select_permanent";
		} else if (status.equals("Contractor")) {
			status_radio = "truesight_select_contractor";
		} else if (status.equals("Workpackage/3rd Party")) {
			status_radio = "truesight_select_workpackage_3rdparty";
		}

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_select_status_label", "Status *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_select_status_validation_result", "Status"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "" + status_radio + "_radio_btn_label", Status));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "" + status_radio + "_radio_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_organisation_details_label",
				"Please provide details *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "truesight_organisation_details_field",
				"Organisation Details"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_organisation_details_validation_result", "Organisation Details"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "truesight_organisation_details_field", OrganisationDetails));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

	}

	@And("^the Work Order Notes field will contain all the details provided in the Service Request for condition Organisation=Other and Status=Permanent/Contractor \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validateWorkOrderNotesDetailsOrganisationOtherAndStautsPermanentOrContractor(String RequesterEmail,
			String RequesterTelephoneNumber, String RequesterGrade, String RequestedForLANID, String RequestedForOUC,
			String RequestedForEIN, String RequestedForLineManager, String RequestedForLocation,
			String RequestedForEmail, String RequestedForTelephoneNumber, String RequestedForDepartment,
			String Organisation, String OrganisationDetails, String TeamName, String RoleName, String Grade,
			String Status, String TypeOfRequest) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(the Work Order Notes field will contain all the details provided in the Service Request for condition Organisation=Other and Status=Permanent(or)Contractor)");

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Submission Validation : I have read the instructions and am authorised to submit on behalf of this user."));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Requester Email : " + RequesterEmail));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Requester Telephone Number : " + RequesterTelephoneNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Requester Grade : " + RequesterGrade));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"LAN ID : " + RequestedForLANID));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"OUC : " + RequestedForOUC));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"EIN : " + RequestedForEIN));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Line Manager : " + RequestedForLineManager));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Location : " + RequestedForLocation));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Email : " + RequestedForEmail));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Telephone Number : " + RequestedForTelephoneNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Department : " + RequestedForDepartment));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Please select Organisation : " + Organisation));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Please provide details : " + OrganisationDetails));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Team Name : " + TeamName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Role Name : " + RoleName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Grade : " + Grade));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Status : " + Status));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Type of Request : " + TypeOfRequest));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"ITCC Application Operator"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"ITCC Supervisor"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"NMC Application Operator"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"NMC Supervisor"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"SOA Service Operator"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"SOA Supervisor"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Smart Metering Service Operator"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Smart Metering Supervisor"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Indra SuperAdmin"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Application Support – Read only"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "logout_button", ""));

	}

	@And("^Test condition Organisation!=Other and Status=Workpackage/3rd Party \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void requestOrganisationNotOtherAndStautsWorkPackage3rdParty(String RequesterEmail,
			String RequesterTelephoneNumber, String RequesterGrade, String RequestedForLANID, String RequestedForOUC,
			String RequestedForEIN, String RequestedForLineManager, String RequestedForLocation,
			String RequestedForEmail, String RequestedForTelephoneNumber, String RequestedForDepartment,
			String Organisation, String TeamName, String RoleName, String Grade, String Status,
			String ManagedServiceProvider) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(Test condition Organisation!=Other and Status=Workpackage/3rd Party)");

		APP_LOGS.debug((String) switchtothisframe_method.invoke(keywords, "", "2"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "instructions_icon", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "instructions_message",
				"This form must be used to submit a request ‘on behalf of’ the user and cannot be completed until the user has a LAN ID. Please close this form and click on the settings icon (top RH side).  Select ‘On Behalf of’ and search for the person you wish to submit a request for, highlight them and click on select.  Once you have completed the request, go back to settings and click on ‘Back to Myself’."));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_submission_validation_radio_label",
				"Submission Validation *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_submission_validation_radio_validation_result", "Submission Validation"));
		APP_LOGS.debug(
				(String) clickelement_method.invoke(keywords, "truesight_submission_validation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_submission_validation_radio_field",
				"I have read the instructions and am authorised to submit on behalf of this user."));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requester_email_label",
				"Requester Email *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requester_email_field",
				"Requester Email"));
		APP_LOGS.debug(
				(String) verifyinputtext_method.invoke(keywords, "truesight_requester_email_field", RequesterEmail));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requester_telephone_number_label",
				"Requester Telephone Number *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords,
				"truesight_requester_telephone_number_field", "Requester Telephone Number"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_requester_telephone_number_field",
				RequesterTelephoneNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requester_grade_label",
				"Requester Grade *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_requester_grade_validation_result", "Requester Grade"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "truesight_requester_grade_dropdown",
				RequesterGrade));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requester_grade_field_note",
				"This form can only be submitted by managers MPG2 and above or an authorised nominee."));

		APP_LOGS.debug(
				(String) verifylinktext_method.invoke(keywords, "truesight_requested_for_lan_id_label", "LAN ID *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_lan_id_field",
				"Requested For LANID"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_lan_id_field",
				RequestedForLANID));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_ouc_label", "OUC *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_ouc_field",
				"Requested For OUC"));
		APP_LOGS.debug(
				(String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_ouc_field", RequestedForOUC));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_ein_label", "EIN *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_ein_field",
				"Requested For EIN"));
		APP_LOGS.debug(
				(String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_ein_field", RequestedForEIN));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_line_Manager_label",
				"Line Manager *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_line_Manager_field",
				"Requested For Line Manager"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_line_Manager_field",
				RequestedForLineManager));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_location_label",
				"Location *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_location_field",
				"Requested For Location"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_location_field",
				RequestedForLocation));

		APP_LOGS.debug(
				(String) verifylinktext_method.invoke(keywords, "truesight_requested_for_email_label", "Email *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_email_field",
				"Requested For Email"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_email_field",
				RequestedForEmail));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_telephone_number_label",
				"Telephone Number *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_requested_for_telephone_number_field", "Requested For Telephone Number"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords,
				"truesight_requested_for_telephone_number_field", RequestedForTelephoneNumber));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_department_label",
				"Department *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_department_field",
				"Requested For Department"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_department_field",
				RequestedForDepartment));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_select_organisation_label",
				"Please select Organisation *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_select_organisation_validation_result", "Please select Organisation"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords,
				"truesight_select_organisation_dropdown", Organisation));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_team_name_label", "Team Name *"));
		APP_LOGS.debug(
				(String) verifyfieldisnotreadOnly_method.invoke(keywords, "truesight_team_name_field", "Team Name"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_team_name_validation_result", "Team Name"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_team_name_field", TeamName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_role_name_label", "Role Name *"));
		APP_LOGS.debug(
				(String) verifyfieldisnotreadOnly_method.invoke(keywords, "truesight_role_name_field", "Role Name"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_role_name_validation_result", "Role Name"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_role_name_field", RoleName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_role_name_field_note",
				"Please provide the specific job role name for the user."));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_grade_label", "Grade *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "truesight_grade_field", "Grade"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_grade_validation_result", "Grade"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_grade_field", Grade));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		String status_radio = "";
		String status = Status;
		if (status.equals("Permanent")) {
			status_radio = "truesight_select_permanent";
		} else if (status.equals("Contractor")) {
			status_radio = "truesight_select_contractor";
		} else if (status.equals("Workpackage/3rd Party")) {
			status_radio = "truesight_select_workpackage_3rdparty";
		}
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_select_status_label", "Status *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_select_status_validation_result", "Status"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "" + status_radio + "_radio_btn_label", Status));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "" + status_radio + "_radio_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_managed_service_provider_name_label",
				"Managed Service Provider Name / Company Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords,
				"truesight_managed_service_provider_name_field", "Managed Service Provider Name / Company Name"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_managed_service_provider_name_validation_result",
				"Managed Service Provider Name / Company Name"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_managed_service_provider_name_field",
				ManagedServiceProvider));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

	}

	@And("^the Work Order Notes field will contain all the details provided in the Service Request for condition Organisation!=Other and Status=Workpackage/3rd Party \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validateWorkOrderNotesDetailsOrganisationNotOtherAndStautsWorkPackage3rdParty(String RequesterEmail,
			String RequesterTelephoneNumber, String RequesterGrade, String RequestedForLANID, String RequestedForOUC,
			String RequestedForEIN, String RequestedForLineManager, String RequestedForLocation,
			String RequestedForEmail, String RequestedForTelephoneNumber, String RequestedForDepartment,
			String Organisation, String TeamName, String RoleName, String Grade, String Status,
			String ManagedServiceProvider, String TypeOfRequest) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(the Work Order Notes field will contain all the details provided in the Service Request for condition Organisation!=Other and Status=Workpackage/3rd Party)");

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Submission Validation : I have read the instructions and am authorised to submit on behalf of this user."));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Requester Email : " + RequesterEmail));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Requester Telephone Number : " + RequesterTelephoneNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Requester Grade : " + RequesterGrade));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"LAN ID : " + RequestedForLANID));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"OUC : " + RequestedForOUC));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"EIN : " + RequestedForEIN));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Line Manager : " + RequestedForLineManager));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Location : " + RequestedForLocation));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Email : " + RequestedForEmail));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Telephone Number : " + RequestedForTelephoneNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Department : " + RequestedForDepartment));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Please select Organisation : " + Organisation));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Team Name : " + TeamName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Role Name : " + RoleName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Grade : " + Grade));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Status : " + Status));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Managed Service Provider Name / Company Name : " + ManagedServiceProvider));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Type of Request : " + TypeOfRequest));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"ITCC Application Operator"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"ITCC Supervisor"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"NMC Application Operator"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"NMC Supervisor"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"SOA Service Operator"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"SOA Supervisor"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Smart Metering Service Operator"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Smart Metering Supervisor"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Indra SuperAdmin"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Application Support – Read only"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "logout_button", ""));

	}

	@And("^Test condition Organisation=Other and Status=Workpackage/3rd Party \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void requestOrganisationOtherAndStautsWorkPackage3rdParty(String RequesterEmail,
			String RequesterTelephoneNumber, String RequesterGrade, String RequestedForLANID, String RequestedForOUC,
			String RequestedForEIN, String RequestedForLineManager, String RequestedForLocation,
			String RequestedForEmail, String RequestedForTelephoneNumber, String RequestedForDepartment,
			String Organisation, String OrganisationDetails, String TeamName, String RoleName, String Grade,
			String Status, String ManagedServiceProvider) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(Test condition Organisation=Other and Status=Workpackage/3rd Party)");

		APP_LOGS.debug((String) switchtothisframe_method.invoke(keywords, "", "2"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "instructions_icon", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "instructions_message",
				"This form must be used to submit a request ‘on behalf of’ the user and cannot be completed until the user has a LAN ID. Please close this form and click on the settings icon (top RH side).  Select ‘On Behalf of’ and search for the person you wish to submit a request for, highlight them and click on select.  Once you have completed the request, go back to settings and click on ‘Back to Myself’."));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_submission_validation_radio_label",
				"Submission Validation *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_submission_validation_radio_validation_result", "Submission Validation"));
		APP_LOGS.debug(
				(String) clickelement_method.invoke(keywords, "truesight_submission_validation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_submission_validation_radio_field",
				"I have read the instructions and am authorised to submit on behalf of this user."));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requester_email_label",
				"Requester Email *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requester_email_field",
				"Requester Email"));
		APP_LOGS.debug(
				(String) verifyinputtext_method.invoke(keywords, "truesight_requester_email_field", RequesterEmail));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requester_telephone_number_label",
				"Requester Telephone Number *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords,
				"truesight_requester_telephone_number_field", "Requester Telephone Number"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_requester_telephone_number_field",
				RequesterTelephoneNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requester_grade_label",
				"Requester Grade *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_requester_grade_validation_result", "Requester Grade"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "truesight_requester_grade_dropdown",
				RequesterGrade));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requester_grade_field_note",
				"This form can only be submitted by managers MPG2 and above or an authorised nominee."));

		APP_LOGS.debug(
				(String) verifylinktext_method.invoke(keywords, "truesight_requested_for_lan_id_label", "LAN ID *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_lan_id_field",
				"Requested For LANID"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_lan_id_field",
				RequestedForLANID));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_ouc_label", "OUC *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_ouc_field",
				"Requested For OUC"));
		APP_LOGS.debug(
				(String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_ouc_field", RequestedForOUC));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_ein_label", "EIN *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_ein_field",
				"Requested For EIN"));
		APP_LOGS.debug(
				(String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_ein_field", RequestedForEIN));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_line_Manager_label",
				"Line Manager *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_line_Manager_field",
				"Requested For Line Manager"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_line_Manager_field",
				RequestedForLineManager));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_location_label",
				"Location *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_location_field",
				"Requested For Location"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_location_field",
				RequestedForLocation));

		APP_LOGS.debug(
				(String) verifylinktext_method.invoke(keywords, "truesight_requested_for_email_label", "Email *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_email_field",
				"Requested For Email"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_email_field",
				RequestedForEmail));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_telephone_number_label",
				"Telephone Number *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_requested_for_telephone_number_field", "Requested For Telephone Number"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords,
				"truesight_requested_for_telephone_number_field", RequestedForTelephoneNumber));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_requested_for_department_label",
				"Department *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_requested_for_department_field",
				"Requested For Department"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_requested_for_department_field",
				RequestedForDepartment));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_select_organisation_label",
				"Please select Organisation *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_select_organisation_validation_result", "Please select Organisation"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords,
				"truesight_select_organisation_dropdown", Organisation));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_team_name_label", "Team Name *"));
		APP_LOGS.debug(
				(String) verifyfieldisnotreadOnly_method.invoke(keywords, "truesight_team_name_field", "Team Name"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_team_name_validation_result", "Team Name"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_team_name_field", TeamName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_role_name_label", "Role Name *"));
		APP_LOGS.debug(
				(String) verifyfieldisnotreadOnly_method.invoke(keywords, "truesight_role_name_field", "Role Name"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_role_name_validation_result", "Role Name"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_role_name_field", RoleName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_role_name_field_note",
				"Please provide the specific job role name for the user."));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_grade_label", "Grade *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "truesight_grade_field", "Grade"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_grade_validation_result", "Grade"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_grade_field", Grade));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		String status_radio = "";
		String status = Status;
		if (status.equals("Permanent")) {
			status_radio = "truesight_select_permanent";
		} else if (status.equals("Contractor")) {
			status_radio = "truesight_select_contractor";
		} else if (status.equals("Workpackage/3rd Party")) {
			status_radio = "truesight_select_workpackage_3rdparty";
		}
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_select_status_label", "Status *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_select_status_validation_result", "Status"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "" + status_radio + "_radio_btn_label", Status));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "" + status_radio + "_radio_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_organisation_details_label",
				"Please provide details *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "truesight_organisation_details_field",
				"Organisation Details"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_organisation_details_validation_result", "Organisation Details"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "truesight_organisation_details_field", OrganisationDetails));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_managed_service_provider_name_label",
				"Managed Service Provider Name / Company Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords,
				"truesight_managed_service_provider_name_field", "Managed Service Provider Name / Company Name"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_managed_service_provider_name_validation_result",
				"Managed Service Provider Name / Company Name"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_managed_service_provider_name_field",
				ManagedServiceProvider));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

	}

	@And("^the Work Order Notes field will contain all the details provided in the Service Request for condition Organisation=Other and Status=Workpackage/3rd Party \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validateWorkOrderNotesDetailsOrganisationOtherAndStautsWorkPackage3rdParty(String RequesterEmail,
			String RequesterTelephoneNumber, String RequesterGrade, String RequestedForLANID, String RequestedForOUC,
			String RequestedForEIN, String RequestedForLineManager, String RequestedForLocation,
			String RequestedForEmail, String RequestedForTelephoneNumber, String RequestedForDepartment,
			String Organisation, String OrganisationDetails, String TeamName, String RoleName, String Grade,
			String Status, String ManagedServiceProvider, String TypeOfRequest) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(the Work Order Notes field will contain all the details provided in the Service Request for condition Organisation=Other and Status=Workpackage/3rd Party)");

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Submission Validation : I have read the instructions and am authorised to submit on behalf of this user."));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Requester Email : " + RequesterEmail));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Requester Telephone Number : " + RequesterTelephoneNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Requester Grade : " + RequesterGrade));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"LAN ID : " + RequestedForLANID));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"OUC : " + RequestedForOUC));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"EIN : " + RequestedForEIN));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Line Manager : " + RequestedForLineManager));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Location : " + RequestedForLocation));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Email : " + RequestedForEmail));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Telephone Number : " + RequestedForTelephoneNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Department : " + RequestedForDepartment));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Please select Organisation : " + Organisation));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Please provide details : " + OrganisationDetails));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Team Name : " + TeamName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Role Name : " + RoleName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Grade : " + Grade));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Status : " + Status));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Managed Service Provider Name / Company Name : " + ManagedServiceProvider));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Type of Request : " + TypeOfRequest));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"ITCC Application Operator"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"ITCC Supervisor"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"NMC Application Operator"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"NMC Supervisor"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"SOA Service Operator"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"SOA Supervisor"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Smart Metering Service Operator"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Smart Metering Supervisor"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Indra SuperAdmin"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Application Support – Read only"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "logout_button", ""));

	}

	@Given("^I am raising the Service Reqeust %TrueSight Issue% on behalf of an user \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void navigateToTrueSightIssueRequestForm(String Username, String Password, String RequestedForFullName)
			throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @Given(I am raising the Service Reqeust %TrueSight Issue% on behalf of an user)");

		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "user_name", Username));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "password", Password));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "login_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "10000"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "application_link", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "service_request_management", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "request_entry", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "request_entry", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "10000"));
		//APP_LOGS.debug((String) pagesync_method.invoke(keywords, "", ""));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_request_settings_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_request_on_behalf_of", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) switchtothisframe_method.invoke(keywords, "", "1"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));

		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "obo_fullname_field", RequestedForFullName));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "obo_fullname_search_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "obo_user_search_result", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "obo_user_select_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));

		APP_LOGS.debug((String) switchtoparentwindow_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_request_browse", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "10000"));
		//APP_LOGS.debug((String) pagesync_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) switchtonewframe_method.invoke(keywords, "", ""));

		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "service_desk", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_desk", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));

		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "service_desk_subcategory", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_desk_subcategory", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));

		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "systems", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "systems", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));

		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "systems_subcategory", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "systems_subcategory", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));

		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "ptoz", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "ptoz", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "20000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "true_sight_issue", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "request_now_btn", ""));
		APP_LOGS.debug((String) switchtoparentwindow_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

	}

	@And("^Test condition AccessIssue-SingleUser and provide all the mandatory details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void requestAccessIssueSingleUser(String RequestedForLANID, String RequestedForOUC,
			String RequestedForLineManager, String RequestedForEmail, String RequestedForTelephoneNumber,
			String RequestedForRole, String TypeOfTrueSightIssue, String AffectedUser, String LoginPageAvailability,
			String LoginSuccessfully, String FirewallAccessIssue, String AdditionalInformation) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(Test condition AccessIssue-SingleUser and provide all the mandatory details)");

		APP_LOGS.debug((String) switchtothisframe_method.invoke(keywords, "", "2"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "instructions_icon", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "instructions_message",
				"Please ensure that you have the necessary software installed as indicated below:- 1) User needs to have the Java 1.8 plugin installed on their laptop  2) SMIP root and intermediate certificates need to be installed"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_lan_id_label",
				"LAN ID"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_lan_id_field",
				"Requested For LANID"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_issue_requested_for_lan_id_field",
				RequestedForLANID));

		APP_LOGS.debug(
				(String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_ouc_label", "OUC *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_ouc_field",
				"Requested For OUC"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_issue_requested_for_ouc_field",
				RequestedForOUC));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_requested_for_line_manager_label", "Line Manager *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_requested_for_line_manager_field", "Requested For Line Manager"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords,
				"truesight_issue_requested_for_line_manager_field", RequestedForLineManager));
		// APP_LOGS.debug((String)
		// sendkeys_method.invoke(keywords,"truesight_issue_requested_for_line_manager_field",
		// RequestedForLineManager));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_email_label",
				"Email *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_email_field",
				"Requested For Email"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_issue_requested_for_email_field",
				RequestedForEmail));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_requested_for_contact_phone_number_label", "Contact Phone Number *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_requested_for_contact_phone_number_field", "Requested For Contact Phone Number"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "truesight_issue_requested_for_contact_phone_number_validation_result", "Requested For Contact Phone Number"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords,
				"truesight_issue_requested_for_contact_phone_number_field", RequestedForTelephoneNumber));

		APP_LOGS.debug(
				(String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_role_label", "Role *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_role_field",
				"Requested For Role"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "truesight_issue_requested_for_role_validation_result", "Requested For Role"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_issue_requested_for_role_field",
				RequestedForRole));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_role_field_note",
				"Please provide the specific job role name for the user."));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_type_label",
				"What is your TrueSight issue? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "truesight_issue_type_validation_result", "Type of TrueSight Issue"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "truesight_issue_type_dropdown",
				TypeOfTrueSightIssue));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		String type_of_issue = "";
		if (TypeOfTrueSightIssue.equals("Access Issue")) {
			type_of_issue = "access_issue";
		} else if (TypeOfTrueSightIssue.equals("Functionality Issue")) {
			type_of_issue = "functionality_issue";
		} else if (TypeOfTrueSightIssue.equals("Performance Issue")) {
			type_of_issue = "performance_issue";
		} else if (TypeOfTrueSightIssue.equals("Password Reset")) {
			type_of_issue = "password_reset";
		}

		String affectedUser = "";
		if (AffectedUser.equals("single")) {
			affectedUser = "Single User";
		} else if (AffectedUser.equals("multiple")) {
			affectedUser = "Multiple Users";
		}

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_reporting_users_label",
				"Are you reporting a Single or Multiple user issue? *"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_reporting_" + AffectedUser + "_user_radio_btn_label",
				affectedUser));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "truesight_issue_" + type_of_issue + "_reporting_users_validation_result", "Are you reporting a Single or Multiple user issue?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_reporting_" + AffectedUser + "_user_radio_btn", ""));

		String loginPageAvailability = "";

		if (LoginPageAvailability.equals("yes")) {
			loginPageAvailability = "Yes";
		}

		else if (LoginPageAvailability.equals("no")) {
			loginPageAvailability = "No";
		}

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_login_page_available_label",
				"Is the TrueSight login page available? *"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_" + type_of_issue
				+ "_login_page_available_" + LoginPageAvailability + "_radio_btn_label", loginPageAvailability));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "truesight_issue_" + type_of_issue + "_login_page_available_validation_result", "Is the TrueSight login page available?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_login_page_available_" + LoginPageAvailability + "_radio_btn",
				""));

		String loginSuccessfully = "";
		if (LoginSuccessfully.equals("yes")) {
			loginSuccessfully = "Yes";
		}

		else if (LoginSuccessfully.equals("no")) {
			loginSuccessfully = "No";
		}

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_ability_to_login_successfully_label",
				"Are you able to login into TrueSight successfully? *"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_" + type_of_issue
				+ "_ability_to_login_successfully_" + LoginSuccessfully + "_radio_btn_label", loginSuccessfully));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "truesight_issue_" + type_of_issue + "_ability_to_login_successfully_validation_result",	"Are you able to login into TrueSight successfully?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "truesight_issue_" + type_of_issue
				+ "_ability_to_login_successfully_" + LoginSuccessfully + "_radio_btn", ""));

		String firewallAccessIssue = "";

		if (FirewallAccessIssue.equals("yes")) {
			firewallAccessIssue = "Yes";
		}

		else if (FirewallAccessIssue.equals("no")) {
			firewallAccessIssue = "No";
		}

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_firewall_access_issue_label",
				"Are you having any Firewall access issues? *"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_" + type_of_issue
				+ "_firewall_access_issue_" + FirewallAccessIssue + "_radio_btn_label", firewallAccessIssue));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,	"truesight_issue_" + type_of_issue + "_firewall_access_issue_validation_result", "Are you having any Firewall access issues?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_firewall_access_issue_" + FirewallAccessIssue + "_radio_btn",
				""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_additional_information_label",
				"Additional Information *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_additional_information_field", "Additional Information"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "truesight_issue_additional_information_validation_result", "Additional Information"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_issue_additional_information_field",
				AdditionalInformation));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_additional_information_field_note", "Please attach screenshots if appropriate."));

	}

	@And("^I submit the TrueSight Issue Serviec Request form$")
	public void submitTrueSightIssueServiceRequestForm() throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(I submit the TrueSight Issue Serviec Request form)");

		APP_LOGS.debug((String) switchtoparentwindow_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) getservicerequestid_method.invoke(keywords,
				"true_sight_issue_service_request_submit_btn", "RequestID"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "50000"));

	}

	@Then("^the system will create a Incident Record to correct support group \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void serviceRequestCreatesIncidentRecordToCorrectSupportGroup(String INCSummary, String INCImpact,
			String INCUrgency, String INCPriority, String INCSupportGroupName, String INCCompany, String INCOptCatTier1,
			String INCOptCatTier2, String INCProdCatTier1, String INCProdCatTier2, String INCProdCatTier3,
			String INCProductName) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(the system will create a Incident Record to correct support group)");

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_request_home_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_request_it_home_page", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "10000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "application_link", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "incident_management_pre_prod", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "search_incident_pre_prod", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "search_incident_pre_prod", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "75000"));
		//APP_LOGS.debug((String) pagesync_method.invoke(keywords, "", ""));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_customer_tab", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "associated_request_id_field",
				(String) getruntimeproperty_method.invoke(keywords, "RequestID", "")));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "search_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "75000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "Summary_Detail", INCSummary));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_field", INCImpact));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "urgency_field", INCUrgency));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "priority_field", INCPriority));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "assigned_group", INCSupportGroupName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_categorization_tab", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "inc_company_field", INCCompany));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "opt_cat_1_field", INCOptCatTier1));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "opt_cat_2_field", INCOptCatTier2));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "opt_cat_3_field", "INCOptCatTier3"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prodcat_tier1_field", INCProdCatTier1));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prodcat_tier2_field", INCProdCatTier2));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prodcat_tier3_field", INCProdCatTier3));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prodcat_product_name_field", INCProductName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

	}

	@And("^the Incident record Notes field will contain all the details provided in the Service Request for condition AccessIssue-SingleUser \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validateIncidentNotesDetailsAccessIssueSingleUser(String RequestedForLANID, String RequestedForOUC,
			String RequestedForLineManager, String RequestedForEmail, String RequestedForTelephoneNumber,
			String RequestedForRole, String TypeOfTrueSightIssue, String AffectedUser, String LoginPageAvailability,
			String LoginSuccessfully, String FirewallAccessIssue, String AdditionalInformation) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(the Incident record Notes field will contain all the details provided in the Service Request for condition AccessIssue-SingleUser)");

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"LAN ID : " + RequestedForLANID));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"OUC : " + RequestedForOUC));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Line Manager : " + RequestedForLineManager));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Email : " + RequestedForEmail));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Contact Phone Number : " + RequestedForTelephoneNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Role : " + RequestedForRole));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"What is your TrueSight issue? : " + TypeOfTrueSightIssue));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		String affectedUser = "";
		if (AffectedUser.equals("single")) {
			affectedUser = "Single User";
		} else if (AffectedUser.equals("multiple")) {
			affectedUser = "Multiple Users";
		}

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Are you reporting a Single or Multiple user issue? : " + affectedUser));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		String loginPageAvailability = "";

		if (LoginPageAvailability.equals("yes")) {
			loginPageAvailability = "Yes";
		}

		else if (LoginPageAvailability.equals("no")) {
			loginPageAvailability = "No";
		}

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Is the TrueSight login page available? : " + loginPageAvailability));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		String loginSuccessfully = "";
		if (LoginSuccessfully.equals("yes")) {
			loginSuccessfully = "Yes";
		}

		else if (LoginSuccessfully.equals("no")) {
			loginSuccessfully = "No";
		}

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Are you able to login into TrueSight successfully? : " + loginSuccessfully));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		String firewallAccessIssue = "";

		if (FirewallAccessIssue.equals("yes")) {
			firewallAccessIssue = "Yes";
		}

		else if (FirewallAccessIssue.equals("no")) {
			firewallAccessIssue = "No";
		}

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Are you having any Firewall access issues? : " + firewallAccessIssue));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Additional Information : " + AdditionalInformation));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "logout_button", ""));

	}

	@And("^Test condition AccessIssue-MultipleUser and provide all the mandatory details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void requestAccessIssueMultipleUser(String RequestedForLANID, String RequestedForOUC,
			String RequestedForLineManager, String RequestedForEmail, String RequestedForTelephoneNumber,
			String RequestedForRole, String TypeOfTrueSightIssue, String AffectedUser, String NumberOfUsersImpacted,
			String LoginPageAvailability, String LoginSuccessfully, String FirewallAccessIssue,
			String AdditionalInformation) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(Test condition AccessIssue-MultipleUser and provide all the mandatory details)");

		APP_LOGS.debug((String) switchtothisframe_method.invoke(keywords, "", "2"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "instructions_icon", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "instructions_message",
				"Please ensure that you have the necessary software installed as indicated below:- 1) User needs to have the Java 1.8 plugin installed on their laptop  2) SMIP root and intermediate certificates need to be installed"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_lan_id_label",
				"LAN ID"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_lan_id_field",
				"Requested For LANID"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_issue_requested_for_lan_id_field",
				RequestedForLANID));

		APP_LOGS.debug(
				(String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_ouc_label", "OUC *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_ouc_field",
				"Requested For OUC"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_issue_requested_for_ouc_field",
				RequestedForOUC));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_requested_for_line_manager_label", "Line Manager *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_requested_for_line_manager_field", "Requested For Line Manager"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords,
				"truesight_issue_requested_for_line_manager_field", RequestedForLineManager));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_email_label",
				"Email *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_email_field",
				"Requested For Email"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_issue_requested_for_email_field",
				RequestedForEmail));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_requested_for_contact_phone_number_label", "Contact Phone Number *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_requested_for_contact_phone_number_field", "Requested For Contact Phone Number"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_requested_for_contact_phone_number_validation_result",
				"Requested For Contact Phone Number"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_issue_requested_for_contact_phone_number_field",
				RequestedForTelephoneNumber));

		APP_LOGS.debug(
				(String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_role_label", "Role *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_role_field",
				"Requested For Role"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_requested_for_role_validation_result", "Requested For Role"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_issue_requested_for_role_field",
				RequestedForRole));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_role_field_note",
				"Please provide the specific job role name for the user."));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_type_label",
				"What is your TrueSight issue? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_type_validation_result", "Type of TrueSight Issue"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "truesight_issue_type_dropdown",
				TypeOfTrueSightIssue));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		String type_of_issue = "";
		if (TypeOfTrueSightIssue.equals("Access Issue")) {
			type_of_issue = "access_issue";
		} else if (TypeOfTrueSightIssue.equals("Functionality Issue")) {
			type_of_issue = "functionality_issue";
		} else if (TypeOfTrueSightIssue.equals("Performance Issue")) {
			type_of_issue = "performance_issue";
		} else if (TypeOfTrueSightIssue.equals("Password Reset")) {
			type_of_issue = "password_reset";
		}

		String affectedUser = "";
		if (AffectedUser.equals("single")) {
			affectedUser = "Single User";
		} else if (AffectedUser.equals("multiple")) {
			affectedUser = "Multiple Users";
		}

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_reporting_users_label",
				"Are you reporting a Single or Multiple user issue? *"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_reporting_" + AffectedUser + "_user_radio_btn_label",
				affectedUser));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_reporting_users_validation_result",
				"Are you reporting a Single or Multiple user issue?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_reporting_" + AffectedUser + "_user_radio_btn", ""));

		String loginPageAvailability = "";

		if (LoginPageAvailability.equals("yes")) {
			loginPageAvailability = "Yes";
		}

		else if (LoginPageAvailability.equals("no")) {
			loginPageAvailability = "No";
		}

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_login_page_available_label",
				"Is the TrueSight login page available? *"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_" + type_of_issue
				+ "_login_page_available_" + LoginPageAvailability + "_radio_btn_label", loginPageAvailability));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_login_page_available_validation_result",
				"Is the TrueSight login page available?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_login_page_available_" + LoginPageAvailability + "_radio_btn",
				""));

		String loginSuccessfully = "";
		if (LoginSuccessfully.equals("yes")) {
			loginSuccessfully = "Yes";
		}

		else if (LoginSuccessfully.equals("no")) {
			loginSuccessfully = "No";
		}

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_ability_to_login_successfully_label",
				"Are you able to login into TrueSight successfully? *"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_" + type_of_issue
				+ "_ability_to_login_successfully_" + LoginSuccessfully + "_radio_btn_label", loginSuccessfully));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_ability_to_login_successfully_validation_result",
				"Are you able to login into TrueSight successfully?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "truesight_issue_" + type_of_issue
				+ "_ability_to_login_successfully_" + LoginSuccessfully + "_radio_btn", ""));

		String firewallAccessIssue = "";

		if (FirewallAccessIssue.equals("yes")) {
			firewallAccessIssue = "Yes";
		}

		else if (FirewallAccessIssue.equals("no")) {
			firewallAccessIssue = "No";
		}

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_firewall_access_issue_label",
				"Are you having any Firewall access issues? *"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_" + type_of_issue
				+ "_firewall_access_issue_" + FirewallAccessIssue + "_radio_btn_label", firewallAccessIssue));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_firewall_access_issue_validation_result",
				"Are you having any Firewall access issues?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_firewall_access_issue_" + FirewallAccessIssue + "_radio_btn",
				""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_additional_information_label",
				"Additional Information *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_additional_information_field", "Additional Information"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_additional_information_validation_result", "Additional Information"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_issue_additional_information_field",
				AdditionalInformation));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_additional_information_field_note", "Please attach screenshots if appropriate."));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_number_of_users_impacted_label",
				"Please specify the number of users impacted *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_number_of_users_impacted_field",
				"Please specify the number of users impacted"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_number_of_users_impacted_validation_result",
				"Please specify the number of users impacted"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_number_of_users_impacted_field", NumberOfUsersImpacted));

	}

	@And("^the Incident record Notes field will contain all the details provided in the Service Request for condition AccessIssue-MultipleUser \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validateIncidentNotesDetailsAccessIssueMultipleUser(String RequestedForLANID, String RequestedForOUC,
			String RequestedForLineManager, String RequestedForEmail, String RequestedForTelephoneNumber,
			String RequestedForRole, String TypeOfTrueSightIssue, String AffectedUser, String NumberOfUsersImpacted,
			String LoginPageAvailability, String LoginSuccessfully, String FirewallAccessIssue,
			String AdditionalInformation) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(the Incident record Notes field will contain all the details provided in the Service Request for condition AccessIssue-MultipleUser)");

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"LAN ID : " + RequestedForLANID));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"OUC : " + RequestedForOUC));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Line Manager : " + RequestedForLineManager));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Email : " + RequestedForEmail));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Contact Phone Number : " + RequestedForTelephoneNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Role : " + RequestedForRole));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"What is your TrueSight issue? : " + TypeOfTrueSightIssue));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		String affectedUser = "";
		if (AffectedUser.equals("single")) {
			affectedUser = "Single User";
		} else if (AffectedUser.equals("multiple")) {
			affectedUser = "Multiple Users";
		}

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Are you reporting a Single or Multiple user issue? : " + affectedUser));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Please specify the number of users impacted : " + NumberOfUsersImpacted));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		String loginPageAvailability = "";

		if (LoginPageAvailability.equals("yes")) {
			loginPageAvailability = "Yes";
		}

		else if (LoginPageAvailability.equals("no")) {
			loginPageAvailability = "No";
		}

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Is the TrueSight login page available? : " + loginPageAvailability));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		String loginSuccessfully = "";
		if (LoginSuccessfully.equals("yes")) {
			loginSuccessfully = "Yes";
		}

		else if (LoginSuccessfully.equals("no")) {
			loginSuccessfully = "No";
		}

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Are you able to login into TrueSight successfully? : " + loginSuccessfully));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		String firewallAccessIssue = "";

		if (FirewallAccessIssue.equals("yes")) {
			firewallAccessIssue = "Yes";
		}

		else if (FirewallAccessIssue.equals("no")) {
			firewallAccessIssue = "No";
		}

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Are you having any Firewall access issues? : " + firewallAccessIssue));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Additional Information : " + AdditionalInformation));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "logout_button", ""));

	}

	@And("^Test condition FunctionalityIssue-SingleUser and provide all the mandatory details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void requestFunctionalityIssueSingleUser(String RequestedForLANID, String RequestedForOUC,
			String RequestedForLineManager, String RequestedForEmail, String RequestedForTelephoneNumber,
			String RequestedForRole, String TypeOfTrueSightIssue, String AffectedUser, String IssueDescription)
			throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(Test condition FunctionalityIssue-SingleUser and provide all the mandatory details)");

		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "10000"));
		//APP_LOGS.debug((String) pagesync_method.invoke(keywords, "", ""));
		
		APP_LOGS.debug((String) switchtothisframe_method.invoke(keywords, "", "2"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "instructions_icon", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "instructions_message",
				"Please ensure that you have the necessary software installed as indicated below:- 1) User needs to have the Java 1.8 plugin installed on their laptop  2) SMIP root and intermediate certificates need to be installed"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_lan_id_label",
				"LAN ID"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_lan_id_field",
				"Requested For LANID"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_issue_requested_for_lan_id_field",
				RequestedForLANID));

		APP_LOGS.debug(
				(String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_ouc_label", "OUC *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_ouc_field",
				"Requested For OUC"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_issue_requested_for_ouc_field",
				RequestedForOUC));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_requested_for_line_manager_label", "Line Manager *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_requested_for_line_manager_field", "Requested For Line Manager"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords,
				"truesight_issue_requested_for_line_manager_field", RequestedForLineManager));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_email_label",
				"Email *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_email_field",
				"Requested For Email"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_issue_requested_for_email_field",
				RequestedForEmail));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_requested_for_contact_phone_number_label", "Contact Phone Number *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_requested_for_contact_phone_number_field", "Requested For Contact Phone Number"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_requested_for_contact_phone_number_validation_result",
				"Requested For Contact Phone Number"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_issue_requested_for_contact_phone_number_field",
				RequestedForTelephoneNumber));

		APP_LOGS.debug(
				(String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_role_label", "Role *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_role_field",
				"Requested For Role"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_requested_for_role_validation_result", "Requested For Role"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_issue_requested_for_role_field",
				RequestedForRole));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_role_field_note",
				"Please provide the specific job role name for the user."));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_type_label",
				"What is your TrueSight issue? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_type_validation_result", "Type of TrueSight Issue"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "truesight_issue_type_dropdown",
				TypeOfTrueSightIssue));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		String type_of_issue = "";
		if (TypeOfTrueSightIssue.equals("Access Issue")) {
			type_of_issue = "access_issue";
		} else if (TypeOfTrueSightIssue.equals("Functionality Issue")) {
			type_of_issue = "functionality_issue";
		} else if (TypeOfTrueSightIssue.equals("Performance Issue")) {
			type_of_issue = "performance_issue";
		} else if (TypeOfTrueSightIssue.equals("Password Reset")) {
			type_of_issue = "password_reset";
		}

		String affectedUser = "";
		if (AffectedUser.equals("single")) {
			affectedUser = "Single User";
		} else if (AffectedUser.equals("multiple")) {
			affectedUser = "Multiple Users";
		}

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_reporting_users_label",
				"Are you reporting a Single or Multiple user issue? *"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_reporting_" + AffectedUser + "_user_radio_btn_label",
				affectedUser));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_reporting_users_validation_result",
				"Are you reporting a Single or Multiple user issue?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_reporting_" + AffectedUser + "_user_radio_btn", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_issue_description_label",
				"Please describe the issue you are having with as much information as possible. Detail what you were trying to do. *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_issue_description_field", "Issue Description"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_issue_description_validation_result", "Issue Description"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_issue_description_field", IssueDescription));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_issue_description_field_note",
				"Please attach screenshots if appropriate."));

	}

	@And("^the Incident record Notes field will contain all the details provided in the Service Request for condition FunctionalityIssue-SingleUser \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validateIncidentNotesDetailsFunctionalityIssueSingleUser(String RequestedForLANID,
			String RequestedForOUC, String RequestedForLineManager, String RequestedForEmail,
			String RequestedForTelephoneNumber, String RequestedForRole, String TypeOfTrueSightIssue,
			String AffectedUser, String IssueDescription) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(the Incident record Notes field will contain all the details provided in the Service Request for condition FunctionalityIssue-SingleUser)");

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"LAN ID : " + RequestedForLANID));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"OUC : " + RequestedForOUC));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Line Manager : " + RequestedForLineManager));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Email : " + RequestedForEmail));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Contact Phone Number : " + RequestedForTelephoneNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Role : " + RequestedForRole));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"What is your TrueSight issue? : " + TypeOfTrueSightIssue));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		String affectedUser = "";
		if (AffectedUser.equals("single")) {
			affectedUser = "Single User";
		} else if (AffectedUser.equals("multiple")) {
			affectedUser = "Multiple Users";
		}

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Are you reporting a Single or Multiple user issue? : " + affectedUser));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Please describe the issue you are having with as much information as possible.  Detail what you were trying to do. : "
						+ IssueDescription));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "logout_button", ""));

	}

	@And("^Test condition FunctionalityIssue-MultipleUser and provide all the mandatory details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void requestFunctionalityIssueMultipleUser(String RequestedForLANID, String RequestedForOUC,
			String RequestedForLineManager, String RequestedForEmail, String RequestedForTelephoneNumber,
			String RequestedForRole, String TypeOfTrueSightIssue, String AffectedUser, String NumberOfUsersImpacted,
			String IssueDescription) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(Test condition FunctionalityIssue-MultipleUser and provide all the mandatory details)");

		APP_LOGS.debug((String) switchtothisframe_method.invoke(keywords, "", "2"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "instructions_icon", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "instructions_message",
				"Please ensure that you have the necessary software installed as indicated below:- 1) User needs to have the Java 1.8 plugin installed on their laptop  2) SMIP root and intermediate certificates need to be installed"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_lan_id_label",
				"LAN ID"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_lan_id_field",
				"Requested For LANID"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_issue_requested_for_lan_id_field",
				RequestedForLANID));

		APP_LOGS.debug(
				(String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_ouc_label", "OUC *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_ouc_field",
				"Requested For OUC"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_issue_requested_for_ouc_field",
				RequestedForOUC));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_requested_for_line_manager_label", "Line Manager *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_requested_for_line_manager_field", "Requested For Line Manager"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords,
				"truesight_issue_requested_for_line_manager_field", RequestedForLineManager));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_email_label",
				"Email *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_email_field",
				"Requested For Email"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_issue_requested_for_email_field",
				RequestedForEmail));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_requested_for_contact_phone_number_label", "Contact Phone Number *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_requested_for_contact_phone_number_field", "Requested For Contact Phone Number"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_requested_for_contact_phone_number_validation_result",
				"Requested For Contact Phone Number"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_issue_requested_for_contact_phone_number_field",
				RequestedForTelephoneNumber));

		APP_LOGS.debug(
				(String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_role_label", "Role *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_role_field",
				"Requested For Role"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_requested_for_role_validation_result", "Requested For Role"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_issue_requested_for_role_field",
				RequestedForRole));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_role_field_note",
				"Please provide the specific job role name for the user."));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_type_label",
				"What is your TrueSight issue? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_type_validation_result", "Type of TrueSight Issue"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "truesight_issue_type_dropdown",
				TypeOfTrueSightIssue));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		String type_of_issue = "";
		if (TypeOfTrueSightIssue.equals("Access Issue")) {
			type_of_issue = "access_issue";
		} else if (TypeOfTrueSightIssue.equals("Functionality Issue")) {
			type_of_issue = "functionality_issue";
		} else if (TypeOfTrueSightIssue.equals("Performance Issue")) {
			type_of_issue = "performance_issue";
		} else if (TypeOfTrueSightIssue.equals("Password Reset")) {
			type_of_issue = "password_reset";
		}
		

String affectedUser="";
		if (AffectedUser.equals("single")){
			affectedUser="Single User";
		}
		else if(AffectedUser.equals("multiple")){
			affectedUser="Multiple Users";
		}

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_reporting_users_label",
				"Are you reporting a Single or Multiple user issue? *"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_" + type_of_issue + "_reporting_" + AffectedUser + "_user_radio_btn_label", affectedUser));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_reporting_users_validation_result",
				"Are you reporting a Single or Multiple user issue?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_reporting_" + AffectedUser + "_user_radio_btn", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_issue_description_label",
				"Please describe the issue you are having with as much information as possible. Detail what you were trying to do. *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_issue_description_field", "Issue Description"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_issue_description_validation_result", "Issue Description"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_issue_description_field", IssueDescription));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_issue_description_field_note",
				"Please attach screenshots if appropriate."));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_number_of_users_impacted_label",
				"Please specify the number of users impacted *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_number_of_users_impacted_field",
				"Please specify the number of users impacted"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_number_of_users_impacted_validation_result",
				"Please specify the number of users impacted"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_number_of_users_impacted_field", NumberOfUsersImpacted));

	}

	@And("^the Incident record Notes field will contain all the details provided in the Service Request for condition FunctionalityIssue-MultipleUser \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validateIncidentNotesDetailsFunctionalityIssueMultipleUser(String RequestedForLANID,
			String RequestedForOUC, String RequestedForLineManager, String RequestedForEmail,
			String RequestedForTelephoneNumber, String RequestedForRole, String TypeOfTrueSightIssue,
			String AffectedUser, String NumberOfUsersImpacted, String IssueDescription) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(the Incident record Notes field will contain all the details provided in the Service Request for condition FunctionalityIssue-MultipleUser)");

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"LAN ID : " + RequestedForLANID));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"OUC : " + RequestedForOUC));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Line Manager : " + RequestedForLineManager));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Email : " + RequestedForEmail));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Contact Phone Number : " + RequestedForTelephoneNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Role : " + RequestedForRole));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"What is your TrueSight issue? : " + TypeOfTrueSightIssue));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		String affectedUser="";
		if (AffectedUser.equals("single")){
			affectedUser="Single User";
		}
		else if(AffectedUser.equals("multiple")){
			affectedUser="Multiple Users";
		}

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Are you reporting a Single or Multiple user issue? : " + affectedUser));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Please specify the number of users impacted : " + NumberOfUsersImpacted));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Please describe the issue you are having with as much information as possible.  Detail what you were trying to do. : "
						+ IssueDescription));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "logout_button", ""));

	}

	@And("^Test condition PerformanceIssue-SingleUser and provide all the mandatory details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void requestPerformanceIssueSingleUser(String RequestedForLANID, String RequestedForOUC,
			String RequestedForLineManager, String RequestedForEmail, String RequestedForTelephoneNumber,
			String RequestedForRole, String TypeOfTrueSightIssue, String AffectedUser, String IssueDescription)
			throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(Test condition PerformanceIssue-SingleUser and provide all the mandatory details)");

		APP_LOGS.debug((String) switchtothisframe_method.invoke(keywords, "", "2"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "instructions_icon", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "instructions_message",
				"Please ensure that you have the necessary software installed as indicated below:- 1) User needs to have the Java 1.8 plugin installed on their laptop  2) SMIP root and intermediate certificates need to be installed"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_lan_id_label",
				"LAN ID"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_lan_id_field",
				"Requested For LANID"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_issue_requested_for_lan_id_field",
				RequestedForLANID));

		APP_LOGS.debug(
				(String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_ouc_label", "OUC *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_ouc_field",
				"Requested For OUC"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_issue_requested_for_ouc_field",
				RequestedForOUC));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_requested_for_line_manager_label", "Line Manager *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_requested_for_line_manager_field", "Requested For Line Manager"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords,
				"truesight_issue_requested_for_line_manager_field", RequestedForLineManager));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_email_label",
				"Email *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_email_field",
				"Requested For Email"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_issue_requested_for_email_field",
				RequestedForEmail));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_requested_for_contact_phone_number_label", "Contact Phone Number *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_requested_for_contact_phone_number_field", "Requested For Contact Phone Number"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_requested_for_contact_phone_number_validation_result",
				"Requested For Contact Phone Number"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_issue_requested_for_contact_phone_number_field",
				RequestedForTelephoneNumber));

		APP_LOGS.debug(
				(String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_role_label", "Role *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_role_field",
				"Requested For Role"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_requested_for_role_validation_result", "Requested For Role"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_issue_requested_for_role_field",
				RequestedForRole));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_role_field_note",
				"Please provide the specific job role name for the user."));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_type_label",
				"What is your TrueSight issue? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_type_validation_result", "Type of TrueSight Issue"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "truesight_issue_type_dropdown",
				TypeOfTrueSightIssue));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		String type_of_issue = "";
		if (TypeOfTrueSightIssue.equals("Access Issue")) {
			type_of_issue = "access_issue";
		} else if (TypeOfTrueSightIssue.equals("Functionality Issue")) {
			type_of_issue = "functionality_issue";
		} else if (TypeOfTrueSightIssue.equals("Performance Issue")) {
			type_of_issue = "performance_issue";
		} else if (TypeOfTrueSightIssue.equals("Password Reset")) {
			type_of_issue = "password_reset";
		}
		
		String affectedUser="";
		if (AffectedUser.equals("single")){
			affectedUser="Single User";
		}
		else if(AffectedUser.equals("multiple")){
			affectedUser="Multiple Users";
		}

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_reporting_users_label",
				"Are you reporting a Single or Multiple user issue? *"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_" + type_of_issue + "_reporting_" + AffectedUser + "_user_radio_btn_label", affectedUser));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_reporting_users_validation_result",
				"Are you reporting a Single or Multiple user issue?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_reporting_" + AffectedUser + "_user_radio_btn", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_issue_description_label",
				"Please describe the issue you are having with as much information as possible. Detail what you were trying to do. *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_issue_description_field", "Issue Description"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_issue_description_validation_result", "Issue Description"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_issue_description_field", IssueDescription));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_issue_description_field_note",
				"Please attach screenshots if appropriate."));

	}

	@And("^the Incident record Notes field will contain all the details provided in the Service Request for condition PerformanceIssue-SingleUser \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validateIncidentNotesDetailsPerformanceIssueSingleUser(String RequestedForLANID, String RequestedForOUC,
			String RequestedForLineManager, String RequestedForEmail, String RequestedForTelephoneNumber,
			String RequestedForRole, String TypeOfTrueSightIssue, String AffectedUser, String IssueDescription)
			throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(the Incident record Notes field will contain all the details provided in the Service Request for condition PerformanceIssue-SingleUser)");

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"LAN ID : " + RequestedForLANID));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"OUC : " + RequestedForOUC));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Line Manager : " + RequestedForLineManager));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Email : " + RequestedForEmail));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Contact Phone Number : " + RequestedForTelephoneNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Role : " + RequestedForRole));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"What is your TrueSight issue? : " + TypeOfTrueSightIssue));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		String affectedUser="";
		if (AffectedUser.equals("single")){
			affectedUser="Single User";
		}
		else if(AffectedUser.equals("multiple")){
			affectedUser="Multiple Users";
		}

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Are you reporting a Single or Multiple user issue? : " + affectedUser));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Please describe the issue you are having with as much information as possible.  Detail what you were trying to do. : "
						+ IssueDescription));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "logout_button", ""));

	}

	@And("^Test condition PerformanceIssue-MultipleUser and provide all the mandatory details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void requestPerformanceIssueMultipleUser(String RequestedForLANID, String RequestedForOUC,
			String RequestedForLineManager, String RequestedForEmail, String RequestedForTelephoneNumber,
			String RequestedForRole, String TypeOfTrueSightIssue, String AffectedUser, String NumberOfUsersImpacted,
			String IssueDescription) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(Test condition PerformanceIssue-MultipleUser and provide all the mandatory details)");

		APP_LOGS.debug((String) switchtothisframe_method.invoke(keywords, "", "2"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "instructions_icon", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "instructions_message",
				"Please ensure that you have the necessary software installed as indicated below:- 1) User needs to have the Java 1.8 plugin installed on their laptop  2) SMIP root and intermediate certificates need to be installed"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_lan_id_label",
				"LAN ID"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_lan_id_field",
				"Requested For LANID"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_issue_requested_for_lan_id_field",
				RequestedForLANID));

		APP_LOGS.debug(
				(String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_ouc_label", "OUC *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_ouc_field",
				"Requested For OUC"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_issue_requested_for_ouc_field",
				RequestedForOUC));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_requested_for_line_manager_label", "Line Manager *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_requested_for_line_manager_field", "Requested For Line Manager"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords,
				"truesight_issue_requested_for_line_manager_field", RequestedForLineManager));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_email_label",
				"Email *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_email_field",
				"Requested For Email"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_issue_requested_for_email_field",
				RequestedForEmail));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_requested_for_contact_phone_number_label", "Contact Phone Number *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_requested_for_contact_phone_number_field", "Requested For Contact Phone Number"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_requested_for_contact_phone_number_validation_result",
				"Requested For Contact Phone Number"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_issue_requested_for_contact_phone_number_field",
				RequestedForTelephoneNumber));

		APP_LOGS.debug(
				(String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_role_label", "Role *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_role_field",
				"Requested For Role"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_requested_for_role_validation_result", "Requested For Role"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_issue_requested_for_role_field",
				RequestedForRole));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_role_field_note",
				"Please provide the specific job role name for the user."));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_type_label",
				"What is your TrueSight issue? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_type_validation_result", "Type of TrueSight Issue"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "truesight_issue_type_dropdown",
				TypeOfTrueSightIssue));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		String type_of_issue = "";
		if (TypeOfTrueSightIssue.equals("Access Issue")) {
			type_of_issue = "access_issue";
		} else if (TypeOfTrueSightIssue.equals("Functionality Issue")) {
			type_of_issue = "functionality_issue";
		} else if (TypeOfTrueSightIssue.equals("Performance Issue")) {
			type_of_issue = "performance_issue";
		} else if (TypeOfTrueSightIssue.equals("Password Reset")) {
			type_of_issue = "password_reset";
		}
		
		String affectedUser="";
		if (AffectedUser.equals("single")){
			affectedUser="Single User";
		}
		else if(AffectedUser.equals("multiple")){
			affectedUser="Multiple Users";
		}

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_reporting_users_label",
				"Are you reporting a Single or Multiple user issue? *"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_" + type_of_issue + "_reporting_" + AffectedUser + "_user_radio_btn_label", affectedUser));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_reporting_users_validation_result",
				"Are you reporting a Single or Multiple user issue?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_reporting_" + AffectedUser + "_user_radio_btn", ""));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_issue_description_label",
				"Please describe the issue you are having with as much information as possible. Detail what you were trying to do. *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_issue_description_field", "Issue Description"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_issue_description_validation_result", "Issue Description"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_issue_description_field", IssueDescription));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_issue_description_field_note",
				"Please attach screenshots if appropriate."));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_number_of_users_impacted_label",
				"Please specify the number of users impacted *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_number_of_users_impacted_field",
				"Please specify the number of users impacted"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_number_of_users_impacted_validation_result",
				"Please specify the number of users impacted"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords,
				"truesight_issue_" + type_of_issue + "_number_of_users_impacted_field", NumberOfUsersImpacted));

	}

	@And("^the Incident record Notes field will contain all the details provided in the Service Request for condition PerformanceIssue-MultipleUser \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validateIncidentNotesDetailsPerformanceIssueMultipleUser(String RequestedForLANID,
			String RequestedForOUC, String RequestedForLineManager, String RequestedForEmail,
			String RequestedForTelephoneNumber, String RequestedForRole, String TypeOfTrueSightIssue,
			String AffectedUser, String NumberOfUsersImpacted, String IssueDescription) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(the Incident record Notes field will contain all the details provided in the Service Request for condition PerformanceIssue-MultipleUser)");

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"LAN ID : " + RequestedForLANID));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"OUC : " + RequestedForOUC));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Line Manager : " + RequestedForLineManager));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Email : " + RequestedForEmail));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Contact Phone Number : " + RequestedForTelephoneNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Role : " + RequestedForRole));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"What is your TrueSight issue? : " + TypeOfTrueSightIssue));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		String affectedUser="";
		if (AffectedUser.equals("single")){
			affectedUser="Single User";
		}
		else if(AffectedUser.equals("multiple")){
			affectedUser="Multiple Users";
		}

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Are you reporting a Single or Multiple user issue? : " + affectedUser));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Please specify the number of users impacted : " + NumberOfUsersImpacted));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyincidentrecordnotesdetails_method.invoke(keywords, "notes_field",
				"Please describe the issue you are having with as much information as possible.  Detail what you were trying to do. : "
						+ IssueDescription));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "logout_button", ""));

	}

	@And("^Test condition Password Reset and provide all the mandatory details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void requestTrueSightIssuePasswordReset(String RequestedForLANID, String RequestedForOUC,
			String RequestedForLineManager, String RequestedForEmail, String RequestedForTelephoneNumber,
			String RequestedForRole, String TypeOfTrueSightIssue, String TrueSightUserID) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(Test condition Password Reset and provide all the mandatory details)");

		APP_LOGS.debug((String) switchtothisframe_method.invoke(keywords, "", "2"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "instructions_icon", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "instructions_message",
				"Please ensure that you have the necessary software installed as indicated below:- 1) User needs to have the Java 1.8 plugin installed on their laptop  2) SMIP root and intermediate certificates need to be installed"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_lan_id_label",
				"LAN ID"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_lan_id_field",
				"Requested For LANID"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_issue_requested_for_lan_id_field",
				RequestedForLANID));

		APP_LOGS.debug(
				(String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_ouc_label", "OUC *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_ouc_field",
				"Requested For OUC"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_issue_requested_for_ouc_field",
				RequestedForOUC));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_requested_for_line_manager_label", "Line Manager *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_requested_for_line_manager_field", "Requested For Line Manager"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords,
				"truesight_issue_requested_for_line_manager_field", RequestedForLineManager));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_email_label",
				"Email *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_email_field",
				"Requested For Email"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "truesight_issue_requested_for_email_field",
				RequestedForEmail));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
				"truesight_issue_requested_for_contact_phone_number_label", "Contact Phone Number *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords,
				"truesight_issue_requested_for_contact_phone_number_field", "Requested For Contact Phone Number"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_requested_for_contact_phone_number_validation_result",
				"Requested For Contact Phone Number"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_issue_requested_for_contact_phone_number_field",
				RequestedForTelephoneNumber));

		APP_LOGS.debug(
				(String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_role_label", "Role *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_requested_for_role_field",
				"Requested For Role"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_requested_for_role_validation_result", "Requested For Role"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "truesight_issue_requested_for_role_field",
				RequestedForRole));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_requested_for_role_field_note",
				"Please provide the specific job role name for the user."));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_type_label",
				"What is your TrueSight issue? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_type_validation_result", "Type of TrueSight Issue"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "truesight_issue_type_dropdown",
				TypeOfTrueSightIssue));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "truesight_issue_truesight_user_id_label",
				"Please provide your TrueSight user ID *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "truesight_issue_truesight_user_id_field",
				"Please provide your TrueSight user ID"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords,
				"truesight_issue_truesight_user_id_validation_result", "Please provide your TrueSight user ID"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "truesight_issue_truesight_user_id_field", TrueSightUserID));

	}

	@And("^the WorkOrder Notes field will contain all the details provided in the Service Request for condition Password Reset \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validateWorkOrderNotesDetailsTrueSightIssuePasswordReset(String RequestedForLANID,
			String RequestedForOUC, String RequestedForLineManager, String RequestedForEmail,
			String RequestedForTelephoneNumber, String RequestedForRole, String TypeOfTrueSightIssue,
			String TrueSightUserID) throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(the WorkOrder Notes field will contain all the details provided in the Service Request for condition Password Reset)");

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"LAN ID : " + RequestedForLANID));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"OUC : " + RequestedForOUC));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Line Manager : " + RequestedForLineManager));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Email : " + RequestedForEmail));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Contact Phone Number : " + RequestedForTelephoneNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Role : " + RequestedForRole));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"What is your TrueSight issue? : " + TypeOfTrueSightIssue));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Please provide your TrueSight user ID : " + TrueSightUserID));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "logout_button", ""));

	}
}
