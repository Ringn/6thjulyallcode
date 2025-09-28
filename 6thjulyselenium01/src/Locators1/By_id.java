package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_id {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement s1=driver.findElement(By.id("email"));//Xpath by id
		//for that use//*[id='id value'] in a inspect
		s1.sendKeys("ashvaghosh@gmail");
		
		
	}

}

