package flipkart;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_BaseClass 
{
	public WebDriver driver;
	public void openbrowser()
	{
		driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	
	
	
	}

}
