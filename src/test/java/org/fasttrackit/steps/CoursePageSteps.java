package org.fasttrackit.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.CoursePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CoursePageSteps extends TestBase {

    CoursePage cursPage = PageFactory.initElements(driver, CoursePage.class);


    @When("^I click INSCRIE-TE button from Curs Java Acreditat section$")
    public void iClickINSCRIETEButtonFromCursJavaAcreditatSection() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//strong//em")));
        actions.perform();
        cursPage.getInscrie_teButtonForJavaCursAcreditat().click();
    }

    @When("^I click INSCRIE-TE button from Curs Java section$")
    public void iClickINSCRIETEButtonFromCursJavaSection() throws InterruptedException {
        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//strong//em")));
        actions.perform();

        cursPage.getInscrie_teButtonForJavaCurs().click();


    }

    @Then("^I expect to be redirected to the sign up page$")
    public void iExpectToBeRedirectedToTheSignUpPage() throws InterruptedException {
        Thread.sleep(1000);


        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.switchTo().window(tabs2.get(0));
        driver.switchTo().window(tabs2.get(1));

        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("firs size of iframe" + size);
        driver.switchTo().frame(0);
        waitForPageToLoad(4000);

        String successMessage = cursPage.getMsgForInscriereJava().getText();
        System.out.println("*******" + successMessage + "***********");
        String expectMessage = "Inscriere Java";

        int size2 = driver.findElements(By.tagName("iframe")).size();
        System.out.println("second size of iframe = " + size2);
        assertThat("I can't sing up", successMessage, is(expectMessage));
    }

    @When("^I click INSCRIE-TE button from Curs Web Developer section$")
    public void iClickINSCRIETEButtonFromCursWebDeveloperSection() {

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//strong//em")));
        actions.perform();
        cursPage.getInscrie_teButtonForCursWebDeveloper().click();

    }

    @Then("^I expect to be redirected to the sign up page in Curs Web Developer$")
    public void iExpectToBeRedirectedToTheSignUpPageInCursWebDeveloper() throws InterruptedException {

        Thread.sleep(2000);
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.switchTo().window(tabs2.get(0));
        driver.switchTo().window(tabs2.get(1));

        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("firs size of iframe" + size);
        driver.switchTo().frame(0);
        waitForPageToLoad(4000);


        String successMessage = cursPage.getMsgForInscriereJava().getText();
        System.out.println("*******" + successMessage + "***********");
        String expectMessage = "Inscriere Web developer";
        assertThat("I can't sing up", successMessage, is(expectMessage));

    }

    @When("^I click INSCRIE-TE button from Curs Web Developer Acreditat section$")
    public void iClickINSCRIETEButtonFromCursWebDeveloperAcreditatSection() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//strong//em")));
        actions.perform();

        cursPage.getInscrie_teButtonForCursWebDeveloperAcreditat().click();
    }

    @When("^I click INSCRIE-TE button from Curs Web Developer React JS Oriented section$")
    public void iClickINSCRIETEButtonFromCursWebDeveloperReactJSOrientedSection() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//strong//em")));
        actions.perform();

        cursPage.getInscrie_teButtonForCursWebDeveloperReactJS().click();

    }

    @When("^I click INSCRIE-TE button from Curs Web Developer React JS Oriented Acreditat section$")
    public void iClickINSCRIETEButtonFromCursWebDeveloperReactJSOrientedAcreditatSection() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//strong//em")));
        actions.perform();

        cursPage.getInscrie_teButtonForCursWebDeveloperReactJSAcreditat().click();

    }

    @When("^I click INSCRIE-TE button from Curs Node JS section$")
    public void iClickINSCRIETEButtonFromCursNodeJSSection() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//strong//em")));
        actions.perform();

        cursPage.getInscrie_teButtonForCursNodeJS().click();
    }

    @Then("^I expect to be redirected to the sign up page in Curs Node JS$")
    public void iExpectToBeRedirectedToTheSignUpPageInCursNodeJS() throws InterruptedException {

        Thread.sleep(2000);
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.switchTo().window(tabs2.get(0));
        driver.switchTo().window(tabs2.get(1));

        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("firs size of iframe" + size);
        driver.switchTo().frame(0);

        waitForPageToLoad(4000);
        String successMessage = cursPage.getMsgForInscriereJava().getText();
        System.out.println("*******" + successMessage + "***********");
        String expectMessage = "Inscriere Node-JS";
        assertThat("I can't sing up", successMessage, is(expectMessage));


    }

    @When("^I click INSCRIE-TE button from Curs Node JS Acreditat section$")
    public void iClickINSCRIETEButtonFromCursNodeJSAcreditatSection() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//strong//em")));
        actions.perform();

        cursPage.getInscrie_teButtonForCursNodeJSAcreditat().click();

    }

    @When("^I click INSCRIE-TE button from Curs C# Net section$")
    public void iClickINSCRIETEButtonFromCursCNetSection() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//strong//em")));
        actions.perform();

        cursPage.getInscrie_teButtonForCursCNet().click();

    }

    @Then("^I expect to be redirected to the sign up page in Curs C# Net$")
    public void iExpectToBeRedirectedToTheSignUpPageInCursCNet() throws InterruptedException {

        Thread.sleep(2000);
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.switchTo().window(tabs2.get(0));
        driver.switchTo().window(tabs2.get(1));

        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("firs size of iframe" + size);
        driver.switchTo().frame(0);

        waitForPageToLoad(4000);
        String successMessage = cursPage.getMsgForInscriereJava().getText();
        System.out.println("*******" + successMessage + "***********");
        String expectMessage = "Inscriere C# .NET";
        assertThat("I can't sing up", successMessage, is(expectMessage));
    }
}
