package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.CheckoutPage;
import com.fasttrackit.pages.OrderConfirmationPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CheckoutSteps {

    private CheckoutPage checkoutPage;
    private OrderConfirmationPage orderConfirmationPage;

    @Step
    public void placeOrder (){
        checkoutPage.clickBillingContinue();
        checkoutPage.clickFixedShipping();
        checkoutPage.clickShippingMethodContinue();
        checkoutPage.clickPaymentContinue();
        checkoutPage.clickPlaceOrder();
    }

    @Step
    public void verifyOrderReceived() {
        Assert.assertTrue(orderConfirmationPage.orderConfirmed());

    }

}
