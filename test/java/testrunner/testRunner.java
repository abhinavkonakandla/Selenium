package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepdefinitions"},
        plugin = {"pretty","html:target/cucumber-output/cucumberreport.html"},
//        monochrome = true,
        tags = "@activity2"


)

public class testRunner {

}