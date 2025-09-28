package Test;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features= {"src\\test\\resources\\Features\\loginwithdifferentdataSteps.feature"},	
	
	glue= {"StepDefination"},
	
	publish = true
	
	
	
)
public class RunnerClass 
{

}
