package FrameWork.FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {
	
	
	@Test
	public void t1()
	{
		//hard assert
		
		/*
		 
	     Assert.assertEquals("ABC","ABC");
	     Assert.assertNotEquals("ABC","abc");
	     Assert.assertTrue(true);
	     Assert.assertFalse(false);

	     System.out.println("call frequency will increses from monday");
	     
	      */ 
	     
	   //soft assert /Verify
	     
	  /*   
	     SoftAssert soft=new SoftAssert();
	     
	     soft.assertEquals("abc", "abc");
	     soft.assertNotEquals("abc", "prq");
	     soft.assertTrue(true);
	     soft.assertFalse(false);

	     
	     System.out.println("call frequency will increses from monday");

	     soft.assertAll();
	     
	     */
		
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String exp="Google" ;
		String act=driver.getTitle();
		
			Assert.assertEquals(act, exp);
			
			System.out.println("Title displayed");
			
			
			
			
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
