package SCPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass 
{
	public WebDriver driver;
	public void openBrowser()
	{
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sci.gov.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
	}

}
