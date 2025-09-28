package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
		features= {"C:\\Users\\Pratiksha\\Desktop\\NewProjectRest\\6thjuly_BDD\\src\\test\\resources\\file\\Scenario_Outline.feature"},
		glue= {"Steps"}
		)
public class ScenarioOutline extends AbstractTestNGCucumberTests
{

}
