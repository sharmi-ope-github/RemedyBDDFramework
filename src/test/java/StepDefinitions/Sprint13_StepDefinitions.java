package StepDefinitions;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sprint13_StepDefinitions extends StepDefinitions.Keywords {

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

 	public Sprint13_StepDefinitions() throws NoSuchMethodException, SecurityException {
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
		
		copychangeandcreatenewchangerecord_method = keywords.getClass().getMethod("copyChangeAndCreateNewChangeRecord", String.class, String.class);
		clearfield_mehtod = keywords.getClass().getMethod("clearField", String.class, String.class);
		getservicerequestid_method=keywords.getClass().getMethod("getServiceRequestID", String.class, String.class);
		verifyfieldmandatoryinsrdform_method=keywords.getClass().getMethod("verifyFieldMandatoryInSRDForm", String.class, String.class);
		selectmenuoptionsrdform_method=keywords.getClass().getMethod("selectMenuOptionSRDForm", String.class, String.class);
		verifyworkordernotesdetails_method = keywords.getClass().getMethod("verifyWorkOrderNotesDetails", String.class,
				String.class);
		
	}

	@Given("^I navigate to Change Template Request Form \"([^\"]*)\",\"([^\"]*)\"$")
	public void navigateToChangeTemplateRequestForm(String Username, String Password)
			throws Throwable {
		APP_LOGS.debug("Running Test Step: @Given(I navigate to Change Template Request Form)");

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
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_request_browse", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) switchtonewframe_method.invoke(keywords, "", ""));

		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "service_management", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_management", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "service_management_subcategory", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_management_subcategory", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "change_management_subcategory", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		//APP_LOGS.debug((String) clickelement_method.invoke(keywords, "yammer", ""));
		//APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "change_template_request", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "request_now_btn", ""));
		APP_LOGS.debug((String) switchtoparentwindow_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) switchtothisframe_method.invoke(keywords, "", "2"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

	/*	APP_LOGS.debug((String) clickelement_method.invoke(keywords, "functionality_issue_notes_field", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "functionality_issue_notes_editor", ""));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "functionality_issue_notes_editor", Notes));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "functionality_issue_notes_editor_ok_btn", ""));
*/
	}
	
	@And("^I am requesting to create a new change template \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void requestToCreateNewChangeTemplate(String LANID, String OUC, String Email, String ContactNumber,
			String ManagerName, String RequestType) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(I am requesting to create a new change template)");

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "instructions_icon", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "instructions_message",
				"Please complete all required fields as any missing or incorrect information will delay the progress of your request. All the information required can be found by looking up previous successful CRQ's in Remedy. If you have any queries before you submit your request please contact your operational change manager."));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "requester_lan_id_label", "LAN ID"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "requester_lan_id_field", "LANID"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "requester_lan_id_field", LANID));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "requester_ouc_label", "OUC *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "requester_ouc_field", "OUC"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "requester_ouc_field", OUC));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "requester_email_label", "Email *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "requester_email_field", "Email"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "requester_email_field", Email));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "requester_contact_phone_number_label",
				"Contact Phone Number *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "requester_contact_phone_number_field",
				"Contact Phone Number"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "requester_contact_phone_number_validation_result", "Contact Phone Number"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "requester_contact_phone_number_field", ContactNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "requester_line_manager_label", "Line Manager *"));
		APP_LOGS.debug(
				(String) verifyfieldisempty_method.invoke(keywords, "requester_line_manager_field", ManagerName));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "requester_line_manager_field_validation_result", "Line Manager"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "requester_line_manager_field", ManagerName));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "request_type_label", "Request Type *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "request_type_validation_result", "Request Type"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "request_type_dropdown", RequestType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

	}
	
	@When("^I enter the template details for test condition1 \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enterTemplateDetailsTestCondition1(String SuccessfulCRQs,String FrequencyOfUse, String TemplateName, String TemplateOwner, String TemplateSummary, String TemplateNotes, String ChangeClass, String NormalClassType, String ChangeReason, String ImpactOfFailure, String Urgency, String RiskLevel,String ServiceImpacting, String EffectOnService, String OptCat, String ProdCat1, String ProdCat2, String ProdCat3, String ProductName,String CIFixedForTemplate, String CIToRelateToTemplate, String CoOrdSupportOrg, String CoOrdSupportGrp, String ChgMgmtGrpTemplateRelateTo, String TemplateVisibilty,String TaskTemplateToBeAssigned) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(I enter the template details for test condition1)");

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "successful_crqs_label",
				"Please provide a minimum of 3 successful CRQ’s *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "successful_crqs_field",
				"Successful CRQs Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "successful_crqs_validation_result", "Successful CRQs Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "successful_crqs_field", SuccessfulCRQs));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "frequency_of_use_label",
				"What’s the frequency of use? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "frequency_of_use_field",
				"Frequency Of Use Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "frequency_of_use_validation_result", "Frequency Of Use Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "frequency_of_use_field", FrequencyOfUse));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_name_label",
				"Template Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_name_field",
				"Template Name Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_name_validation_result", "Template Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_name_field", TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_owner_label",
				"Template Owner *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_owner_field",
				"Template Owner Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_owner_validation_result", "Template Owner Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_owner_field", TemplateOwner));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_label",
				"Summary *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_summary_field",
				"Summary Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_summary_field_validation_result", "Summary Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_summary_field", TemplateSummary));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_field_note",
				"Please provide the summary for the Change."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_label",
				"Notes *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_notes_field",
				"Notes Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_notes_field_validation_result", "Notes Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_notes_field", TemplateNotes));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_field_note",
				"Please provide a description of what the change is implementing."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_class_label",
				"Change Class *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_class_validation_result", "Change Class"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_class_dropdown", ChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_reason_label",
				"Change Reason *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_reason_validation_result", "Change Reason"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_reason_dropdown", ChangeReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_label",
				"Impact of failure *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "impact_of_failure_validation_result", "Impact of failure"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "impact_of_failure_dropdown", ImpactOfFailure));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_dropdown_note",
				"This is the impact of failure if the change goes wrong. Refer to the Incident matrix."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "urgency_label",
				"Urgency *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "urgency_validation_result", "Urgency"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "urgency_dropdown", Urgency));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "risk_level_label",
				"Risk Level *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "risk_level_validation_result", "Risk Level"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "risk_level_dropdown", RiskLevel));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "service_impacting_radio_label",
				"Is the change service impacting? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "service_impacting_radio_validation_result", "Is the change service impacting"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_impacting_radio_"+ServiceImpacting+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "opt_cat_label",
				"Operational Categorisation *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "opt_cat_validation_result", "Operational Categorisation"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "opt_cat_dropdown", OptCat));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_1_label",
				"Product Categorisation Tier 1"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_1_field",
				"Product Categorisation Tier 1 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_1_field", ProdCat1));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_2_label",
				"Product Categorisation Tier 2"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_2_field",
				"Product Categorisation Tier 2 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_2_field", ProdCat2));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_3_label",
				"Product Categorisation Tier 3"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_3_field",
				"Product Categorisation Tier 3 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_3_field", ProdCat3));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_label",
				"Product Name"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "product_name_field",
				"Product Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "product_name_field", ProductName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_field_note",
				"Please provide tier 1,2 & 3 Product Categorisation and also the Product Name."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_fixed_for_template_radio_label",
				"Is the CI fixed for the template? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "ci_fixed_for_template_radio_validation_result", "Is the CI fixed for the template"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "ci_fixed_for_template_radio_"+CIFixedForTemplate+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_org_label",
				"Change Co-ordinator assignment - Support Organisation *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_org_field",
				"Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_co-ord_assign_support_org_field_validation_result", "Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_org_field", CoOrdSupportOrg));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_group_label",
				"Change Co-ordinator assignment Support Group Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_group_field",
				"Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_co-ord_assign_support_group_field_validation_result", "Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_group_field", CoOrdSupportGrp));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_mgmt_grp_template_relate_to_label",
				"Which Change Management Group does the template relate to? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field",
				"Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_mgmt_grp_template_relate_to_validation_result", "Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field", ChgMgmtGrpTemplateRelateTo));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_label",
				"Template Visibility *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_visibility_field",
				"Template Visibility Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_visibility_field_validation_result", "Template Visibility Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_visibility_field", TemplateVisibilty));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_field_note",
				"You must supply the Support Organisation and the Support Group Name of the support groups who will need visbility of this template. The template will be restricted to the support groups you list here."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_label",
				"Do you want a task template assigned? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "want_task_template_assigned_radio_validation_result", "Do you want a task template assigned?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "want_task_template_assigned_radio_"+TaskTemplateToBeAssigned+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_note",
				"If the change implementer does not have the functional role of change co-ordinator they will not be able to move the CRQ through the real time status to completion. A task template enables an implementer to do this."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note_label",
				"Note"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note",
				"Please attach the implementation, Testing and Back Out plans."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_imp_plan_confirmation_radio_label",
				"I confirm I have attached the Implementation Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_imp_plan_confirmation_radio_validation_result", "I confirm I have attached the Implementation Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_imp_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_testing_plan_confirmation_radio_label",
				"I confirm I have attached the Testing Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_testing_plan_confirmation_radio_validation_result", "I confirm I have attached the Testing Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_testing_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_backout_plan_confirmation_radio_label",
				"I confirm I have attached the Back Out Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_backout_plan_confirmation_radio_validation_result", "I confirm I have attached the Back Out Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_backout_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "normal_class_type_label",
				"Normal Class Type *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "normal_class_type_validation_result", "Normal Class Type"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "normal_class_type_dropdown", NormalClassType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "effect_on_service_label",
				"Effect on Service *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "effect_on_service_field",
				"Effect on Service Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "effect_on_service_validation_result", "Effect on Service Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "effect_on_service_field", EffectOnService));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "effect_on_service_field_note",
				"Please provide the effect on service whilst the change is being implemented."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_to_relate_to_template_label",
				"Please provide the CI’s to relate to the template *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "ci_to_relate_to_template_field",
				"Please provide the CI’s to relate to the template"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "ci_to_relate_to_template_field_validation_result", "Please provide the CI’s to relate to the template"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "ci_to_relate_to_template_field", CIToRelateToTemplate));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_to_relate_to_template_field_note",
				"If the template is used against a fixed CI(s) please list here."));
		
		
			
	}
	
	@And("^the Work Order Notes field will contain all the details provided in the Service Request for Create New Change Template condition1 \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validateWorkOrderNotesDetailsCreateNewTemplateServiceImpactingCIFixed(String LANID, String OUC, String Email, String ContactNumber, String ManagerName, String RequestType, String SuccessfulCRQs, String FrequencyOfUse, String TemplateName, String TemplateOwner, String TemplateSummary, String TemplateNotes, String ChangeClass, String NormalClassType, String ChangeReason, String ImpactOfFailure, String Urgency, String RiskLevel, String ServiceImpacting, String EffectOnService, String OptCat, String ProdCat1, String ProdCat2, String ProdCat3, String ProductName, String CIFixedForTemplate, String CIToRelateToTemplate, String CoOrdSupportOrg, String CoOrdSupportGrp, String ChgMgmtGrpTemplateRelateTo, String TemplateVisibilty, String TaskTemplateToBeAssigned)
			throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(the Work Order Notes field will contain all the details provided in the Service Request for Create New Change Template condition1)");

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"LAN ID : " + LANID));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"OUC : " + OUC));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Email : " + Email));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Contact Phone Number : " + ContactNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Line Manager : " + ManagerName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Request Type : " + RequestType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Please provide a minimum of 3 successful CRQ’s : " + SuccessfulCRQs));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"What’s the frequency of use? : " + FrequencyOfUse));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Template Name : " + TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Template Owner : " + TemplateOwner));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Summary : " + TemplateSummary));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Notes : " + TemplateNotes));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Change Class : " + ChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				ChangeClass+" Type : " + NormalClassType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Change Reason : " + ChangeReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Impact of failure : " + ImpactOfFailure));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Urgency : " + Urgency));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Risk Level : " + RiskLevel));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		String service_impacting= "";
		if(ServiceImpacting.equals("yes")){
		service_impacting= "Yes";
		}
		else if(ServiceImpacting.equals("no")){
		service_impacting= "No";
		}
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Is the change service impacting? : " + service_impacting));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Effect on Service : " + EffectOnService));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Operational Categorisation : " + OptCat));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Product Categorisation Tier 1 : " + ProdCat1));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Product Categorisation Tier 2 : " + ProdCat2));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Product Categorisation Tier 3 : " + ProdCat3));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Product Name : " + ProductName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		String ci_fixed="";
		
		if(CIFixedForTemplate.equals("yes")){
			ci_fixed= "Yes";
		}
		else if(CIFixedForTemplate.equals("no")){
			ci_fixed= "No";
		}
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Is the CI fixed for the template? : " + ci_fixed));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Please provide the CI’s to relate to the template : " + CIToRelateToTemplate));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Change Co-ordinator assignment - Support Organisation : " + CoOrdSupportOrg));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Change Co-ordinator assignment Support Group Name : " + CoOrdSupportGrp));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Which Change Management Group does the template relate to? : " + ChgMgmtGrpTemplateRelateTo));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Template Visibility : " + TemplateVisibilty));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
String task_template_assigned="";
		
		if(TaskTemplateToBeAssigned.equals("yes")){
			task_template_assigned= "Yes";
		}
		else if(TaskTemplateToBeAssigned.equals("no")){
			task_template_assigned= "No";
		}
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Do you want a task template assigned? : " + task_template_assigned));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"I confirm I have attached the Implementation Plan : Yes"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"I confirm I have attached the Testing Plan : Yes"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"I confirm I have attached the Back Out Plan : Yes"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));		

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "logout_button", ""));

	}
	
	@And("^the Work Order Notes field will contain all the details provided in the Service Request for Create New Change Template condition2 \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validateWorkOrderNotesDetailsCreateNewTemplateServiceImpactingCINotFixed(String LANID, String OUC, String Email, String ContactNumber, String ManagerName, String RequestType, String SuccessfulCRQs, String FrequencyOfUse, String TemplateName, String TemplateOwner, String TemplateSummary, String TemplateNotes, String ChangeClass, String NormalClassType, String ChangeReason, String ImpactOfFailure, String Urgency, String RiskLevel, String ServiceImpacting, String EffectOnService, String OptCat, String ProdCat1, String ProdCat2, String ProdCat3, String ProductName, String CIFixedForTemplate, String CoOrdSupportOrg, String CoOrdSupportGrp, String ChgMgmtGrpTemplateRelateTo, String TemplateVisibilty, String TaskTemplateToBeAssigned)
			throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(the Work Order Notes field will contain all the details provided in the Service Request for Create New Change Template condition2)");

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"LAN ID : " + LANID));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"OUC : " + OUC));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Email : " + Email));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Contact Phone Number : " + ContactNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Line Manager : " + ManagerName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Request Type : " + RequestType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Please provide a minimum of 3 successful CRQ’s : " + SuccessfulCRQs));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"What’s the frequency of use? : " + FrequencyOfUse));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Template Name : " + TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Template Owner : " + TemplateOwner));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Summary : " + TemplateSummary));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Notes : " + TemplateNotes));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Change Class : " + ChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				ChangeClass+" Type : " + NormalClassType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Change Reason : " + ChangeReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Impact of failure : " + ImpactOfFailure));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Urgency : " + Urgency));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Risk Level : " + RiskLevel));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		String service_impacting= "";
		if(ServiceImpacting.equals("yes")){
		service_impacting= "Yes";
		}
		else if(ServiceImpacting.equals("no")){
		service_impacting= "No";
		}
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Is the change service impacting? : " + service_impacting));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Effect on Service : " + EffectOnService));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Operational Categorisation : " + OptCat));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Product Categorisation Tier 1 : " + ProdCat1));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Product Categorisation Tier 2 : " + ProdCat2));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Product Categorisation Tier 3 : " + ProdCat3));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Product Name : " + ProductName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
String ci_fixed="";
		
		if(CIFixedForTemplate.equals("yes")){
			ci_fixed= "Yes";
		}
		else if(CIFixedForTemplate.equals("no")){
			ci_fixed= "No";
		}

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Is the CI fixed for the template? : " + ci_fixed));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Change Co-ordinator assignment - Support Organisation : " + CoOrdSupportOrg));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Change Co-ordinator assignment Support Group Name : " + CoOrdSupportGrp));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Which Change Management Group does the template relate to? : " + ChgMgmtGrpTemplateRelateTo));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Template Visibility : " + TemplateVisibilty));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
String task_template_assigned="";
		
		if(TaskTemplateToBeAssigned.equals("yes")){
			task_template_assigned= "Yes";
		}
		else if(TaskTemplateToBeAssigned.equals("no")){
			task_template_assigned= "No";
		}
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Do you want a task template assigned? : " + task_template_assigned));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"I confirm I have attached the Implementation Plan : Yes"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"I confirm I have attached the Testing Plan : Yes"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"I confirm I have attached the Back Out Plan : Yes"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));		

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "logout_button", ""));

	}

	
	@And("^the Work Order Notes field will contain all the details provided in the Service Request for Create New Change Template condition3 \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validateWorkOrderNotesDetailsCreateNewTemplateNoServiceImpactCIFixed(String LANID, String OUC, String Email, String ContactNumber, String ManagerName, String RequestType, String SuccessfulCRQs, String FrequencyOfUse, String TemplateName, String TemplateOwner, String TemplateSummary, String TemplateNotes, String ChangeClass, String NormalClassType, String ChangeReason, String ImpactOfFailure, String Urgency, String RiskLevel, String ServiceImpacting, String OptCat, String ProdCat1, String ProdCat2, String ProdCat3, String ProductName, String CIFixedForTemplate, String CIToRelateToTemplate, String CoOrdSupportOrg, String CoOrdSupportGrp, String ChgMgmtGrpTemplateRelateTo, String TemplateVisibilty, String TaskTemplateToBeAssigned)
			throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(the Work Order Notes field will contain all the details provided in the Service Request for Create New Change Template condition3)");

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"LAN ID : " + LANID));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"OUC : " + OUC));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Email : " + Email));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Contact Phone Number : " + ContactNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Line Manager : " + ManagerName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Request Type : " + RequestType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Please provide a minimum of 3 successful CRQ’s : " + SuccessfulCRQs));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"What’s the frequency of use? : " + FrequencyOfUse));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Template Name : " + TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Template Owner : " + TemplateOwner));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Summary : " + TemplateSummary));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Notes : " + TemplateNotes));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Change Class : " + ChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				ChangeClass+" Type : " + NormalClassType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Change Reason : " + ChangeReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Impact of failure : " + ImpactOfFailure));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Urgency : " + Urgency));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Risk Level : " + RiskLevel));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		

