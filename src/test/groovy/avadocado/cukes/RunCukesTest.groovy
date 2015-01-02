package avadocado.cukes

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber

import org.junit.runner.RunWith

@RunWith(Cucumber)
@CucumberOptions(
	format=["pretty", "html:build/reports/cucumber"],
	strict=true,
	features=["src/test/cucumber/feature"],
	glue=["src/test/cucumber/step", "src/test/cucumber/support"]
	,tags=["~@manual", "~@review"]
	)
	public class RunCukesTest {
		
	}