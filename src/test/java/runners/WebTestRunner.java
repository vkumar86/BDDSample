package runners;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.cucumber.testng.CucumberOptions;
import utilities.ThreadManager;

@CucumberOptions(
        plugin = {"json:target/results/regression/cucumber-report.json",  "html:target/results/regression"},
        features = "src/test/resources/features",
        glue = "steps",
        tags = {"@testvinodDemo"}



)
public class WebTestRunner extends BaseTestRunner
{
	@BeforeClass (alwaysRun=true)
    @Parameters({"browserName"})
    public void beforeClass(String browserName)
    {
        ThreadManager.setBrowser("remote chrome89");
    }

}


