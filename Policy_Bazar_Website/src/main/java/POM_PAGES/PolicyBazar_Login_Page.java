package POM_PAGES;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PolicyBazar_Login_Page {
	
	@FindBy(xpath="//div[text()='My Account']")private WebElement MyAccount; 
    @FindBy(xpath="//input[@id='1']")private WebElement name;
    
}
