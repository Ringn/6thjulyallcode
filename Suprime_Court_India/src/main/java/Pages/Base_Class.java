package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	
	public WebDriver driver;
	
	public void Browser() 
	{
	 driver=new ChromeDriver();
	 driver.get("https://www.sci.gov.in/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

}
