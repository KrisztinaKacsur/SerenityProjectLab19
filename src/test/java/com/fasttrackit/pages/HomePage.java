package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = ".skip-account")
    private WebElementFacade accountLink;

    @FindBy(css = "[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(id = "search")
    private WebElementFacade searchField;

    @FindBy(css = ".search-button")
    private WebElementFacade searchButton;


    public void clickAccountLink() {
        clickOn(accountLink);
    }

    public void clickOnLoginLink() {
        clickOn(loginLink);
    }

    public void setSearchField(String productName) {
        typeInto(searchField, productName);
    }

    public void clickSearchButton(){
        clickOn(searchButton);
    }

    public void search(String productName) {
        setSearchField(productName);
        clickSearchButton();
    }


}