String service_impacting= "";
if(ServiceImpacting.equals("yes")){
service_impacting= "Yes";
}
else if(ServiceImpacting.equals("no")){
service_impacting= "No";
}
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Is the change service impacting? : " + service_impacting));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Operational Categorisation : " + OptCat));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Product Categorisation Tier 1 : " + ProdCat1));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Product Categorisation Tier 2 : " + ProdCat2));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Product Categorisation Tier 3 : " + ProdCat3));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Product Name : " + ProductName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
String ci_fixed="";
		
		if(CIFixedForTemplate.equals("yes")){
			ci_fixed= "Yes";
		}
		else if(CIFixedForTemplate.equals("no")){
			ci_fixed= "No";
		}
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Is the CI fixed for the template? : " + ci_fixed));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Please provide the CI’s to relate to the template : " + CIToRelateToTemplate));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Change Co-ordinator assignment - Support Organisation : " + CoOrdSupportOrg));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Change Co-ordinator assignment Support Group Name : " + CoOrdSupportGrp));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Which Change Management Group does the template relate to? : " + ChgMgmtGrpTemplateRelateTo));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Template Visibility : " + TemplateVisibilty));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
String task_template_assigned="";
		
		if(TaskTemplateToBeAssigned.equals("yes")){
			task_template_assigned= "Yes";
		}
		else if(TaskTemplateToBeAssigned.equals("no")){
			task_template_assigned= "No";
		}
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Do you want a task template assigned? : " + task_template_assigned));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"I confirm I have attached the Implementation Plan : Yes"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"I confirm I have attached the Testing Plan : Yes"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"I confirm I have attached the Back Out Plan : Yes"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));		

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "logout_button", ""));

	}
	
	@And("^the Work Order Notes field will contain all the details provided in the Service Request for Create New Change Template condition4 \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validateWorkOrderNotesDetailsCreateNewTemplateNoServiceImpactCINotFixed(String LANID, String OUC, String Email, String ContactNumber, String ManagerName, String RequestType, String SuccessfulCRQs, String FrequencyOfUse, String TemplateName, String TemplateOwner, String TemplateSummary, String TemplateNotes, String ChangeClass, String NormalClassType, String ChangeReason, String ImpactOfFailure, String Urgency, String RiskLevel, String ServiceImpacting, String OptCat, String ProdCat1, String ProdCat2, String ProdCat3, String ProductName, String CIFixedForTemplate, String CoOrdSupportOrg, String CoOrdSupportGrp, String ChgMgmtGrpTemplateRelateTo, String TemplateVisibilty, String TaskTemplateToBeAssigned)
			throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(the Work Order Notes field will contain all the details provided in the Service Request for Create New Change Template condition4)");

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"LAN ID : " + LANID));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"OUC : " + OUC));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Email : " + Email));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Contact Phone Number : " + ContactNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Line Manager : " + ManagerName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Request Type : " + RequestType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Please provide a minimum of 3 successful CRQ’s : " + SuccessfulCRQs));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"What’s the frequency of use? : " + FrequencyOfUse));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Template Name : " + TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Template Owner : " + TemplateOwner));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Summary : " + TemplateSummary));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Notes : " + TemplateNotes));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Change Class : " + ChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				ChangeClass+" Type : " + NormalClassType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Change Reason : " + ChangeReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Impact of failure : " + ImpactOfFailure));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Urgency : " + Urgency));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Risk Level : " + RiskLevel));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		String service_impacting= "";
		if(ServiceImpacting.equals("yes")){
		service_impacting= "Yes";
		}
		else if(ServiceImpacting.equals("no")){
		service_impacting= "No";
		}
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Is the change service impacting? : " + service_impacting));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Operational Categorisation : " + OptCat));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Product Categorisation Tier 1 : " + ProdCat1));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Product Categorisation Tier 2 : " + ProdCat2));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Product Categorisation Tier 3 : " + ProdCat3));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Product Name : " + ProductName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
String ci_fixed="";
		
		if(CIFixedForTemplate.equals("yes")){
			ci_fixed= "Yes";
		}
		else if(CIFixedForTemplate.equals("no")){
			ci_fixed= "No";
		}
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Is the CI fixed for the template? : " + ci_fixed));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Change Co-ordinator assignment - Support Organisation : " + CoOrdSupportOrg));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Change Co-ordinator assignment Support Group Name : " + CoOrdSupportGrp));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Which Change Management Group does the template relate to? : " + ChgMgmtGrpTemplateRelateTo));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Template Visibility : " + TemplateVisibilty));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
String task_template_assigned="";
		
		if(TaskTemplateToBeAssigned.equals("yes")){
			task_template_assigned= "Yes";
		}
		else if(TaskTemplateToBeAssigned.equals("no")){
			task_template_assigned= "No";
		}

		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Do you want a task template assigned? : " + task_template_assigned));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"I confirm I have attached the Implementation Plan : Yes"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"I confirm I have attached the Testing Plan : Yes"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"I confirm I have attached the Back Out Plan : Yes"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));		

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "logout_button", ""));

	}
	
	@And("^the Work Order Notes field will contain all the details provided in the Service Request for Modify an existing Change Template \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validateWorkOrderNotesDetailsModifyAnExistingChangeTemplate(String LANID, String OUC, String Email, String ContactNumber, String ManagerName, String RequestType, String TemplateName, String WhatToModify, String ChgMgmtGrpTemplateRelateTo)
			throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(the Work Order Notes field will contain all the details provided in the Service Request for Modify an existing Change Template)");

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"LAN ID : " + LANID));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"OUC : " + OUC));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Email : " + Email));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Contact Phone Number : " + ContactNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Line Manager : " + ManagerName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Request Type : " + RequestType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Template Name : " + TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"What would you like to modify? : " + WhatToModify));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Which Change Management Group does the template relate to? : " + ChgMgmtGrpTemplateRelateTo));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "logout_button", ""));

	}
	
	@And("^the Work Order Notes field will contain all the details provided in the Service Request for Remove an existing Change Template \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validateWorkOrderNotesDetailsRemoveAnExistingChangeTemplate(String LANID, String OUC, String Email, String ContactNumber, String ManagerName, String RequestType, String TemplateName, String JustificationForRemoval, String ChgMgmtGrpTemplateRelateTo)
			throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @And(the Work Order Notes field will contain all the details provided in the Service Request for Remove an existing Change Template)");

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"LAN ID : " + LANID));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"OUC : " + OUC));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Email : " + Email));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Contact Phone Number : " + ContactNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Line Manager : " + ManagerName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Request Type : " + RequestType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Template Name : " + TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Justification for removal : " + JustificationForRemoval));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyworkordernotesdetails_method.invoke(keywords, "work_order_notes_field",
				"Which Change Management Group does the template relate to? : " + ChgMgmtGrpTemplateRelateTo));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "logout_button", ""));

	}
	
	
	@And("^submit the Change Template service request form$")
	public void submitChangeTemplateServiceRequestForm() throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(submit the Change Template service request form)");

		APP_LOGS.debug((String) switchtoparentwindow_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		//APP_LOGS.debug((String) clickelement_method.invoke(keywords, "change_template_service_request_submit_btn", ""));
		//APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) getservicerequestid_method.invoke(keywords, "change_template_service_request_submit_btn", "RequestID"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "75000"));

	}
	
	@Then("^the system will create a Work Order to Change Management \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void serviceRequestCreatesWorkOrderToChangeManagement(String WOSummary, String WOPriority, String WOSupportGroupName, String WOCompany, String WOOptCatTier1, String WOOptCatTier2, String WOOptCatTier3, String WOProdCatTier1, String WOProdCatTier2, String WOProdCatTier3, String WOProductName) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(the system will create a Work Order to Change Management)");

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_request_home_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_request_it_home_page", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "75000"));
		
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "application_link", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "service_request_management", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "search_work_order", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "search_work_order", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "75000"));
		
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "associated_request_id_field",
				(String) getruntimeproperty_method.invoke(keywords, "RequestID", "")));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "search_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "6000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "Summary_Detail", WOSummary));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "work_order_priority_field",	WOPriority));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "wo_request_manager_support_group_name_field",	WOSupportGroupName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "wo_request_assignee_support_group_name_field",	WOSupportGroupName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "wo_categorization_tab", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "wo_company_field",	WOCompany));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "wo_optcat_tier1_field",	WOOptCatTier1));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "wo_optcat_tier2_field",	WOOptCatTier2));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "wo_optcat_tier3_field",	WOOptCatTier3));
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

	

	@When("^I enter the template details for test condition2 \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enterTemplateDetailsTestCondition2(String SuccessfulCRQs,String FrequencyOfUse, String TemplateName, String TemplateOwner, String TemplateSummary, String TemplateNotes, String ChangeClass, String NormalClassType, String ChangeReason, String ImpactOfFailure, String Urgency, String RiskLevel,String ServiceImpacting, String EffectOnService, String OptCat, String ProdCat1, String ProdCat2, String ProdCat3, String ProductName,String CIFixedForTemplate, String CoOrdSupportOrg, String CoOrdSupportGrp, String ChgMgmtGrpTemplateRelateTo, String TemplateVisibilty,String TaskTemplateToBeAssigned) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(I enter the template details for test condition2)");

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "successful_crqs_label",
				"Please provide a minimum of 3 successful CRQ’s *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "successful_crqs_field",
				"Successful CRQs Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "successful_crqs_validation_result", "Successful CRQs Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "successful_crqs_field", SuccessfulCRQs));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "frequency_of_use_label",
				"What’s the frequency of use? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "frequency_of_use_field",
				"Frequency Of Use Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "frequency_of_use_validation_result", "Frequency Of Use Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "frequency_of_use_field", FrequencyOfUse));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_name_label",
				"Template Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_name_field",
				"Template Name Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_name_validation_result", "Template Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_name_field", TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_owner_label",
				"Template Owner *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_owner_field",
				"Template Owner Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_owner_validation_result", "Template Owner Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_owner_field", TemplateOwner));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_label",
				"Summary *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_summary_field",
				"Summary Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_summary_field_validation_result", "Summary Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_summary_field", TemplateSummary));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_field_note",
				"Please provide the summary for the Change."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_label",
				"Notes *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_notes_field",
				"Notes Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_notes_field_validation_result", "Notes Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_notes_field", TemplateNotes));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_field_note",
				"Please provide a description of what the change is implementing."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_class_label",
				"Change Class *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_class_validation_result", "Change Class"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_class_dropdown", ChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_reason_label",
				"Change Reason *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_reason_validation_result", "Change Reason"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_reason_dropdown", ChangeReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_label",
				"Impact of failure *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "impact_of_failure_validation_result", "Impact of failure"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "impact_of_failure_dropdown", ImpactOfFailure));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_dropdown_note",
				"This is the impact of failure if the change goes wrong. Refer to the Incident matrix."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "urgency_label",
				"Urgency *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "urgency_validation_result", "Urgency"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "urgency_dropdown", Urgency));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "risk_level_label",
				"Risk Level *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "risk_level_validation_result", "Risk Level"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "risk_level_dropdown", RiskLevel));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "service_impacting_radio_label",
				"Is the change service impacting? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "service_impacting_radio_validation_result", "Is the change service impacting"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_impacting_radio_"+ServiceImpacting+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "opt_cat_label",
				"Operational Categorisation *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "opt_cat_validation_result", "Operational Categorisation"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "opt_cat_dropdown", OptCat));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_1_label",
				"Product Categorisation Tier 1"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_1_field",
				"Product Categorisation Tier 1 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_1_field", ProdCat1));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_2_label",
				"Product Categorisation Tier 2"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_2_field",
				"Product Categorisation Tier 2 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_2_field", ProdCat2));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_3_label",
				"Product Categorisation Tier 3"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_3_field",
				"Product Categorisation Tier 3 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_3_field", ProdCat3));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_label",
				"Product Name"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "product_name_field",
				"Product Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "product_name_field", ProductName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_field_note",
				"Please provide tier 1,2 & 3 Product Categorisation and also the Product Name."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_fixed_for_template_radio_label",
				"Is the CI fixed for the template? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "ci_fixed_for_template_radio_validation_result", "Is the CI fixed for the template"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "ci_fixed_for_template_radio_"+CIFixedForTemplate+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_org_label",
				"Change Co-ordinator assignment - Support Organisation *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_org_field",
				"Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_co-ord_assign_support_org_field_validation_result", "Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_org_field", CoOrdSupportOrg));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_group_label",
				"Change Co-ordinator assignment Support Group Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_group_field",
				"Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_co-ord_assign_support_group_field_validation_result", "Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_group_field", CoOrdSupportGrp));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_mgmt_grp_template_relate_to_label",
				"Which Change Management Group does the template relate to? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field",
				"Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_mgmt_grp_template_relate_to_validation_result", "Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field", ChgMgmtGrpTemplateRelateTo));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_label",
				"Template Visibility *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_visibility_field",
				"Template Visibility Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_visibility_field_validation_result", "Template Visibility Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_visibility_field", TemplateVisibilty));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_field_note",
				"You must supply the Support Organisation and the Support Group Name of the support groups who will need visbility of this template. The template will be restricted to the support groups you list here."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_label",
				"Do you want a task template assigned? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "want_task_template_assigned_radio_validation_result", "Do you want a task template assigned?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "want_task_template_assigned_radio_"+TaskTemplateToBeAssigned+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_note",
				"If the change implementer does not have the functional role of change co-ordinator they will not be able to move the CRQ through the real time status to completion. A task template enables an implementer to do this."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note_label",
				"Note"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note",
				"Please attach the implementation, Testing and Back Out plans."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_imp_plan_confirmation_radio_label",
				"I confirm I have attached the Implementation Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_imp_plan_confirmation_radio_validation_result", "I confirm I have attached the Implementation Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_imp_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_testing_plan_confirmation_radio_label",
				"I confirm I have attached the Testing Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_testing_plan_confirmation_radio_validation_result", "I confirm I have attached the Testing Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_testing_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_backout_plan_confirmation_radio_label",
				"I confirm I have attached the Back Out Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_backout_plan_confirmation_radio_validation_result", "I confirm I have attached the Back Out Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_backout_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "normal_class_type_label",
				"Normal Class Type *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "normal_class_type_validation_result", "Normal Class Type"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "normal_class_type_dropdown", NormalClassType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "effect_on_service_label",
				"Effect on Service *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "effect_on_service_field",
				"Effect on Service Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "effect_on_service_validation_result", "Effect on Service Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "effect_on_service_field", EffectOnService));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "effect_on_service_field_note",
				"Please provide the effect on service whilst the change is being implemented."));
	
			
	}
	
	@When("^I enter the template details for test condition3 \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enterTemplateDetailsTestCondition3(String SuccessfulCRQs,String FrequencyOfUse, String TemplateName, String TemplateOwner, String TemplateSummary, String TemplateNotes, String ChangeClass, String NormalClassType, String ChangeReason, String ImpactOfFailure, String Urgency, String RiskLevel,String ServiceImpacting,  String OptCat, String ProdCat1, String ProdCat2, String ProdCat3, String ProductName,String CIFixedForTemplate, String CIToRelateToTemplate, String CoOrdSupportOrg, String CoOrdSupportGrp, String ChgMgmtGrpTemplateRelateTo, String TemplateVisibilty,String TaskTemplateToBeAssigned) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(I enter the template details for test condition3)");

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "successful_crqs_label",
				"Please provide a minimum of 3 successful CRQ’s *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "successful_crqs_field",
				"Successful CRQs Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "successful_crqs_validation_result", "Successful CRQs Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "successful_crqs_field", SuccessfulCRQs));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "frequency_of_use_label",
				"What’s the frequency of use? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "frequency_of_use_field",
				"Frequency Of Use Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "frequency_of_use_validation_result", "Frequency Of Use Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "frequency_of_use_field", FrequencyOfUse));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_name_label",
				"Template Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_name_field",
				"Template Name Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_name_validation_result", "Template Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_name_field", TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_owner_label",
				"Template Owner *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_owner_field",
				"Template Owner Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_owner_validation_result", "Template Owner Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_owner_field", TemplateOwner));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_label",
				"Summary *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_summary_field",
				"Summary Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_summary_field_validation_result", "Summary Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_summary_field", TemplateSummary));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_field_note",
				"Please provide the summary for the Change."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_label",
				"Notes *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_notes_field",
				"Notes Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_notes_field_validation_result", "Notes Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_notes_field", TemplateNotes));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_field_note",
				"Please provide a description of what the change is implementing."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_class_label",
				"Change Class *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_class_validation_result", "Change Class"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_class_dropdown", ChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_reason_label",
				"Change Reason *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_reason_validation_result", "Change Reason"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_reason_dropdown", ChangeReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_label",
				"Impact of failure *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "impact_of_failure_validation_result", "Impact of failure"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "impact_of_failure_dropdown", ImpactOfFailure));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_dropdown_note",
				"This is the impact of failure if the change goes wrong. Refer to the Incident matrix."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "urgency_label",
				"Urgency *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "urgency_validation_result", "Urgency"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "urgency_dropdown", Urgency));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "risk_level_label",
				"Risk Level *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "risk_level_validation_result", "Risk Level"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "risk_level_dropdown", RiskLevel));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "service_impacting_radio_label",
				"Is the change service impacting? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "service_impacting_radio_validation_result", "Is the change service impacting"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_impacting_radio_"+ServiceImpacting+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "opt_cat_label",
				"Operational Categorisation *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "opt_cat_validation_result", "Operational Categorisation"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "opt_cat_dropdown", OptCat));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_1_label",
				"Product Categorisation Tier 1"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_1_field",
				"Product Categorisation Tier 1 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_1_field", ProdCat1));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_2_label",
				"Product Categorisation Tier 2"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_2_field",
				"Product Categorisation Tier 2 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_2_field", ProdCat2));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_3_label",
				"Product Categorisation Tier 3"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_3_field",
				"Product Categorisation Tier 3 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_3_field", ProdCat3));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_label",
				"Product Name"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "product_name_field",
				"Product Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "product_name_field", ProductName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_field_note",
				"Please provide tier 1,2 & 3 Product Categorisation and also the Product Name."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_fixed_for_template_radio_label",
				"Is the CI fixed for the template? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "ci_fixed_for_template_radio_validation_result", "Is the CI fixed for the template"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "ci_fixed_for_template_radio_"+CIFixedForTemplate+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_org_label",
				"Change Co-ordinator assignment - Support Organisation *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_org_field",
				"Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_co-ord_assign_support_org_field_validation_result", "Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_org_field", CoOrdSupportOrg));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_group_label",
				"Change Co-ordinator assignment Support Group Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_group_field",
				"Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_co-ord_assign_support_group_field_validation_result", "Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_group_field", CoOrdSupportGrp));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_mgmt_grp_template_relate_to_label",
				"Which Change Management Group does the template relate to? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field",
				"Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_mgmt_grp_template_relate_to_validation_result", "Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field", ChgMgmtGrpTemplateRelateTo));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_label",
				"Template Visibility *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_visibility_field",
				"Template Visibility Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_visibility_field_validation_result", "Template Visibility Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_visibility_field", TemplateVisibilty));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_field_note",
				"You must supply the Support Organisation and the Support Group Name of the support groups who will need visbility of this template. The template will be restricted to the support groups you list here."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_label",
				"Do you want a task template assigned? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "want_task_template_assigned_radio_validation_result", "Do you want a task template assigned?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "want_task_template_assigned_radio_"+TaskTemplateToBeAssigned+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_note",
				"If the change implementer does not have the functional role of change co-ordinator they will not be able to move the CRQ through the real time status to completion. A task template enables an implementer to do this."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note_label",
				"Note"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note",
				"Please attach the implementation, Testing and Back Out plans."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_imp_plan_confirmation_radio_label",
				"I confirm I have attached the Implementation Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_imp_plan_confirmation_radio_validation_result", "I confirm I have attached the Implementation Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_imp_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_testing_plan_confirmation_radio_label",
				"I confirm I have attached the Testing Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_testing_plan_confirmation_radio_validation_result", "I confirm I have attached the Testing Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_testing_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_backout_plan_confirmation_radio_label",
				"I confirm I have attached the Back Out Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_backout_plan_confirmation_radio_validation_result", "I confirm I have attached the Back Out Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_backout_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "normal_class_type_label",
				"Normal Class Type *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "normal_class_type_validation_result", "Normal Class Type"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "normal_class_type_dropdown", NormalClassType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_to_relate_to_template_label",
				"Please provide the CI’s to relate to the template *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "ci_to_relate_to_template_field",
				"Please provide the CI’s to relate to the template"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "ci_to_relate_to_template_field_validation_result", "Please provide the CI’s to relate to the template"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "ci_to_relate_to_template_field", CIToRelateToTemplate));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_to_relate_to_template_field_note",
				"If the template is used against a fixed CI(s) please list here."));
	
			
	}

	@When("^I enter the template details for test condition4 \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enterTemplateDetailsTestCondition4(String SuccessfulCRQs,String FrequencyOfUse, String TemplateName, String TemplateOwner, String TemplateSummary, String TemplateNotes, String ChangeClass, String NormalClassType, String ChangeReason, String ImpactOfFailure, String Urgency, String RiskLevel,String ServiceImpacting, String OptCat, String ProdCat1, String ProdCat2, String ProdCat3, String ProductName,String CIFixedForTemplate, String CoOrdSupportOrg, String CoOrdSupportGrp, String ChgMgmtGrpTemplateRelateTo, String TemplateVisibilty,String TaskTemplateToBeAssigned) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(I enter the template details for test condition4)");

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "successful_crqs_label",
				"Please provide a minimum of 3 successful CRQ’s *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "successful_crqs_field",
				"Successful CRQs Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "successful_crqs_validation_result", "Successful CRQs Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "successful_crqs_field", SuccessfulCRQs));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "frequency_of_use_label",
				"What’s the frequency of use? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "frequency_of_use_field",
				"Frequency Of Use Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "frequency_of_use_validation_result", "Frequency Of Use Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "frequency_of_use_field", FrequencyOfUse));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_name_label",
				"Template Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_name_field",
				"Template Name Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_name_validation_result", "Template Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_name_field", TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_owner_label",
				"Template Owner *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_owner_field",
				"Template Owner Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_owner_validation_result", "Template Owner Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_owner_field", TemplateOwner));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_label",
				"Summary *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_summary_field",
				"Summary Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_summary_field_validation_result", "Summary Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_summary_field", TemplateSummary));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_field_note",
				"Please provide the summary for the Change."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_label",
				"Notes *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_notes_field",
				"Notes Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_notes_field_validation_result", "Notes Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_notes_field", TemplateNotes));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_field_note",
				"Please provide a description of what the change is implementing."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_class_label",
				"Change Class *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_class_validation_result", "Change Class"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_class_dropdown", ChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_reason_label",
				"Change Reason *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_reason_validation_result", "Change Reason"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_reason_dropdown", ChangeReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_label",
				"Impact of failure *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "impact_of_failure_validation_result", "Impact of failure"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "impact_of_failure_dropdown", ImpactOfFailure));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_dropdown_note",
				"This is the impact of failure if the change goes wrong. Refer to the Incident matrix."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "urgency_label",
				"Urgency *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "urgency_validation_result", "Urgency"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "urgency_dropdown", Urgency));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "risk_level_label",
				"Risk Level *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "risk_level_validation_result", "Risk Level"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "risk_level_dropdown", RiskLevel));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "service_impacting_radio_label",
				"Is the change service impacting? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "service_impacting_radio_validation_result", "Is the change service impacting"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_impacting_radio_"+ServiceImpacting+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "opt_cat_label",
				"Operational Categorisation *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "opt_cat_validation_result", "Operational Categorisation"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "opt_cat_dropdown", OptCat));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_1_label",
				"Product Categorisation Tier 1"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_1_field",
				"Product Categorisation Tier 1 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_1_field", ProdCat1));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_2_label",
				"Product Categorisation Tier 2"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_2_field",
				"Product Categorisation Tier 2 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_2_field", ProdCat2));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_3_label",
				"Product Categorisation Tier 3"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_3_field",
				"Product Categorisation Tier 3 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_3_field", ProdCat3));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_label",
				"Product Name"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "product_name_field",
				"Product Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "product_name_field", ProductName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_field_note",
				"Please provide tier 1,2 & 3 Product Categorisation and also the Product Name."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_fixed_for_template_radio_label",
				"Is the CI fixed for the template? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "ci_fixed_for_template_radio_validation_result", "Is the CI fixed for the template"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "ci_fixed_for_template_radio_"+CIFixedForTemplate+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_org_label",
				"Change Co-ordinator assignment - Support Organisation *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_org_field",
				"Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_co-ord_assign_support_org_field_validation_result", "Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_org_field", CoOrdSupportOrg));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_group_label",
				"Change Co-ordinator assignment Support Group Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_group_field",
				"Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_co-ord_assign_support_group_field_validation_result", "Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_group_field", CoOrdSupportGrp));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_mgmt_grp_template_relate_to_label",
				"Which Change Management Group does the template relate to? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field",
				"Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_mgmt_grp_template_relate_to_validation_result", "Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field", ChgMgmtGrpTemplateRelateTo));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_label",
				"Template Visibility *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_visibility_field",
				"Template Visibility Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_visibility_field_validation_result", "Template Visibility Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_visibility_field", TemplateVisibilty));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_field_note",
				"You must supply the Support Organisation and the Support Group Name of the support groups who will need visbility of this template. The template will be restricted to the support groups you list here."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_label",
				"Do you want a task template assigned? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "want_task_template_assigned_radio_validation_result", "Do you want a task template assigned?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "want_task_template_assigned_radio_"+TaskTemplateToBeAssigned+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_note",
				"If the change implementer does not have the functional role of change co-ordinator they will not be able to move the CRQ through the real time status to completion. A task template enables an implementer to do this."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note_label",
				"Note"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note",
				"Please attach the implementation, Testing and Back Out plans."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_imp_plan_confirmation_radio_label",
				"I confirm I have attached the Implementation Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_imp_plan_confirmation_radio_validation_result", "I confirm I have attached the Implementation Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_imp_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_testing_plan_confirmation_radio_label",
				"I confirm I have attached the Testing Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_testing_plan_confirmation_radio_validation_result", "I confirm I have attached the Testing Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_testing_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_backout_plan_confirmation_radio_label",
				"I confirm I have attached the Back Out Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_backout_plan_confirmation_radio_validation_result", "I confirm I have attached the Back Out Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_backout_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "normal_class_type_label",
				"Normal Class Type *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "normal_class_type_validation_result", "Normal Class Type"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "normal_class_type_dropdown", NormalClassType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
			
	}
	
	@When("^I enter the template details for test condition5 \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enterTemplateDetailsTestCondition5(String SuccessfulCRQs,String FrequencyOfUse, String TemplateName, String TemplateOwner, String TemplateSummary, String TemplateNotes, String ChangeClass, String PreApprovedClassType, String ChangeReason, String ImpactOfFailure, String Urgency, String RiskLevel,String ServiceImpacting, String EffectOnService, String OptCat, String ProdCat1, String ProdCat2, String ProdCat3, String ProductName,String CIFixedForTemplate, String CIToRelateToTemplate, String CoOrdSupportOrg, String CoOrdSupportGrp, String ChgMgmtGrpTemplateRelateTo, String TemplateVisibilty,String TaskTemplateToBeAssigned) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(I enter the template details for test condition5)");

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "successful_crqs_label",
				"Please provide a minimum of 3 successful CRQ’s *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "successful_crqs_field",
				"Successful CRQs Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "successful_crqs_validation_result", "Successful CRQs Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "successful_crqs_field", SuccessfulCRQs));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "frequency_of_use_label",
				"What’s the frequency of use? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "frequency_of_use_field",
				"Frequency Of Use Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "frequency_of_use_validation_result", "Frequency Of Use Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "frequency_of_use_field", FrequencyOfUse));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_name_label",
				"Template Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_name_field",
				"Template Name Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_name_validation_result", "Template Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_name_field", TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_owner_label",
				"Template Owner *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_owner_field",
				"Template Owner Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_owner_validation_result", "Template Owner Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_owner_field", TemplateOwner));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_label",
				"Summary *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_summary_field",
				"Summary Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_summary_field_validation_result", "Summary Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_summary_field", TemplateSummary));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_field_note",
				"Please provide the summary for the Change."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_label",
				"Notes *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_notes_field",
				"Notes Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_notes_field_validation_result", "Notes Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_notes_field", TemplateNotes));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_field_note",
				"Please provide a description of what the change is implementing."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_class_label",
				"Change Class *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_class_validation_result", "Change Class"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_class_dropdown", ChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_reason_label",
				"Change Reason *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_reason_validation_result", "Change Reason"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_reason_dropdown", ChangeReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_label",
				"Impact of failure *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "impact_of_failure_validation_result", "Impact of failure"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "impact_of_failure_dropdown", ImpactOfFailure));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_dropdown_note",
				"This is the impact of failure if the change goes wrong. Refer to the Incident matrix."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "urgency_label",
				"Urgency *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "urgency_validation_result", "Urgency"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "urgency_dropdown", Urgency));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "risk_level_label",
				"Risk Level *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "risk_level_validation_result", "Risk Level"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "risk_level_dropdown", RiskLevel));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "service_impacting_radio_label",
				"Is the change service impacting? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "service_impacting_radio_validation_result", "Is the change service impacting"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_impacting_radio_"+ServiceImpacting+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "opt_cat_label",
				"Operational Categorisation *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "opt_cat_validation_result", "Operational Categorisation"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "opt_cat_dropdown", OptCat));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_1_label",
				"Product Categorisation Tier 1"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_1_field",
				"Product Categorisation Tier 1 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_1_field", ProdCat1));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_2_label",
				"Product Categorisation Tier 2"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_2_field",
				"Product Categorisation Tier 2 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_2_field", ProdCat2));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_3_label",
				"Product Categorisation Tier 3"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_3_field",
				"Product Categorisation Tier 3 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_3_field", ProdCat3));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_label",
				"Product Name"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "product_name_field",
				"Product Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "product_name_field", ProductName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_field_note",
				"Please provide tier 1,2 & 3 Product Categorisation and also the Product Name."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_fixed_for_template_radio_label",
				"Is the CI fixed for the template? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "ci_fixed_for_template_radio_validation_result", "Is the CI fixed for the template"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "ci_fixed_for_template_radio_"+CIFixedForTemplate+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_org_label",
				"Change Co-ordinator assignment - Support Organisation *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_org_field",
				"Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_co-ord_assign_support_org_field_validation_result", "Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_org_field", CoOrdSupportOrg));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_group_label",
				"Change Co-ordinator assignment Support Group Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_group_field",
				"Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_co-ord_assign_support_group_field_validation_result", "Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_group_field", CoOrdSupportGrp));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_mgmt_grp_template_relate_to_label",
				"Which Change Management Group does the template relate to? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field",
				"Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_mgmt_grp_template_relate_to_validation_result", "Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field", ChgMgmtGrpTemplateRelateTo));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_label",
				"Template Visibility *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_visibility_field",
				"Template Visibility Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_visibility_field_validation_result", "Template Visibility Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_visibility_field", TemplateVisibilty));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_field_note",
				"You must supply the Support Organisation and the Support Group Name of the support groups who will need visbility of this template. The template will be restricted to the support groups you list here."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_label",
				"Do you want a task template assigned? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "want_task_template_assigned_radio_validation_result", "Do you want a task template assigned?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "want_task_template_assigned_radio_"+TaskTemplateToBeAssigned+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_note",
				"If the change implementer does not have the functional role of change co-ordinator they will not be able to move the CRQ through the real time status to completion. A task template enables an implementer to do this."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note_label",
				"Note"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note",
				"Please attach the implementation, Testing and Back Out plans."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_imp_plan_confirmation_radio_label",
				"I confirm I have attached the Implementation Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_imp_plan_confirmation_radio_validation_result", "I confirm I have attached the Implementation Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_imp_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_testing_plan_confirmation_radio_label",
				"I confirm I have attached the Testing Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_testing_plan_confirmation_radio_validation_result", "I confirm I have attached the Testing Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_testing_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_backout_plan_confirmation_radio_label",
				"I confirm I have attached the Back Out Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_backout_plan_confirmation_radio_validation_result", "I confirm I have attached the Back Out Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_backout_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "preapproved_class_type_label",
				"Pre-Approved Class Type *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "preapproved_class_type_validation_result", "PreApproved Class Type"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "preapproved_class_type_dropdown", PreApprovedClassType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "effect_on_service_label",
				"Effect on Service *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "effect_on_service_field",
				"Effect on Service Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "effect_on_service_validation_result", "Effect on Service Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "effect_on_service_field", EffectOnService));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "effect_on_service_field_note",
				"Please provide the effect on service whilst the change is being implemented."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_to_relate_to_template_label",
				"Please provide the CI’s to relate to the template *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "ci_to_relate_to_template_field",
				"Please provide the CI’s to relate to the template"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "ci_to_relate_to_template_field_validation_result", "Please provide the CI’s to relate to the template"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "ci_to_relate_to_template_field", CIToRelateToTemplate));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_to_relate_to_template_field_note",
				"If the template is used against a fixed CI(s) please list here."));
	
			
	}
	
	@When("^I enter the template details for test condition6 \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enterTemplateDetailsTestCondition6(String SuccessfulCRQs,String FrequencyOfUse, String TemplateName, String TemplateOwner, String TemplateSummary, String TemplateNotes, String ChangeClass, String PreApprovedClassType, String ChangeReason, String ImpactOfFailure, String Urgency, String RiskLevel,String ServiceImpacting, String EffectOnService, String OptCat, String ProdCat1, String ProdCat2, String ProdCat3, String ProductName,String CIFixedForTemplate, String CoOrdSupportOrg, String CoOrdSupportGrp, String ChgMgmtGrpTemplateRelateTo, String TemplateVisibilty,String TaskTemplateToBeAssigned) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(I enter the template details for test condition6)");

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "successful_crqs_label",
				"Please provide a minimum of 3 successful CRQ’s *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "successful_crqs_field",
				"Successful CRQs Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "successful_crqs_validation_result", "Successful CRQs Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "successful_crqs_field", SuccessfulCRQs));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "frequency_of_use_label",
				"What’s the frequency of use? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "frequency_of_use_field",
				"Frequency Of Use Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "frequency_of_use_validation_result", "Frequency Of Use Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "frequency_of_use_field", FrequencyOfUse));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_name_label",
				"Template Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_name_field",
				"Template Name Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_name_validation_result", "Template Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_name_field", TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_owner_label",
				"Template Owner *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_owner_field",
				"Template Owner Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_owner_validation_result", "Template Owner Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_owner_field", TemplateOwner));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_label",
				"Summary *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_summary_field",
				"Summary Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_summary_field_validation_result", "Summary Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_summary_field", TemplateSummary));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_field_note",
				"Please provide the summary for the Change."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_label",
				"Notes *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_notes_field",
				"Notes Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_notes_field_validation_result", "Notes Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_notes_field", TemplateNotes));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_field_note",
				"Please provide a description of what the change is implementing."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_class_label",
				"Change Class *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_class_validation_result", "Change Class"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_class_dropdown", ChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_reason_label",
				"Change Reason *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_reason_validation_result", "Change Reason"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_reason_dropdown", ChangeReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_label",
				"Impact of failure *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "impact_of_failure_validation_result", "Impact of failure"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "impact_of_failure_dropdown", ImpactOfFailure));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_dropdown_note",
				"This is the impact of failure if the change goes wrong. Refer to the Incident matrix."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "urgency_label",
				"Urgency *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "urgency_validation_result", "Urgency"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "urgency_dropdown", Urgency));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "risk_level_label",
				"Risk Level *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "risk_level_validation_result", "Risk Level"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "risk_level_dropdown", RiskLevel));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "service_impacting_radio_label",
				"Is the change service impacting? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "service_impacting_radio_validation_result", "Is the change service impacting"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_impacting_radio_"+ServiceImpacting+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "opt_cat_label",
				"Operational Categorisation *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "opt_cat_validation_result", "Operational Categorisation"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "opt_cat_dropdown", OptCat));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_1_label",
				"Product Categorisation Tier 1"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_1_field",
				"Product Categorisation Tier 1 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_1_field", ProdCat1));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_2_label",
				"Product Categorisation Tier 2"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_2_field",
				"Product Categorisation Tier 2 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_2_field", ProdCat2));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_3_label",
				"Product Categorisation Tier 3"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_3_field",
				"Product Categorisation Tier 3 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_3_field", ProdCat3));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_label",
				"Product Name"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "product_name_field",
				"Product Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "product_name_field", ProductName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_field_note",
				"Please provide tier 1,2 & 3 Product Categorisation and also the Product Name."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_fixed_for_template_radio_label",
				"Is the CI fixed for the template? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "ci_fixed_for_template_radio_validation_result", "Is the CI fixed for the template"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "ci_fixed_for_template_radio_"+CIFixedForTemplate+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_org_label",
				"Change Co-ordinator assignment - Support Organisation *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_org_field",
				"Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_co-ord_assign_support_org_field_validation_result", "Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_org_field", CoOrdSupportOrg));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_group_label",
				"Change Co-ordinator assignment Support Group Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_group_field",
				"Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_co-ord_assign_support_group_field_validation_result", "Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_group_field", CoOrdSupportGrp));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_mgmt_grp_template_relate_to_label",
				"Which Change Management Group does the template relate to? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field",
				"Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_mgmt_grp_template_relate_to_validation_result", "Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field", ChgMgmtGrpTemplateRelateTo));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_label",
				"Template Visibility *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_visibility_field",
				"Template Visibility Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_visibility_field_validation_result", "Template Visibility Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_visibility_field", TemplateVisibilty));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_field_note",
				"You must supply the Support Organisation and the Support Group Name of the support groups who will need visbility of this template. The template will be restricted to the support groups you list here."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_label",
				"Do you want a task template assigned? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "want_task_template_assigned_radio_validation_result", "Do you want a task template assigned?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "want_task_template_assigned_radio_"+TaskTemplateToBeAssigned+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_note",
				"If the change implementer does not have the functional role of change co-ordinator they will not be able to move the CRQ through the real time status to completion. A task template enables an implementer to do this."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note_label",
				"Note"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note",
				"Please attach the implementation, Testing and Back Out plans."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_imp_plan_confirmation_radio_label",
				"I confirm I have attached the Implementation Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_imp_plan_confirmation_radio_validation_result", "I confirm I have attached the Implementation Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_imp_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_testing_plan_confirmation_radio_label",
				"I confirm I have attached the Testing Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_testing_plan_confirmation_radio_validation_result", "I confirm I have attached the Testing Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_testing_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_backout_plan_confirmation_radio_label",
				"I confirm I have attached the Back Out Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_backout_plan_confirmation_radio_validation_result", "I confirm I have attached the Back Out Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_backout_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "preapproved_class_type_label",
				"Pre-Approved Class Type *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "preapproved_class_type_validation_result", "PreApproved Class Type"));		
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "preapproved_class_type_dropdown", PreApprovedClassType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "effect_on_service_label",
				"Effect on Service *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "effect_on_service_field",
				"Effect on Service Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "effect_on_service_validation_result", "Effect on Service Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "effect_on_service_field", EffectOnService));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "effect_on_service_field_note",
				"Please provide the effect on service whilst the change is being implemented."));
		
			
	}
	
	@When("^I enter the template details for test condition7 \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enterTemplateDetailsTestCondition7(String SuccessfulCRQs,String FrequencyOfUse, String TemplateName, String TemplateOwner, String TemplateSummary, String TemplateNotes, String ChangeClass, String PreApprovedClassType, String ChangeReason, String ImpactOfFailure, String Urgency, String RiskLevel,String ServiceImpacting, String OptCat, String ProdCat1, String ProdCat2, String ProdCat3, String ProductName,String CIFixedForTemplate, String CIToRelateToTemplate, String CoOrdSupportOrg, String CoOrdSupportGrp, String ChgMgmtGrpTemplateRelateTo, String TemplateVisibilty,String TaskTemplateToBeAssigned) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(I enter the template details for test condition7)");

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "successful_crqs_label",
				"Please provide a minimum of 3 successful CRQ’s *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "successful_crqs_field",
				"Successful CRQs Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "successful_crqs_validation_result", "Successful CRQs Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "successful_crqs_field", SuccessfulCRQs));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "frequency_of_use_label",
				"What’s the frequency of use? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "frequency_of_use_field",
				"Frequency Of Use Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "frequency_of_use_validation_result", "Frequency Of Use Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "frequency_of_use_field", FrequencyOfUse));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_name_label",
				"Template Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_name_field",
				"Template Name Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_name_validation_result", "Template Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_name_field", TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_owner_label",
				"Template Owner *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_owner_field",
				"Template Owner Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_owner_validation_result", "Template Owner Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_owner_field", TemplateOwner));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_label",
				"Summary *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_summary_field",
				"Summary Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_summary_field_validation_result", "Summary Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_summary_field", TemplateSummary));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_field_note",
				"Please provide the summary for the Change."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_label",
				"Notes *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_notes_field",
				"Notes Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_notes_field_validation_result", "Notes Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_notes_field", TemplateNotes));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_field_note",
				"Please provide a description of what the change is implementing."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_class_label",
				"Change Class *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_class_validation_result", "Change Class"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_class_dropdown", ChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_reason_label",
				"Change Reason *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_reason_validation_result", "Change Reason"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_reason_dropdown", ChangeReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_label",
				"Impact of failure *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "impact_of_failure_validation_result", "Impact of failure"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "impact_of_failure_dropdown", ImpactOfFailure));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_dropdown_note",
				"This is the impact of failure if the change goes wrong. Refer to the Incident matrix."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "urgency_label",
				"Urgency *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "urgency_validation_result", "Urgency"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "urgency_dropdown", Urgency));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "risk_level_label",
				"Risk Level *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "risk_level_validation_result", "Risk Level"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "risk_level_dropdown", RiskLevel));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "service_impacting_radio_label",
				"Is the change service impacting? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "service_impacting_radio_validation_result", "Is the change service impacting"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_impacting_radio_"+ServiceImpacting+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "opt_cat_label",
				"Operational Categorisation *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "opt_cat_validation_result", "Operational Categorisation"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "opt_cat_dropdown", OptCat));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_1_label",
				"Product Categorisation Tier 1"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_1_field",
				"Product Categorisation Tier 1 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_1_field", ProdCat1));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_2_label",
				"Product Categorisation Tier 2"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_2_field",
				"Product Categorisation Tier 2 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_2_field", ProdCat2));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_3_label",
				"Product Categorisation Tier 3"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_3_field",
				"Product Categorisation Tier 3 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_3_field", ProdCat3));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_label",
				"Product Name"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "product_name_field",
				"Product Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "product_name_field", ProductName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_field_note",
				"Please provide tier 1,2 & 3 Product Categorisation and also the Product Name."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_fixed_for_template_radio_label",
				"Is the CI fixed for the template? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "ci_fixed_for_template_radio_validation_result", "Is the CI fixed for the template"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "ci_fixed_for_template_radio_"+CIFixedForTemplate+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_org_label",
				"Change Co-ordinator assignment - Support Organisation *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_org_field",
				"Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_co-ord_assign_support_org_field_validation_result", "Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_org_field", CoOrdSupportOrg));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_group_label",
				"Change Co-ordinator assignment Support Group Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_group_field",
				"Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_co-ord_assign_support_group_field_validation_result", "Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_group_field", CoOrdSupportGrp));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_mgmt_grp_template_relate_to_label",
				"Which Change Management Group does the template relate to? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field",
				"Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_mgmt_grp_template_relate_to_validation_result", "Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field", ChgMgmtGrpTemplateRelateTo));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_label",
				"Template Visibility *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_visibility_field",
				"Template Visibility Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_visibility_field_validation_result", "Template Visibility Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_visibility_field", TemplateVisibilty));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_field_note",
				"You must supply the Support Organisation and the Support Group Name of the support groups who will need visbility of this template. The template will be restricted to the support groups you list here."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_label",
				"Do you want a task template assigned? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "want_task_template_assigned_radio_validation_result", "Do you want a task template assigned?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "want_task_template_assigned_radio_"+TaskTemplateToBeAssigned+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_note",
				"If the change implementer does not have the functional role of change co-ordinator they will not be able to move the CRQ through the real time status to completion. A task template enables an implementer to do this."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note_label",
				"Note"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note",
				"Please attach the implementation, Testing and Back Out plans."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_imp_plan_confirmation_radio_label",
				"I confirm I have attached the Implementation Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_imp_plan_confirmation_radio_validation_result", "I confirm I have attached the Implementation Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_imp_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_testing_plan_confirmation_radio_label",
				"I confirm I have attached the Testing Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_testing_plan_confirmation_radio_validation_result", "I confirm I have attached the Testing Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_testing_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_backout_plan_confirmation_radio_label",
				"I confirm I have attached the Back Out Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_backout_plan_confirmation_radio_validation_result", "I confirm I have attached the Back Out Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_backout_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "preapproved_class_type_label",
				"Pre-Approved Class Type *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "preapproved_class_type_validation_result", "PreApproved Class Type"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "preapproved_class_type_dropdown", PreApprovedClassType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_to_relate_to_template_label",
				"Please provide the CI’s to relate to the template *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "ci_to_relate_to_template_field",
				"Please provide the CI’s to relate to the template"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "ci_to_relate_to_template_field_validation_result", "Please provide the CI’s to relate to the template"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "ci_to_relate_to_template_field", CIToRelateToTemplate));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_to_relate_to_template_field_note",
				"If the template is used against a fixed CI(s) please list here."));
	
			
	}
	
	@When("^I enter the template details for test condition8 \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enterTemplateDetailsTestCondition8(String SuccessfulCRQs,String FrequencyOfUse, String TemplateName, String TemplateOwner, String TemplateSummary, String TemplateNotes, String ChangeClass, String PreApprovedClassType, String ChangeReason, String ImpactOfFailure, String Urgency, String RiskLevel,String ServiceImpacting, String OptCat, String ProdCat1, String ProdCat2, String ProdCat3, String ProductName,String CIFixedForTemplate, String CoOrdSupportOrg, String CoOrdSupportGrp, String ChgMgmtGrpTemplateRelateTo, String TemplateVisibilty,String TaskTemplateToBeAssigned) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(I enter the template details for test condition8)");

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "successful_crqs_label",
				"Please provide a minimum of 3 successful CRQ’s *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "successful_crqs_field",
				"Successful CRQs Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "successful_crqs_validation_result", "Successful CRQs Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "successful_crqs_field", SuccessfulCRQs));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "frequency_of_use_label",
				"What’s the frequency of use? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "frequency_of_use_field",
				"Frequency Of Use Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "frequency_of_use_validation_result", "Frequency Of Use Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "frequency_of_use_field", FrequencyOfUse));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_name_label",
				"Template Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_name_field",
				"Template Name Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_name_validation_result", "Template Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_name_field", TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_owner_label",
				"Template Owner *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_owner_field",
				"Template Owner Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_owner_validation_result", "Template Owner Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_owner_field", TemplateOwner));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_label",
				"Summary *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_summary_field",
				"Summary Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_summary_field_validation_result", "Summary Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_summary_field", TemplateSummary));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_field_note",
				"Please provide the summary for the Change."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_label",
				"Notes *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_notes_field",
				"Notes Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_notes_field_validation_result", "Notes Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_notes_field", TemplateNotes));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_field_note",
				"Please provide a description of what the change is implementing."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_class_label",
				"Change Class *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_class_validation_result", "Change Class"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_class_dropdown", ChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_reason_label",
				"Change Reason *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_reason_validation_result", "Change Reason"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_reason_dropdown", ChangeReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_label",
				"Impact of failure *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "impact_of_failure_validation_result", "Impact of failure"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "impact_of_failure_dropdown", ImpactOfFailure));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_dropdown_note",
				"This is the impact of failure if the change goes wrong. Refer to the Incident matrix."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "urgency_label",
				"Urgency *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "urgency_validation_result", "Urgency"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "urgency_dropdown", Urgency));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "risk_level_label",
				"Risk Level *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "risk_level_validation_result", "Risk Level"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "risk_level_dropdown", RiskLevel));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "service_impacting_radio_label",
				"Is the change service impacting? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "service_impacting_radio_validation_result", "Is the change service impacting"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_impacting_radio_"+ServiceImpacting+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "opt_cat_label",
				"Operational Categorisation *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "opt_cat_validation_result", "Operational Categorisation"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "opt_cat_dropdown", OptCat));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_1_label",
				"Product Categorisation Tier 1"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_1_field",
				"Product Categorisation Tier 1 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_1_field", ProdCat1));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_2_label",
				"Product Categorisation Tier 2"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_2_field",
				"Product Categorisation Tier 2 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_2_field", ProdCat2));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_3_label",
				"Product Categorisation Tier 3"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_3_field",
				"Product Categorisation Tier 3 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_3_field", ProdCat3));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_label",
				"Product Name"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "product_name_field",
				"Product Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "product_name_field", ProductName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_field_note",
				"Please provide tier 1,2 & 3 Product Categorisation and also the Product Name."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_fixed_for_template_radio_label",
				"Is the CI fixed for the template? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "ci_fixed_for_template_radio_validation_result", "Is the CI fixed for the template"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "ci_fixed_for_template_radio_"+CIFixedForTemplate+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_org_label",
				"Change Co-ordinator assignment - Support Organisation *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_org_field",
				"Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_co-ord_assign_support_org_field_validation_result", "Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_org_field", CoOrdSupportOrg));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_group_label",
				"Change Co-ordinator assignment Support Group Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_group_field",
				"Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_co-ord_assign_support_group_field_validation_result", "Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_group_field", CoOrdSupportGrp));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_mgmt_grp_template_relate_to_label",
				"Which Change Management Group does the template relate to? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field",
				"Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_mgmt_grp_template_relate_to_validation_result", "Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field", ChgMgmtGrpTemplateRelateTo));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_label",
				"Template Visibility *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_visibility_field",
				"Template Visibility Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_visibility_field_validation_result", "Template Visibility Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_visibility_field", TemplateVisibilty));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_field_note",
				"You must supply the Support Organisation and the Support Group Name of the support groups who will need visbility of this template. The template will be restricted to the support groups you list here."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_label",
				"Do you want a task template assigned? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "want_task_template_assigned_radio_validation_result", "Do you want a task template assigned?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "want_task_template_assigned_radio_"+TaskTemplateToBeAssigned+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_note",
				"If the change implementer does not have the functional role of change co-ordinator they will not be able to move the CRQ through the real time status to completion. A task template enables an implementer to do this."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note_label",
				"Note"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note",
				"Please attach the implementation, Testing and Back Out plans."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_imp_plan_confirmation_radio_label",
				"I confirm I have attached the Implementation Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_imp_plan_confirmation_radio_validation_result", "I confirm I have attached the Implementation Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_imp_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_testing_plan_confirmation_radio_label",
				"I confirm I have attached the Testing Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_testing_plan_confirmation_radio_validation_result", "I confirm I have attached the Testing Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_testing_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_backout_plan_confirmation_radio_label",
				"I confirm I have attached the Back Out Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_backout_plan_confirmation_radio_validation_result", "I confirm I have attached the Back Out Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_backout_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "preapproved_class_type_label",
				"Pre-Approved Class Type *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "preapproved_class_type_validation_result", "PreApproved Class Type"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "preapproved_class_type_dropdown", PreApprovedClassType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
			
	}

	@When("^I enter the template details for test condition9 \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enterTemplateDetailsTestCondition9(String SuccessfulCRQs,String FrequencyOfUse, String TemplateName, String TemplateOwner, String TemplateSummary, String TemplateNotes, String ChangeClass, String EmergencyClassType, String ChangeReason, String ImpactOfFailure, String Urgency, String RiskLevel,String ServiceImpacting, String EffectOnService, String OptCat, String ProdCat1, String ProdCat2, String ProdCat3, String ProductName,String CIFixedForTemplate, String CIToRelateToTemplate, String CoOrdSupportOrg, String CoOrdSupportGrp, String ChgMgmtGrpTemplateRelateTo, String TemplateVisibilty,String TaskTemplateToBeAssigned) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(I enter the template details for test condition9)");

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "successful_crqs_label",
				"Please provide a minimum of 3 successful CRQ’s *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "successful_crqs_field",
				"Successful CRQs Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "successful_crqs_field", SuccessfulCRQs));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "frequency_of_use_label",
				"What’s the frequency of use? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "frequency_of_use_field",
				"Frequency Of Use Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "frequency_of_use_field", FrequencyOfUse));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_name_label",
				"Template Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_name_field",
				"Template Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_name_field", TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_owner_label",
				"Template Owner *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_owner_field",
				"Template Owner Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_owner_field", TemplateOwner));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_label",
				"Summary *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_summary_field",
				"Summary Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_summary_field", TemplateSummary));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_field_note",
				"Please provide the summary for the Change."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_label",
				"Notes *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_notes_field",
				"Notes Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_notes_field", TemplateNotes));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_field_note",
				"Please provide a description of what the change is implementing."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_class_label",
				"Change Class *"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_class_dropdown", ChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_reason_label",
				"Change Reason *"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_reason_dropdown", ChangeReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_label",
				"Impact of failure *"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "impact_of_failure_dropdown", ImpactOfFailure));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_dropdown_note",
				"This is the impact of failure if the change goes wrong. Refer to the Incident matrix."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "urgency_label",
				"Urgency *"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "urgency_dropdown", Urgency));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "risk_level_label",
				"Risk Level *"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "risk_level_dropdown", RiskLevel));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "service_impacting_radio_label",
				"Is the change service impacting? *"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_impacting_radio_"+ServiceImpacting+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "opt_cat_label",
				"Operational Categorisation *"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "opt_cat_dropdown", OptCat));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_1_label",
				"Product Categorisation Tier 1"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_1_field",
				"Product Categorisation Tier 1 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_1_field", ProdCat1));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_2_label",
				"Product Categorisation Tier 2"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_2_field",
				"Product Categorisation Tier 2 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_2_field", ProdCat2));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_3_label",
				"Product Categorisation Tier 3"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_3_field",
				"Product Categorisation Tier 3 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_3_field", ProdCat3));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_label",
				"Product Name"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "product_name_field",
				"Product Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "product_name_field", ProductName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_field_note",
				"Please provide tier 1,2 & 3 Product Categorisation and also the Product Name."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_fixed_for_template_radio_label",
				"Is the CI fixed for the template? *"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "ci_fixed_for_template_radio_"+CIFixedForTemplate+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_org_label",
				"Change Co-ordinator assignment - Support Organisation *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_org_field",
				"Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_org_field", CoOrdSupportOrg));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_group_label",
				"Change Co-ordinator assignment Support Group Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_group_field",
				"Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_group_field", CoOrdSupportGrp));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_mgmt_grp_template_relate_to_label",
				"Which Change Management Group does the template relate to? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field",
				"Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_mgmt_grp_template_relate_to_validation_result", "Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field", ChgMgmtGrpTemplateRelateTo));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_label",
				"Template Visibility *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_visibility_field",
				"Template Visibility Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_visibility_field", TemplateVisibilty));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_field_note",
				"You must supply the Support Organisation and the Support Group Name of the support groups who will need visbility of this template. The template will be restricted to the support groups you list here."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_label",
				"Do you want a task template assigned? *"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "want_task_template_assigned_radio_"+TaskTemplateToBeAssigned+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_note",
				"If the change implementer does not have the functional role of change co-ordinator they will not be able to move the CRQ through the real time status to completion. A task template enables an implementer to do this."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note_label",
				"Note"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note",
				"Please attach the implementation, Testing and Back Out plans."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_imp_plan_confirmation_radio_label",
				"I confirm I have attached the Implementation Plan *"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_imp_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_testing_plan_confirmation_radio_label",
				"I confirm I have attached the Testing Plan *"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_testing_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_backout_plan_confirmation_radio_label",
				"I confirm I have attached the Back Out Plan *"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_backout_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "emergency_class_type_label",
				"Normal Class Type *"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "emergency_class_type_dropdown", EmergencyClassType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "effect_on_service_label",
				"Effect on Service *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "effect_on_service_field",
				"Effect on Service Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "effect_on_service_field", EffectOnService));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "effect_on_service_field_note",
				"Please provide the effect on service whilst the change is being implemented."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_to_relate_to_template_label",
				"Please provide the CI’s to relate to the template *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "ci_to_relate_to_template_field",
				"Please provide the CI’s to relate to the template"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "ci_to_relate_to_template_field", CIToRelateToTemplate));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_to_relate_to_template_field_note",
				"If the template is used against a fixed CI(s) please list here."));
		
	}
	
	@When("^I enter the template details for test condition10 \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enterTemplateDetailsTestCondition10(String SuccessfulCRQs,String FrequencyOfUse, String TemplateName, String TemplateOwner, String TemplateSummary, String TemplateNotes, String ChangeClass, String EmergencyClassType, String ChangeReason, String ImpactOfFailure, String Urgency, String RiskLevel,String ServiceImpacting, String EffectOnService, String OptCat, String ProdCat1, String ProdCat2, String ProdCat3, String ProductName,String CIFixedForTemplate, String CoOrdSupportOrg, String CoOrdSupportGrp, String ChgMgmtGrpTemplateRelateTo, String TemplateVisibilty,String TaskTemplateToBeAssigned) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(I enter the template details for test condition10)");

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "successful_crqs_label",
				"Please provide a minimum of 3 successful CRQ’s *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "successful_crqs_field",
				"Successful CRQs Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "successful_crqs_validation_result", "Successful CRQs Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "successful_crqs_field", SuccessfulCRQs));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "frequency_of_use_label",
				"What’s the frequency of use? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "frequency_of_use_field",
				"Frequency Of Use Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "frequency_of_use_validation_result", "Frequency Of Use Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "frequency_of_use_field", FrequencyOfUse));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_name_label",
				"Template Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_name_field",
				"Template Name Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_name_validation_result", "Template Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_name_field", TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_owner_label",
				"Template Owner *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_owner_field",
				"Template Owner Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_owner_validation_result", "Template Owner Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_owner_field", TemplateOwner));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_label",
				"Summary *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_summary_field",
				"Summary Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_summary_field_validation_result", "Summary Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_summary_field", TemplateSummary));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_field_note",
				"Please provide the summary for the Change."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_label",
				"Notes *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_notes_field",
				"Notes Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_notes_field_validation_result", "Notes Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_notes_field", TemplateNotes));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_field_note",
				"Please provide a description of what the change is implementing."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_class_label",
				"Change Class *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_class_validation_result", "Change Class"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_class_dropdown", ChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_reason_label",
				"Change Reason *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_reason_validation_result", "Change Reason"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_reason_dropdown", ChangeReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_label",
				"Impact of failure *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "impact_of_failure_validation_result", "Impact of failure"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "impact_of_failure_dropdown", ImpactOfFailure));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_dropdown_note",
				"This is the impact of failure if the change goes wrong. Refer to the Incident matrix."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "urgency_label",
				"Urgency *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "urgency_validation_result", "Urgency"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "urgency_dropdown", Urgency));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "risk_level_label",
				"Risk Level *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "risk_level_validation_result", "Risk Level"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "risk_level_dropdown", RiskLevel));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "service_impacting_radio_label",
				"Is the change service impacting? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "service_impacting_radio_validation_result", "Is the change service impacting"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_impacting_radio_"+ServiceImpacting+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "opt_cat_label",
				"Operational Categorisation *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "opt_cat_validation_result", "Operational Categorisation"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "opt_cat_dropdown", OptCat));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_1_label",
				"Product Categorisation Tier 1"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_1_field",
				"Product Categorisation Tier 1 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_1_field", ProdCat1));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_2_label",
				"Product Categorisation Tier 2"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_2_field",
				"Product Categorisation Tier 2 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_2_field", ProdCat2));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_3_label",
				"Product Categorisation Tier 3"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_3_field",
				"Product Categorisation Tier 3 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_3_field", ProdCat3));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_label",
				"Product Name"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "product_name_field",
				"Product Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "product_name_field", ProductName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_field_note",
				"Please provide tier 1,2 & 3 Product Categorisation and also the Product Name."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_fixed_for_template_radio_label",
				"Is the CI fixed for the template? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "ci_fixed_for_template_radio_validation_result", "Is the CI fixed for the template"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "ci_fixed_for_template_radio_"+CIFixedForTemplate+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_org_label",
				"Change Co-ordinator assignment - Support Organisation *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_org_field",
				"Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_co-ord_assign_support_org_field_validation_result", "Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_org_field", CoOrdSupportOrg));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_group_label",
				"Change Co-ordinator assignment Support Group Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_group_field",
				"Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_co-ord_assign_support_group_field_validation_result", "Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_group_field", CoOrdSupportGrp));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_mgmt_grp_template_relate_to_label",
				"Which Change Management Group does the template relate to? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field",
				"Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_mgmt_grp_template_relate_to_validation_result", "Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field", ChgMgmtGrpTemplateRelateTo));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_label",
				"Template Visibility *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_visibility_field",
				"Template Visibility Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_visibility_field_validation_result", "Template Visibility Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_visibility_field", TemplateVisibilty));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_field_note",
				"You must supply the Support Organisation and the Support Group Name of the support groups who will need visbility of this template. The template will be restricted to the support groups you list here."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_label",
				"Do you want a task template assigned? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "want_task_template_assigned_radio_validation_result", "Do you want a task template assigned?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "want_task_template_assigned_radio_"+TaskTemplateToBeAssigned+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_note",
				"If the change implementer does not have the functional role of change co-ordinator they will not be able to move the CRQ through the real time status to completion. A task template enables an implementer to do this."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note_label",
				"Note"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note",
				"Please attach the implementation, Testing and Back Out plans."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_imp_plan_confirmation_radio_label",
				"I confirm I have attached the Implementation Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_imp_plan_confirmation_radio_validation_result", "I confirm I have attached the Implementation Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_imp_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_testing_plan_confirmation_radio_label",
				"I confirm I have attached the Testing Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_testing_plan_confirmation_radio_validation_result", "I confirm I have attached the Testing Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_testing_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_backout_plan_confirmation_radio_label",
				"I confirm I have attached the Back Out Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_backout_plan_confirmation_radio_validation_result", "I confirm I have attached the Back Out Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_backout_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "emergency_class_type_label",
				"Emergency Class Type *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "emergency_class_type_validation_result", "Emergency Class Type"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "emergency_class_type_dropdown", EmergencyClassType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "effect_on_service_label",
				"Effect on Service *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "effect_on_service_field",
				"Effect on Service Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "effect_on_service_validation_result", "Effect on Service Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "effect_on_service_field", EffectOnService));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "effect_on_service_field_note",
				"Please provide the effect on service whilst the change is being implemented."));
		
			
	}

	@When("^I enter the template details for test condition11 \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enterTemplateDetailsTestCondition11(String SuccessfulCRQs,String FrequencyOfUse, String TemplateName, String TemplateOwner, String TemplateSummary, String TemplateNotes, String ChangeClass, String EmergencyClassType, String ChangeReason, String ImpactOfFailure, String Urgency, String RiskLevel,String ServiceImpacting, String OptCat, String ProdCat1, String ProdCat2, String ProdCat3, String ProductName,String CIFixedForTemplate, String CIToRelateToTemplate, String CoOrdSupportOrg, String CoOrdSupportGrp, String ChgMgmtGrpTemplateRelateTo, String TemplateVisibilty,String TaskTemplateToBeAssigned) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(I enter the template details for test condition11)");

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "successful_crqs_label",
				"Please provide a minimum of 3 successful CRQ’s *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "successful_crqs_field",
				"Successful CRQs Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "successful_crqs_validation_result", "Successful CRQs Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "successful_crqs_field", SuccessfulCRQs));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "frequency_of_use_label",
				"What’s the frequency of use? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "frequency_of_use_field",
				"Frequency Of Use Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "frequency_of_use_validation_result", "Frequency Of Use Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "frequency_of_use_field", FrequencyOfUse));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_name_label",
				"Template Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_name_field",
				"Template Name Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_name_validation_result", "Template Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_name_field", TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_owner_label",
				"Template Owner *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_owner_field",
				"Template Owner Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_owner_validation_result", "Template Owner Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_owner_field", TemplateOwner));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_label",
				"Summary *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_summary_field",
				"Summary Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_summary_field_validation_result", "Summary Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_summary_field", TemplateSummary));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_field_note",
				"Please provide the summary for the Change."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_label",
				"Notes *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_notes_field",
				"Notes Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_notes_field_validation_result", "Notes Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_notes_field", TemplateNotes));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_field_note",
				"Please provide a description of what the change is implementing."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_class_label",
				"Change Class *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_class_validation_result", "Change Class"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_class_dropdown", ChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_reason_label",
				"Change Reason *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_reason_validation_result", "Change Reason"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_reason_dropdown", ChangeReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_label",
				"Impact of failure *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "impact_of_failure_validation_result", "Impact of failure"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "impact_of_failure_dropdown", ImpactOfFailure));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_dropdown_note",
				"This is the impact of failure if the change goes wrong. Refer to the Incident matrix."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "urgency_label",
				"Urgency *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "urgency_validation_result", "Urgency"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "urgency_dropdown", Urgency));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "risk_level_label",
				"Risk Level *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "risk_level_validation_result", "Risk Level"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "risk_level_dropdown", RiskLevel));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "service_impacting_radio_label",
				"Is the change service impacting? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "service_impacting_radio_validation_result", "Is the change service impacting"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_impacting_radio_"+ServiceImpacting+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
				
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "opt_cat_label",
				"Operational Categorisation *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "opt_cat_validation_result", "Operational Categorisation"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "opt_cat_dropdown", OptCat));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_1_label",
				"Product Categorisation Tier 1"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_1_field",
				"Product Categorisation Tier 1 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_1_field", ProdCat1));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_2_label",
				"Product Categorisation Tier 2"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_2_field",
				"Product Categorisation Tier 2 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_2_field", ProdCat2));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_3_label",
				"Product Categorisation Tier 3"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_3_field",
				"Product Categorisation Tier 3 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_3_field", ProdCat3));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_label",
				"Product Name"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "product_name_field",
				"Product Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "product_name_field", ProductName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_field_note",
				"Please provide tier 1,2 & 3 Product Categorisation and also the Product Name."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_fixed_for_template_radio_label",
				"Is the CI fixed for the template? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "ci_fixed_for_template_radio_validation_result", "Is the CI fixed for the template"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "ci_fixed_for_template_radio_"+CIFixedForTemplate+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_org_label",
				"Change Co-ordinator assignment - Support Organisation *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_org_field",
				"Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_co-ord_assign_support_org_field_validation_result", "Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_org_field", CoOrdSupportOrg));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_group_label",
				"Change Co-ordinator assignment Support Group Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_group_field",
				"Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_co-ord_assign_support_group_field_validation_result", "Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_group_field", CoOrdSupportGrp));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_mgmt_grp_template_relate_to_label",
				"Which Change Management Group does the template relate to? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field",
				"Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_mgmt_grp_template_relate_to_validation_result", "Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field", ChgMgmtGrpTemplateRelateTo));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_label",
				"Template Visibility *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_visibility_field",
				"Template Visibility Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_visibility_field_validation_result", "Template Visibility Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_visibility_field", TemplateVisibilty));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_field_note",
				"You must supply the Support Organisation and the Support Group Name of the support groups who will need visbility of this template. The template will be restricted to the support groups you list here."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_label",
				"Do you want a task template assigned? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "want_task_template_assigned_radio_validation_result", "Do you want a task template assigned?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "want_task_template_assigned_radio_"+TaskTemplateToBeAssigned+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_note",
				"If the change implementer does not have the functional role of change co-ordinator they will not be able to move the CRQ through the real time status to completion. A task template enables an implementer to do this."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note_label",
				"Note"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note",
				"Please attach the implementation, Testing and Back Out plans."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_imp_plan_confirmation_radio_label",
				"I confirm I have attached the Implementation Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_imp_plan_confirmation_radio_validation_result", "I confirm I have attached the Implementation Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_imp_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_testing_plan_confirmation_radio_label",
				"I confirm I have attached the Testing Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_testing_plan_confirmation_radio_validation_result", "I confirm I have attached the Testing Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_testing_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_backout_plan_confirmation_radio_label",
				"I confirm I have attached the Back Out Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_backout_plan_confirmation_radio_validation_result", "I confirm I have attached the Back Out Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_backout_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "emergency_class_type_label",
				"Emergency Class Type *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "emergency_class_type_validation_result", "Emergency Class Type"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "emergency_class_type_dropdown", EmergencyClassType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_to_relate_to_template_label",
				"Please provide the CI’s to relate to the template *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "ci_to_relate_to_template_field",
				"Please provide the CI’s to relate to the template"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "ci_to_relate_to_template_field_validation_result", "Please provide the CI’s to relate to the template"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "ci_to_relate_to_template_field", CIToRelateToTemplate));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_to_relate_to_template_field_note",
				"If the template is used against a fixed CI(s) please list here."));
			
	}
	
	@When("^I enter the template details for test condition12 \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enterTemplateDetailsTestCondition12(String SuccessfulCRQs,String FrequencyOfUse, String TemplateName, String TemplateOwner, String TemplateSummary, String TemplateNotes, String ChangeClass, String EmergencyClassType, String ChangeReason, String ImpactOfFailure, String Urgency, String RiskLevel,String ServiceImpacting, String OptCat, String ProdCat1, String ProdCat2, String ProdCat3, String ProductName,String CIFixedForTemplate, String CoOrdSupportOrg, String CoOrdSupportGrp, String ChgMgmtGrpTemplateRelateTo, String TemplateVisibilty,String TaskTemplateToBeAssigned) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(I enter the template details for test condition12)");

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "successful_crqs_label",
				"Please provide a minimum of 3 successful CRQ’s *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "successful_crqs_field",
				"Successful CRQs Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "successful_crqs_validation_result", "Successful CRQs Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "successful_crqs_field", SuccessfulCRQs));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "frequency_of_use_label",
				"What’s the frequency of use? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "frequency_of_use_field",
				"Frequency Of Use Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "frequency_of_use_validation_result", "Frequency Of Use Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "frequency_of_use_field", FrequencyOfUse));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_name_label",
				"Template Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_name_field",
				"Template Name Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_name_validation_result", "Template Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_name_field", TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_owner_label",
				"Template Owner *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_owner_field",
				"Template Owner Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_owner_validation_result", "Template Owner Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_owner_field", TemplateOwner));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_label",
				"Summary *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_summary_field",
				"Summary Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_summary_field_validation_result", "Summary Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_summary_field", TemplateSummary));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_summary_field_note",
				"Please provide the summary for the Change."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_label",
				"Notes *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_notes_field",
				"Notes Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_notes_field_validation_result", "Notes Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_notes_field", TemplateNotes));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_notes_field_note",
				"Please provide a description of what the change is implementing."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_class_label",
				"Change Class *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_class_validation_result", "Change Class"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_class_dropdown", ChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_reason_label",
				"Change Reason *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_reason_validation_result", "Change Reason"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "change_reason_dropdown", ChangeReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_label",
				"Impact of failure *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "impact_of_failure_validation_result", "Impact of failure"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "impact_of_failure_dropdown", ImpactOfFailure));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "impact_of_failure_dropdown_note",
				"This is the impact of failure if the change goes wrong. Refer to the Incident matrix."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "urgency_label",
				"Urgency *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "urgency_validation_result", "Urgency"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "urgency_dropdown", Urgency));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "risk_level_label",
				"Risk Level *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "risk_level_validation_result", "Risk Level"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "risk_level_dropdown", RiskLevel));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "service_impacting_radio_label",
				"Is the change service impacting? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "service_impacting_radio_validation_result", "Is the change service impacting"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "service_impacting_radio_"+ServiceImpacting+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "opt_cat_label",
				"Operational Categorisation *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "opt_cat_validation_result", "Operational Categorisation"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "opt_cat_dropdown", OptCat));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_1_label",
				"Product Categorisation Tier 1"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_1_field",
				"Product Categorisation Tier 1 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_1_field", ProdCat1));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_2_label",
				"Product Categorisation Tier 2"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_2_field",
				"Product Categorisation Tier 2 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_2_field", ProdCat2));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "prod_cat_3_label",
				"Product Categorisation Tier 3"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "prod_cat_3_field",
				"Product Categorisation Tier 3 Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "prod_cat_3_field", ProdCat3));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_label",
				"Product Name"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "product_name_field",
				"Product Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "product_name_field", ProductName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "product_name_field_note",
				"Please provide tier 1,2 & 3 Product Categorisation and also the Product Name."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "ci_fixed_for_template_radio_label",
				"Is the CI fixed for the template? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "ci_fixed_for_template_radio_validation_result", "Is the CI fixed for the template"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "ci_fixed_for_template_radio_"+CIFixedForTemplate+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_org_label",
				"Change Co-ordinator assignment - Support Organisation *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_org_field",
				"Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_co-ord_assign_support_org_field_validation_result", "Change Co-Ord Assignment Support Org Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_org_field", CoOrdSupportOrg));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_co-ord_assign_support_group_label",
				"Change Co-ordinator assignment Support Group Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_co-ord_assign_support_group_field",
				"Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_co-ord_assign_support_group_field_validation_result", "Change Co-Ord Assignment Support Group Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "change_co-ord_assign_support_group_field", CoOrdSupportGrp));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "change_mgmt_grp_template_relate_to_label",
				"Which Change Management Group does the template relate to? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field",
				"Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "change_mgmt_grp_template_relate_to_validation_result", "Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "change_mgmt_grp_template_relate_to_field", ChgMgmtGrpTemplateRelateTo));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_label",
				"Template Visibility *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "template_visibility_field",
				"Template Visibility Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "template_visibility_field_validation_result", "Template Visibility Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "template_visibility_field", TemplateVisibilty));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "template_visibility_field_note",
				"You must supply the Support Organisation and the Support Group Name of the support groups who will need visbility of this template. The template will be restricted to the support groups you list here."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_label",
				"Do you want a task template assigned? *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "want_task_template_assigned_radio_validation_result", "Do you want a task template assigned?"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "want_task_template_assigned_radio_"+TaskTemplateToBeAssigned+"_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "want_task_template_assigned_radio_note",
				"If the change implementer does not have the functional role of change co-ordinator they will not be able to move the CRQ through the real time status to completion. A task template enables an implementer to do this."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note_label",
				"Note"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "task_template_assinged_note",
				"Please attach the implementation, Testing and Back Out plans."));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_imp_plan_confirmation_radio_label",
				"I confirm I have attached the Implementation Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_imp_plan_confirmation_radio_validation_result", "I confirm I have attached the Implementation Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_imp_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_testing_plan_confirmation_radio_label",
				"I confirm I have attached the Testing Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_testing_plan_confirmation_radio_validation_result", "I confirm I have attached the Testing Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_testing_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "attached_backout_plan_confirmation_radio_label",
				"I confirm I have attached the Back Out Plan *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "attached_backout_plan_confirmation_radio_validation_result", "I confirm I have attached the Back Out Plan"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "attached_backout_plan_confirmation_radio_yes_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "emergency_class_type_label",
				"Emergency Class Type *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "emergency_class_type_validation_result", "Emergency Class Type"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "emergency_class_type_dropdown", EmergencyClassType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
			
	}
	
	@And("^I am requesting to Modify an existing change template \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void requestToModifyAnExistingChangeTemplate(String LANID, String OUC, String Email, String ContactNumber,
			String ManagerName, String RequestType) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(I am requesting to Modify an existing change template)");

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "instructions_icon", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "instructions_message",
				"Please complete all required fields as any missing or incorrect information will delay the progress of your request. All the information required can be found by looking up previous successful CRQ's in Remedy. If you have any queries before you submit your request please contact your operational change manager."));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "requester_lan_id_label", "LAN ID"));
		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "requester_lan_id_field", "LANID"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "requester_lan_id_field", LANID));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "requester_ouc_label", "OUC *"));
		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "requester_ouc_field", "OUC"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "requester_ouc_field", OUC));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "requester_email_label", "Email *"));
		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "requester_email_field", Email));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "requester_email_field", Email));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "requester_contact_phone_number_label",
				"Contact Phone Number *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "requester_contact_phone_number_field",
				"Contact Phone Number"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "requester_contact_phone_number_validation_result", "Contact Phone Number"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "requester_contact_phone_number_field", ContactNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "requester_line_manager_label", "Line Manager *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "requester_line_manager_field", ManagerName));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "requester_line_manager_field_validation_result", "Line Manager"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "requester_line_manager_field", ManagerName));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "request_type_label", "Request Type *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "request_type_validation_result", "Request Type"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "request_type_dropdown", RequestType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

	}
	
	@When("^I enter the template details to modify \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enterTemplateDetailsToModify( String TemplateName, String WhatToModify, String ChgMgmtGrpTemplateRelateTo) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(I enter the template details to modify)");

		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "modify_template_name_label",
				"Template Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "modify_template_name_field",
				"Template Name Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "modify_template_name_field_validation_result", "Template Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "modify_template_name_field", TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "modify_template_name_field_note",
				"You must be the owner of the template or attach the owner’s approval for the modification of this template."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "what_to_modify_in_the_template_label",
				"What would you like to modify? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "what_to_modify_in_the_template_field",
				"What to modify in the template Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "what_to_modify_in_the_template_field_validation_result", "What to modify in the template Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "what_to_modify_in_the_template_field", WhatToModify));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "what_to_modify_in_the_template_field_note",
				"Please attached any revised documentation to support the template."));		
		

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "modify_change_mgmt_grp_template_relate_to_label",
				"Which Change Management Group does the template relate to? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "modify_change_mgmt_grp_template_relate_to_field",
				"Which Change Management Group does the template relate to?"));		
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "modify_change_mgmt_grp_template_relate_to_validation_result", "Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "modify_change_mgmt_grp_template_relate_to_field", ChgMgmtGrpTemplateRelateTo));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
							
	}
	
	@And("^I am requesting to remove a change template \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void requestToRemoveAChangeTemplate(String LANID, String OUC, String Email, String ContactNumber,
			String ManagerName, String RequestType) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(I am requesting to remove a change template)");

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "instructions_icon", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "instructions_message",
				"Please complete all required fields as any missing or incorrect information will delay the progress of your request. All the information required can be found by looking up previous successful CRQ's in Remedy. If you have any queries before you submit your request please contact your operational change manager."));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "requester_lan_id_label", "LAN ID"));
		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "requester_lan_id_field", "LANID"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "requester_lan_id_field", LANID));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "requester_ouc_label", "OUC *"));
		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "requester_ouc_field", "OUC"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "requester_ouc_field", OUC));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "requester_email_label", "Email *"));
		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "requester_email_field", Email));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "requester_email_field", Email));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "requester_contact_phone_number_label",
				"Contact Phone Number *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "requester_contact_phone_number_field",
				"Contact Phone Number"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "requester_contact_phone_number_validation_result", "Contact Phone Number"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "requester_contact_phone_number_field", ContactNumber));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "requester_line_manager_label", "Line Manager *"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "requester_line_manager_field", ManagerName));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "requester_line_manager_field_validation_result", "Line Manager"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "requester_line_manager_field", ManagerName));

		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "request_type_label", "Request Type *"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "request_type_validation_result", "Request Type"));
		APP_LOGS.debug((String) selectmenuoptionsrdform_method.invoke(keywords, "request_type_dropdown", RequestType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

	}
	
	@When("^I enter the template details for removal \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enterTemplateDetailsForRemoval( String TemplateName, String JustificationForRemoval, String ChgMgmtGrpTemplateRelateTo) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(I enter the template details for removal)");

		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "remove_template_name_label",
				"Template Name *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "remove_template_name_field",
				"Template Name Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "remove_template_name_field_validation_result", "Template Name Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "remove_template_name_field", TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "remove_template_name_field_note",
				"You must be the owner of the template or attach the owner’s approval for the removal of this template."));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "justification_for_removal_label",
				"Justification for removal *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "justification_for_removal_field",
				"Justification for removal Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "justification_for_removal_validation_result", "Justification for removal Field"));
		APP_LOGS.debug(
				(String) sendkeys_method.invoke(keywords, "justification_for_removal_field", JustificationForRemoval));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug((String) verifylinktext_method.invoke(keywords, "remove_change_mgmt_grp_template_relate_to_label",
				"Which Change Management Group does the template relate to? *"));
		APP_LOGS.debug((String) verifyfieldisnotreadOnly_method.invoke(keywords, "remove_change_mgmt_grp_template_relate_to_field",
				"Which Change Management Group does the template relate to Field"));
		APP_LOGS.debug((String) verifyfieldmandatoryinsrdform_method.invoke(keywords, "remove_change_mgmt_grp_template_relate_to_validation_result", "Which Change Management Group does the template relate to?"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "remove_change_mgmt_grp_template_relate_to_field", ChgMgmtGrpTemplateRelateTo));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
							
	}
	
	@And("^the Restored Date is set to Future Date \"([^\"]*)\"$")
	public void futureRestoredDateEntered(String RestoredDate) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(the Restored Date is set to Future Date: " + RestoredDate + ")");

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_date_system_tab", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "in_restored_date", RestoredDate));

	}
	
	

	@And("^the Restored Date is greater than the Last Resolved Date \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void restoreDateGreater(String Resolution, String ResolutionCI, String StatusReason,
			String ResolutionOptCat1, String Assignee) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(the Restored Date is greater than the Last Resolved Date)");

		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "assignee_field", Assignee));
		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolution_cat_tier1", ResolutionOptCat1));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolved_resolution_field", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_editor", ""));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "summary_editor", Resolution));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_ok_btn", ""));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolved_status_reason", StatusReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "search_resolution_ci", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "resolution_ci_search", ResolutionCI));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolution_ci_search_btn", ""));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolution_ci_search_select", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));

	}

	@Then("^the Restored Date greater error message is displayed$")
	public void restoredDateGreaterError() throws Throwable {
		APP_LOGS.debug("Running Test Step: @Then(the Restored Date greater error message is displayed)");

		APP_LOGS.debug((String) verifyrestoreddategreaterthanlastresolveddate_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "refresh_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) switchtothisframe_method.invoke(keywords, "", "1"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_popup_no_btn", ""));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));

	}

	@And("^the Restored Date set to past date \"([^\"]*)\"$")
	public void pastRestoredDateEntered(String RestoredDate) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(the Restored Date set to past date: "+RestoredDate+")");

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_date_system_tab", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "in_restored_date", RestoredDate));

	}

	@When("^I click on the Save button in the Incident record$")
	public void saveRestoredDate() throws Throwable {
		APP_LOGS.debug("Running Test Step: @Then(I click on the Save button in the Incident record)");

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
	}

	@And("^the Restored Date is lesser than the Reported Date \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void restoreDateLesser(String Resolution, String ResolutionCI, String StatusReason, String ResolutionOptCat1,
			String Assignee) throws Throwable {
		APP_LOGS.debug("Running Test Step: @And(the Restored Date is lesser than the Reported Date)");

		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "assignee_field", Assignee));
		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolution_cat_tier1", ResolutionOptCat1));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolved_resolution_field", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_editor", ""));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "summary_editor", Resolution));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_ok_btn", ""));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "resolved_status_reason", StatusReason));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "search_resolution_ci", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "resolution_ci_search", ResolutionCI));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "resolution_ci_search_btn", ""));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolution_ci_search_select", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "resolved_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));

	}

	@Then("^the Restored Date lesser error message is displayed$")
	public void restoredDateLesserError() throws Throwable {
		APP_LOGS.debug("Running Test Step: @Then(the Restored Date lesser error message is displayed)");

		// APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
		// "mandate_error_message",
		// "The Restored Date cannot be less than the Reported Date. Please
		// correct the Restored Date before Resolving this Incident"));

		APP_LOGS.debug((String) verifyrestoreddatelesserthanreporteddate_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "refresh_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) switchtothisframe_method.invoke(keywords, "", "1"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "save_popup_no_btn", ""));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));

		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));
	}

	@Then("^the Restored Date lesser error message is displayed during incident creation$")
	public void restoredDateLesserErrorDuringCreation() throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @Then(the Restored Date lesser error message is displayed during incident creation)");

		// APP_LOGS.debug((String) verifylinktext_method.invoke(keywords,
		// "mandate_error_message",
		// "The Restored Date cannot be less than the Reported Date. Please
		// correct the Restored Date before Resolving this Incident"));

		APP_LOGS.debug((String) verifyrestoreddatelesserthanreporteddateduringcreation_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));
	}

	@Given("^A new Incident is created \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void newIncidentCreation(String Username, String Password, String Company, String Customer, String Summary,
			String Impact, String Urgency, String AssignedGroup, String OpCat1, String Service) throws Throwable {
		APP_LOGS.debug("Running Test Step: @Then(A new Incident is created)");

		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "user_name", Username));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "password", Password));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "login_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "10000"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "application_link", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "700"));
		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "incident_management", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "600"));
		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "new_incident", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "700"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "new_incident", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "in_company", Company));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_customer", ""));
		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "in_customer", Customer));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_summary_field", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_summary_editor", ""));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "in_summary_editor", Summary));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_summary_ok_btn", ""));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "impact_dropdown", Impact));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "urgency_dropdown", Urgency));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "assigned_group", AssignedGroup));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));

		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "service_dropdown_field", Service));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_categorization_tab", ""));
		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "create_opcat_tier1", OpCat1));

	}

	@Given("^I am creating a new Change Request in the Draft Status \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void createNewChangeInDraft(String Username, String Password, String InitialStatus) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Given(I am creating a new Change Request in the Draft Status)");

		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "user_name", Username));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "password", Password));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "login_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "10000"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "application_link", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "change_management", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "create_change", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "7000"));

		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_status_field", InitialStatus));
		
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_categorization_tab", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
	}

	@When("^I select a Change Template \"([^\"]*)\",\"([^\"]*)\"$")
	public void selectChangeTemplateDuringCreation(String Summary, String TemplateName) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Given(I select a Change Template " + TemplateName + ")");
		
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_field", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_editor", ""));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "summary_editor", Summary));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_ok_btn", ""));

		APP_LOGS.debug((String) entertext_method.invoke(keywords, "cm_template_field", TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "cm_template_field", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) keyboardaction_method.invoke(keywords, "cm_template_field", "SPACE"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) keyboardaction_method.invoke(keywords, "cm_template_field", "BACKSPACE"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));

		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "cm_group_autocomplete", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "cm_template_select_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

	}

	@Then("^the Change Class and Change Type fields should be made Read Only during creation \"([^\"]*)\",\"([^\"]*)\"$")
	public void changeClassAndTypeReadOnlyDuringCreation(String ChangeClass, String ChangeType) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Given(the Change Class and Change Type fields should be made Read Only during creation)");

		APP_LOGS.debug(
				(String) verifyfieldisreadonly_method.invoke(keywords, "cm_create_change_class_field", "Change Class"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_create_change_class_field", ChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_categorization_tab", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifyfieldisreadonly_method.invoke(keywords, "cm_change_type_field", "Change Type"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_change_type_field", ChangeType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) getfielddetail_method.invoke(keywords, "change_id_field",""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "cm_create_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		
		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));
	}
	

	@And("^the Change Request has been created with a Change Template \"([^\"]*)\",\"([^\"]*)\"$")
	public void verifyChangeTemplateAssociated(String InitialStatus, String TemplateName) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Given(the Change Request has been created with a Change Template: " + TemplateName + ")");

		
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_status_field", InitialStatus));
		
		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "cm_template_field", "Change Template"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_template_field", TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
	}
	

	@Then("^the Change Class and Change Type fields should be made Read Only for an existing Change record \"([^\"]*)\",\"([^\"]*)\"$")
	public void changeClassAndTypeReadOnlyForAnExisitngRecord(String ChangeClass, String ChangeType) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Given(the Change Class and Change Type fields should be made Read Only for an existing Change record)");

		APP_LOGS.debug(
				(String) verifyfieldisreadonly_method.invoke(keywords, "cm_create_change_class_field", "Change Class"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_create_change_class_field", ChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_categorization_tab", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifyfieldisreadonly_method.invoke(keywords, "cm_change_type_field", "Change Type"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_change_type_field", ChangeType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));
	}
	
	@And("^the Change Request has been created with a Change Template along with Class and Type made Read Only \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verifyChangeTemplateAssociatedWithClassTypeReadOnly(String InitialStatus, String TemplateName, String ChangeClass, String ChangeType) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Given(the Change Request has been created with a Change Template along with Class and Type made Read Only" + TemplateName + ")");

		
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_status_field", InitialStatus));
		
		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "cm_template_field", "Change Template"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_template_field", TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug(
				(String) verifyfieldisreadonly_method.invoke(keywords, "cm_create_change_class_field", "Change Class"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_create_change_class_field", ChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));

		
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_categorization_tab", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifyfieldisreadonly_method.invoke(keywords, "cm_change_type_field", "Change Type"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_change_type_field", ChangeType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
	}
	
	@When("^I copy change to create a new change record \"([^\"]*)\",\"([^\"]*)\"$")
	public void copyChangeToCreateNewChangeRecord(String ChangeClass, String ChangeType) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Given(I copy change to create a new change record)");

		
		APP_LOGS.debug((String) copychangeandcreatenewchangerecord_method.invoke(keywords, "", ""));
		
		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "copy_change_class_field", "Copy Change-Class Field"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "copy_change_class_field", ChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "copy_change_type_field", "Copy Change-Type Field"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "copy_change_type_field", ChangeType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "copy_change_start_copy_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		
		APP_LOGS.debug((String) switchtothisframe_method.invoke(keywords, "", "0"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "error_popup_ok_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		APP_LOGS.debug((String) switchtoparentwindow_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "6000"));
		
		//APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));
		
	}
	
	@Then("^the Change Class and Change Type fields should be made Read Only in the new copied change record \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void changeClassAndTypeReadOnlyForNewCopiedRecord(String TemplateName, String ChangeClass, String ChangeType) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Given(the Change Class and Change Type fields should be made Read Only in the new copied change record)");
		
		APP_LOGS.debug((String) verifyfieldisnotempty_method.invoke(keywords, "cm_template_field", "Change Template"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_template_field", TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));

		APP_LOGS.debug(
				(String) verifyfieldisreadonly_method.invoke(keywords, "cm_create_change_class_field", "Change Class"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_create_change_class_field", ChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		
		
		APP_LOGS.debug((String) scrolltoelement_method.invoke(keywords, "cm_categorization_tab", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "cm_categorization_tab", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) verifyfieldisreadonly_method.invoke(keywords, "cm_change_type_field", "Change Type"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_change_type_field", ChangeType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		
		
		APP_LOGS.debug((String) getfielddetail_method.invoke(keywords, "change_id_field",""));
		
		APP_LOGS.debug((String) scrolltoelement_method.invoke(keywords, "cm_create_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "cm_create_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));		
		
		
		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));
	}
	
	@And("^already I have selected a change template \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void selectChangeTemplateAlreadyDuringCreation(String Summary, String TemplateName, String ChangeClass, String ChangeType ) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Given(already I have selected a change template " + TemplateName+", " + ChangeClass+", "+ChangeType+ ")");

		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_field", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_editor", ""));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "summary_editor", Summary));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_ok_btn", ""));

		APP_LOGS.debug((String) entertext_method.invoke(keywords, "cm_template_field", TemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "cm_template_field", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) keyboardaction_method.invoke(keywords, "cm_template_field", "SPACE"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) keyboardaction_method.invoke(keywords, "cm_template_field", "BACKSPACE"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));

		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "cm_group_autocomplete", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "cm_template_select_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug(
				(String) verifyfieldisreadonly_method.invoke(keywords, "cm_create_change_class_field", "Change Class"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_create_change_class_field", ChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_categorization_tab", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifyfieldisreadonly_method.invoke(keywords, "cm_change_type_field", "Change Type"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_change_type_field", ChangeType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));

	}
	
	@When("^I remove the change template \"([^\"]*)\"$")
	public void removeChangeTemplateAlreadyDuringCreation(String TemplateName) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Given(I remove the change template " + TemplateName + ")");

		APP_LOGS.debug((String) clearfield_mehtod.invoke(keywords, "cm_template_field", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_relationships_tab", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		
	}
	
	@Then("^the Change Type and Change Class fields should be made editable \"([^\"]*)\",\"([^\"]*)\"$")
	public void changeClassAndTypeMadeEditable(String ChangeClassFinal, String ProcessFlowNameFinal) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Given(the Change Type and Change Class fields should be made editable)");

		APP_LOGS.debug(
				(String) verifyfieldisnotreadOnly_method.invoke(keywords, "cm_create_change_class_field", "Change Class"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_create_change_class_field", ChangeClassFinal));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_categorization_tab", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug(
				(String) verifyfieldisnotreadOnly_method.invoke(keywords, "cm_change_type_field", "Change Type"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "cm_change_type_field", "Change Type"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug(
				(String) verifyfieldisreadonly_method.invoke(keywords, "cm_process_flow_name_field", "Change Process Flow Name"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_process_flow_name_field", ProcessFlowNameFinal));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		
		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));
		
	}
	
	@Then("^the Change Type and Change Class fields should be made editable after removing the first template \"([^\"]*)\",\"([^\"]*)\"$")
	public void changeClassAndTypeMadeEditableOnRemovingFirstTemplate(String ChangeClassFinal, String ProcessFlowNameFinal) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Given(the Change Type and Change Class fields should be made editable after removing the first template)");

		APP_LOGS.debug(
				(String) verifyfieldisnotreadOnly_method.invoke(keywords, "cm_create_change_class_field", "Change Class"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_create_change_class_field", ChangeClassFinal));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "in_categorization_tab", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		APP_LOGS.debug(
				(String) verifyfieldisnotreadOnly_method.invoke(keywords, "cm_change_type_field", "Change Type"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifyfieldisempty_method.invoke(keywords, "cm_change_type_field", "Change Type"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
		APP_LOGS.debug(
				(String) verifyfieldisreadonly_method.invoke(keywords, "cm_process_flow_name_field", "Change Process Flow Name"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_process_flow_name_field", ProcessFlowNameFinal));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		
				
	}
	
	@And("^I select a new template \"([^\"]*)\"$")
	public void selectNewChangeTemplateDuringCreation(String NewTemplateName ) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Given(I select a new template " + NewTemplateName + ")");

		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		
		
		APP_LOGS.debug((String) entertext_method.invoke(keywords, "cm_template_field", NewTemplateName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "cm_template_field", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) keyboardaction_method.invoke(keywords, "cm_template_field", "SPACE"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) keyboardaction_method.invoke(keywords, "cm_template_field", "BACKSPACE"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));

		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "cm_group_autocomplete", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "2000"));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "cm_template_select_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) switchtodefaultwindow_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		
		
	}
	
	
	@Then("^the Change Type and Change Class fields gets reset based on the new template \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void changeClassAndTypeResetBasedonNewTemplate(String NewTemplateName, String NewChangeClass, String NewChangeType, String NewProcessFlowName) throws Throwable {

		APP_LOGS.debug("Running Test Step: @Given(the Change Type and Change Class fields gets reset based on the new template "+NewTemplateName+", "+NewChangeClass+", "+NewChangeType+ ")");

		APP_LOGS.debug(
				(String) verifyfieldisreadonly_method.invoke(keywords, "cm_create_change_class_field", "Change Class"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_create_change_class_field", NewChangeClass));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		
		
		APP_LOGS.debug((String) scrolltoelement_method.invoke(keywords, "cm_categorization_tab", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "cm_categorization_tab", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) verifyfieldisreadonly_method.invoke(keywords, "cm_change_type_field", "Change Type"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_change_type_field", NewChangeType));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		
		APP_LOGS.debug(
				(String) verifyfieldisreadonly_method.invoke(keywords, "cm_process_flow_name_field", "Change Process Flow Name"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) verifyinputtext_method.invoke(keywords, "cm_process_flow_name_field", NewProcessFlowName));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		
		
		APP_LOGS.debug((String) getfielddetail_method.invoke(keywords, "change_id_field",""));
		
		APP_LOGS.debug((String) scrolltoelement_method.invoke(keywords, "cm_create_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "cm_create_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));		
		
		
		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));
	}
}
