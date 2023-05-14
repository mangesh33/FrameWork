package FrameWork.FrameWork;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfter {
	
	@Test
	public void Test()
	{
		System.out.println("Test run");
	}
	

	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method run");
	}
	
	
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Before Suite run");
	}
	
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After Class run");
	}
	
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After Method run");
	}
	
	
	

	
	@AfterTest
	public void AfterTest()
	{
		System.out.println(" After Test run ");
	}
	
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println(" Before Test run");
	}
	
	
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println(" After Suite run");
	}
	
	
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println(" Before Class run");
	}
	
	
		
	
	
}
