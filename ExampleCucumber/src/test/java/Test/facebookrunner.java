package Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features= {"src\\test\\resources\\Features\\Facebooklogin.feature"},	
	
	glue= {"StepDefination"},
	
	 plugin = {"pretty", "html:target/cucumber-report.html"},
	    monochrome = true
	
	
	
)
public class facebookrunner extends AbstractTestNGCucumberTests 
{
	

}
