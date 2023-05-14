package FrameWork.FrameWork;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class PomControlClass {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Pom p=new Pom(driver);
		//Pom p1=new Pom(driver);

	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	   
		
		p.enterusername("iammangeshmane");
		p.enterpassword("Mangesh@33");
		p.clicklogn();
		
		
		
		
		

	}

}
