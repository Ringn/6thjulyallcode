package POM_Class_BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pop_up 
{
	@FindBy(xpath="(//a[@rel='noopener'])[31]")private WebElement popuplink;
	@FindBy(xpath="(//div[@id='comp-lvxz6wtx']//div[@role='button'])[2]")private WebElement cbutton;

	WebDriverWait wait;
	public Pop_up(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
	}
	
	public void PopUP_click_link() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(popuplink));
		popuplink.click();
		
		

	}
	public void PopUP_click_cross() throws InterruptedException
	{
		
		
	
		WebElement cbuttonFresh = wait.until(
		        ExpectedConditions.elementToBeClickable(
		            By.xpath("(//div[@id='comp-lvxz6wtx']//div[@role='button'])[2]")
		        )
		    );
		    cbuttonFresh.click();
		
		
	

	}
}
