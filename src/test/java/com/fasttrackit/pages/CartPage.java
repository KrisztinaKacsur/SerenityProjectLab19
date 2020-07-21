package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/cart/")
public class CartPage extends PageObject {

    @FindBy(css = ".success-msg")
    private WebElementFacade productAddedToCartMessage;

    @FindBy(css = ".method-checkout-cart-methods-onepage-bottom .btn-checkout")
    private WebElementFacade proceedToCheckoutButton;

    public boolean verifyProductAddedToCart(String productName){
        return productAddedToCartMessage.containsText(productName);

    }

    public void clickProceedToCheckout() {
        clickOn(proceedToCheckoutButton);
    }




}
