package Selenium;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
 
public class GoogleSearchSuggetions  extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				 invokeBrowser("chrome");
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 driver.get("https://www.google.com");
				 WebElement textArea = driver.findElement(By.name("q"));
				 textArea.sendKeys("Selenium");
				 Thread.sleep(3000);
				 List<WebElement> seleniumSuggestions = textArea.findElements(By.xpath("//span[contains(text(),'selenium')]"));
				 WebElement suggestionChoice = null;
				 for(WebElement l :seleniumSuggestions) {
					 System.out.println(l.getText());
					 if(l.getText().equalsIgnoreCase("selenium webdriver")) {
						 suggestionChoice=l;
					 }
				 }
				 suggestionChoice.click();
				 //seleniumSuggestions.get(0).click();
				 System.out.println(seleniumSuggestions.size());
	}
}