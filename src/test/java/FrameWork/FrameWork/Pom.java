package FrameWork.FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	
	
	WebDriver driver;
	//create constructor
	
	Pom(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver,this);		
	}
	
	//identify Webelement  //https://www.saucedemo.com/
	
	
	@FindBy(id="email") WebElement username;
	@FindBy(id="pass") WebElement pass;
	@FindBy(name="login") WebElement loginb;	

	
	//operations on the WebElement-passing data in textbox and click login button
	
	
	public void enterusername(String uname)
	{
		username.sendKeys(uname);
	}

	
	public void enterpassword(String password)
	{
		pass.sendKeys(password);
	}
	
	
	
	public void clicklogn()
	{
		loginb.click();
		
	}
	
}
	
	
	
	
	
	


