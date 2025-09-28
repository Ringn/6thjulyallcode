package Demo;

public class LoginTest 
{
	@Test
	public void test() 
	{
		Webdriver driver=new ChromeDriver();
		
		driver.get("https://iemodemoindia.meditab.com");
		
		driver.manage().window().maximize();
		
		LoginPage login=new LoginPage();
		
		login.inClinic(driver);
		login.inUsername(driver);
		login.inPassword(driver);
		login.clickLogin(driver);
		
		 driver.close();
	}

}
