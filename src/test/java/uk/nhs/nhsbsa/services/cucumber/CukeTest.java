package uk.nhs.nhsbsa.services.cucumber;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

/**
 * Created by Ankita
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        plugin = {"json:target/RunCuke/cucumber.json",
                "pretty", "html:target/cucumber-report/cucumber.html",
                "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html"},
        monochrome = true
)
public class CukeTest {
    @AfterClass
    public static void setup() {
        String projectPath = System.getProperty("user.dir");
        //generates extent report in the given path
        String reportConfigPath = projectPath + "/src/test/java/uk/nhs/nhsbsa/" +
                "services/resources/extentreport/extent-config.xml";
        //using the reporter from cucumber.listener
        Reporter.loadXMLConfig(reportConfigPath);

        //The below code generates  details of environment information
        //System.getProperty gets system name and system timezone
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
        Reporter.setSystemInfo("Selenium", "3.141.59");
        Reporter.setSystemInfo("Maven", "3.5.2");
        Reporter.setSystemInfo("Java Version", "1.8.0_151");
    }

}
