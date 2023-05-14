package FrameWork.FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParllelBrowser {
	
	
	@Test
	public void Test1() throws InterruptedException
	{
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println("Google open");
		Thread.sleep(5000);

	}
		
		
		@Test
		public void Test2() throws InterruptedException
		{
			 
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com");
			System.out.println("flipkart open");
			Thread.sleep(5000);
			
		
		
		}
		
		
		
		
	
	
	
	
	
	
	
	

}
