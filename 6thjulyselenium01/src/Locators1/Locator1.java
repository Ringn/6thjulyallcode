package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		//what is locator:-locator is use to find the webelement 
		//there are 8 types of locator
		//1.tagname2.name3.id.4.classname5.linktext6.partiallink text
		//7.xpath8.css selector
		//we can  find the address of elemnet using findelement method
		//return type of findeelemnt is webelement
		Thread.sleep(2000);
		
		 WebElement s1 = driver.findElement(By.xpath("//input[@name='username']"));
				s1.sendKeys("7744838574");
				Thread.sleep(2000);
				
		driver.findElement(By.linkText("Sign up")).click();
		
		
		
	}

}
