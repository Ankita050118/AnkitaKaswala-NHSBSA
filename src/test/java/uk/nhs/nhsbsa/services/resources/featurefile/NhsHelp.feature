Feature: Eligibility Checker

  Scenario: As a person from Wales, I need to know what help
  I can get with my NHS costs that I can get the treatment I need

    Given I am on NHS bsa page
    When I click on start button
    And I click on wales button
    And I click on next button
    And I enter date of birth to the field"date"
    And I enter month of birth to the field"month"
    And I enter year of birth to thr field"year"
    And I click on next to calender button
    And I click on not live with partner button
    And I click on next partner button
    And I click on not claim any button
    And I click on claim next button
    And I click on not pregnant button
    And I click on pregnant page next button
    And I click on not injury button
    And I click on injury next button
    And I click on not diabetes button
    And I click on next diabetes button
    And I click on no glaucoma button
    And I click on no glaucoma next button
    And I click on no care home button
    And I click on care home next button
    And I click on not saving on the button
    And I click on saving next button
    Then I should see help text message successfully







