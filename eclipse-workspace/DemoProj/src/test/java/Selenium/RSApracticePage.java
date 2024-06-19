package Selenium;



import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class RSApracticePage extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				// TODO Auto-generated method stub
				invokeBrowser("edge");
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
				WebElement radio1 = driver.findElement(By.name("radioButton"));
				System.out.println("Displayed "+radio1.isDisplayed());
				System.out.println("Selected "+radio1.isSelected());
				System.out.println("Enabled "+radio1.isEnabled());
				radio1.click();
				System.out.println("Selected "+radio1.isSelected());
				List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='radioButton']"));
				System.out.println("Total no of radio buttons: "+radioBtns.size());
				
				
				
			}
	
		}