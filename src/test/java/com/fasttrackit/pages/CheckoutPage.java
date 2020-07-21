package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.time.Duration;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/onepage/")
public class CheckoutPage extends PageObject {

    @FindBy(css = "#billing-buttons-container .button")
    private WebElementFacade billingInformationContinueButton;

    @FindBy(css = "[for='s_method_flatrate_flatrate']")
    private WebElementFacade shippingMethodFixedRadioButton;

    @FindBy(css = "#shipping-method-buttons-container .button")
    private WebElementFacade shippingMethodContinueButton;

    @FindBy(css = "#payment-buttons-container .button")
    private WebElementFacade paymentInfoContinueButton;

    @FindBy(css = ".btn-checkout")
    private WebElementFacade placeOrderButton;


    public void clickBillingContinue() {
        clickOn(billingInformationContinueButton);
    }

    public void clickFixedShipping() {
        clickOn(shippingMethodFixedRadioButton);
    }

    public void clickShippingMethodContinue(){
        clickOn(shippingMethodContinueButton);
    }

    public void clickPaymentContinue() {
        withTimeoutOf(Duration.ofSeconds(5)).waitFor(paymentInfoContinueButton);
        clickOn(paymentInfoContinueButton);
    }

    public void clickPlaceOrder() {
        withTimeoutOf(Duration.ofSeconds(5)).waitFor(placeOrderButton);
        clickOn(placeOrderButton);
    }
}
