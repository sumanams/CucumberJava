package stepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"stepDefinition"},
monochrome=true,
plugin= {"pretty",
		"junit:target/junitReports/report.xml",
		"json:target/junitReports/report.json",
		"html:target/junitReports/report.html"
		},
tags="@smokeTest or @regression"
)
public class TestRunner {
//tags="@smokeTest"
}
