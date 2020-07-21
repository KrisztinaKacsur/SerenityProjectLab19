package com.fasttrackit.features.search;

import com.fasttrackit.steps.serenity.CartSteps;
import com.fasttrackit.steps.serenity.LoginSteps;
import com.fasttrackit.steps.serenity.SearchSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import util.BaseTest;
import util.Constants;

public class CartTest extends BaseTest {

   @Steps
   private LoginSteps loginSteps;

    @Steps
    private SearchSteps searchSteps;

    @Steps
    private CartSteps cartSteps;

    @Test
    public void addProductToCart() {
        loginSteps.loginWhole(Constants.USSR_NAME, Constants.USER_PASS);
        searchSteps.searchProduct("SWING");
        cartSteps.addProductToCart();
        cartSteps.verifyProductWasAddedToCart("Swing Time Earrings was added to your shopping cart.");
    }

}
