package candy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.candymapper.net/");
		Thread.sleep(20000);
		driver.findElement(By.xpath("(//div[@id='comp-lvxz6wtx']//div[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		
	}

}
