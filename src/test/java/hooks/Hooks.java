package hooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import constants.FrameworkConstant;
import driver.DriverFactory;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import utils.PropertyUtils;
import utils.TestDataLoader;

public class Hooks {
	
	public static WebDriver driver ;
	
	@BeforeAll
	public static void beforeHooks() {
		
	Properties properties = 	PropertyUtils.propertyUtils(FrameworkConstant.CONFIG_FILE_PATH);
		
	FrameworkConstant.BROWSER =  properties.getProperty("browser");	
	
	FrameworkConstant.ENVIRONMENT =  properties.getProperty("environment");	

	
	driver	= DriverFactory.initDriver(FrameworkConstant.BROWSER);
	
	
	driver.get(TestDataLoader.getInstance().getAppURL());
	driver.manage().window().maximize();		
	}
	
	
	@AfterAll
	public static void afterHooks() {
		driver.quit();
	}
	
	
	
	
	
	

}
