package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import constants.FrameworkConstant;

public class DriverFactory {
	
	public static WebDriver initDriver(String browsername) {
		
		WebDriver driver; 
		
		switch (browsername) {
		case FrameworkConstant.CHROME_BROWSER:
			
			driver = new ChromeDriver();
			
			break;
			
		case FrameworkConstant.FIREFOX_BROWSER :
			driver = new FirefoxDriver();
			break;

		default:
			throw new IllegalStateException("Invalid browser name");
			
		}
		return driver;
	}

}
