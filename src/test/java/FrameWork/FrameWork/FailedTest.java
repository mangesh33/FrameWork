package FrameWork.FrameWork;

import org.testng.annotations.Test;

public class FailedTest {
	
	
	@Test
	public void t1()
	{
		System.out.println("selected");
	}
	
	
	
	//@Test(timeOut=100)
	@Test
	public void t2()                               //method failed here
	{    
		
		//Thread.sleep(1000);
		System.out.println("Rejected");
	}
	
	
	
	
	@Test
	public void t3()
	{
		System.out.println("Hold");
	}
	

}
