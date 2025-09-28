package POM_Class_BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Homepagecandy 
{
	@FindBy(xpath="//h1[@role='heading']")private WebElement Title ;
	@FindBy(xpath="(//div[@data-ux='ModalPopup']//div)[3]")private WebElement cross ;
	@FindBy(xpath="(//div[@data-aid='CONTACT_FORM_CONTAINER_REND']//input)[2]")private WebElement fname;
	@FindBy(xpath="(//div[@data-aid='CONTACT_FORM_CONTAINER_REND']//input)[3]")private WebElement lname;
	@FindBy(xpath="(//div[@data-aid='CONTACT_FORM_CONTAINER_REND']//input)[4]")private WebElement email ;
	@FindBy(xpath="(//div[@data-aid='CONTACT_FORM_CONTAINER_REND']//input)[5]")private WebElement number ;
	@FindBy(xpath="//textarea[@role='textbox']")private WebElement msg ;
	@FindBy(xpath="//form//div[@data-ux='Block']//button")private WebElement sbutton;
	@FindBy(xpath="//span[text()='Thank you for your inquiry! We will get back to you within 48 Years.']")private WebElement lastmsg ;
	WebDriverWait wait;

	
	public Homepagecandy(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	}
	
	public void Hometitlecheck()
	{
		cross.click();
		String acttitle = Title.getText();
		String tit = acttitle.replace("\n"," ");
		String ti = tit.replace("\r", "");    // remove carriage returns
       ti.trim();
		System.out.println(ti);
		String exptitle="CandyMapper:  The Website That Goes Wrong!";
		Assert.assertEquals(ti, exptitle);
	}
	public void HomeContactUsVerify(String name,String lastname,String emailid,String num,String message) throws InterruptedException
	{
		
		wait.until(ExpectedConditions.visibilityOf(fname));
		fname.sendKeys(name);
		wait.until(ExpectedConditions.visibilityOf(lname));
		lname.sendKeys(lastname);
		Thread.sleep(2000);
		email.sendKeys(emailid);
		wait.until(ExpectedConditions.visibilityOf(number));
		number.sendKeys(num);
		wait.until(ExpectedConditions.visibilityOf(msg));
		msg.sendKeys(message);
		Thread.sleep(2000);
		sbutton.click();
		sbutton.click();
		wait.until(ExpectedConditions.visibilityOf(lastmsg));

		String actm = lastmsg.getText();
	    String expm="Thank you for your inquiry! We will get back to you within 48 Years.";
		
		Assert.assertEquals(actm,expm);
	}
	
	
}
