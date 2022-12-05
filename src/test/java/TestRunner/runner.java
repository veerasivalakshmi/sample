package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions ( features="src\test\resources\features", glue= {"Stepdefination"},
plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
"junit:target/cucumber-reports/Cucumber.xml",
"html:target/cucumber-reports.html"},
monochrome = true)


		
		
		
public class runner {

}


