package ReiffTestCases;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
import RediffPages.RediffHomePage;
import RediffPages.RediffLoginPage;
 
public class RediffLoginTC1 {							
	
	WebDriver driver;
	RediffLoginPage rlp;
	RediffHomePage rhp;
	
	@BeforeTest
	public void invokeBrowser()
	{
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
	}
	
		
	@Test
	public void rediffTC1() throws InterruptedException
	{
		rlp = new RediffLoginPage(driver);
		rlp.userName().sendKeys("Admin");
		rlp.password().sendKeys("admin123");
		Thread.sleep(2000);
		rlp.signIn().click();//clicking on sign in btn
		driver.navigate().back();
		rlp.rediffHome().click();//take us to the home page
		
		rhp = new RediffHomePage(driver);
		rhp.news().click(); //taking you to new pages
		Thread.sleep(2000);
		rhp.sports().click();
		System.out.println("We have reached sports tab");
		
		//Title matching
				
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
 
}