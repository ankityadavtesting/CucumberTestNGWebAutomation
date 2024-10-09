package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/Login.feature", 
glue = {"stepdefinations", "hooks" },
plugin = {
		"pretty", "html:target/cucumber.html" })
public class MyTestNGRunner extends AbstractTestNGCucumberTests{

}
