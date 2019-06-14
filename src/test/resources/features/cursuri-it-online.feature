Feature: Cursuri IT Online


  Scenario: Verify that when clicking on QA Manual section it redirects to right page

    Given I open the homepage
    And I click on the "CURSURI IT ONLINE" category
    When I click on "QA Manual"
    Then I expect to be redirected to the "QA Manuall" page

  Scenario: Verify that when clicking on QA Automation section it redirects to right page

    Given I open the homepage
    And I click on the "CURSURI IT ONLINE" category
    When I click on "QA Automation"
    Then I expect to be redirected to the "QA Automation" page

  Scenario: Verify that when clicking on QA Complete section it redirects to right page

    Given I open the homepage
    And I click on the "CURSURI IT ONLINE" category
    When I click on "QA Complete"
    Then I expect to be redirected to the "QA Complete" page

  Scenario: Check if the trainer's name in section QA Manual coincides with trainer's name in QA Manual Page

    Given I open the homepage
    And I click on the "CURSURI IT ONLINE" category
    When I click on "QA Manual" to check "Daniel Cosman" name
    Then I expect the trainer's name is the same on both locations


  Scenario: Check if the trainer's name in section "QA Automation" coincides with trainer's name in QA Automation Page

    Given I open the homepage
    And I click on the "CURSURI IT ONLINE" category
    When I click on "QA Automation" to check "Flaviu Ratiu" name
    Then I expect the trainer's name is the same on both locations


  Scenario: Check that when I access the "Cursuri It online" I am redirected to the right URL

    Given I open the homepage
    When I click on the "CURSURI IT ONLINE" category
    Then I expect to be redirected to the right URL