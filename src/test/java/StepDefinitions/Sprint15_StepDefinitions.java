package StepDefinitions;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;

public class Sprint15_StepDefinitions extends StepDefinitions.Keywords {
	
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

 	public Sprint15_StepDefinitions() throws NoSuchMethodException, SecurityException {
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
	}
 	
 	@Given("^that an existing SMIP incident record exists \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void searchAnExistingSMIPIncident(String Username, String Password, String IncidentID, String AssignedGroup)
			throws Throwable {
		APP_LOGS.debug(
				"Running Test Step: @Given(that an existing SMIP incident record exists " + IncidentID + ")");

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

	}

}
