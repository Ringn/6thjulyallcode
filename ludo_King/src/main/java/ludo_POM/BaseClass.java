package ludo_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass 
{
	public WebDriver driver;
	@Test
	public void OB() throws InterruptedException 
	{
		driver=new ChromeDriver();
		
		driver.get("https://ludoking.com/play/");
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("//div[@id='loginCloseBtn']")).click();
	}

}
