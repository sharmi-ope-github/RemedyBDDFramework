/*######################################################################################################
'Project Name		: Test framework for Telefonica UK
'File Name			: Keywords.java
'Author		       	: Nandeesh Mydur
'Version	    	: v0.02
'Date of Creation	: 04-Apr-2014
'#######################################################################################################
 */

package StepDefinitions;

import static org.hamcrest.Matchers.isEmptyString;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.hamcrest.core.IsNot;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Keywords{
	public static Logger APP_LOGS;
	public static Properties CONFIG;
	public static Properties OR;

	public static WebDriver driver;
	private AssertionError exception;
	public static Properties RUNTIME;

	
	
	public void loadConfigPropertyFiles(String object, String data) throws IOException {
		// APP_LOGS.debug("Opening loadConfigPropertyFiles");

		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//PropertyFiles//config.properties");
		//C://Users//snarasi1//workspace//RemedyBDDFramework//src//test//java//PropertyFiles//config.properties
		        
		CONFIG = new Properties(); // initialize CONFIG object
		CONFIG.load(fs);// load config properties

		fs = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//PropertyFiles//or.properties");
		OR = new Properties(); // initialize OR object
		OR.load(fs);// load or properties

		/*fs = new FileInputStream(
				"C://Users//sharmendiran//workspace//Remedy_BDD_POC//src//remedy//config//runtime.properties");
		RUNTIME = new Properties(); // initialize RUNTIME object
		RUNTIME.load(fs);// load runtime properties
		*/
		// initialize the application logs
		APP_LOGS = Logger.getLogger("devpinoyLogger");

	}
	
	//object = or.properties(ex: xpath|<xpath>), data = from xls Test Steps Data column or Test Data tab
	@SuppressWarnings("deprecation")
	public String openBrowser(String object, String data) throws InterruptedException{
		//reads the URL from config.properties. pass data as "testSiteURL" from xls
		APP_LOGS.debug("Opening browser");		
		if(CONFIG.getProperty(data).trim().equalsIgnoreCase("Mozilla")){
			System.setProperty("webdriver.gecko.driver", CONFIG.getProperty("firefox_driver_exe"));
			 DesiredCapabilities capabilities=DesiredCapabilities.firefox();
			    capabilities.setCapability("marionette", true);
			     driver = new MarionetteDriver(capabilities);
			     
			 
			/*ProfilesIni prof = new ProfilesIni();
			FirefoxProfile p = prof.getProfile("default");  
			driver = new FirefoxDriver(p);*/
			//if the firefox is not able to find the binary/firefox.exe file
			/*FirefoxBinary binary = new FirefoxBinary(new File(CONFIG.getProperty("firefox_driver_exe")));
			driver = new FirefoxDriver(binary, p);*/
		}else if(CONFIG.getProperty(data).trim().equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", CONFIG.getProperty("ie_driver_exe"));
			driver = new InternetExplorerDriver();
		}else if(CONFIG.getProperty(data).trim().equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", CONFIG.getProperty("chrome_driver_exe"));
			//driver = new RemoteWebDriver("http://localhost:9515", DesiredCapabilities.chrome());
			driver = new ChromeDriver();
		}else{
			APP_LOGS.debug("Invalid browserType:"+data+" in config.properties");
			return Constants.KEYWORD_FAIL;
		}
		
		long implicitWaitTime = Long.valueOf(CONFIG.getProperty("implicitwait"));
		driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000L);
		driver.navigate().refresh();
		Thread.sleep(3000L);
		return Constants.KEYWORD_PASS;
	}
	
	
	
	public String navigate(String object, String data){
		APP_LOGS.debug("Opening navigate");
		try{
			driver.navigate().to(CONFIG.getProperty(data));
			return Constants.KEYWORD_PASS;
		}catch(Exception e){
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}
	
	public String pageSync(String object, String data){
		//use this function only of you are sure the page will load successfully
		try{
			APP_LOGS.debug("Opening synchronize");
			((JavascriptExecutor) driver).executeScript(
					"function pageloadingtime()"+
					"{"+
					"return 'Page has loaded completely'"+
					"}"+
					"return (window.onload=pageloadingtime());");
			return Constants.KEYWORD_PASS;
		}
		catch(Exception e){
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}
	
	public String sendKeys(String object, String data){
		APP_LOGS.debug("Opening sendKeys: with Object Reference: "+object+ " and Data: "+ data);
		try{
			By byObject=getSelectorType(object);
			if(byObject==null){
				return Constants.KEYWORD_FAIL+" - "+"Invalid reference:"+object;
			}else{
				driver.findElement(byObject).clear();
				driver.findElement(byObject).sendKeys(data);
				return Constants.KEYWORD_PASS;
			}
		}
		catch (Exception e){
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}
	
	public String clearField(String object, String data) {
		APP_LOGS.debug("Opening clearField: with Object Reference: " + object + " and Data: " + data);
		try {
			By byObject = getSelectorType(object);
			if (byObject == null) {
				return Constants.KEYWORD_FAIL + " - " + "Invalid reference:" + object;
			} else {
				boolean fieldClear;
				WebElement field_data = driver.findElement(byObject);
				fieldClear = false;

				while ((fieldClear != true)) {
					driver.findElement(byObject).click();
					keyboardAction(object, "BACKSPACE");

					if (field_data.getAttribute("value").equals("")) {

						fieldClear = true;
						break;
					}

				}

				return Constants.KEYWORD_PASS;
			}
		} catch (Exception e) {
			return Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}
	
	public String keyboardAction(String object, String data){
		APP_LOGS.debug("Opening keyboardAction");
		try{
			By byObject=getSelectorType(object);
			if(byObject==null){
				return Constants.KEYWORD_FAIL+" - "+"Invalid reference:"+object;
			}else{
				if(data.equals("ENTER"))
				{
				driver.findElement(byObject).sendKeys(Keys.RETURN);
				}
				else if(data.equals("ESCAPE"))
				{
				driver.findElement(byObject).sendKeys(Keys.ESCAPE);
				}
				else if(data.equals("DOWNARROW"))
				{
				driver.findElement(byObject).sendKeys(Keys.DOWN);
				
				}
				else if(data.equals("BACKSPACE"))
				{
				driver.findElement(byObject).sendKeys(Keys.BACK_SPACE);
				}
				else if(data.equals("SPACE"))
				{
				driver.findElement(byObject).sendKeys(Keys.SPACE);
				}
				return Constants.KEYWORD_PASS;
			}
		}
		catch (Exception e){
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}

	public String clickElement(String object, String data){
		APP_LOGS.debug("Opening clickElement: "+object);
		try{
			By byObject=getSelectorType(object);
			if(byObject==null){
				return Constants.KEYWORD_FAIL+" - "+"Invalid reference:"+object;
			}else{
				driver.findElement(byObject).click();
				return Constants.KEYWORD_PASS;
			}
		}
		catch (Exception e){
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}
	
	public String selectRadioButton(String object, String data){
	 	APP_LOGS.debug("Opening selectRadioButton");
	 	try{
			By byObject=getSelectorType(object);
			if(byObject==null){
				return Constants.KEYWORD_FAIL+" - "+"Invalid reference:"+object;
			}else{
				driver.findElement(byObject).click();
				return Constants.KEYWORD_PASS;
			}
	 	}
	 	catch(Exception e){
	 		return Constants.KEYWORD_FAIL+" - "+e.getMessage();
	 	}
	 }

	public String scrollToElement(String object, String data){
		APP_LOGS.debug("Opening scrollToElement");
		try
		{
			By byObject=getSelectorType(object);
			if(byObject==null){
				return Constants.KEYWORD_FAIL+" - "+"Invalid reference:"+object;
			}else{
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byObject));
				
				return Constants.KEYWORD_PASS;
			}
		}
		catch(Exception e)
		{
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}
	
	public String enterText(String object, String data){
		APP_LOGS.debug("Opening enterText");
		try
		{
			By byObject=getSelectorType(object);
			if(byObject==null){
				return Constants.KEYWORD_FAIL+" - "+"Invalid reference:"+object;
			}else{
				((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", driver.findElement(byObject), data);
				
				return Constants.KEYWORD_PASS;
			}
		}
		catch(Exception e)
		{
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}
	
	
	public String pauseExecution(String object, String data) throws InterruptedException{
		APP_LOGS.debug("Opening pauseExecution");
		try{
			//converts the String to double and then converts it to long as the value from xls is sometimes read as 2000.0
			long time = (long)Double.parseDouble(data);
			Thread.sleep(time);
			return Constants.KEYWORD_PASS;
		
		}catch(Exception e){
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}
	
	public String saveAttributeToXls(String object, String data) {
		// object is xpath,id,etc ref from object repository
		// data should be the xls test data tab column name where this value has
		// to be stored
		APP_LOGS.debug("Opening saveAttributeToPropertyFile");
		try {
			String OrderNo;
			By byObject = getSelectorType(object);
			if (byObject == null) {
				return Constants.KEYWORD_FAIL + " - " + "Invalid reference:" + object;
			} else {
				OrderNo = driver.findElement(byObject).getText();
				if (OrderNo.equals("")) {
					OrderNo = driver.findElement(byObject).getAttribute("value");
				}
				APP_LOGS.debug("Data read from the field is: " + data + ": " + OrderNo);
				setRuntimeProperty(data, OrderNo);
				return Constants.KEYWORD_PASS;
			}
		} catch (Exception e) {
			APP_LOGS.debug(e.getStackTrace());
			return Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}
	
	public String getWeightageValue(String object, String data){
		//object is xpath,id,etc ref from object repository
		//data should be the xls test data tab column name where this value has to be stored 
		APP_LOGS.debug("Opening getOrderNo");
		try{
			String OrderNo;
			//By byObject=getSelectorType(object);
			//if(byObject==null){
			//	return Constants.KEYWORD_FAIL+" - "+"Invalid reference:"+object;
			//}
			//else{
				//OrderNo = driver.findElement(byObject).getText();
				//OrderNo = driver.findElement(byObject).getAttribute("value");
				
				OrderNo=driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div/div[3]/fieldset/div/div/div/div/div[3]/fieldset/div/div/div/div[4]/div[4]/div/div/div[2]/fieldset/div/div/div/div/div[3]/fieldset/div/div/fieldset[5]/div[4]/div/input")).getAttribute("value");
				APP_LOGS.debug("The TicketId is: "+OrderNo);
				setRuntimeProperty(data,OrderNo);
				return Constants.KEYWORD_PASS;
			//}
		}
		catch (Exception e){
			APP_LOGS.debug(e.getStackTrace());
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}
	
	
	
	public String switchToDefaultWindow(String object, String data){
		APP_LOGS.debug("Opening switchToDefault");
		try{
			driver.switchTo().defaultContent();
			return Constants.KEYWORD_PASS;
		}
		catch(Exception e){
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}
	
	public String mouseHover(String object, String data){
		APP_LOGS.debug("Opening mouseHover: with Object Reference : "+ object);
		try{
			By byObject=getSelectorType(object);
			if(byObject==null){
				return Constants.KEYWORD_FAIL+" - "+"Invalid reference:"+object;
			}else{
				Mouse mouse = ((HasInputDevices) driver).getMouse();
				Locatable hoverItem = (Locatable) driver.findElement(byObject);
				mouse.mouseMove(hoverItem.getCoordinates());
				return Constants.KEYWORD_PASS;
			}
		}
		catch(Exception e){
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}
	
	public String verifyInputText(String object, String data){
		APP_LOGS.debug("Opening verifyTextinInput");
		try{
			By byObject=getSelectorType(object);
			if(byObject==null){
				return Constants.KEYWORD_FAIL+" - "+"Invalid reference:"+object;
			}else{
				String actualVal=driver.findElement(byObject).getAttribute("value").trim();
				if(actualVal.equals(data.trim())){
					APP_LOGS.debug("Expected Content: "+data+" matches with the Actual Content: "+actualVal);
					return Constants.KEYWORD_PASS;
				}else{
					return Constants.KEYWORD_FAIL+" -- "+actualVal+" does not match the expected:"+data;
				}
			}
		}catch(Exception e){
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}
	


	public String verifySlmWeight(String object, String data){
		APP_LOGS.debug("Opening verifySlmWeight");
		try{
			
				String priority=driver.findElement(By.xpath("//*[@id='arid_WIN_3_1000000164']")).getAttribute("value").trim();
				String impact=driver.findElement(By.xpath("//*[@id='arid_WIN_3_1000000163']")).getAttribute("value").trim();
				clickElement(object,data);
				Thread.sleep(3000L);
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				
				String actualSlmWeight=driver.findElement(By.xpath("//*[@id='arid_WIN_3_700006250']")).getAttribute("value").trim();
				String actualAuxSlmWeight=driver.findElement(By.xpath("//*[@id='arid_WIN_3_700006251']")).getAttribute("value").trim();
				String slmStatus=driver.findElement(By.xpath("//*[@id='arid_WIN_3_1000003009']")).getAttribute("value").trim();
				

	if(priority.equals("Critical") && impact.equals("1-Extensive/Widespread")) {
					
					
					if (slmStatus.equals("Within the Service Target")){
						if(actualSlmWeight.equals("10") && actualAuxSlmWeight.equals("W90") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"10"+" and "+"W90";
						}
					}
					else if (slmStatus.equals("Service Target Warning")){
						if(actualSlmWeight.equals("10") && actualAuxSlmWeight.equals("W90") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"10"+" and "+"W90";
						}
					}
					else if (slmStatus.equals("Service Targets Breached")){
						if(actualSlmWeight.equals("10") && actualAuxSlmWeight.equals("W90") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"10"+" and "+"W90";
						}
					}
					else if (slmStatus.equals("All Service Targets Breached")){
						if(actualSlmWeight.equals("10") && actualAuxSlmWeight.equals("W90") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"10"+" and "+"W90";
						}
					}
					else if (slmStatus.equals("")){
						if(actualSlmWeight.equals("10") && actualAuxSlmWeight.equals("W90") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"10"+" and "+"W90";
						}
					}else{
						return Constants.KEYWORD_FAIL+" -- "+"SLM Status: "+slmStatus+" is not as expected";
					}
					
				}
	else if(priority.equals("Critical") && impact.equals("2-Significant/Large")) {
					
					
					if (slmStatus.equals("Within the Service Target")){
						if(actualSlmWeight.equals("11") && actualAuxSlmWeight.equals("W89") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"11"+" and "+"W89";
						}
					}
					else if (slmStatus.equals("Service Target Warning")){
						if(actualSlmWeight.equals("11") && actualAuxSlmWeight.equals("W89") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"11"+" and "+"W89";
						}
					}
					else if (slmStatus.equals("Service Targets Breached")){
						if(actualSlmWeight.equals("11") && actualAuxSlmWeight.equals("W89") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"11"+" and "+"W89";
						}
					}
					else if (slmStatus.equals("All Service Targets Breached")){
						if(actualSlmWeight.equals("11") && actualAuxSlmWeight.equals("W89") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"11"+" and "+"W89";
						}
					}
					else if (slmStatus.equals("")){
						if(actualSlmWeight.equals("11") && actualAuxSlmWeight.equals("W89") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"11"+" and "+"W89";
						}
					}else{
						return Constants.KEYWORD_FAIL+" -- "+"SLM Status: "+slmStatus+" is not as expected";
					}
					
				}
	else if(priority.equals("High") && impact.equals("1-Extensive/Widespread")) {
					
					
					if (slmStatus.equals("Within the Service Target")){
						if(actualSlmWeight.equals("20") && actualAuxSlmWeight.equals("W80") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"20"+" and "+"W80";
						}
					}
					else if (slmStatus.equals("Service Target Warning")){
						if(actualSlmWeight.equals("20") && actualAuxSlmWeight.equals("W80") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"20"+" and "+"W80";
						}
					}
					else if (slmStatus.equals("Service Targets Breached")){
						if(actualSlmWeight.equals("20") && actualAuxSlmWeight.equals("W80") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"20"+" and "+"W80";
						}
					}
					else if (slmStatus.equals("All Service Targets Breached")){
						if(actualSlmWeight.equals("20") && actualAuxSlmWeight.equals("W80") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"20"+" and "+"W80";
						}
					}
					else if (slmStatus.equals("")){
						if(actualSlmWeight.equals("20") && actualAuxSlmWeight.equals("W80") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"20"+" and "+"W80";
						}
					}					
					else{
						return Constants.KEYWORD_FAIL+" -- "+"SLM Status: "+slmStatus+" is not as expected";
					}
					
				}
	else if(priority.equals("High") && impact.equals("2-Significant/Large")) {
					
					
					if (slmStatus.equals("Within the Service Target")){
						if(actualSlmWeight.equals("21") && actualAuxSlmWeight.equals("W79") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"21"+" and "+"W79";
						}
					}
					else if (slmStatus.equals("Service Target Warning")){
						if(actualSlmWeight.equals("21") && actualAuxSlmWeight.equals("W79") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"21"+" and "+"W79";
						}
					}
					else if (slmStatus.equals("Service Targets Breached")){
						if(actualSlmWeight.equals("21") && actualAuxSlmWeight.equals("W79") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"21"+" and "+"W79";
						}
					}
					else if (slmStatus.equals("All Service Targets Breached")){
						if(actualSlmWeight.equals("21") && actualAuxSlmWeight.equals("W79") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"21"+" and "+"W79";
						}
					}
					else if (slmStatus.equals("")){
						if(actualSlmWeight.equals("21") && actualAuxSlmWeight.equals("W79") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"21"+" and "+"W79";
						}
					}else{
						return Constants.KEYWORD_FAIL+" -- "+"SLM Status: "+slmStatus+" is not as expected";
					}
					
				}
	else if(priority.equals("High") && impact.equals("3-Moderate/Limited")) {
					
					
					if (slmStatus.equals("Within the Service Target")){
						if(actualSlmWeight.equals("22") && actualAuxSlmWeight.equals("W78") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"22"+" and "+"W78";
						}
					}
					else if (slmStatus.equals("Service Target Warning")){
						if(actualSlmWeight.equals("22") && actualAuxSlmWeight.equals("W78") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"22"+" and "+"W78";
						}
					}
					else if (slmStatus.equals("Service Targets Breached")){
						if(actualSlmWeight.equals("22") && actualAuxSlmWeight.equals("W78") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"22"+" and "+"W78";
						}
					}
					else if (slmStatus.equals("All Service Targets Breached")){
						if(actualSlmWeight.equals("22") && actualAuxSlmWeight.equals("W78") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"22"+" and "+"W78";
						}
					}
					else if (slmStatus.equals("")){
						if(actualSlmWeight.equals("22") && actualAuxSlmWeight.equals("W78") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"22"+" and "+"W78";
						}
					}else{
						return Constants.KEYWORD_FAIL+" -- "+"SLM Status: "+slmStatus+" is not as expected";
					}
					
				}
	else if(priority.equals("Medium") && impact.equals("1-Extensive/Widespread")) {
					
					
					if (slmStatus.equals("Within the Service Target")){
						if(actualSlmWeight.equals("30") && actualAuxSlmWeight.equals("W70") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"30"+" and "+"W70";
						}
					}
					else if (slmStatus.equals("Service Target Warning")){
						if(actualSlmWeight.equals("30") && actualAuxSlmWeight.equals("W70") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"30"+" and "+"W70";
						}
					}
					else if (slmStatus.equals("Service Targets Breached")){
						if(actualSlmWeight.equals("50") && actualAuxSlmWeight.equals("W50") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"50"+" and "+"W50";
						}
					}
					else if (slmStatus.equals("All Service Targets Breached")){
						if(actualSlmWeight.equals("50") && actualAuxSlmWeight.equals("W50") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"50"+" and "+"W50";
						}
					}
					else if (slmStatus.equals("")){
						if(actualSlmWeight.equals("50") && actualAuxSlmWeight.equals("W50") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"50"+" and "+"W50";
						}
					}
					else{
							return Constants.KEYWORD_FAIL+" -- "+"SLM Status: "+slmStatus+" is not as expected";
						}
					}
	else if(priority.equals("Medium") && impact.equals("2-Significant/Large")) {
						
						
						if (slmStatus.equals("Within the Service Target")){
							if(actualSlmWeight.equals("31") && actualAuxSlmWeight.equals("W69") ){
								setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
								return Constants.KEYWORD_PASS;
							}else{
								return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"31"+" and "+"W69";
							}
						}
						else if (slmStatus.equals("Service Target Warning")){
							if(actualSlmWeight.equals("31") && actualAuxSlmWeight.equals("W69") ){
								setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
								return Constants.KEYWORD_PASS;
							}else{
								return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"31"+" and "+"W69";
							}
						}
						else if (slmStatus.equals("Service Targets Breached")){
							if(actualSlmWeight.equals("51") && actualAuxSlmWeight.equals("W49") ){
								setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
								return Constants.KEYWORD_PASS;
							}else{
								return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"51"+" and "+"W49";
							}
						}
						else if (slmStatus.equals("All Service Targets Breached")){
							if(actualSlmWeight.equals("51") && actualAuxSlmWeight.equals("W49") ){
								setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
								return Constants.KEYWORD_PASS;
							}else{
								return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"51"+" and "+"W49";
							}
						}
						else if (slmStatus.equals("")){
							if(actualSlmWeight.equals("51") && actualAuxSlmWeight.equals("W49") ){
								setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
								return Constants.KEYWORD_PASS;
							}else{
								return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"51"+" and "+"W49";
							}
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"SLM Status: "+slmStatus+" is not as expected";
						}
						
					}				
	else if(priority.equals("Medium") && impact.equals("3-Moderate/Limited")) {
					
					
					if (slmStatus.equals("Within the Service Target")){
						if(actualSlmWeight.equals("32") && actualAuxSlmWeight.equals("W68") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"32"+" and "+"W68";
						}
					}
					else if (slmStatus.equals("Service Target Warning")){
						if(actualSlmWeight.equals("32") && actualAuxSlmWeight.equals("W68") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"32"+" and "+"W68";
						}
					}
					else if (slmStatus.equals("Service Targets Breached")){
						if(actualSlmWeight.equals("52") && actualAuxSlmWeight.equals("W48") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"52"+" and "+"W48";
						}
					}
					else if (slmStatus.equals("All Service Targets Breached")){
						if(actualSlmWeight.equals("52") && actualAuxSlmWeight.equals("W48") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"52"+" and "+"W48";
						}
					}
					else if (slmStatus.equals("")){
						if(actualSlmWeight.equals("52") && actualAuxSlmWeight.equals("W48") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"52"+" and "+"W48";
						}
					}else{
						return Constants.KEYWORD_FAIL+" -- "+"SLM Status: "+slmStatus+" is not as expected";
					}
					
				}
	else if(priority.equals("Medium") && impact.equals("4-Minor/Localized")) {
					
					
					if (slmStatus.equals("Within the Service Target")){
						if(actualSlmWeight.equals("33") && actualAuxSlmWeight.equals("W67") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"33"+" and "+"W67";
						}
					}
					else if (slmStatus.equals("Service Target Warning")){
						if(actualSlmWeight.equals("33") && actualAuxSlmWeight.equals("W67") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"33"+" and "+"W67";
						}
					}
					else if (slmStatus.equals("Service Targets Breached")){
						if(actualSlmWeight.equals("53") && actualAuxSlmWeight.equals("W47") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"53"+" and "+"W47";
						}
					}
					else if (slmStatus.equals("All Service Targets Breached")){
						if(actualSlmWeight.equals("53") && actualAuxSlmWeight.equals("W47") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"53"+" and "+"W47";
						}
					}
					else if (slmStatus.equals("")){
						if(actualSlmWeight.equals("53") && actualAuxSlmWeight.equals("W47") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"53"+" and "+"W47";
						}
					}else{
						return Constants.KEYWORD_FAIL+" -- "+"SLM Status: "+slmStatus+" is not as expected";
					}
					
				}
	else if(priority.equals("Low") && impact.equals("3-Moderate/Limited")) {
					
					
					if (slmStatus.equals("Within the Service Target")){
						if(actualSlmWeight.equals("40") && actualAuxSlmWeight.equals("W60") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"40"+" and "+"W60";
						}
					}
					else if (slmStatus.equals("Service Target Warning")){
						if(actualSlmWeight.equals("40") && actualAuxSlmWeight.equals("W60") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"40"+" and "+"W60";
						}
					}
					else if (slmStatus.equals("Service Targets Breached")){
						if(actualSlmWeight.equals("60") && actualAuxSlmWeight.equals("W40") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"60"+" and "+"W40";
						}
					}
					else if (slmStatus.equals("All Service Targets Breached")){
						if(actualSlmWeight.equals("60") && actualAuxSlmWeight.equals("W40") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"60"+" and "+"W40";
						}
					}
					else if (slmStatus.equals("")){
						if(actualSlmWeight.equals("60") && actualAuxSlmWeight.equals("W40") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"60"+" and "+"W40";
						}
					}else{
						return Constants.KEYWORD_FAIL+" -- "+"SLM Status: "+slmStatus+" is not as expected";
					}
					
				}
	else if(priority.equals("Low") && impact.equals("4-Minor/Localized")) {
					
					
					if (slmStatus.equals("Within the Service Target")){
						if(actualSlmWeight.equals("41") && actualAuxSlmWeight.equals("W59") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"41"+" and "+"W59";
						}
					}
					else if (slmStatus.equals("Service Target Warning")){
						if(actualSlmWeight.equals("41") && actualAuxSlmWeight.equals("W59") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"41"+" and "+"W59";
						}
					}
					else if (slmStatus.equals("Service Targets Breached")){
						if(actualSlmWeight.equals("61") && actualAuxSlmWeight.equals("W39") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"61"+" and "+"W39";
						}
					}
					else if (slmStatus.equals("All Service Targets Breached")){
						if(actualSlmWeight.equals("61") && actualAuxSlmWeight.equals("W39") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"61"+" and "+"W39";
						}
					}
					else if (slmStatus.equals("")){
						if(actualSlmWeight.equals("61") && actualAuxSlmWeight.equals("W39") ){
							setRuntimeProperty("Actual Priority + Actual Impact + Actual SLM Weight + Actual Auxiliary Weight + Actual SLM Status", priority+" | "+impact+" | "+actualSlmWeight+" | "+actualAuxSlmWeight+" | "+slmStatus);
							return Constants.KEYWORD_PASS;
						}else{
							return Constants.KEYWORD_FAIL+" -- "+"Actual SLM Weight: "+actualSlmWeight+" and "+"Actual Auxiliary SLM Weight: "+actualAuxSlmWeight+" not equals to expected:"+"61"+" and "+"W39";
						}
					}else{
						return Constants.KEYWORD_FAIL+" -- "+"SLM Status: "+slmStatus+" is not as expected";
					}
					
				}
				else{
					return Constants.KEYWORD_FAIL+" -- "+"Priority: "+priority+" and "+"Impact: "+impact+" not as expected";
				}				
			
		}catch(Exception e){
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}




	public String verifyLinkText(String object, String data) {
		APP_LOGS.debug("Opening verifyLinkText");
		SoftAssert s_assert = new SoftAssert();
		String actualVal = "";

		try {
			By byObject = getSelectorType(object);
			if (byObject == null) {
				return Constants.KEYWORD_FAIL + " - " + "Invalid reference:" + object;
			} else {

				actualVal = driver.findElement(byObject).getText().trim();
				if (actualVal.equals("")) {

					actualVal = driver.findElement(byObject).getAttribute("value").trim();
				}
				s_assert.assertEquals(actualVal, data.trim());
				s_assert.assertAll();
				APP_LOGS.debug("The actual value: " + actualVal + " matches with the expected value: " + data);

				// Assert.assertTrue(actualVal.contains(data));

				// System.out.println("The actual value: " + actualVal + "
				// matches with the expected value: " + data);
				return Constants.KEYWORD_PASS;

			}

		} catch (AssertionError e) {
			APP_LOGS.debug("The actual value: " + actualVal + " does not match with the expected value: " + data);
			return Constants.KEYWORD_FAIL + " - " + e.getMessage();

		}

	}
	
	public String verifyWorkOrderNotesDetails(String object, String data) {
		APP_LOGS.debug("Opening verifyWorkOrderNotesDetails");
		
		String actualVal = "";

		try {
			By byObject = getSelectorType(object);
			if (byObject == null) {
				return Constants.KEYWORD_FAIL + " - " + "Invalid reference:" + object;
			} else {

				actualVal = driver.findElement(byObject).getText().trim();
				if (actualVal.equals("")) {
					actualVal = driver.findElement(byObject).getAttribute("value").trim();
					Assert.assertTrue("Assertion Failed: " + data + " is not present in the WorkOrder Notes Field",
							actualVal.contains(data));
					APP_LOGS.debug("The " + data + " is present in the WorkOrder Notes field");
				} else {
					Assert.assertTrue("Assertion Failed: " + data + " is not present in the WorkOrder Notes Field",
							actualVal.contains(data));
					APP_LOGS.debug("The " + data + " is present in the WorkOrder Notes field");
				}

				return Constants.KEYWORD_PASS;

			}

		} catch (AssertionError e) {
			APP_LOGS.debug("The " + data + "  is not present in the WorkOrder Notes Field");
			return Constants.KEYWORD_FAIL + " - " + e.getMessage();

		}

	}
	
	public String verifyIncidentRecordNotesDetails(String object, String data) {
		APP_LOGS.debug("Opening verifyIncidentRecordNotesDetails");
		
		String actualVal = "";

		try {
			By byObject = getSelectorType(object);
			if (byObject == null) {
				return Constants.KEYWORD_FAIL + " - " + "Invalid reference:" + object;
			} else {

				actualVal = driver.findElement(byObject).getText().trim();
				if (actualVal.equals("")) {
					actualVal = driver.findElement(byObject).getAttribute("value").trim();
					Assert.assertTrue("Assertion Failed: " + data + " is not present in the Incident Record Notes Field",
							actualVal.contains(data));
					APP_LOGS.debug("The " + data + " is present in the Incident Record Notes field");
				} else {
					Assert.assertTrue("Assertion Failed: " + data + " is not present in the Incident Record Notes Field",
							actualVal.contains(data));
					APP_LOGS.debug("The " + data + " is present in the Incident Record Notes field");
				}

				return Constants.KEYWORD_PASS;

			}

		} catch (AssertionError e) {
			APP_LOGS.debug("The " + data + "  is not present in the Incident Record Notes Field");
			return Constants.KEYWORD_FAIL + " - " + e.getMessage();

		}

	}
	
	public String verifyAuditLogResult(String object, String data) {
		APP_LOGS.debug("Opening verifyAuditLogResult");
		SoftAssert s_assert = new SoftAssert();
		String actualVal = "";

		try {
			By byObject = getSelectorType(object);
			if (byObject == null) {
				return Constants.KEYWORD_FAIL + " - " + "Invalid reference:" + object;
			} else {

				actualVal = driver.findElement(byObject).getText().trim();
				if(actualVal.equals("")){
				actualVal = driver.findElement(byObject).getAttribute("value");
				}
				s_assert.assertEquals(actualVal, data.trim());
				s_assert.assertAll();
				APP_LOGS.debug("The actual value: " + actualVal + " matches with the expected value: " + data);
				// Assert.assertTrue(actualVal.contains(data));

				System.out.println("The actual value: " + actualVal + " matches with the expected value: " + data);
				return Constants.KEYWORD_PASS;

			}

		} catch (AssertionError e) {
			APP_LOGS.debug("The actual value: " + actualVal + " does not match with the expected value: " + data);
			return Constants.KEYWORD_FAIL + " - " + e.getMessage();

		}

	}
	
	public String verifyAssignedGroupDetails(String object, String data) {
		APP_LOGS.debug("Opening verifyAssignedGroupDetails");
		String Status;
		try {
			By byObject = getSelectorType(object);
			if (byObject == null) {
				return Constants.KEYWORD_FAIL + " - " + "Invalid reference:" + object;
			} else {
				Status = driver.findElement(By.xpath("//*[@arid='7']/div/input")).getAttribute("value").trim();
				if (Status.equalsIgnoreCase("Resolved")) {
					APP_LOGS.debug("Status of the Incident is Resolved");
					verifyFieldIsReadOnly(object, data);
					return Constants.KEYWORD_PASS;

				} else if (Status.equalsIgnoreCase("Cancelled")) {
					APP_LOGS.debug("Status of the Incident is Cancelled");
					verifyFieldIsReadOnly(object, data);
					return Constants.KEYWORD_PASS;

				} else if (Status.equalsIgnoreCase("Closed")) {
					APP_LOGS.debug("Status of the Incident is Closed");
					verifyFieldIsReadOnly(object, data);
					return Constants.KEYWORD_PASS;

				} else {
					APP_LOGS.debug("Status of the Incident is "+Status+" and not Resolved (or) Cancelled (or) Closed");
					verifyFieldIsNotReadOnly(object, data);
					return Constants.KEYWORD_PASS;
				}

			}
		} catch (Exception e) {
			APP_LOGS.debug("The field does not contain any value");
			return Constants.KEYWORD_FAIL + " - " + e.getMessage();

		}
	}

	public String verifyFieldIsReadOnly(String object, String data) {
		APP_LOGS.debug("Opening verifyFieldIsReadOnly");
		
		try {
			By byObject = getSelectorType(object);
			if (byObject == null) {
				return Constants.KEYWORD_FAIL + " - " + "Invalid reference:" + object;
			} else {
				

				WebElement readOnly = driver.findElement(byObject);
			//	Assert.assertTrue(readOnly.getAttribute("readOnly").equals("true"));
				
				Assert.assertTrue("Assertion Failed: Field is not read only", readOnly.getAttribute("style").contains("background-color"));
				
				APP_LOGS.debug("The Field "+data+" is read only");
				return Constants.KEYWORD_PASS;

			}

		} catch (AssertionError e) {
			APP_LOGS.debug("The Field "+data+"  is not read only");
			return Constants.KEYWORD_FAIL + " - " + e.getMessage();

		}

	}
	
	public String verifyFieldIsNotReadOnly(String object, String data) {
		APP_LOGS.debug("Opening verifyFieldIsNotReadOnly");

		try {
			By byObject = getSelectorType(object);
			if (byObject == null) {
				return Constants.KEYWORD_FAIL + " - " + "Invalid reference:" + object;
			} else {

				WebElement readOnly = driver.findElement(byObject);

				//Assert.assertThat("Field is read Only", readOnly.getAttribute("readOnly"), IsNot.not("true"));
				Assert.assertFalse("Assertion Failed: Field is read only",readOnly.getAttribute("style").contains("background-color"));
				
				

				APP_LOGS.debug("The Field " + data + " is not read only");
				return Constants.KEYWORD_PASS;

			}

		} catch (AssertionError e) {
			APP_LOGS.debug("The Field " + data + "  is read only");
			return Constants.KEYWORD_FAIL + " - " + e.getMessage();

		}

	}
	public String verifyFieldIsNotEmpty(String object, String data) throws InterruptedException {
		APP_LOGS.debug("Opening verifyFieldIsNotEmpty");
		// SoftAssert s_assert = new SoftAssert();

		try {
			By byObject = getSelectorType(object);
			if (byObject == null) {
				return Constants.KEYWORD_FAIL + " - " + "Invalid reference:" + object;
			} else {

				WebElement field_data = driver.findElement(byObject);
			//syntax to verify field is not empty	
			Assert.assertThat("Field "+data+" is empty", field_data.getAttribute("value"), IsNot.not(""));
			
			
			//syntax to verify field is empty			
			//Assert.assertThat("Field is empty", field_data.getAttribute("value"), isEmptyString());
			
			
			APP_LOGS.debug("The field "+data+" is not empty");
			APP_LOGS.debug("Field Contains: "+field_data.getAttribute("value"));
				return Constants.KEYWORD_PASS;
				
				
			}

		} catch (AssertionError e) {
			APP_LOGS.debug("The field "+data+" is empty");
			
			APP_LOGS.debug("Updating the field with detail "+data+" now");
			
			
			APP_LOGS.debug((String) enterText(object, data));
			APP_LOGS.debug((String) pauseExecution("", "500"));
			APP_LOGS.debug((String) clickElement(object, ""));
			APP_LOGS.debug((String) pauseExecution("", "500"));
			APP_LOGS.debug((String) keyboardAction(object, "SPACE"));
			APP_LOGS.debug((String) pauseExecution("", "500"));
			APP_LOGS.debug((String) keyboardAction(object, "BACKSPACE"));
			APP_LOGS.debug((String) pauseExecution("", "1000"));

			APP_LOGS.debug((String) clickElement("cm_group_autocomplete", ""));
			APP_LOGS.debug((String) pauseExecution("", "6000"));
			return Constants.KEYWORD_PASS;

		}

	}
	
	public String verifyFieldIsEmpty(String object, String data) throws InterruptedException {
		APP_LOGS.debug("Opening verifyFieldIsEmpty");
		// SoftAssert s_assert = new SoftAssert();

		try {
			By byObject = getSelectorType(object);
			if (byObject == null) {
				return Constants.KEYWORD_FAIL + " - " + "Invalid reference:" + object;
			} else {

				WebElement field_data = driver.findElement(byObject);
				// syntax to verify field is not empty
				/*
				 * Assert.assertThat("Field is empty",
				 * field_data.getAttribute("value"), IsNot.not(""));
				 * APP_LOGS.debug("The field is not empty");
				 * APP_LOGS.debug("Field Contains: "+field_data.getAttribute(
				 * "value"));
				 */

				// syntax to verify field is empty
				Assert.assertThat("Field "+data+" is not empty", field_data.getAttribute("value"), isEmptyString());
				APP_LOGS.debug("The field " + data + " is empty");

				return Constants.KEYWORD_PASS;

			}

		} catch (AssertionError e) {
			APP_LOGS.debug("The field "+data+" is not empty");

			return Constants.KEYWORD_FAIL + " - " + e.getMessage();

		}

	}
	
	public String getFieldDetail(String object, String data) {
		APP_LOGS.debug("Opening getFieldDetail");
		String Field_Detail = "";
		try {
			By byObject = getSelectorType(object);
			if (byObject == null) {
				return Constants.KEYWORD_FAIL + " - " + "Invalid reference:" + object;
			} else {

				Field_Detail = driver.findElement(byObject).getText().trim();

				if (Field_Detail.equals("")) {
					Field_Detail = driver.findElement(byObject).getAttribute("value");

				}
				APP_LOGS.debug("The Field contains detail as:  " + Field_Detail);
				return Constants.KEYWORD_PASS;
			}

		} catch (Exception e) {
			APP_LOGS.debug("The Field " + data + "  does not have any detail");
			return Constants.KEYWORD_FAIL + " - " + e.getMessage();

		}

	}
	
	/*public String waitUntilVisibility(String object, String data){
		APP_LOGS.debug("Opening waitUntilVisibility");
		//object = xpath/id of the element
		//data = wait time in secs ex:20 
		try{
			By byObject=getSelectorType(object);
			if(byObject==null){
				return Constants.KEYWORD_FAIL+" - "+"Invalid reference:"+object;
			}else{
				long time = (long)Double.parseDouble(data);
				new FluentWait  <WebDriver>(driver)
			      .withTimeout(time, TimeUnit.SECONDS)
			      .pollingEvery(1, TimeUnit.SECONDS)
			      .ignoring(NoSuchElementException.class);//in case the element is not found even after 30secs, don't throw this exception.
			    //  .until(ExpectedConditions.visibilityOfElementLocated(byObject));
				
				return Constants.KEYWORD_PASS;
			}
		}
		catch (Exception e){
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}
	
	public String waitUntilInVisibility(String object, String data){
		APP_LOGS.debug("Opening waitUntilInVisibility");
		//object = xpath/id of the element
		//data = wait time in secs ex:20 
		try{
			By byObject=getSelectorType(object);
			if(byObject==null){
				return Constants.KEYWORD_FAIL+" - "+"Invalid reference:"+object;
			}else{
				long time = (long)Double.parseDouble(data);
				new FluentWait  <WebDriver>(driver)
			      .withTimeout(time, TimeUnit.SECONDS)
			      .pollingEvery(1, TimeUnit.SECONDS)
			      .ignoring(NoSuchElementException.class);//in case the element is not found even after 30secs, don't throw this exception.
			     // .until(ExpectedConditions.invisibilityOfElementLocated(byObject));
				return Constants.KEYWORD_PASS;
			}
		}
		catch (Exception e){
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}*/
	
	public String closeBroswer(){
		APP_LOGS.debug("Opening closeBroswer");
		return Constants.KEYWORD_PASS;
	}
	
	public String verifyListSelection(){
		APP_LOGS.debug("Opening verifyListSelection");
		return Constants.KEYWORD_PASS;
	}
	
	public String verifyAllListElements(){
		APP_LOGS.debug("Opening verifyAllListElements");
		return Constants.KEYWORD_PASS;
	}
	
	public String selectRadio(){
		APP_LOGS.debug("Opening selectRadio");
		return Constants.KEYWORD_PASS;
	}
	
	public String verifyRadioSelected(){
		APP_LOGS.debug("Opening verifyRadioSelected");
		return Constants.KEYWORD_PASS;
	}
	
	public String checkCheckBox(){
		APP_LOGS.debug("Opening checkCheckBox");
		return Constants.KEYWORD_PASS;
	}
	
	public String unCheckCheckBox(){
		APP_LOGS.debug("Opening unCheckCheckBox");
		return Constants.KEYWORD_PASS;
	}
	
	public String verifyCheckBoxSelected(){
		APP_LOGS.debug("Opening verifyCheckBoxSelected");
		return Constants.KEYWORD_PASS;
	}
	
	public String verifyTitle(){
		APP_LOGS.debug("Opening verifyTitle");
		return Constants.KEYWORD_PASS;
	}
	
	public String exist(){
		APP_LOGS.debug("Opening exist");
		return Constants.KEYWORD_PASS;
	}
	
	public String click(){
		APP_LOGS.debug("Opening click");
		return Constants.KEYWORD_PASS;
	}
	
	public String synchronize(){
		APP_LOGS.debug("Opening synchronize");
		return Constants.KEYWORD_PASS;
	}

	/*************Application Specific Keywords - BMC Project Keywords*************/
	
	public String selectMenuOption(String object, String data){
		APP_LOGS.debug("Opening selectMenuOption: with Object Reference: "+object+ " and Data: "+ data);
		try{ 
			clickElement(object, data);
	           Thread.sleep(3000L);
	           driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	           int minDiv=3,maxDiv=19;
	           boolean elementFound;
	           for(int menuVal=0;menuVal<data.split(Constants.DATA_DELIMITER).length;menuVal++){
	                 elementFound=false;
	                 for (;minDiv<=maxDiv;){
	                        List<WebElement> menuOuter = driver.findElements(By.xpath("html/body/div["+minDiv+"]"));
	                        if (menuOuter.size()==0){
	                               minDiv++;
	                        }
	                        else{
	                               List<WebElement> menuOptions = menuOuter.get(0).findElements(By.tagName("tr"));
	                               if(menuOptions.size()==0)minDiv++;
	                               for(int menuOption=0; menuOption<menuOptions.size();menuOption++){
	                                      if (menuOptions.get(menuOption).getText().trim().equals(data.split(Constants.DATA_DELIMITER)[menuVal])){
	                                             driver.findElement(By.xpath("html/body/div["+minDiv+"]/div[2]/table/tbody/tr["+(menuOption+1)+"]/td")).click();
	                                             Thread.sleep(500L);
	                                             minDiv++;
	                                             elementFound=true;
	                                             break;
	                                      }
	                                      if(menuOption==(menuOptions.size()-1))minDiv++;
	                               }
	                        }
	                        if(elementFound)break;
	                 }
	           }
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        return Constants.KEYWORD_PASS;
	    }
	    catch(Exception e){
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	return Constants.KEYWORD_FAIL+" - "+e.getMessage();
	    }
	}
	
	public String selectMenuOptionSRDForm(String object, String data){
		APP_LOGS.debug("Opening selectMenuOptionSRDForm: with Object Reference: "+object+ " and Data: "+ data);
		try{ 
			clickElement(object, data);
	           Thread.sleep(3000L);
	           driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	           int minDiv=1,maxDiv=30;
	           boolean elementFound;
	           for(int menuVal=0;menuVal<data.split(Constants.DATA_DELIMITER).length;menuVal++){
	                 elementFound=false;
	                 for (;minDiv<=maxDiv;){
	                        List<WebElement> menuOuter = driver.findElements(By.xpath("html/body/ul["+minDiv+"]"));
	                        
	                        if (menuOuter.size()==0){
	                               minDiv++;
	                        }
	                        else{
	                               List<WebElement> menuOptions = menuOuter.get(0).findElements(By.tagName("a"));
	                               if(menuOptions.size()==0)minDiv++;
	                               for(int menuOption=0; menuOption<menuOptions.size();menuOption++){
	                                      if (menuOptions.get(menuOption).getText().trim().equals(data.split(Constants.DATA_DELIMITER)[menuVal])){
	                                             driver.findElement(By.xpath("html/body/ul["+minDiv+"]/li["+(menuOption+1)+"]/a")).click();
	                                             Thread.sleep(500L);
	                                             minDiv++;
	                                             elementFound=true;
	                                             break;
	                                      }
	                                      if(menuOption==(menuOptions.size()-1))minDiv++;
	                               }
	                        }
	                        if(elementFound)break;
	                 }
	           }
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        return Constants.KEYWORD_PASS;
	    }
	    catch(Exception e){
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	return Constants.KEYWORD_FAIL+" - "+e.getMessage();
	    }
	}
	
	public String printMenu(String object, String data){
		APP_LOGS.debug("Opening printMenu: with Object Reference: "+object+ " and Data: "+ data);
		try{ 
			clickElement(object, data);
	           Thread.sleep(3000L);
	           driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	           int minDiv=3,maxDiv=19;
	           boolean elementFound;
	           for(int menuVal=0;menuVal<data.split(Constants.DATA_DELIMITER).length;menuVal++){
	                 elementFound=false;
	                 for (;minDiv<=maxDiv;){
	                        List<WebElement> menuOuter = driver.findElements(By.xpath("html/body/div["+minDiv+"]"));
	                        if (menuOuter.size()==0){
	                               minDiv++;
	                        }
	                        else{
	                               List<WebElement> menuOptions = menuOuter.get(0).findElements(By.tagName("tr"));
	                               if(menuOptions.size()==0)minDiv++;
	                               for(int menuOption=0; menuOption<menuOptions.size();menuOption++){
	                                      {
	                                             System.out.println("Option"+menuOption+" is: "+ menuOptions.get(menuOption).getText());
	                                      }
	                                      if(menuOption==(menuOptions.size()-1))minDiv++;
	                               }
	                        }
	                        if(elementFound)break;
	                 }
	           }
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        return Constants.KEYWORD_PASS;
	    }
	    catch(Exception e){
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	return Constants.KEYWORD_FAIL+" - "+e.getMessage();
	    }
	}
	public String selectOptCat3(String object, String data){
		APP_LOGS.debug("Opening selectMenuOption: "+data);
		try{ 
			clickElement(object, data);
	           Thread.sleep(3000L);
	           driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	           int minDiv=3,maxDiv=19;
	           boolean elementFound;
	           for(int menuVal=0;menuVal<data.split(Constants.DATA_DELIMITER).length;menuVal++){
	                 elementFound=false;
	                 for (;minDiv<=maxDiv;){
	                        List<WebElement> menuOuter = driver.findElements(By.xpath("html/body/div["+minDiv+"]"));
	                        if (menuOuter.size()==0){
	                               minDiv++;
	                        }
	                        else{
	                               List<WebElement> menuOptions = menuOuter.get(0).findElements(By.tagName("tr"));
	                               if(menuOptions.size()==0)minDiv++;
	                               for(int menuOption=0; menuOption<menuOptions.size();menuOption++){
	                                      if (menuOptions.get(menuOption).getText().trim().equals(data.split(Constants.DATA_DELIMITER)[menuVal])){
	                                             driver.findElement(By.xpath("html/body/div["+minDiv+"]/div[2]/table/tbody/tr["+(menuOption+1)+"]/td")).click();
	                                             Thread.sleep(500L);
	                                             minDiv++;
	                                             elementFound=true;
	                                             break;
	                                      }
	                                      if(menuOption==(menuOptions.size()-1))minDiv++;
	                               }
	                        }
	                        if(elementFound)break;
	                 }
	           }
	           Thread.sleep(5000);
	           int i = driver.getWindowHandles().size();
	           if(i>1){
	        	   		for (String winHandle : driver.getWindowHandles()){
	        	   		driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
	        	   			   		}
	        	   		driver.findElement(By.xpath("//*[@id='WIN_0_301912800']")).click();//click on save
	        	   		for (String winHandle : driver.getWindowHandles()){
		        	   		driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		        	   			   		}
	        	   	}
	           
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        return Constants.KEYWORD_PASS;
	    }
	    catch(Exception e){
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	return Constants.KEYWORD_FAIL+" - "+e.getMessage();
	    }
	}

	public String userPermissionGroup(String object, String data){
		APP_LOGS.debug("Opening userPermissionGroup: "+data);
		 
		try{ 
			  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	           boolean elementFound;
	           int xlsVal=1;
	           String NotFoundValues="";
	          
	           				Thread.sleep(3000);
	                        List<WebElement> PGTable = driver.findElement(By.xpath("//*[@id='T302017400']/tbody")).findElements(By.tagName("td"));
	                        
	                        setRuntimeProperty("LoadsheetPGCount"," ");
	                        setRuntimeProperty("RemedyPGCount"," ");
	                        
	                        setRuntimeProperty("LoadsheetPGCount",Integer.toString(data.split(Constants.DATA_DELIMITER).length));
	                        setRuntimeProperty("RemedyPGCount",Integer.toString(PGTable.size()));
	                        
	                       
	                        		for(int imputdata=0; imputdata<data.split(Constants.DATA_DELIMITER).length;imputdata++){
	                            	   elementFound =false;
	                            	   for (int i=0; i<PGTable.size(); i++){
	                            		   
	                                      if (PGTable.get(i).getText().trim().equals(data.split(Constants.DATA_DELIMITER)[imputdata].trim())){
	                                    	  elementFound=true;
	                                      	}
	                            	   }
	                            	   if(!elementFound){
                                	  
	                            		   NotFoundValues=NotFoundValues +"|"+data.split(Constants.DATA_DELIMITER)[imputdata];
	                            		   setRuntimeProperty("MissingData", " "); 
	                            		   setRuntimeProperty("MissingData", NotFoundValues); 
	                            		   xlsVal++;  
	                            	   	   }
	                        		}
	                            
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        return Constants.KEYWORD_PASS;
	    }
	    catch(Exception e){
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	return Constants.KEYWORD_FAIL+" - "+e.getMessage();
	    }
	}
	
	

	public String switchToParentWindow(String object, String data){
		APP_LOGS.debug("Opening switchToParentWindow");
		try{
			Set<String> parentHandle = driver.getWindowHandles(); // get all the window handles
			for (String winHandle : parentHandle){
				driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
			}
			return Constants.KEYWORD_PASS;
		}
		catch (Exception e){
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}
	
	public String switchToNewFrame(String object, String data){
		APP_LOGS.debug("Opening switchToNewFrame");
		try{
			List<WebElement> frames = driver.findElements(By.tagName("iframe"));
			
			//System.out.println("Number of Frames at the moment is : "+ frames.size());
			driver.switchTo().frame(frames.get((frames.size()-1)).getAttribute("id"));
			return Constants.KEYWORD_PASS;
		}
		catch (Exception e){
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}
	
	public String switchToThisFrame(String object, String data){
		APP_LOGS.debug("Opening switchToThisFrame");
		try{
		//	WebElement frame = driver.findElement(By.id(data));
			
			List<WebElement> frames = driver.findElements(By.tagName("iframe"));

			APP_LOGS.debug((String) ("Number of Frames at this moment is: " + frames.size()));
			//System.out.println("Number of Frames at the moment is : "+ frames.size());
			int frameid = Integer.parseInt(data);
			driver.switchTo().frame(frameid);
			return Constants.KEYWORD_PASS;
		}
		catch (Exception e){
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}
	
	public String closeNewWindow(String object, String data){
		APP_LOGS.debug("Opening closeWindow");
		try{
			driver.close();
			switchToParentWindow("", "");
			return Constants.KEYWORD_PASS;
		}
		catch (Exception e){
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}
	
	public String switchToNewWindow(String object, String data){
		APP_LOGS.debug("Opening switchingWindow");
		try{
			clickElement(object, "");
			// click search button that opens a new window
			Thread.sleep(5000L);
			for (String winHandle : driver.getWindowHandles()){
				driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
			}
			return Constants.KEYWORD_PASS;
		}
		catch (Exception e){
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}
	
	public String accessAuditLog(String object, String data){
		APP_LOGS.debug("Opening accessAuditLog");
		try{
			if(driver.findElement(By.xpath("//*[@arid='1000005680']/span")).isDisplayed()){
				switchToNewWindow("cm_view_audit_log", "");
				clickElement("change_audit_log_form_audit_tab", "");
			}
			else{
				clickElement("cm_functions_more_btn", "");
				switchToNewWindow("cm_view_audit_log", "");
				clickElement("change_audit_log_form_audit_tab", "");
			}
			
			return Constants.KEYWORD_PASS;
		}
		catch (Exception e){
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}
	
	public String copyChangeAndCreateNewChangeRecord(String object, String data) {
		APP_LOGS.debug("Opening copyChangeAndCreateNewChangeRecord");
		try {
			if (driver.findElement(By.xpath("//*[@arid='1000005779']/span")).isDisplayed()) {
				switchToNewWindow("cm_copy_change", "");

			} else {
				clickElement("cm_functions_btn", "");
				switchToNewWindow("cm_copy_change", "");

			}

			return Constants.KEYWORD_PASS;
		} catch (Exception e) {
			return Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}
	
	public String verifyFieldIsDisplayed(String object, String data) {
		APP_LOGS.debug("Opening verifyFieldIsDisplayed");
		try {

			By byObject = getSelectorType(object);
			if (byObject == null) {
				return Constants.KEYWORD_FAIL + " - " + "Invalid reference:" + object;
			} else {

				if (driver.findElement(byObject).isDisplayed()) {

					APP_LOGS.debug("Field " + data + " is present");

				}
				return Constants.KEYWORD_PASS;
			}

		} catch (Exception e) {

			APP_LOGS.debug(" Field " + data + " is not present");
			return Constants.KEYWORD_FAIL + " - " + e.getMessage();

		}
	}
	
	
	public String verifyFieldIsMandatory(String object, String data) throws InterruptedException {
		APP_LOGS.debug("Opening verifyFieldIsMandatory");
		try {

			By byObject = getSelectorType(object);
			if (byObject == null) {
				return Constants.KEYWORD_FAIL + " - " + "Invalid reference:" + object;
			} else {

				clickElement(object, "");
				Thread.sleep(5000L);
				driver.switchTo().frame(0);
				APP_LOGS.debug(driver.findElement(By.xpath("//*[@id='PopupMsgBox']")).getText());
				

			/*	String popmessage = driver.findElement(By.xpath("//*[@id='PopupMsgBox']")).getText().trim();
				String pop1 = StringUtils.substringBetween(popmessage, "Required field ",
						"+ (ARERR 9424)");
				System.out.println(pop1);
				setRuntimeProperty("RequestID", pop1);*/

				// Assert.assertEquals("BMC Remedy User - Error ",
				// driver.findElement(By.xpath("//*[@id='title_0']/div")).getText());
				if (driver.findElement(By.xpath("//*[@id='PopupMsgBox']")).getText().trim()
						.contains("Resolution Category (ARERR 9424)")) {
					APP_LOGS.debug("Resolution Category Tier1 field is being treated as Mandatory");
				} else if (driver.findElement(By.xpath("//*[@id='PopupMsgBox']")).getText().trim()
						.contains("Status Reason (ARERR 9424)")) {
					APP_LOGS.debug("Status Reason field is being treated as Mandatory");
				} else if (driver.findElement(By.xpath("//*[@id='PopupMsgBox']")).getText().trim()
						.contains("Resolution* (ARERR 9424)")) {
					APP_LOGS.debug("Resolution field is being treated as Mandatory");
				} else if (driver.findElement(By.xpath("//*[@id='PopupMsgBox']")).getText().trim()
						.contains("Assignee*+ (ARERR 9424)")) {
					APP_LOGS.debug("Assignee field is being treated as Mandatory");
				} else {
					APP_LOGS.debug("" + data + " is not being treated as Mandatory");
				}

				driver.findElement(By.xpath("//*[@id='PopupMsgFooter']/a")).click();
				return Constants.KEYWORD_PASS;
			}

		} catch (Exception e) {

			APP_LOGS.debug(" " + data + " is not being treated as mandatory");
			return Constants.KEYWORD_FAIL + " - " + e.getMessage();

		}
	}
	
	public String verifyRestoredDateLesserThanReportedDate(String object, String data) throws InterruptedException {
		APP_LOGS.debug("Opening verifyRestoredDateLesserThanReportedDate");
		try {

			Thread.sleep(3000L);
			List<WebElement> frames = driver.findElements(By.tagName("iframe"));

			APP_LOGS.debug((String) ("Number of Frames at this moment is: " + frames.size()));
			if (frames.size() > 1) {
				driver.switchTo().frame(1);
				APP_LOGS.debug(driver.findElement(By.xpath("//*[@id='PopupMsgBox']")).getText());

				// Assert.assertEquals("BMC Remedy User - Error ",
				// driver.findElement(By.xpath("//*[@id='title_0']/div")).getText());
				if (driver.findElement(By.xpath("//*[@id='PopupMsgBox']")).getText().trim()
						.contains("Please correct the Restored Date. (ARERR 620000131)")) {
					APP_LOGS.debug("Error message displayed is correct");
				} else {
					APP_LOGS.debug("The error message displayed is incorrect ");
				}

				driver.findElement(By.xpath("//*[@id='PopupMsgFooter']/a")).click();

			} else {
				APP_LOGS.debug(
						"No Error Message is getting displayed even if Restored Date is lesser than the Reported Date");
			}
			return Constants.KEYWORD_PASS;

		} catch (Exception e) {

			APP_LOGS.debug(" " + data + " Validation on the Restored Date Field has failed");
			return Constants.KEYWORD_FAIL + " - " + e.getMessage();

		}
	}
	
	public String verifyRestoredDateLesserThanReportedDateDuringCreation(String object, String data) throws InterruptedException {
		APP_LOGS.debug("Opening verifyRestoredDateLesserThanReportedDateDuringCreation");
		try {

			Thread.sleep(3000L);
			List<WebElement> frames = driver.findElements(By.tagName("iframe"));

			APP_LOGS.debug((String) ("Number of Frames at this moment is: " + frames.size()));
			if (frames.size() >=1) {
				driver.switchTo().frame(0);
				APP_LOGS.debug(driver.findElement(By.xpath("//*[@id='PopupMsgBox']")).getText());

				// Assert.assertEquals("BMC Remedy User - Error ",
				// driver.findElement(By.xpath("//*[@id='title_0']/div")).getText());
				if (driver.findElement(By.xpath("//*[@id='PopupMsgBox']")).getText().trim()
						.contains("Please correct the Restored Date. (ARERR 620000131)")) {
					APP_LOGS.debug("Error message displayed is correct");
				} else {
					APP_LOGS.debug("The error message displayed is incorrect ");
				}

				driver.findElement(By.xpath("//*[@id='PopupMsgFooter']/a")).click();

			} else {
				APP_LOGS.debug(
						"No Error Message is getting displayed even if Restored Date is lesser than the Reported Date");
			}
			return Constants.KEYWORD_PASS;

		} catch (Exception e) {

			APP_LOGS.debug(" " + data + " Validation on the Restored Date Field has failed");
			return Constants.KEYWORD_FAIL + " - " + e.getMessage();

		}
	}
	
	
	
	public String verifyRestoredDateGreaterThanLastResolvedDate(String object, String data) throws InterruptedException {
		APP_LOGS.debug("Opening verifyRestoredDateGreaterThanLastResolvedDate");
		try {

			Thread.sleep(3000L);
			List<WebElement> frames = driver.findElements(By.tagName("iframe"));

			APP_LOGS.debug((String) ("Number of Frames at this moment is: " + frames.size()));
			if (frames.size() > 1) {
				driver.switchTo().frame(1);
				APP_LOGS.debug(driver.findElement(By.xpath("//*[@id='PopupMsgBox']")).getText());

				// Assert.assertEquals("BMC Remedy User - Error ",
				// driver.findElement(By.xpath("//*[@id='title_0']/div")).getText());
				if (driver.findElement(By.xpath("//*[@id='PopupMsgBox']")).getText().trim()
						.contains("Please correct the Restored Date before Resolving this Incident. (ARERR 620000130)")) {
					APP_LOGS.debug("Error message displayed is correct");
				} else {
					APP_LOGS.debug("The error message displayed is incorrect ");
				}

				driver.findElement(By.xpath("//*[@id='PopupMsgFooter']/a")).click();
				

			} else {
				APP_LOGS.debug(
						"No Error Message is getting displayed even if Restored Date is greater than the Last Resolved Date");
			}
			return Constants.KEYWORD_PASS;

		} catch (Exception e) {

			APP_LOGS.debug(" " + data + " Validation on the Restored Date Field has failed");
			return Constants.KEYWORD_FAIL + " - " + e.getMessage();

		}
	}
	
	public String switchtoPopUpAndClose(String object, String data){
		APP_LOGS.debug("Opening switchtoPopUpAndClose");
		try{
			
			Thread.sleep(2000L);
			driver.switchTo().frame(0);
			Thread.sleep(1000L);
			APP_LOGS.debug("PopUp is getting displayed before logging out ");
			APP_LOGS.debug(driver.findElement(By.xpath("//*[@id='PopupMsgBox']")).getText());
			driver.findElement(By.xpath("//*[@id='PopupMsgFooter']/a")).click();
			return Constants.KEYWORD_PASS;
		}
		catch(Exception e){
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}
	
	public String getServiceRequestID(String object, String data) {
		APP_LOGS.debug("Opening getServiceRequestID");
		try {
			clickElement(object,"");
			Thread.sleep(5000L);
			driver.switchTo().frame(3);
			Thread.sleep(1000L);

			APP_LOGS.debug(driver.findElement(By.xpath("//*[@id='PopupMsgBox']")).getText());

			String popmessage = driver.findElement(By.xpath("//*[@id='PopupMsgBox']")).getText().trim();
			String pop1 = StringUtils.substringBetween(popmessage, "Your request ",
					" has been submitted.");
			System.out.println(pop1);
			APP_LOGS.debug("The Service Request ID is: "+pop1);
			setRuntimeProperty(data, pop1);
			driver.findElement(By.xpath("//*[@id='PopupMsgFooter']/a")).click();
			Thread.sleep(5000L);
			switchToParentWindow("", "");
			return Constants.KEYWORD_PASS;
		} catch (Exception e) {
			return Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}
	
	public String verifyFieldMandatoryInSRDForm(String object, String data) throws InterruptedException {
		APP_LOGS.debug("Opening verifyFieldMandatoryInSRDForm");
		try {

			By byObject = getSelectorType(object);
			if (byObject == null) {
				return Constants.KEYWORD_FAIL + " - " + "Invalid reference:" + object;
			} else {

				switchToParentWindow("", "");
				clickElement("change_template_service_request_submit_btn", "");
				Thread.sleep(3000L);

				List<WebElement> frames = driver.findElements(By.tagName("iframe"));

				APP_LOGS.debug((String) ("Number of Frames at this moment is: " + frames.size()));
				if (frames.size() >= 1) {

					driver.switchTo().frame(2);
					//System.out.println(driver.findElement(By.xpath("//*[@id='PopupMsgBox_DVF']")).getText());

					APP_LOGS.debug(driver.findElement(By.xpath("//*[@id='PopupMsgBox_DVF']")).getText());

					verifyLinkText("srd_field_mandatory_error_popup_message", "Please check questions values");
					clickElement("srd_field_mandatory_error_popup_ok_btn", "");
					Thread.sleep(3000L);

					Assert.assertTrue("Assertion Failed: Field " + data + " is not treated as mandatory",
							driver.findElement(byObject).getAttribute("style").contains("display: block;"));
					APP_LOGS.debug("The Field " + data + " has been treated as mandatory");

					String error_message = driver.findElement(byObject).getText().trim();
					verifyLinkText(object, error_message);
					Thread.sleep(2000L);

				} else {
					driver.switchTo().frame(2);
					APP_LOGS.debug("No Error PopUp is getting displayed");
				}

				return Constants.KEYWORD_PASS;
			}
		} catch (AssertionError e) {
			APP_LOGS.debug("The Field " + data + " has not been treated as mandatory");
			return Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}
	
	public String AddAttachment(String object, String data){
		APP_LOGS.debug("Opening AddAttachment");
		try{
			clickElement(object, "");
			//Click Upload Button
			Thread.sleep(1000L);
			List<WebElement> frames = driver.findElements(By.tagName("iframe"));
			driver.switchTo().frame(frames.get((frames.size()-1)).getAttribute("id"));
			Thread.sleep(1000L);
			return Constants.KEYWORD_PASS;
		}
		catch(Exception e){
			return Constants.KEYWORD_FAIL+" - "+e.getMessage();
		}
	}
	
	public String logout(String object, String data) {
		APP_LOGS.debug("Opening logout");
		try {
			clickElement(object, "");
			List<WebElement> frames = driver.findElements(By.tagName("iframe"));

			APP_LOGS.debug((String) ("Number of Frames at this moment is: " + frames.size()));
			if (frames.size() >=1) {
				switchtoPopUpAndClose("", "");
			} else {
				APP_LOGS.debug("No PopUp is displayed before logging out ");
			}
			clickElement("return_to_login", "");
			return Constants.KEYWORD_PASS;
		} catch (

		Exception e) {
			return Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}
	 
	 /**********************************NOT KEYWORDS*********************************/
	
	public void captureScreenshot(String filename, String keyword_execution_result) throws IOException{
		// take screen shots
		if(CONFIG.getProperty("screenshot_everyStep").equalsIgnoreCase("Y")){
			// capturescreen
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") +"//screenshots//"+filename+".jpg"));
			
		}else if (keyword_execution_result.startsWith(Constants.KEYWORD_FAIL) && CONFIG.getProperty("screenshot_onError").equalsIgnoreCase("Y") ){
		// capture screenshot
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") +"//screenshots//"+filename+".jpg"));
		}
	}

	public String setRuntimeProperty(String object, String data) {
		APP_LOGS.debug("updating runtime properties");
		RUNTIME = new Properties();
		try {
			// loads existing property file
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//PropertyFiles//runtime.properties");

			RUNTIME.load(fis);
			fis.close();

			RUNTIME.clear();

			// modifies existing or adds new property value
			RUNTIME.setProperty(object, data);

			// saves modified property file
			FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"//src//test//java//PropertyFiles//runtime.properties");
			RUNTIME.store(fos, null);
			fos.close();

			return Constants.KEYWORD_PASS;
		} catch (Exception e) {
			return Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}
	}
	
	public String getRuntimeProperty(String object, String data) throws IOException {
		APP_LOGS.debug("reading runtime properties");
		RUNTIME = new Properties();
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//PropertyFiles//runtime.properties");
			// initialize RUNTIME object
			RUNTIME.load(fis);
			fis.close();
			String x = ((String) RUNTIME.getProperty(object).trim());
			System.out.println("The data read from the runtime property is: " + x);

			APP_LOGS.debug("Pass");
			return x;

		} catch (Exception e) {
			return Constants.KEYWORD_FAIL + " - " + e.getMessage();
		}

	}
	
	public By getSelectorType(String object){
		APP_LOGS.debug("Opening getSelectorType");
		By by;
		try{
			if (OR.getProperty(object).split(Constants.DATA_DELIMITER).length!=2){
				APP_LOGS.debug("Incorrect object ref in or.properties for property key:"+object);
				return null;
			}
			if(OR.getProperty(object).split(Constants.DATA_DELIMITER)[0].trim().equalsIgnoreCase("xpath")){
				by=By.xpath(OR.getProperty(object).split(Constants.DATA_DELIMITER)[1].trim());
			}
			else if(OR.getProperty(object).split(Constants.DATA_DELIMITER)[0].trim().equalsIgnoreCase("id")){
				by=By.id(OR.getProperty(object).split(Constants.DATA_DELIMITER)[1].trim());
			}
			else if(OR.getProperty(object).split(Constants.DATA_DELIMITER)[0].equalsIgnoreCase("linkText")){
				by=By.linkText(OR.getProperty(object).split(Constants.DATA_DELIMITER)[1].trim());
			}
			else if(OR.getProperty(object).split(Constants.DATA_DELIMITER)[0].equalsIgnoreCase("cssSelector")){
				by=By.cssSelector(OR.getProperty(object).split(Constants.DATA_DELIMITER)[1].trim());
			}
			else if(OR.getProperty(object).split(Constants.DATA_DELIMITER)[0].equalsIgnoreCase("name")){
				by=By.name(OR.getProperty(object).split(Constants.DATA_DELIMITER)[1].trim());
			}
			else if(OR.getProperty(object).split(Constants.DATA_DELIMITER)[0].equalsIgnoreCase("partialLinkText")){
				by=By.partialLinkText(OR.getProperty(object).split(Constants.DATA_DELIMITER)[1].trim());
			}
			else{
				APP_LOGS.debug("getSelectorType - Invalid selector");
				by=null;
			}
			return by;
			}
		catch (Exception e){
			APP_LOGS.debug("getSelectorType - "+Constants.KEYWORD_FAIL+" - "+e.getMessage());
			return null;
			}
	}

}