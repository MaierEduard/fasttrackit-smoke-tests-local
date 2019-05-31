package org.fasttrackit.pageobjects;

import org.fasttrackit.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CursuriItOnlinePage {

    public WebElement trainerName(String trainerName) {
        return DriverManager.getDriver().findElement(By.xpath("//div[@class='pull-left']//div[contains(text(), '" + trainerName + "')]"));

    }

    public WebElement courseName(String courseName) {
        return DriverManager.getDriver().findElement(By.xpath("//div[@class='col-lg-12']//div[contains(text(), '" + courseName + "')]"));

    }

    public WebElement qaSection(String courseName) {
        return DriverManager.getDriver().findElement(By.xpath("//div[@class='col-lg-12']//div[contains(text(), '" + courseName + "')]"));
    }

    public WebElement pageTitle(String courseName) {
        return DriverManager.getDriver().findElement(By.className("course-title"));
    }


    @FindBy(className = "author-name")
    private WebElement trainersNameInQaPage;

    @FindBy(className = "course-title")
    private WebElement qaPagesAsText;


    public WebElement getTrainersNameInQaPage() {
        return trainersNameInQaPage;
    }


    public WebElement getQaPagesAsText() {
        return qaPagesAsText;
    }


}
