package FrameWork.FrameWork;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups="sanity")
	public void sanity1()
	{
		System.out.println("sanity1 test case");
		
	}
	
	@Test(groups="Regration")
	public void Regration1()
	{	
		System.out.println("Regration1 test case");
		
	}
	
	
	@Test(groups="sanity")
	public void sanity2()
	{
		System.out.println("sanity2 test case");
		
	}
	
	
	
	@Test(groups="Regration")
	public void Regration2()
	{
		System.out.println("Regration2 test case");
		
	}
	
	
	             //here test cases are executed as per alaphabetic order
	
	
	
	
	
}
