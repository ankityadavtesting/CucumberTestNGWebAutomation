package utils;

import java.util.Properties;
import constants.FrameworkConstant;


public class TestDataLoader {
	
	
	private static TestDataLoader testDataLoader ;
	
	public static TestDataLoader getInstance() {
		
		if (testDataLoader == null) {
			testDataLoader = new TestDataLoader();
		}
		
		return testDataLoader;
		
	}
	
	Properties prop; 
	
	private TestDataLoader() {
		
		switch (FrameworkConstant.ENVIRONMENT) {
		case "QA":
			prop = PropertyUtils.propertyUtils(FrameworkConstant.QA_TEST_DATA_FILE);
			
			break;
			
		case "Prod" :
			prop = PropertyUtils.propertyUtils(FrameworkConstant.PROD_TEST_DATA_FILE);
			break;

		default:
			break;
		}
		
	}
	
	
	
	public String getAppURL() {
		
		return prop.getProperty("appurl");
		
	}
	
	
	
	


}
