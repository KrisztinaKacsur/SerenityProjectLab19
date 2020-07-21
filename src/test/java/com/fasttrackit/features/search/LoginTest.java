package com.fasttrackit.features.search;

import util.Constants;
import com.fasttrackit.steps.serenity.LoginSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import util.BaseTest;


public class LoginTest extends BaseTest {


    @Steps
    private LoginSteps loginSteps;

    @Test
    public void validLoginTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginWithCredentials(Constants.USSR_NAME , Constants.USER_PASS);
        loginSteps.verifyLoggedIn("Krisztina K Kacsur");
    }
}
