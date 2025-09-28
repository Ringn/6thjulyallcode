import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LISTbox {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s1= new Select(month);
		
		//s1.selectByIndex(11);
		//System.out.println(s1.isMultiple());
		//WebElement first = s1.getFirstSelectedOption();
		//System.out.println(first.getText());
		List<WebElement> all = s1.getOptions();
		
		for(WebElement s2:all)
		{
			System.out.println(s2.getText());
		}
		
	}

}
