package POM_Class_BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassCandy 
{
	public WebDriver driver;
	
	public void openb()
	{
		driver=new ChromeDriver();
		driver.get("https://candymapper.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}

}
