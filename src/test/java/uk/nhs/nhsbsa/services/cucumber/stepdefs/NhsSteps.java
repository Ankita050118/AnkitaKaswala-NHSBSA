package uk.nhs.nhsbsa.services.cucumber.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import uk.nhs.nhsbsa.services.pages.HomePage;


/**
 * Created by Ankita
 */


public class NhsSteps {
    @Given("^I am on NHS bsa page$")
    public void iAmOnNHSBsaPage() {

    }

    @When("^I click on start button$")
    public void iClickOnStartButton() {

        new HomePage().clickingOnStartButton();
    }

    @And("^I click on wales button$")
    public void iClickOnWalesButton() {
        new HomePage().clickOnLiveInWalesButton();
    }

    @And("^I click on next button$")
    public void iClickOnNextButton() {
        new HomePage().clickOnWalesNextButton();
    }

    @And("^I enter date of birth to the field\"([^\"]*)\"$")
    public void iEnterDateOfBirthToTheField(String date) {
        new HomePage().enterDateOfTheBirth("01");
    }

    @And("^I enter month of birth to the field\"([^\"]*)\"$")
    public void iEnterMonthOfBirthToTheField(String month) {
        new HomePage().enterMonthOfTheBirth("02");
    }

    @And("^I enter year of birth to thr field\"([^\"]*)\"$")
    public void iEnterYearOfBirthToThrField(String year) {
        new HomePage().enterYearOfTheBirth("1990");
    }

    @And("^I click on next to calender button$")
    public void iClickOnNextToCalenderButton() {
        new HomePage().clickOnCalenderNextButton();
    }

    @And("^I click on not live with partner button$")
    public void iClickOnNotLiveWithPartnerButton() {
        new HomePage().clickOnLiveWithNotPartnerButton();
    }

    @And("^I click on next partner button$")
    public void iClickOnNextPartnerButton() {
        new HomePage().clickOnPartnerNextButton();
    }

    @And("^I click on not claim any button$")
    public void iClickOnNotClaimAnyButton() {
        new HomePage().clickingOnNotClaimButton();
    }

    @And("^I click on claim next button$")
    public void iClickOnClaimNextButton() {
        new HomePage().clickOnClaimNextButton();
    }

    @And("^I click on not pregnant button$")
    public void iClickOnNotPregnantButton() {
        new HomePage().clickingOnNotPregnancyButton();
    }

    @And("^I click on pregnant page next button$")
    public void iClickOnPregnantPageNextButton() {
        new HomePage().clickingOnPregnancyNextButton();
    }

    @And("^I click on not injury button$")
    public void iClickOnNotInjuryButton() {
        new HomePage().clickingOnNotInjuryButton();
    }

    @And("^I click on injury next button$")
    public void iClickOnInjuryNextButton() {
        new HomePage().clickingOnInjuryNextButton();
    }

    @And("^I click on not diabetes button$")
    public void iClickOnNotDiabetesButton() {
        new HomePage().clickingOnNotDiabetesButton();
    }

    @And("^I click on next diabetes button$")
    public void iClickOnNextDiabetesButton() {
        new HomePage().clickingOnNotDiabetesNextButton();
    }

    @And("^I click on no glaucoma button$")
    public void iClickOnNoGlaucomaButton() {
        new HomePage().clickingOnNotGlaucomaButton();
    }

    @And("^I click on no glaucoma next button$")
    public void iClickOnNoGlaucomaNextButton() {
        new HomePage().clickingOnNotGlaucomaNextButton();
    }

    @And("^I click on no care home button$")
    public void iClickOnNoCareHomeButton() {
        new HomePage().clickingOnNotLiveInCareHomeButton();
    }

    @And("^I click on care home next button$")
    public void iClickOnCareHomeNextButton() {
        new HomePage().clickingOnNotLiverInCareHomeNextButton();
    }

    @And("^I click on not saving on the button$")
    public void iClickOnNotSavingOnTheButton() {
        new HomePage().clickingOnSavingNotMoreThenSixteenThousandButton();
    }

    @And("^I click on saving next button$")
    public void iClickOnSavingNextButton() {
        new HomePage().clickingOnSavingNextButton();
    }

    @Then("^I should see help text message successfully$")
    public void iShouldSeeHelpTextMessageSuccessfully() {
        Assert.assertTrue(new HomePage().getHelpText().contains("You get free:"));
    }

}


























