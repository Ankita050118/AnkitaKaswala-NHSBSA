package uk.nhs.nhsbsa.services.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.nhs.nhsbsa.services.utility.Utility;

/***
 * Created by Ankita
 */

public class HomePage extends Utility {

    /**
     * logger to print the logs
     */

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    /**
     * locators saved for web elements
     */

    @FindBy(xpath = "//input[@id='next-button']")
    WebElement _startTab;

    @FindBy(xpath = "//label[@id='label-wales']")
    WebElement _walesRBtn;

    @FindBy(xpath = "//input[@id='next-button']")
    WebElement _walesNextRBtn;

    @FindBy(xpath = "//input[@id='dob-day']")
    WebElement _dateField;

    @FindBy(xpath = "//input[@id='dob-month']")
    WebElement _monthField;

    @FindBy(xpath = "//input[@id='dob-year']")
    WebElement _yearField;

    @FindBy(xpath = "//input[@id='next-button']")
    WebElement _calenderNextBtn;

    @FindBy(xpath = "//label[@id='label-no']")
    WebElement _notLiveWithPartnerBtn;

    @FindBy(xpath = "//input[@id='next-button']")
    WebElement _nextLiveWithPartnerBtn;

    @FindBy(xpath = "//label[@id='label-no']")
    WebElement _notClaimBenefitBtn;

    @FindBy(xpath = "//input[@id='next-button']")
    WebElement _nextClaimBenefitBtn;

    @FindBy(xpath = "//label[@id='label-no']")
    WebElement _notPregnantBtn;

    @FindBy(xpath = "//input[@id='next-button']")
    WebElement _nextPregnantBtn;

    @FindBy(xpath = "//label[@id='label-no']")
    WebElement _notInjuryBtn;

    @FindBy(xpath = "//input[@id='next-button']")
    WebElement _nextInjuryBtn;

    @FindBy(xpath = "//label[@id='label-no']")
    WebElement _notDiabetesBtn;

    @FindBy(xpath = "//input[@id='next-button']")
    WebElement _nextDiabetesBtn;

    @FindBy(xpath = "//label[@id='label-no']")
    WebElement _notGlaucomaBtn;

    @FindBy(xpath = "//input[@id='next-button']")
    WebElement _nextGlaucomaBtn;

    @FindBy(xpath = "//label[@id='label-no']")
    WebElement _notLiveCareHomeBtn;

    @FindBy(xpath = "//input[@id='next-button']")
    WebElement _nextCareHomeBtn;

    @FindBy(xpath = "//label[@id='label-no']")
    WebElement _notSavingMoreThenSixteenThousand;

    @FindBy(xpath = "//input[@id='next-button']")
    WebElement _nextSavingBtn;

    @FindBy(xpath = "//h2[@id='FREE-heading']")
    WebElement _helpText;


    public void clickingOnStartButton() {
        Reporter.addStepLog("Clicking on start button :  " + _startTab.toString());
        clickOnElement(_startTab);
        log.info("Clicking on start button :  " + _startTab.toString());
    }

    public void clickOnLiveInWalesButton() {
        Reporter.addStepLog("Clicking on live in wales button :  " + _walesRBtn.toString());
        clickOnElement(_walesRBtn);
        log.info("Clicking on live in wales button :  " + _walesRBtn.toString());
    }

    public void clickOnWalesNextButton() {
        Reporter.addStepLog("Clicking on wales next button :  " + _walesNextRBtn.toString());
        clickOnElement(_walesNextRBtn);
        log.info("Clicking on wales next button :  " + _walesNextRBtn.toString());
    }

    public void enterDateOfTheBirth(String date) {
        Reporter.addStepLog("Enter date of the birth to the field :   " + _dateField.toString());
        sendTextToElement(_dateField, date);
        log.info("Enter date of the birth to field :   " + _dateField.toString());
    }


    public void enterMonthOfTheBirth(String month) {
        Reporter.addStepLog("Enter month of the birth to the field :   " + _monthField.toString());
        sendTextToElement(_monthField, month);
        log.info("Enter month of the birth to the field :   " + _monthField.toString());
    }

    public void enterYearOfTheBirth(String year) {
        Reporter.addStepLog("Enter year of the birth to the field :   " + _yearField.toString());
        sendTextToElement(_yearField, year);
        log.info("Enter year of the birth to the field :   " + _yearField.toString());
    }


    public void clickOnCalenderNextButton() {
        Reporter.addStepLog("Clicking on calender next button :  " + _calenderNextBtn.toString());
        clickOnElement(_calenderNextBtn);
        log.info("Clicking on calender next button :  " + _calenderNextBtn.toString());
    }


    public void clickOnLiveWithNotPartnerButton() {
        Reporter.addStepLog("Clicking on living with no partner button :  " + _notLiveWithPartnerBtn.toString());
        clickOnElement(_notLiveWithPartnerBtn);
        log.info("Clicking on living with no partner button :  " + _notLiveWithPartnerBtn.toString());
    }

