package com.rps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void loginTest(){
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		
		Assert.assertEquals(driver.getTitle(), "Google");
	}

}
