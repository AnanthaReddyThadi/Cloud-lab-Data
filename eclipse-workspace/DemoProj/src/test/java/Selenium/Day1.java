package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		        // Set the path to ChromeDriver executable
		        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver/chromedriver.exe");
		        
		        // Instantiate ChromeDriver
		        WebDriver driver = new ChromeDriver();
		        
		        // Navigate to the specified URL
		        driver.get("http://example.com");
		        
		        // Retrieve the page title
		        String pageTitle = driver.getTitle();
		        
		        // Define the expected title
		        String expectedTitle = "Example Domain";
		        
		        
		        // Verify the page title
		        if (pageTitle.equals(expectedTitle)) {
		        	
		            System.out.println("Page title verification successful!");
		        } else {
		        	
		            System.out.println("Page title verification failed. Expected: " + expectedTitle + ", Actual: " + pageTitle);
		            
		        }
		        
		        
		        // Close the browser
		        driver.quit();
		        
	    }
	}
		