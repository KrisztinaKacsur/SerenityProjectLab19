package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.yecht.Data;

import java.util.*;


@DefaultUrl("http://testfasttrackit.info/selenium-test/catalogsearch/result/?q=retro")
public class SearchResultPage extends PageObject {

    @FindBy(css = ".product-name [title='Swing Time Earrings']")
    private WebElementFacade productNameLink;

    @FindBy(css = ".actions [type='button'].btn-cart")
    private WebElementFacade addToCartButton;

    //---------LISTA ELEMENTE GASITE
    @FindBy(css = ".products-grid--max-3-col>li")
    private List<WebElementFacade> searchResultItems;

    @FindBy(css = ".product-name [title='Pearl Necklace Set']")
    private WebElementFacade pearlNecklaceSet;

    @FindBy(css = ".product-name [title='Silver Desert Necklace']")
    private WebElementFacade silverDesertNecklace;

    @FindBy(css = ".product-name [title='Ludlow Sheath Dress']")
    private WebElementFacade ludlowSheathDress;

    @FindBy (css = ".product-name [title='Racer Back Maxi Dress']")
    private WebElementFacade racerBackMaxiDress;


    @FindBy(css = ".category-products > .toolbar select[title^=Sort]")
    private WebElementFacade sortByDropdown;

    @FindBy(css = ".category-products > .toolbar select[title^=Sort] [selected='selected']")
    private WebElementFacade sortByPriceButton;

    @FindBy(css = "div.category-products > div.toolbar > div.sorter > div > a")
    private WebElementFacade ascendingArrowIcon;

    @FindBy(css = "#product-price-396 .price")
    private WebElementFacade cheapestProductPrice;

    @FindBy(css = "#product-minimal-price-439")
    private WebElementFacade mostExpensiveProductPrice;



    public void clickAddToCart() {
        clickOn(addToCartButton);
    }


    public boolean findElementInSearchResultList(){
        List<WebElementFacade> searchResultList = findAll(By.cssSelector(".products-grid--max-3-col>li"));
        for(WebElementFacade element : searchResultList) {
            if (element == silverDesertNecklace){
                clickOn(silverDesertNecklace);
            }
        }
        return true;
    }


    public boolean verifyProductWasFound(String productName){
        return silverDesertNecklace.containsOnlyText(productName);
    }


    public void clickSortByDropdown(){
        clickOn(sortByDropdown);
    }

    public void clickSortByPrice(){
        clickOn(sortByPriceButton);
    }

    public void clickAscendingArrowIcon () {
        clickOn(ascendingArrowIcon);
    }





}
