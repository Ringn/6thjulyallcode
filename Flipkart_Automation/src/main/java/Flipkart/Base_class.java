package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base_class {
	
	public WebDriver driver;
	
	
	public void browser() throws InterruptedException 
	{
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		
	}

}
