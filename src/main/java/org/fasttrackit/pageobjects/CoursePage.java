package org.fasttrackit.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoursePage {

    @FindBy(xpath = "//td//a[contains(@style, '266B5')]")
    private WebElement inscrie_teButtonForJavaCurs;

    @FindBy(className = "freebirdFormviewerViewHeaderTitleRow")
    private WebElement msgForInscriereJava;

    @FindBy(xpath = "//a[contains(@style, 'EE1616')]")
    private WebElement inscrie_teButtonForJavaCursAcreditat;

    @FindBy(xpath = " //a[contains(@style, '#000')]")
    private WebElement inscrie_teButtonForCursWebDeveloper;

    @FindBy(xpath = " //a[contains(@style, '#A70027')]")
    private WebElement inscrie_teButtonForCursWebDeveloperAcreditat;

    @FindBy(xpath = "//a[contains(@style, '5ADAFD')]")
    private WebElement inscrie_teButtonForCursWebDeveloperReactJS;

    @FindBy(xpath = "//a[contains(@style, '2671CA')]")
    private WebElement inscrie_teButtonForCursWebDeveloperReactJSAcreditat;

    @FindBy(xpath = "//a[contains(@style, '5ADAFD')]")
    private WebElement inscrie_teButtonForCursNodeJS;

    @FindBy(xpath = "//a[contains(@style, '8ACA41')]")
    private WebElement inscrie_teButtonForCursNodeJSAcreditat;

    @FindBy(xpath = "////a[contains(@style, '3798D2')]")
    private WebElement inscrie_teButtonForCursCNet;


    public WebElement getInscrie_teButtonForCursCNet() {
        return inscrie_teButtonForCursCNet;
    }

    public WebElement getInscrie_teButtonForCursNodeJSAcreditat() {
        return inscrie_teButtonForCursNodeJSAcreditat;
    }

    public WebElement getInscrie_teButtonForCursNodeJS() {
        return inscrie_teButtonForCursNodeJS;
    }

    public WebElement getInscrie_teButtonForCursWebDeveloperReactJSAcreditat() {
        return inscrie_teButtonForCursWebDeveloperReactJSAcreditat;
    }

    public WebElement getInscrie_teButtonForCursWebDeveloperReactJS() {
        return inscrie_teButtonForCursWebDeveloperReactJS;
    }

    public WebElement getInscrie_teButtonForCursWebDeveloperAcreditat() {
        return inscrie_teButtonForCursWebDeveloperAcreditat;
    }

    public WebElement getInscrie_teButtonForCursWebDeveloper() {
        return inscrie_teButtonForCursWebDeveloper;
    }

    public WebElement getInscrie_teButtonForJavaCursAcreditat() {
        return inscrie_teButtonForJavaCursAcreditat;
    }

    public WebElement getMsgForInscriereJava() {
        return msgForInscriereJava;
    }

    public WebElement getInscrie_teButtonForJavaCurs() {
        return inscrie_teButtonForJavaCurs;
    }
}
