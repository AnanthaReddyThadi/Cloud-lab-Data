package Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;


public class Task1 {

	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub
	
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter the browser name (chrome, edge, firefox):");
		        String browserName = scanner.nextLine();

		        invokeBrowser(browserName);
		    }

		    public static void invokeBrowser(String browserName) throws InterruptedException {
		        WebDriver driver = null;
		        switch (browserName) {
		            case "chrome":
		                driver = new ChromeDriver();
		                break;
		            case "edge":
		                driver = new EdgeDriver();
		                break;
		            case "firefox":
		                driver = new FirefoxDriver();
		                break;
		            default:
		                System.out.println("Invalid browser selection. Please select chrome, edge, or firefox.");
		                return;
		        }

		        driver.manage().window().maximize();
		        driver.get("https://www.google.com");

		        String aTitle = driver.getTitle();
		        System.out.println(aTitle);
		        String eTitle = "google";
		        if (eTitle.equalsIgnoreCase(aTitle)) {
		            System.out.println("Titles are matching - TC PASS");
		        } else {
		            System.out.println("Titles are not matching - TC Fail");
		        }

		        Thread.sleep(3000);

		        driver.navigate().to("https://www.amazon.in/");
		        Thread.sleep(2000);
		        System.out.println(driver.getTitle());
		        driver.navigate().back();
		        driver.navigate().forward();
		        driver.navigate().refresh();
		        driver.close();
		        
		    }
		    
		    
		  
		}
		

	
