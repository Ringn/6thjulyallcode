package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(		
		features = {"C:\\Users\\Pratiksha\\Desktop\\NewProjectRest\\6thjuly_BDD\\src\\test\\resources\\file\\Logintoapp.feature"},
		
		glue = {"Steps"}			
		)

public class Login_Runner extends AbstractTestNGCucumberTests
{

}


