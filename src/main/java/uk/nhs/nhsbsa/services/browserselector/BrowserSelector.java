package uk.nhs.nhsbsa.services.browserselector;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import uk.nhs.nhsbsa.services.basepage.BasePage;

/***
 * Created by Ankita
 */

public class BrowserSelector extends BasePage {

    /**
     * logger to print the logs
     */
    private static final Logger log = LogManager.getLogger(BrowserSelector.class.getName());

    /**
     * Project path to get property of user directory
     */
    String projectPath = System.getProperty("user.dir");

    /**
     * Below code to run programme in any browser
     * @param browser
     */
    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
            log.info("Launching Chrome Browser");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver.exe");
            log.info("Launching FireFox Browser");
            driver = new FirefoxDriver();
        } else {
            System.out.println("Browser is not available");
            log.info("Browser is not available");
        }
    }
}
