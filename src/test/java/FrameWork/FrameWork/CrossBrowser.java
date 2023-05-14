package FrameWork.FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	
	WebDriver driver;
	
	
	@BeforeMethod
	@Parameters("browser")
	 public void launchB(String browser)
	 {
		 switch(browser.toLowerCase()) 
		 {
		     
			 
			 
		 case "firefox":WebDriverManager.firefoxdriver().setup();
			            driver=new FirefoxDriver();
			            break;
			 
			 
		 case "chrome":
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 break;
			 
		  
			 default:
			       driver=null;
			       break;	    	 
			 
					 
		 
		 
		 } 
		 
	 }
	
	@Test
	public void openURL()
	{
	    driver.get("https://www.amazon.com");
	}
	
	
	
   @AfterMethod	
	public void closebrowser()
	{
		driver.quit();
		
	}
	
	
	
	
	
}
