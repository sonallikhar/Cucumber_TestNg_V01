package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.CucumberOptions;

@CucumberOptions
	(
	features=".//Features",
	glue="stepdefinitions",
	dryRun=false,
	tags={"@mobile"},
	monochrome=true,
			format = {
	                "pretty",
	                "html:target1/cucumber-reports/cucumber-pretty",
	                "json:target1/cucumber-reports/CucumberTestReport.json",
	                "rerun:target1/cucumber-reports/rerun.txt"},
	plugin="json:target1/cucumber-reports/CucumberTestReport.json"
	
	)

public class TestRunner1 {
    private TestNGCucumberRunner testNGCucumberRunner;
  
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
 
    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }
}
