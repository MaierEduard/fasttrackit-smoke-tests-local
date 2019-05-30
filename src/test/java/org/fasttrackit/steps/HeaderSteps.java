package org.fasttrackit.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.Header;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class HeaderSteps extends TestBase {

    Header header = PageFactory.initElements(driver,Header.class);



    @And("^I go to \"([^\"]*)\" category and I select \"([^\"]*)\" option$")
    public void iGoToCategoryAndISelect(String categoryName, String subCategoryName) {

        Actions actions = new Actions(driver);
        actions.moveToElement(header.selectCategory(categoryName, driver)).build().perform();
        header.clickSubCategory(subCategoryName, driver);

    }

}
