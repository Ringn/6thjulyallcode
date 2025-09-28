package gui;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Check_GUI 
{
	@FindBy(xpath="//input[@id='name']")private WebElement EnterName;
	@FindBy(xpath="//input[@id='email']")private WebElement EnterEmail;
    
	WebDriverWait wait;
	public Check_GUI(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	}
	
	public boolean verifyEnternameTextBox()
	{
		boolean result1 = EnterName.isDisplayed();
		return result1;
		
	}
	
	public boolean verifyEnterEmailTextBox()
	{
		
		boolean result2 = EnterEmail.isDisplayed();
		return result2;
	}
	
	public String EnterValueInNameTextBox()
	{
		wait.until(ExpectedConditions.visibilityOf(EnterName));
		EnterName.sendKeys("Ashvaghosh");
		String type1 = EnterName.getAttribute("type");
		
        return type1;
        
	}
	
	public String EnterValueInEmailTextBox()
	{
		wait.until(ExpectedConditions.visibilityOf(EnterEmail));
        EnterEmail.sendKeys("adr@gmail");
		String type2 = EnterEmail.getAttribute("type");


        return type2;
        
	}
	
	

}
