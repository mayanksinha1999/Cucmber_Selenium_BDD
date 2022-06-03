package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="C:/Users/Lenovo/OneDrive/Desktop/Cucumber/CucumverJavaBDD/src/test/resources/Features/Login.feature", 
	glue= {"steps"},
	plugin= {"json:target/cucumber.json"}
	)
public class TestRunner {

}
