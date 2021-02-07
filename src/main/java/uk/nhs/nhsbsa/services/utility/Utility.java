package uk.nhs.nhsbsa.services.utility;

import org.openqa.selenium.WebElement;

import uk.nhs.nhsbsa.services.basepage.BasePage;


/***
 * Created by Ankita
 */

public class Utility extends BasePage {



    /**
     * This method will click on element
     */
    public void clickOnElement(WebElement element) {
        element.click();
    }

    /**
     * This method will get text from element
     */
    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    /**
     * This method will send text on element
     */
    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);
    }





}
