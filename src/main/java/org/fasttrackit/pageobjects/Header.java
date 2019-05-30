package org.fasttrackit.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header {

    @FindBy(id = "search")
    private WebElement searchField;

    @FindBy(className = "search-button")
    private WebElement searchButton;

    public void search(String keyword) {
        searchField.clear();
        searchField.sendKeys(keyword);
        searchButton.click();
    }


    public WebElement selectCategory(String categoryName, WebDriver driver) {
        return driver.findElement(By.xpath("//ul[@id='menu-main-menu']//a[contains(text(), '"+ categoryName +"')]"));
    }

    public WebElement subCategory(String subCategoryName, WebDriver driver) {
        return driver.findElement(By.xpath("//ul[@class='sub-menu']//a[contains(text(), '" + subCategoryName + "')]"));
    }

    public void clickSubCategory(String subCategoryName, WebDriver driver) {
        subCategory(subCategoryName,driver).click();
    }


    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }
}
