package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByAttribute {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("9988765456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		
	}

}