    public void clickOnPartnerNextButton() {
        Reporter.addStepLog("Clicking on partner next button :  " + _nextLiveWithPartnerBtn.toString());
        clickOnElement(_nextLiveWithPartnerBtn);
        log.info("Clicking on partner next button :  " + _nextLiveWithPartnerBtn.toString());
    }

    public void clickingOnNotClaimButton() {
        Reporter.addStepLog("Clicking on no claim button :  " + _notClaimBenefitBtn.toString());
        clickOnElement(_notClaimBenefitBtn);
        log.info("Clicking on no claim button :  " + _notClaimBenefitBtn);
    }

    public void clickOnClaimNextButton() {
        Reporter.addStepLog("Clicking on next claim button :  " + _nextClaimBenefitBtn.toString());
        clickOnElement(_nextClaimBenefitBtn);
        log.info("Clicking on next claim button :  " + _nextClaimBenefitBtn.toString());
    }


    public void clickingOnNotPregnancyButton() {
        Reporter.addStepLog("Clicking on no pregnancy button :  " + _notPregnantBtn.toString());
        clickOnElement(_notPregnantBtn);
        log.info("Clicking on no pregnancy button :  " + _notPregnantBtn.toString());
    }
    public void clickingOnPregnancyNextButton() {
        Reporter.addStepLog("Clicking on pregnancy next button :  " + _nextPregnantBtn.toString());
        clickOnElement(_nextPregnantBtn);
        log.info("Clicking on pregnancy next button :  " + _nextPregnantBtn.toString());
    }
    public void clickingOnNotInjuryButton() {
        Reporter.addStepLog("Clicking on no injury button :  " + _notInjuryBtn.toString());
        clickOnElement(_notInjuryBtn);
        log.info("Clicking on no injury button :  " + _notInjuryBtn.toString());
    }
    public void clickingOnInjuryNextButton() {
        Reporter.addStepLog("Clicking on no injury next button :  " + _nextInjuryBtn.toString());
        clickOnElement(_nextInjuryBtn);
        log.info("Clicking on no injury next button :  " + _nextInjuryBtn.toString());
    }
    public void clickingOnNotDiabetesButton() {
        Reporter.addStepLog("Clicking on no diabetes button :  " + _notDiabetesBtn.toString());
        clickOnElement(_notDiabetesBtn);
        log.info("Clicking on no diabetes button :  " + _notDiabetesBtn.toString());
    }

    public void clickingOnNotDiabetesNextButton() {
        Reporter.addStepLog("Clicking on no diabetes next button :  " + _nextDiabetesBtn.toString());
        clickOnElement(_nextDiabetesBtn);
        log.info("Clicking on no diabetes next button :  " + _nextDiabetesBtn.toString());
    }

    public void clickingOnNotGlaucomaButton() {
        Reporter.addStepLog("Clicking on no glaucoma button :  " + _notGlaucomaBtn.toString());
        clickOnElement(_notGlaucomaBtn);
        log.info("Clicking on no glaucoma button :  " + _notGlaucomaBtn.toString());
    }

    public void clickingOnNotGlaucomaNextButton() {
        Reporter.addStepLog("Clicking on no glaucoma next button :  " + _nextGlaucomaBtn.toString());
        clickOnElement(_nextGlaucomaBtn);
        log.info("Clicking on no glaucoma next button :  " + _nextGlaucomaBtn.toString());
    }

    public void clickingOnNotLiveInCareHomeButton() {
        Reporter.addStepLog("Clicking on no care home button :  " + _notLiveCareHomeBtn.toString());
        clickOnElement(_notLiveCareHomeBtn);
        log.info("Clicking on no care home button :  " + _notLiveCareHomeBtn.toString());
    }

    public void clickingOnNotLiverInCareHomeNextButton() {
        Reporter.addStepLog("Clicking on care home next button :  " + _nextCareHomeBtn.toString());
        clickOnElement(_nextCareHomeBtn);
        log.info("Clicking on care home next button :  " + _nextCareHomeBtn.toString());
    }


    public void clickingOnSavingNotMoreThenSixteenThousandButton() {
        Reporter.addStepLog("Clicking on no saving button :  " + _notSavingMoreThenSixteenThousand.toString());
        clickOnElement(_notSavingMoreThenSixteenThousand);
        log.info("Clicking on no saving button :  " + _notSavingMoreThenSixteenThousand.toString());
    }

    public void clickingOnSavingNextButton() {
        Reporter.addStepLog("Clicking on next saving button :  " + _nextSavingBtn.toString());
        clickOnElement(_nextSavingBtn);
        log.info("Clicking on next saving button :  " + _nextSavingBtn.toString());
    }

    public String getHelpText() {
        Reporter.addStepLog("Getting help text " + _helpText.toString());
        log.info("Getting help Text " + _helpText.toString());
        return getTextFromElement(_helpText);
    }
}
