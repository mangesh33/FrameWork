package FrameWork.FrameWork;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test3 {
	
	
	
	@Test(dataProvider="logindata")
	public void loginData(String email,int pass)
	{
		System.out.println(email+" "+pass);
	}
	
	
	@DataProvider(name="logindata")
	public Object[][] getData()
	{
		   Object[][] data= {{"mangesh@gmail.com",123},{"dinesh@gmail.com",456},{"supriya@gmail.com",798},{"rachana@gmail.com",1011}};
		   return data;
	}
	
	

}
