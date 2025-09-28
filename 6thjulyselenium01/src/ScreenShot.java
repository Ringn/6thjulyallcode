
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		
		//first we need to downcast the takescreenshot interface into driver object
		//because the interface have getscreenshotas() method
		//so the webdriver can use this method
		driver.get("https://www.facebook.com/");
		TakesScreenshot s1 = ((TakesScreenshot)driver);
		
		File src = s1.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Pratiksha\\Documents\\screenshot\\image3.png");
		FileHandler.copy(src, dest);
	    
		
	}

}
