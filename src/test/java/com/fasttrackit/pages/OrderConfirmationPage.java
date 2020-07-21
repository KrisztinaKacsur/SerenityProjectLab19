package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class OrderConfirmationPage extends PageObject {

    @FindBy(css = ".page-title h1")
    private WebElementFacade successMessage;

    @FindBy(css = ".button[title='Continue Shopping']")
    private WebElementFacade continueShoppingButton;

    public boolean orderConfirmed(){
        withTimeoutOf(Duration.ofSeconds(5)).waitFor(continueShoppingButton);
        return successMessage.containsOnlyText("YOUR ORDER HAS BEEN RECEIVED.");
    }
}
