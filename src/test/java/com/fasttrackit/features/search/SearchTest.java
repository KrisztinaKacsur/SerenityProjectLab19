package com.fasttrackit.features.search;

import com.fasttrackit.steps.serenity.SearchResultSteps;
import com.fasttrackit.steps.serenity.SearchSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import util.BaseTest;

public class SearchTest extends BaseTest {

    @Steps
    private SearchSteps searchSteps;

    @Steps
    private SearchResultSteps searchResultSteps;



    @Test
    public void findProductTest(){
        searchSteps.searchProduct("SWING");
        searchResultSteps.verifyProductWasFound("SWING TIME EARRINGS");
    }

    @Test
    public void searchForProductTest() {
        searchSteps.searchProduct("necklace");
        searchResultSteps.verifyProduct();
    }

    @Test
    public void searchByPriceTest() {
        searchSteps.searchProduct("BAG");
        searchResultSteps.organizeAscendingByPrice();
    }




}
