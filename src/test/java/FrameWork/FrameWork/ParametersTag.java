package FrameWork.FrameWork;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTag {
	
	
	
	@Parameters({"a","b"})
	@Test
	public void add(int p,int q)
	{
	  System.out.println("Addition:"+(p+q));
	}
	
	
	@Parameters({"a","b"})
	@Test
	public void sub(int p,int q)
	{
	  System.out.println("Substraction:"+(p-q));
	}

	
	
	
	
	

}
