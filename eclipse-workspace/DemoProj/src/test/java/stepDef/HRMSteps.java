package stepDef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import HRMPages.HRMLoginPage;
import io.cucumber.java.en.*;

public class HRMSteps {

	WebDriver driver;
	HRMLoginPage objLogin;


	@Given("User is on HRMLogin page") public void user_is_on_hrm_login_page() {
		// Write code here that turns the phrase above into concrete actions driver =
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//create the login page object 
		objLogin = new HRMLoginPage(driver);
		//  String title = driver.getTitle();

		//Assert 
	}

	@When("User enters username as {string} and {string}")
	public void user_enters_username_as_and(String string, String string2) { 
		// Write code here that turns the phrase above into concrete
		//actions 
		
		objLogin.username(string); 
		objLogin.password(string2);
		objLogin.submit();
		//objLogin.submit(); System.out.println("2nd step"); 
	}

	@Then("User should be able to login successfully and home page is displayed")
	public void user_should_be_able_to_login_successfully_and_home_page_is_displayed() throws InterruptedException { //
		// Write code here that turns the phrase above into concrete actions
		objLogin.submit();		
		System.out.println("3rd step executed"); 
	}
	@And("User should logout")
	public void User_should_logout() throws InterruptedException
	{
		Thread.sleep(5000);
		objLogin.dropDown();
		objLogin.logout();
		Thread.sleep(2000);
		driver.close();
	}
}