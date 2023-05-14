package FrameWork.FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	
	
	WebDriver driver;
	//constructor
	
	Pom1(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver,this);		
	}
	
	
	//WebElement
	@FindBy(id="email") WebElement username;

	
	
	//action on WebElement
	
	
	
	
	
	
	

}
