package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class Suprime_Court_of_IndiaLast_Page {
	WebDriver driver;
	@FindBy(xpath="//input[@name='diary_no']") private WebElement diary_no;
	@FindBy(xpath="//span[@class='select2-selection__rendered']") private WebElement diary_year;
	@FindBy(xpath="//li[text()='2022']") private WebElement diary_Popup;
	@FindBy(xpath="//input[@name='submit']") private WebElement Sbutton;

	public Suprime_Court_of_IndiaLast_Page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public void LogIn_on_SC() throws InterruptedException 
	{
		
		diary_no.sendKeys("18423");
		Thread.sleep(2000);
		
        Actions act=new Actions(driver);
		
		act.click(diary_year).perform();
		
		for(int i=1;i<=3;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(2000);
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
			
		
	}
	
	
	
	public void SearchButton() throws InterruptedException 
	{
		
	Sbutton.click();
	
	Thread.sleep(20000);
		
	}
	
	

}

