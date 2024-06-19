package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
				// Invoke browser -> run time polymorphism
				//WebDriver driver = new ChromeDriver();//open the Chrome browser
				//WebDriver driver = new FirefoxDriver();//open firefox browser
				WebDriver driver = new EdgeDriver();//MS edge browser
				driver.manage().window().maximize();//maximize the window size
				//entering the url
				driver.get("https://www.google.com");
				
				String aTitle = driver.getTitle();
				System.out.println(aTitle);
				String eTitle="google";
				//Title validation TC - Google(Expected) --> Google(Actual) -> PASS
				//Title validation
				if(eTitle.equalsIgnoreCase(aTitle))//true
				{
					System.out.println("Titles are matching - TC PASS");
				}
				else
					System.out.println("Titles are not matching - TC Fail");
				
				Thread.sleep(2000);//1000 millisec is 1 sec
				
				//navigating to the url
				
				
				driver.navigate().to("https://www.amazon.in/");
				Thread.sleep(1000);
				System.out.println(driver.getTitle());
				driver.navigate().back();//move back on the browser
				driver.navigate().forward();//move forward
				driver.navigate().refresh();//refresh the page
				driver.close();//close the current browser
				
		 
			}
		 
		}

