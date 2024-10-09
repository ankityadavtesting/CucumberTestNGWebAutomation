package stepdefinations;

import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
public class LoginSteps {
	
	LoginPage loginPage ;
	
	@Given("User enters valid username")
	public void user_enters_username() {
		
		loginPage = new LoginPage(Hooks.driver);
		
		loginPage.enterUserName("Admin");
		
	}
	
	
	@And("User enters valid password")
	public void user_enters_password() {
		
		loginPage.enterPassword("admin123");
		
	}
	
	
	@And("User clicks on Login button")
	public void user_clicks_on_login() {
		
		loginPage.clickOnlOgin();
		
	}
	
	@Then("Home page should be displayed.")
	public void home_page_is_displayed() {
		
	String actualURL =	Hooks.driver.getCurrentUrl();
	
	String expectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	
	
	Assert.assertEquals(actualURL, expectedURL);
		
	}
	
	
	
	
	

}
