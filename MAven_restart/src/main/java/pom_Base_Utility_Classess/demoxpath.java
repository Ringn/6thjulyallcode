package pom_Base_Utility_Classess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoxpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sci.gov.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='gen-card-content'])[2]")).click();
		
		
	}

}
