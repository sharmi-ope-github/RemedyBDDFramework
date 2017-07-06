package StepDefinitions;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Sprint9_StepDefinitions extends StepDefinitions.Keywords {
	public WebDriver driver;
	public Method method[];
	public StepDefinitions.Keywords keywords;
	public static String ChangeId;
	//public static Method openbrowser_method;
	//public static Method load_cofigPropertyFiles_method;
	//public static Method navigate_method;
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
	public static Method entertext_method;
	public static Method printmenu_method;

	public String keywordExecutionResult;

	public Sprint9_StepDefinitions() throws NoSuchMethodException, SecurityException {
		// when the object of StepDefinitions is created in the below/next Main
		// function, the object of KeyWords is automatically created here by
		// this constructor
		 
		keywords = new Keywords();
		method = keywords.getClass().getMethods();// this will return an array
		driver = Hooks.driver;								// off all the methods in
													// this class (test t)
	//	load_cofigPropertyFiles_method = keywords.getClass().getMethod("loadConfigPropertyFiles", String.class,
	//			String.class);
	//	openbrowser_method = keywords.getClass().getMethod("openBrowser", String.class, String.class);
	//	navigate_method = keywords.getClass().getMethod("navigate", String.class, String.class);
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
		entertext_method = keywords.getClass().getMethod("enterText", String.class, String.class);
		printmenu_method = keywords.getClass().getMethod("printMenu", String.class, String.class);
	}

	@Given("^I am raising a new change request \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void createNewChange(String Username, String Password, String CoordinatorGroup, String ManagerGroup, String Impact, String RiskLevel,String Service,String Summary, String Class, String ChangeType, String ChangeReason,String ProdCat1, String ProdCat2, String ProdCat3,String ScheduledStartDate, String ScheduledEndDate) throws Throwable {

	
		APP_LOGS.debug("Running Test Step: @Given(I am raising a new change request)");
	
	
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "user_name", Username));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "password", Password));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "login_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "10000"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "application_link", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "change_management", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "create_change", ""));
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
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "cm_create_impact", Impact));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "cm_risk_level_dropdown",
				RiskLevel));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "service_dropdown", Service));
		//APP_LOGS.debug((String) printmenu_method.invoke(keywords, "service_dropdown", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_field", ""));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_editor", ""));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "summary_editor",
				Summary));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "summary_ok_btn", ""));
		
		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "cm_create_change_class", Class));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) switchtoparentwindow_method.invoke(keywords, "", ""));
		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "cm_change_type", ChangeType));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "cm_change_type_ok_btn", ""));
		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "cm_change_reason", ChangeReason));
		
		APP_LOGS.debug((String) entertext_method.invoke(keywords, "cm_manager_group_field", ManagerGroup));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "cm_manager_group_field", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) keyboardaction_method.invoke(keywords, "cm_manager_group_field", "SPACE"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) keyboardaction_method.invoke(keywords, "cm_manager_group_field", "BACKSPACE"));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "1000"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "cm_group_autocomplete", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "cm_categorization_tab", ""));
		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "cm_prodcat_tier1", ProdCat1));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "cm_prodcat_tier2", ProdCat2));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "cm_prodcat_tier3", ProdCat3));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "cm_scheduling_tab", ""));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "cm_scheduled_start_date", ScheduledStartDate));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "cm_scheduled_end_date", ScheduledEndDate));
		
		APP_LOGS.debug((String) saveattributetoxls_method.invoke(keywords, "change_id_field", "ChangeID"));
		
	}

	@When("^I select answer to Risk question as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void answerRiskQuestion(String Question1, String Question2, String Question3, String Save_Button)
			throws Throwable {
		APP_LOGS.debug("Running Test Step: @When(I select answer to Risk Risk question as |Question1: " + Question1
				+ "|Question2: " + Question2 + "|Question3: " + Question3 + "|");

			
		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "cm_risk_question1", Question1));
		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "cm_risk_question2", Question2));
		APP_LOGS.debug((String) selectmenuoption_method.invoke(keywords, "cm_risk_question3", Question3));
		APP_LOGS.debug((String) switchtonewwindow_method.invoke(keywords, "cm_risk_question_save_btn", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));

		APP_LOGS.debug((String) clickelement_method.invoke(keywords, Save_Button, ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "10000"));

	}

	@Then("^Risk Level gets set as \"([^\"]*)\"$")
	public void verifyRiskLevel(String expected_risk_value) throws Throwable {
		APP_LOGS.debug("Running Test Step: @Then(Risk Level gets set as expected risk value: )" + expected_risk_value);

		APP_LOGS.debug((String) verifylinktext_mehtod.invoke(keywords, "cm_risk_level", expected_risk_value));
		// Risk Level 1 - Minimal Risk, Risk Level 2 - Low Risk, Risk Level 3 -
		// Medium Risk, Risk Level 4 - High Risk, Risk Level 5 - Major Risk
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) logout_method.invoke(keywords, "logout_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "3000"));
		APP_LOGS.debug((String) closenewwindow_method.invoke(keywords, "", ""));

	}

	@Given("^I am searching an existing change record \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void searchAnExistingChange(String Username, String Password, String ChangeID) throws Throwable {

	
		APP_LOGS.debug(
				"Running Test Step: @Given(I am searching an existing change record)");
	
	
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "user_name", Username));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "password", Password));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "login_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "10000"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "application_link", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "change_management", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) mousehover_method.invoke(keywords, "search_change", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "500"));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "search_change", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "5000"));
		APP_LOGS.debug((String) sendkeys_method.invoke(keywords, "change_id_field", ChangeID));
		APP_LOGS.debug((String) clickelement_method.invoke(keywords, "search_button", ""));
		APP_LOGS.debug((String) pauseexecution_method.invoke(keywords, "", "7000"));
	}

}
