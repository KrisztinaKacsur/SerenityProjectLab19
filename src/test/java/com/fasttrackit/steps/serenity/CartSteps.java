package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.CartPage;
import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.SearchResultPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps {

    private HomePage homePage;
    private SearchResultPage searchResultPage;
    private CartPage cartPage;

    @Step
    public void addProductToCart() {
        searchResultPage.clickAddToCart();
    }

    @Step
    public void verifyProductWasAddedToCart(String productName) {
        Assert.assertTrue(cartPage.verifyProductAddedToCart(productName));
    }

    @Step
    public void proceedToCheckout(){
        cartPage.clickProceedToCheckout();
    }
}
