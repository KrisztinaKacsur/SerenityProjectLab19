package com.fasttrackit.features.search;

import com.fasttrackit.steps.serenity.SearchSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import util.BaseTest;

public class SearchTest extends BaseTest {

    @Steps
    private SearchSteps searchSteps;


    @Test
    public void searchForProductTest() {
        searchSteps.searchProduct("necklace");
        searchSteps.findProductFromList();
        searchSteps.verifyFoundProduct("SILVER DESERT NECKLACE");
    }





}
