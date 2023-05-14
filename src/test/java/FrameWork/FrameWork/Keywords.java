package FrameWork.FrameWork;

import org.testng.annotations.Test;

public class Keywords {
	
	
	/*
	
	//@Test(invocationCount=3)
	//@Test(priority=1)
	//@Test(priority=1)
	@Test(enabled=true)
	public void td()
	{
		System.out.println("run td");
	}
	
	
	
	//@Test(priority=0)
	//@Test(priority=1)
	//@Test(enabled=false)
	@Test(description="this is it")
	public void tm()
	{
		System.out.println("run tm");
	}
	
	
	
	
	
	//@Test(priority=3)                              //@Test not given then it will not consider as test case so not execute
	//@Test(priority=1)
	@Test(enabled=true)
	public void ta()
	{
		System.out.println("run ta");
	}
	
	@Test(timeOut=50)
	public void tb() throws InterruptedException
	{
		System.out.println("run tb");
		Thread.sleep(2000);
		
	}
	
	
	
	
	*/
	
	@Test
	public void t4()	{
		System.out.println("run t4");
		
	}
	
	
	@Test(dependsOnMethods= {"t4"})
	public void t3()
	{
		System.out.println("run t3");
		
	}
	
	
	
	
	

}
