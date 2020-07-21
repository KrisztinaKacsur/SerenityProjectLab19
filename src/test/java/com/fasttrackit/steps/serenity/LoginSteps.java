package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.LoginPage;
import com.fasttrackit.pages.MyDashboardPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private MyDashboardPage myDashboardPage;


    @Step
    public void navigateToLoginPage() {
        homePage.open();
        homePage.clickAccountLink();
        homePage.clickOnLoginLink();
    }

    @Step
    public void loginWithCredentials(String email, String pass) {
        loginPage.setUserEmailField(email);
        loginPage.setUserPasswordField(pass);
        loginPage.clickLogInButton();
    }

    @Step
    public void verifyLoggedIn(String userName){
        Assert.assertTrue(myDashboardPage.verifyLoginText(userName));
    }

    @Step
    public void loginWhole(String email, String pass) {
        navigateToLoginPage();
        loginWithCredentials(email, pass);
    }
}
