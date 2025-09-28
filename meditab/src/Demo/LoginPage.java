package Demo;

public class LoginPage 
{
	@FindBy(xpath="//input[@type='TEXT']")private WebElement Clinic;
	@FindBy(xpath="(//input[@type='TEXT'])[2]")private WebElement Username;
	@FindBy(xpath="//input[@type='PASSWORD']")private WebElement Password;
	@FindBy(xpath="//Span[text()='Login']")private WebElement Login;
	
	
 public LoginPage()
 {
	 pagefactory.initElements(driver,this);
 }
 
 
 public void inClinic()
 {
	 Clinic.SendKeys("xyz");
 }
 
 public void inUsername()
 {
	 Username.SendKeys("abc");
 }
 
 public void inPassword()
 {
	 Password.SendKeys("mno");
 }
 
 public void clickLogin()
 {
	 Login.click();
 }
	
	  
	
	

}
