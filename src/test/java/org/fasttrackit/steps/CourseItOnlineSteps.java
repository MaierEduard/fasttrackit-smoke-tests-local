package org.fasttrackit.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.CursuriItOnlinePage;
import org.fasttrackit.pageobjects.Header;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CourseItOnlineSteps extends TestBase {

    private CursuriItOnlinePage cursuriItOnlinePage = PageFactory.initElements(driver, CursuriItOnlinePage.class);
    private Header header = PageFactory.initElements(driver, Header.class);


    @Then("^I expect to be redirected to the right URL$")
    public void iExpectToBeRedirectedToTheRightURL() {

        String currentURL = driver.getCurrentUrl();
        String expectedURL = "https://fasttrackit.teachable.com/";
        assertThat("I'm redirected to the wrong URL", currentURL, is(expectedURL));
    }

    @When("^I click on \"([^\"]*)\" to check \"([^\"]*)\" name$")
    public void iClickOnToCheckName(String courseName, String trainerName) {
        String trainersNameInSection = cursuriItOnlinePage.trainerName(trainerName).getText();
        getStepVariables().put("Trainer Name", trainersNameInSection);
        cursuriItOnlinePage.courseName(courseName).click();
    }

    @Then("^I expect the trainer's name is the same on both locations$")
    public void iExpectTheTrainerSNameIsTheSameOnBothLocations() {
        waitForPageToLoad(60000);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(cursuriItOnlinePage.getTrainersNameInQaPage()));
        String trainerNameInQaPage = cursuriItOnlinePage.getTrainersNameInQaPage().getText();
        assertThat("The trainer's name is not the same", getStepVariables().get("Trainer Name"), is(trainerNameInQaPage));
    }


    @When("^I click on \"([^\"]*)\"$")
    public void iClickOn(String courseName) {

        String courseNameAsText = cursuriItOnlinePage.courseName(courseName).getText();
        getStepVariables().put("Course Name", courseNameAsText);
        cursuriItOnlinePage.courseName(courseName).click();

    }

    @Then("^I expect to be redirected to the \"([^\"]*)\" page$")
    public void iExpectToBeRedirectedToThePage(String course) {

        waitForPageToLoad(60000);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String coursePageTitle = cursuriItOnlinePage.pageTitle(course).getText();
        assertThat("Qa Automation page could not be accessed", getStepVariables().get("Course Name"), is(coursePageTitle));

    }
}
