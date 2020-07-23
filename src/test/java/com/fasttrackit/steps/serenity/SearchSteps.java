package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.SearchResultPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;


public class SearchSteps {

    private HomePage homePage;
    private SearchResultPage searchResultPage;

    @Step
    public void searchProduct(String productName){
        homePage.open();
        homePage.setSearchField(productName);
        homePage.clickSearchButton();
    }

    @Step
    public void findProductFromList() {
        searchResultPage.findElementInSearchResultList();
    }


    @Step
    public void verifyFoundProduct(String productName){
        Assert.assertTrue(searchResultPage.verifyProductWasFound(productName));
    }


}
