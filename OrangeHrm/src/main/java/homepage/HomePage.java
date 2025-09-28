package homepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="//input[@placeholder='Search']")private WebElement search; 
	@FindBy(xpath="//ul[@class='oxd-main-menu']//li")private List<WebElement> list; 
	@FindBy(xpath="(//li[@class='oxd-main-menu-item-wrapper'])[5]")private WebElement claim; 

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);

	}
	public void homepagetest() throws InterruptedException
	{
		search.sendKeys("c");
		
		for(WebElement li:list)
		{
			Thread.sleep(2000);
			System.out.println(li.getText());
			
		}
		
	}
	
	public void homepagecliambutton() throws InterruptedException
	{
		
		claim.click();
		
	}
}
