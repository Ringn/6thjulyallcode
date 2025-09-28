package pom_Base_Utility_Classess;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class 
{
	WebDriver driver;
	
	public void ob() 
	{
		driver=new ChromeDriver();
		driver.get("https://www.sci.gov.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		
	}
	
	

}
