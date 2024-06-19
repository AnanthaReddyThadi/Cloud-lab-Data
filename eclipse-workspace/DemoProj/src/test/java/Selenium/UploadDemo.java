package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UploadDemo  extends BaseClass{

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
		
		 
	
		 
			
				// TODO Auto-generated method stub
				invokeBrowser("Chrome");
				driver.get("https://demo.guru99.com/test/upload/");
				Thread.sleep(2000);
				//identify the btn and click
				/*
				 * WebElement upload =
				 * driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
				 * Thread.sleep(4000); upload.click(); Thread.sleep(2000);
				 * upload.sendKeys("D:\\Automation\\Wipro\\html\\Table.html");
				 */
				
				driver.findElement(By.id("submitbutton")).click();
				
			}

	}

     