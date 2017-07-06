package StepDefinitions;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Keywords {
	
   // protected static WebDriver driver;
	public Method method[];
	public StepDefinitions.Keywords keywords;
	public static Method openbrowser_method;
	public static Method load_cofigPropertyFiles_method;
	public static Method navigate_method;
	
	public Hooks () throws NoSuchMethodException, SecurityException{
		keywords = new StepDefinitions.Keywords();
		method = keywords.getClass().getMethods();
		load_cofigPropertyFiles_method = keywords.getClass().getMethod("loadConfigPropertyFiles", String.class,
				String.class);
		openbrowser_method = keywords.getClass().getMethod("openBrowser", String.class, String.class);
		navigate_method = keywords.getClass().getMethod("navigate", String.class, String.class);
	}

	@Before

	public WebDriver environmentSetUp() throws MalformedURLException, InterruptedException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		load_cofigPropertyFiles_method.invoke(keywords, "", "");
		openbrowser_method.invoke(keywords, "", "browserType");
		navigate_method.invoke(keywords, "", "testSiteURL");
		return null;
	}

  
    /**
     * Embed a screenshot in test report if test is marked as failed
     */
    /*
    public WebDriver endexecution(){
    	 driver.close();
    	 return null;
    }
   public void embedScreenshot(Scenario scenario) {
       
       if(scenario.isFailed()) {
        try {
        	 scenario.write("Current Page URL is " +driver.getCurrentUrl());
//            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
        
        }
        driver.close();
        
    }*/
    
}