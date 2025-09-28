package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FacebookLoginPage;

public class FacebookloginSteps   
{
	FacebookLoginPage lp;
	

@Given("user is at the login page")
public void user_is_at_the_login_page() 
{
    lp=new FacebookLoginPage(Facebookloginhooks .driver);
}

@When("user enters the username {string}")
public void user_enters_the_username(String string) throws InterruptedException
{
    lp.Enteruid(string);
    Thread.sleep(2000);
}
@When("user enters the password {string}")
public void user_enters_the_password(String string) throws InterruptedException 
{
	 lp.Enterpw(string);
	    Thread.sleep(2000);
	    
}

@When("user clik on login button")
public void user_clik_on_login_button() throws InterruptedException 
{
    lp.clickonloginb();
    Thread.sleep(5000);
}

@Then("user should login")
public void user_should_login() 
{
    System.out.println("hiiiiiiiii");
}

}
