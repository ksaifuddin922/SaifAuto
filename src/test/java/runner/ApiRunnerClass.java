package runner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(features = "src/test/java/apifeatures/demofeaturefile.feature", 
glue = {"src/test/java/apistepdefination" },
plugin = "json:target/cucumber-reports/CucumberTestReport.json")
//tags = "@test")

public class ApiRunnerClass extends AbstractTestNGCucumberTests {
	private TestNGCucumberRunner testNGCucumberRunner;

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());

	}

}
