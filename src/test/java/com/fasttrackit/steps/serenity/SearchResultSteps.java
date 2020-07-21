package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.SearchResultPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchResultSteps {

    private SearchResultPage searchResultPage;

    @Step
    public void verifyProductWasFound(String productName) {
        Assert.assertTrue(searchResultPage.verifyIfProductWasFound(productName));
    }

    @Step
    public void verifyProduct() {
         Assert.assertTrue(searchResultPage.verifyIfProduct());
    }

    @Step
    public void organizeAscendingByPrice () {
        searchResultPage.clickSortByDropdown();
        searchResultPage.clickSortByPrice();
        searchResultPage.clickAscendingArrowIcon();
    }

    @Step
    public void cheapProduct(){
        searchResultPage.getCheapestProductText();
    }

    @Step
    public void expensiveProduct(){
        searchResultPage.getMostExpensiveProductText();
    }

    @Step
    public void compareProductPrices() {
        searchResultPage.compare();
    }














}
