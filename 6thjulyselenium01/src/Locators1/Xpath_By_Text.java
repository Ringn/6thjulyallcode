package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Text {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement s1=driver.findElement(By.xpath("//a[contains(text(), 'About')]"));
		//xpath by xpath text()
		
		Thread.sleep(2000);
		s1.click();
		

	
	
		
		
	}

}





