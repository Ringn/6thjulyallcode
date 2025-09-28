package Login_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
 public WebDriver driver;
 
 public void ob() throws InterruptedException
 {
	 driver=new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
 }
	
}
