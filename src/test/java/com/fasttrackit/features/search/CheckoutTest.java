package com.fasttrackit.features.search;

import com.fasttrackit.pages.SearchResultPage;
import com.fasttrackit.steps.serenity.CartSteps;
import com.fasttrackit.steps.serenity.CheckoutSteps;
import com.fasttrackit.steps.serenity.LoginSteps;
import com.fasttrackit.steps.serenity.SearchSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import util.BaseTest;
import util.Constants;

public class CheckoutTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private SearchSteps searchSteps;

    @Steps
    private CartSteps cartSteps;

    @Steps
    private CheckoutSteps checkoutSteps;

    @Test
    public void validCheckoutTest() {
        loginSteps.loginWhole(Constants.USSR_NAME, Constants.USER_PASS);
        searchSteps.searchProduct("SWING");
        cartSteps.addProductToCart();
        cartSteps.proceedToCheckout();
        checkoutSteps.placeOrder();
        checkoutSteps.verifyOrderReceived();



    }

}
