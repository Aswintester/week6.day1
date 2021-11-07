package Runners; //Package should be small letter

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Feature", glue = "Steps", monochrome = true, publish = true)
public class CucumberRunner extends AbstractTestNGCucumberTests {
//AbstractTestNGCucumberTests - class to run the cucumber tests
}
