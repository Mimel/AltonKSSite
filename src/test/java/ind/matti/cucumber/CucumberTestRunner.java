package ind.matti.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features="features/test.feature", glue="ind.matti.cucumber")
@RunWith(Cucumber.class)
public class CucumberTestRunner {

}
